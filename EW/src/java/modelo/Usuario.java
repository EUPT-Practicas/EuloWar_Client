/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FranciscoJavier
 */
public class Usuario implements Serializable {
    private String email;
    private String nombreUsuario;
    private String password;
    private Date fechaRegistro;
    private Collection<TropaAtaque> tropaAtaqueCollection;
    private Collection<FabricaOfensiva> fabricaOfensivaCollection;
    private Collection<TropaDefensa> tropaDefensaCollection;
    private Collection<Mina> minaCollection;
    private Collection<Campamento> campamentoCollection;
    private Collection<Recurso> recursoCollection;
    private Collection<FabricaDefensiva> fabricaDefensivaCollection;

    public Usuario() {
    }

    public Usuario(String email) {
        this.email = email;
    }

    public Usuario(String email, String nombreUsuario, String password) {
        this.email = email;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.fechaRegistro = fechaRegistro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @XmlTransient
    public Collection<TropaAtaque> getTropaAtaqueCollection() {
        return tropaAtaqueCollection;
    }

    public void setTropaAtaqueCollection(Collection<TropaAtaque> tropaAtaqueCollection) {
        this.tropaAtaqueCollection = tropaAtaqueCollection;
    }

    @XmlTransient
    public Collection<FabricaOfensiva> getFabricaOfensivaCollection() {
        return fabricaOfensivaCollection;
    }

    public void setFabricaOfensivaCollection(Collection<FabricaOfensiva> fabricaOfensivaCollection) {
        this.fabricaOfensivaCollection = fabricaOfensivaCollection;
    }

    @XmlTransient
    public Collection<TropaDefensa> getTropaDefensaCollection() {
        return tropaDefensaCollection;
    }

    public void setTropaDefensaCollection(Collection<TropaDefensa> tropaDefensaCollection) {
        this.tropaDefensaCollection = tropaDefensaCollection;
    }

    @XmlTransient
    public Collection<Mina> getMinaCollection() {
        return minaCollection;
    }

    public void setMinaCollection(Collection<Mina> minaCollection) {
        this.minaCollection = minaCollection;
    }

    @XmlTransient
    public Collection<Campamento> getCampamentoCollection() {
        return campamentoCollection;
    }

    public void setCampamentoCollection(Collection<Campamento> campamentoCollection) {
        this.campamentoCollection = campamentoCollection;
    }

    @XmlTransient
    public Collection<Recurso> getRecursoCollection() {
        return recursoCollection;
    }

    public void setRecursoCollection(Collection<Recurso> recursoCollection) {
        this.recursoCollection = recursoCollection;
    }

    @XmlTransient
    public Collection<FabricaDefensiva> getFabricaDefensivaCollection() {
        return fabricaDefensivaCollection;
    }

    public void setFabricaDefensivaCollection(Collection<FabricaDefensiva> fabricaDefensivaCollection) {
        this.fabricaDefensivaCollection = fabricaDefensivaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Usuario[ email=" + email + " ]";
    }
    
}
