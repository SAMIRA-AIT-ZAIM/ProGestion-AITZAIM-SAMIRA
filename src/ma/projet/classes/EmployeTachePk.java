/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;

/**
 *
 * @author PC
 */
@Embeddable
public class EmployeTachePk implements  Serializable{
    private int tache;
    private int employe;
    private Date dateFinReel;

    public EmployeTachePk() {
    }

    public EmployeTachePk(int tache, int employe,Date dateFinReel) {
        this.tache = tache;
        this.employe = employe;
        this.dateFinReel = dateFinReel;
    }

    public int getTache() {
        return tache;
    }

    public int getEmploye() {
        return employe;
    }

    public void setTache(int tache) {
        this.tache = tache;
    }

    public void setEmploye(int employe) {
        this.employe = employe;
    }
    
    
}
