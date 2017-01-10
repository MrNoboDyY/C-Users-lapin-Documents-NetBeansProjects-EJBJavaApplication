/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author lapin
 */
@Entity(name = "UtilisateurNewEntity")
@Table(name = "utilisateurnewentity",
        uniqueConstraints = {
            @UniqueConstraint(name = "full_name",columnNames = {"nom","prenom"})
        })
public class UtilisateurNewEntity implements Serializable {
    
    public UtilisateurNewEntity() {
    }
    
    @Column(name="nom",length=50)
    String Nom;
    
    @Column(name = "prenom",length = 50)
    String Prenom;

    

    public UtilisateurNewEntity(String Nom, String Prenom) {
        this.Nom = Nom;
        this.Prenom = Prenom;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }
    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UtilisateurNewEntity)) {
            return false;
        }
        UtilisateurNewEntity other = (UtilisateurNewEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.UtilisateurNewEntity[ id=" + id + " ]";
    }
    
}
