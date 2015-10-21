/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.dao;

import com.br.lp2.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 41487532
 */
public class UsuarioDAO implements GenericDAO<Usuario> {

    private Connection con;
    
    public UsuarioDAO() {
        //Passo 1 - criar conexão
        //con = ConnectionFactory.getConnection();
    }

    @Override
    public boolean insert(Usuario usuario) {
        
        boolean resposta = false;
        // passo 1 - realiza conexão
        con = ConnectionFactory.getConnection();
        
        //passo 2 
        String sql = "INSERT INTO usuario(username, senha) VALUES (?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getSenha());
        
        //passo 3
            int resp = ps.executeUpdate();
            
        //passo 4
            if(resp > 0){
                resposta = true;
            }
            
        //passo 5
            ps.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resposta;
    }
    
    public Usuario readByName(String name){
        
        Usuario usuario = new Usuario();
        
        con = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM usuario WHERE username = ?";
        
        try{
            
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, name);
        
        ResultSet rs =  ps.executeQuery();
        
        while(rs.next()){
        
            usuario.setId_usuario(rs.getInt("id_usuario"));
            usuario.setUsername(rs.getString("username"));
            usuario.setSenha(rs.getString("senha"));
            
        }
        
        ps.close();
        rs.close();
        con.close();
                
                
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return usuario;
    }

    @Override
    public List<Usuario> read() {
        
        //passo 1 - realizar conexão
        con = ConnectionFactory.getConnection();
        List<Usuario> usuarios = new ArrayList<>();
        
        //Passo 2 - cria query e statement
        String sql = "SELECT * FROM Usuario";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
        //Passo 3 - executar o statement
            ResultSet rs = ps.executeQuery();
            
        //Passo 4 - mostrar resultados
            while(rs.next()){
                //u.setId_usuario(rs.getInt("id_usuario"));
                int id = rs.getInt("id_usuario");
                String  username = rs.getString("username");
                String  senha = rs.getString("senha");
                Usuario u = new Usuario(id, username, senha);
                usuarios.add(u);
            }
            
            //Passo 5 - fechar tudo
            
            ps.close();
            rs.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usuarios;
        
    }

    @Override
    public boolean update(Usuario usuario) {
        boolean resposta = false;
        // passo 1 - realiza conexão
        con = ConnectionFactory.getConnection();
        
        //passo 2 
        String sql = "UPDATE Usuario SET username = ?, senha = ? WHERE id_usuario = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getSenha());
            ps.setInt(3, usuario.getId_usuario());
        
        //passo 3
            int resp = ps.executeUpdate();
            
        //passo 4
            if(resp > 0){
                resposta = true;
            }
            
        //passo 5
            ps.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resposta;
    }

    @Override
    public boolean delete(Usuario usuario) {
        boolean resposta = false;
        // passo 1 - realiza conexão
        con = ConnectionFactory.getConnection();
        
        //passo 2 
        String sql = "DELETE FROM usuario WHERE id_usuario =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, usuario.getId_usuario());
        
        //passo 3
            int resp = ps.executeUpdate();
            
        //passo 4
            if(resp > 0){
                resposta = true;
            }
            
        //passo 5
            ps.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resposta;
    }
    
}
