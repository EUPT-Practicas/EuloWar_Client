/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FranciscoJavier
 */
public class Mina implements Serializable {
    private Integer idMina;
    private String tipoMina;
    private int nivelMina;
    private int deposito;
    private Usuario fKMinaUsuario;
    private Recurso fKMinaRecurso;

    public Mina() {
    }

    public Mina(Integer idMina) {
        this.idMina = idMina;
    }

    public Mina(String tipoMina, int nivelMina) {
        this.tipoMina = tipoMina;
        this.nivelMina = nivelMina;
    }

    public Integer getIdMina() {
        return idMina;
    }

    public void setIdMina(Integer idMina) {
        this.idMina = idMina;
    }

    public String getTipoMina() {
        return tipoMina;
    }

    public void setTipoMina(String tipoMina) {
        this.tipoMina = tipoMina;
    }

    public int getNivelMina() {
        return nivelMina;
    }

    public void setNivelMina(int nivelMina) {
        this.nivelMina = nivelMina;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public Usuario getFKMinaUsuario() {
        return fKMinaUsuario;
    }

    public void setFKMinaUsuario(Usuario fKMinaUsuario) {
        this.fKMinaUsuario = fKMinaUsuario;
    }

    public Recurso getFKMinaRecurso() {
        return fKMinaRecurso;
    }

    public void setFKMinaRecurso(Recurso fKMinaRecurso) {
        this.fKMinaRecurso = fKMinaRecurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMina != null ? idMina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mina)) {
            return false;
        }
        Mina other = (Mina) object;
        if ((this.idMina == null && other.idMina != null) || (this.idMina != null && !this.idMina.equals(other.idMina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Mina[ idMina=" + idMina + " ]";
    }
    
}
