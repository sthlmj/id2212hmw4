/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author joehulden
 */
@ManagedBean(name = "CurrencyView")
@RequestScoped
public class CurrencyView {

    /**
     * Creates a new instance of CurrencyView
     */
    
    public CurrencyView() {
        
    }
    
    public String print() {     //testar att skriva ut
        
        return "hej world";
    }
    
}
