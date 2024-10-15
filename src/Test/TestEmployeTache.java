/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ma.projet.classes.Employe;
import ma.projet.classes.EmployeTache;
import ma.projet.classes.EmployeTachePk;
import ma.projet.classes.Tache;
import java.util.Date;
import ma.projet.service.EmployeService;
import ma.projet.service.EmployeTacheService;
import ma.projet.service.TacheService;

/**
 *
 * @author PC
 */
public class TestEmployeTache {
    public static void main(String[] args) {
        EmployeTacheService ets = new EmployeTacheService();
        TacheService ts = new TacheService();
        EmployeService es = new EmployeService();
        
        Tache t = ts.findById(1);
        Tache t2 = ts.findById(2);
        Employe e = es.findById(7);
        ets.create(new EmployeTache(new EmployeTachePk(t.getId(), e.getId(), new Date("2024/01/01")),new Date()));
        ets.create(new EmployeTache(new EmployeTachePk(t2.getId(), e.getId(), new Date("2024/01/01")),new Date()));
        
    }
}
