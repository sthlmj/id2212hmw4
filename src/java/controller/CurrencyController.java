/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author joehulden
 */
@Stateless
public class CurrencyController {

    @PersistenceContext(unitName = "id2212hmw4PU")
    private EntityManager em; 
}
