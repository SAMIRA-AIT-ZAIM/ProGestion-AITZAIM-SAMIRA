/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ma.projet.service.TacheService;

/**
 *
 * @author PC
 */
public class TestGetTachesPrixSupérieurA1000DH {
    public static void main(String[] args) {
        TacheService ts = new TacheService();
        ts.getTachesPrixSupérieurA1000DH();
    }
}
