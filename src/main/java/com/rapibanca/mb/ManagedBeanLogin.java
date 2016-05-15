/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rapibanca.mb;

import com.informa.dto.ClienteRapibancaDTO;
import com.rapibanca.bean.IloginBean;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author jmartinez
 */
@ManagedBean(name = "login", eager = true)
public class ManagedBeanLogin {
    @EJB
    private IloginBean loginBean;
    private String idUsuario;
    private String password;
    
    public boolean loguearUsuario(){
        //System.out.println("funciono");
        ClienteRapibancaDTO clienteRapibancaDTO = new ClienteRapibancaDTO();
        clienteRapibancaDTO.setIdUsuario(getIdUsuario());
        clienteRapibancaDTO.setPassword(getPassword());
        loginBean.loguearUsuario(clienteRapibancaDTO);
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
