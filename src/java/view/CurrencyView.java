/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CurrencyController;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.Currency;

/**
 *
 * @author guuurris
 */
@Named(value = "currencyView")
@ApplicationScoped
public class CurrencyView {
    
    @EJB
    private CurrencyController cont;
    
    private String fromCurrency;

  

   
    private String toCurrency;
    
    private float convertedValue;

    
    
    public String testValue() {
        return "Hello world";
    } 
    
    
    
    public List<Currency> getCurrencies(){
        
        return cont.allCurrencies();
        
    }
    
    public CurrencyView(){
        cont = new CurrencyController();
        convertedValue = 0;
    }
    public float getConvertedValue() {
        return convertedValue;
    }

    private void setConvertedValue(float convertedValue) {
        this.convertedValue = convertedValue;
      
    }
    
    /**
     * Function that convert currency
     */
    public void convertCurrency(){
 
       convertedValue =  cont.convertCurrency(fromCurrency, toCurrency);
       
    }
     public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }
    
      public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }
}
