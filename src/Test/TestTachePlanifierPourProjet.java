/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ma.projet.service.ProjetService;

/**
 *
 * @author PC
 */
public class TestTachePlanifierPourProjet {
    public static void main(String[] args) {
        ProjetService ps = new ProjetService();
        ps.tachePlanifiePourProjet(ps.findById(9));
    }
}
