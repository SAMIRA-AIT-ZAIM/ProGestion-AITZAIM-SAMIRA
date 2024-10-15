/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ma.projet.classes.Projet;
import java.util.Date;
import ma.projet.service.EmployeService;
import ma.projet.service.ProjetService;

/**
 *
 * @author PC
 */
public class TestProjet {
    public static void main(String[] args) {
        ProjetService ps = new ProjetService();
        EmployeService es = new EmployeService();
        ps.create(new Projet("app web", new Date(), new Date("2027/10/18"), es.findById(1)));
        ps.create(new Projet("appp desktop", new Date(), new Date("2027/10/18"), es.findById(2)));
    }
}
