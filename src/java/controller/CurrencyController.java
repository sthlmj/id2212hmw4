/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Currency;

/**
 *
 * @author guuurris
 */

@Stateless
public class CurrencyController {
 
    @PersistenceContext(unitName="ID2212Hmw4PU")
    private EntityManager em;
    
    
    public EntityManager getEntityManager() {
        return em;
    }
    
    public float convertCurrency (Float amount ,String from , String to){
        
        Currency cFrom = em.find(Currency.class, from);
        Currency cTo = em.find(Currency.class, to);
       
        return amount * (cTo.getConversionValue() / cFrom.getConversionValue()); 
    }
    
    /**
     * Lists available currencies
     * @return list of currencies
     */
    public List<Currency> allCurrencies(){ 
        List result = em.createQuery("SELECT c FROM Currency c").getResultList();
        return (List<Currency>) result; 
    }
}
