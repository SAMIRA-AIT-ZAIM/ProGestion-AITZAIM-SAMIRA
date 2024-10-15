/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author PC
 */
@Entity
public class EmployeTache {
    @EmbeddedId
    EmployeTachePk EmployeTachePk;
    
            
   
   
   @Temporal(TemporalType.DATE)
    private Date dateDebutReel;
    @ManyToOne
      @JoinColumn(name = "tache" , insertable = false , updatable = false)
     private Tache tache;
    @ManyToOne
       @JoinColumn(name = "employe" , insertable = false , updatable = false)
    private Employe employe;
  
    

    public EmployeTache() {
    }

    public EmployeTache(EmployeTachePk EmployeTachePk, Date dateDebutReel) {
        this.EmployeTachePk = EmployeTachePk;
        this.dateDebutReel = dateDebutReel;
    }

  

 

    public EmployeTachePk getEmployeTachePk() {
        return EmployeTachePk;
    }

  

    public Date getdateDebutReel() {
        return dateDebutReel;
    }

    public Tache getTache() {
        return tache;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmployeTachePk(EmployeTachePk EmployeTachePk) {
        this.EmployeTachePk = EmployeTachePk;
    }

   
    public void setDateFin(Date dateFin) {
        this.dateDebutReel = dateDebutReel;
    }

    public void setTache(Tache tache) {
        this.tache = tache;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
       
}
