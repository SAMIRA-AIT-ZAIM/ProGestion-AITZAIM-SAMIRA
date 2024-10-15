/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ma.projet.classes.Employe;
import ma.projet.service.EmployeService;

/**
 *
 * @author PC
 */
public class TestEmploye {

    public static void main(String[] args) {
        EmployeService es = new EmployeService();
        es.create(new Employe("Sara", "El Khalfi", "0601234567"));
        es.create(new Employe("Nadia", "Bennani", "0709876543"));
        es.create(new Employe("Yassine", "El Amrani", "0654321987"));
        es.create(new Employe("Hicham", "Belkacem", "0805678901"));

    }

}
