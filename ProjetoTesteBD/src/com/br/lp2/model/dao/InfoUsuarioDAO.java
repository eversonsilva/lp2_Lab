/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.dao;

import com.br.lp2.model.InfoUsuario;
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
public class InfoUsuarioDAO implements GenericDAO<InfoUsuario>{
    
    private Connection con;
    
    public InfoUsuarioDAO() {
        //Passo 1 - criar conexão
        //con = ConnectionFactory.getConnection();
    }

    @Override
    public boolean insert(InfoUsuario infoUsuario) {
        
        boolean resposta = false;
        // passo 1 - realiza conexão
        con = ConnectionFactory.getConnection();
        
        //passo 2 
        String sql = "INSERT INTO infoUsuario(nome, email) VALUES (?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, infoUsuario.getNome());
            ps.setString(2, infoUsuario.getEmail());
        
        //passo 3
            int resp = ps.executeUpdate();
            
        //passo 4
            if(resp > 0){
                resposta = true;
            }
            
        //passo 5
            ps.close();;
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resposta;
    }

    @Override
    public List<InfoUsuario> read() {
        
        //passo 1 - realizar conexão
        con = ConnectionFactory.getConnection();
        List<InfoUsuario> infoUsuarios = new ArrayList<>();
        
        //Passo 2 - cria query e statement
        String sql = "SELECT * FROM infoUsuario";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
        //Passo 3 - executar o statement
            ResultSet rs = ps.executeQuery();
            
        //Passo 4 - mostrar resultados
            while(rs.next()){
                //u.setId_usuario(rs.getInt("id_usuario"));
                int id = rs.getInt("id_info");
                String  nome = rs.getString("nome");
                String  email = rs.getString("email");
                InfoUsuario u = new InfoUsuario(id, nome, email);
                infoUsuarios.add(u);
            }
            
            //Passo 5 - fechar tudo
            
            ps.close();
            rs.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return infoUsuarios;
        
    }

    @Override
    public boolean update(InfoUsuario infoUsuario) {
        boolean resposta = false;
        // passo 1 - realiza conexão
        con = ConnectionFactory.getConnection();
        
        //passo 2 
        String sql = "UPDATE infoUsuario SET nome = ?, email = ? WHERE id_info = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, infoUsuario.getNome());
            ps.setString(2, infoUsuario.getEmail());
            ps.setInt(3, infoUsuario.getId_info());
        
        //passo 3
            int resp = ps.executeUpdate();
            
        //passo 4
            if(resp > 0){
                resposta = true;
            }
            
        //passo 5
            ps.close();;
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resposta;
    }

    @Override
    public boolean delete(InfoUsuario infoUsuario) {
        boolean resposta = false;
        // passo 1 - realiza conexão
        con = ConnectionFactory.getConnection();
        
        //passo 2 
        String sql = "DELETE FROM infoUsuario WHERE id_info =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, infoUsuario.getId_info());
        
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
