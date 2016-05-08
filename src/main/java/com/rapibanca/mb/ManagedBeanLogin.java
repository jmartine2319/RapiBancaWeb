/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rapibanca.mb;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author jmartinez
 */
@ManagedBean(name = "login", eager = true)
public class ManagedBeanLogin {
    private String idUsuario="hola";
    private String password;
    
    public boolean loguearUsuario(){
        System.out.println("funciono");
        return true;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
