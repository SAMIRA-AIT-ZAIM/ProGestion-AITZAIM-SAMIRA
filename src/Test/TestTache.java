/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ma.projet.classes.Tache;
import java.util.Date;
import ma.projet.service.ProjetService;
import ma.projet.service.TacheService;

/**
 *
 * @author PC
 */
public class TestTache {

    public static void main(String[] args) {
        TacheService ts = new TacheService();
        ProjetService ps = new ProjetService();
        ts.create(new Tache("Terminer le projet Java", new Date(), new Date("2024/12/01"), 1500, ps.findById(5)));
        ts.create(new Tache("Préparer la réunion mensuelle", new Date(), new Date("2024/11/15"), 1200, ps.findById(7)));
        ts.create(new Tache("Mettre à jour la documentation technique", new Date(), new Date("2024/11/20"), 1000, ps.findById(3)));

    }
}
