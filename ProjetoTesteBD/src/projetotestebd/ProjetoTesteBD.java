/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotestebd;

import com.br.lp2.model.InfoUsuario;
import com.br.lp2.model.dao.InfoUsuarioDAO;

import com.br.lp2.model.Usuario;
import com.br.lp2.model.dao.UsuarioDAO;
import java.util.List;

/**
 *
 * @author 41487532
 */
public class ProjetoTesteBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        //LEITURA DO ESTADO INICIAL DO BANCO
        List<Usuario> lista = usuarioDAO.read();
        for(Usuario usuario : lista){
            System.out.println(usuario);
        }
        System.out.println("-----------------");
        
        Usuario u1 = new Usuario();
        u1.setSenha("1234");
        u1.setUsername("Dilma");
        //usuarioDAO.insert(u1);
        
        //ATUALIZA USUARIO
        Usuario u2 = lista.get(lista.size() - 1);
        //u2.setUsername("Joel");
        //usuarioDAO.update(u2);
        
        //REMOVE USUARIO
        Usuario u3 = lista.get(lista.size() - 1);
        //usuarioDAO.delete(u3);
        
        //REMOVE USARIO ESPECIFICO
        Usuario u4 = new Usuario();
        for (Usuario usuario : lista) {
            if(usuario.getUsername().equals("Dilma")){
                u4 = usuario;
                break;
            }
        }
        
        usuarioDAO.delete(u4);
        
        lista = usuarioDAO.read();
        for(Usuario usuario : lista){
            System.out.println(usuario);
        }
    /*
        
        InfoUsuarioDAO infoUsuarioDAO = new InfoUsuarioDAO();
        
        //LEITURA DO ESTADO INICIAL DO BANCO
        List<InfoUsuario> lista1 = infoUsuarioDAO.read();
        for(InfoUsuario infoUsuario : lista1){
            System.out.println(infoUsuario);
        }
        System.out.println("-----------------");
        
        InfoUsuario i1 = new InfoUsuario();
        i1.setNome("Dilma");
        i1.setEmail("Dilma@memo.com");
        //usuarioDAO.insert(u1);
        
        //ATUALIZA USUARIO
        InfoUsuario i2 = lista1.get(lista1.size() - 1);
        //i2.setNome("Joel");
        //infoUsuarioDAO.update(i2);
        
        //REMOVE USUARIO
        InfoUsuario i3 = lista1.get(lista1.size() - 1);
        //usuarioDAO.delete(i3);
        
        //REMOVE USARIO ESPECIFICO
        InfoUsuario i4 = new InfoUsuario();
        for (InfoUsuario infoUsuario : lista1) {
            if(infoUsuario.getNome().equals("Dilma")){
                i4 = infoUsuario;
                break;
            }
        }
        
        //infoUsuarioDAO.delete(i4);
        
        lista1 = infoUsuarioDAO.read();
        for(InfoUsuario infoUsuario : lista1){
            System.out.println(infoUsuario);
        }
    */
    }    
}
