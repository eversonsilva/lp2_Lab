/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model;

import java.io.Serializable;

/**
 *
 * @author 41487532
 */
public class InfoUsuario implements Serializable {
    private int id_info, id_usuario;
    private String nome, email;
    
    //------------------CONSTRUTORES------------------------------

    public InfoUsuario() {
        this.id_info = -1;
        this.id_usuario = -1;
        this.nome = "Anonimo da Silva";
        this.email = "anonimo@email.com";
    }

    public InfoUsuario(int id_usuario, String nome, String email) {
        this.id_info = -1;
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.email = email;
    }

    public InfoUsuario(int id_info, int id_usuario, String nome, String email) {
        this.id_info = id_info;
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.email = email;
    }
    
    //-----------------------------GETTER E SETTER ----------------------------

    public int getId_info() {
        return id_info;
    }

    public void setId_info(int id_info) {
        this.id_info = id_info;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //-----------------------------TOSTRING---------------------------------------

    @Override
    public String toString() {
        return "InfoUsuario{" + "id_info=" + id_info + ", id_usuario=" + id_usuario + ", nome=" + nome + ", email=" + email + '}';
    }
   
}
