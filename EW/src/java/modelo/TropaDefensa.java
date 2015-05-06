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
import javax.persistence.GenerationType;
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
public class TropaDefensa implements Serializable {
    private Integer idTropaDefensa;
    private String tipoTropaDefensa;
    private Integer nivelTropaDefensa;
    private Usuario fKTropaDefensaUsuario;
    private FabricaDefensiva fKTropaDefensaFabricaDefensiva;
    private Campamento fKTropaDefensaCampamento;

    public TropaDefensa() {
    }

    public TropaDefensa(Integer idTropaDefensa) {
        this.idTropaDefensa = idTropaDefensa;
    }

    public TropaDefensa(Integer idTropaDefensa, String tipoTropaDefensa) {
        this.idTropaDefensa = idTropaDefensa;
        this.tipoTropaDefensa = tipoTropaDefensa;
    }

    public Integer getIdTropaDefensa() {
        return idTropaDefensa;
    }

    public void setIdTropaDefensa(Integer idTropaDefensa) {
        this.idTropaDefensa = idTropaDefensa;
    }

    public String getTipoTropaDefensa() {
        return tipoTropaDefensa;
    }

    public void setTipoTropaDefensa(String tipoTropaDefensa) {
        this.tipoTropaDefensa = tipoTropaDefensa;
    }

    public Integer getNivelTropaDefensa() {
        return nivelTropaDefensa;
    }

    public void setNivelTropaDefensa(Integer nivelTropaDefensa) {
        this.nivelTropaDefensa = nivelTropaDefensa;
    }

    public Usuario getFKTropaDefensaUsuario() {
        return fKTropaDefensaUsuario;
    }

    public void setFKTropaDefensaUsuario(Usuario fKTropaDefensaUsuario) {
        this.fKTropaDefensaUsuario = fKTropaDefensaUsuario;
    }

    public FabricaDefensiva getFKTropaDefensaFabricaDefensiva() {
        return fKTropaDefensaFabricaDefensiva;
    }

    public void setFKTropaDefensaFabricaDefensiva(FabricaDefensiva fKTropaDefensaFabricaDefensiva) {
        this.fKTropaDefensaFabricaDefensiva = fKTropaDefensaFabricaDefensiva;
    }

    public Campamento getFKTropaDefensaCampamento() {
        return fKTropaDefensaCampamento;
    }

    public void setFKTropaDefensaCampamento(Campamento fKTropaDefensaCampamento) {
        this.fKTropaDefensaCampamento = fKTropaDefensaCampamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTropaDefensa != null ? idTropaDefensa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TropaDefensa)) {
            return false;
        }
        TropaDefensa other = (TropaDefensa) object;
        if ((this.idTropaDefensa == null && other.idTropaDefensa != null) || (this.idTropaDefensa != null && !this.idTropaDefensa.equals(other.idTropaDefensa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TropaDefensa[ idTropaDefensa=" + idTropaDefensa + " ]";
    }
    
}
