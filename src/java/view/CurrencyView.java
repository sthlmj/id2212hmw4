/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CurrencyController;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.Currency;

/**
 *
 * @author guuurris
 */
@Named(value = "currencyView")
@SessionScoped
public class CurrencyView implements Serializable {
    
    @EJB
    private CurrencyController cont;
    private Float amount;
    private String fromCurrency;
    private String toCurrency;
    private float convertedValue;
    
    public List<Currency> getCurrencies(){
        return cont.allCurrencies();
    }
    
    public CurrencyView(){
        cont = new CurrencyController();
        convertedValue = 0;
        amount = 0.0F;
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
       convertedValue =  cont.convertCurrency(amount, fromCurrency, toCurrency);
       
    }
     public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }
     public void setAmount(Float amount) {
        this.amount = amount;
    }
     
      public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }
    
     public Float getAmount() {
        return amount;
    }
}