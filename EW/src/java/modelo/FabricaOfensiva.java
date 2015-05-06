/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FranciscoJavier
 */
public class FabricaOfensiva implements Serializable {
    private Integer idFabricaOfensiva;
    private int nivelFabricaOfensiva;
    private Collection<TropaAtaque> tropaAtaqueCollection;
    private Usuario fKFabricaOfensivaUsuario;

    public FabricaOfensiva() {
    }

    public FabricaOfensiva(Integer idFabricaOfensiva) {
        this.idFabricaOfensiva = idFabricaOfensiva;
    }

    public FabricaOfensiva(Integer idFabricaOfensiva, int nivelFabricaOfensiva) {
        this.idFabricaOfensiva = idFabricaOfensiva;
        this.nivelFabricaOfensiva = nivelFabricaOfensiva;
    }

    public Integer getIdFabricaOfensiva() {
        return idFabricaOfensiva;
    }

    public void setIdFabricaOfensiva(Integer idFabricaOfensiva) {
        this.idFabricaOfensiva = idFabricaOfensiva;
    }

    public int getNivelFabricaOfensiva() {
        return nivelFabricaOfensiva;
    }

    public void setNivelFabricaOfensiva(int nivelFabricaOfensiva) {
        this.nivelFabricaOfensiva = nivelFabricaOfensiva;
    }

    @XmlTransient
    public Collection<TropaAtaque> getTropaAtaqueCollection() {
        return tropaAtaqueCollection;
    }

    public void setTropaAtaqueCollection(Collection<TropaAtaque> tropaAtaqueCollection) {
        this.tropaAtaqueCollection = tropaAtaqueCollection;
    }

    public Usuario getFKFabricaOfensivaUsuario() {
        return fKFabricaOfensivaUsuario;
    }

    public void setFKFabricaOfensivaUsuario(Usuario fKFabricaOfensivaUsuario) {
        this.fKFabricaOfensivaUsuario = fKFabricaOfensivaUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFabricaOfensiva != null ? idFabricaOfensiva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FabricaOfensiva)) {
            return false;
        }
        FabricaOfensiva other = (FabricaOfensiva) object;
        if ((this.idFabricaOfensiva == null && other.idFabricaOfensiva != null) || (this.idFabricaOfensiva != null && !this.idFabricaOfensiva.equals(other.idFabricaOfensiva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.FabricaOfensiva[ idFabricaOfensiva=" + idFabricaOfensiva + " ]";
    }
    
}
