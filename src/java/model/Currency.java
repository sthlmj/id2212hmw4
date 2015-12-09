/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author joehulden
 */
@Entity
public class Currency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String currency;

    public String getId() {
        return currency;
    }

    public void setId(String id) {
        this.currency = id;
    }


    @Override
    public String toString() {
        return "model.Currency[ id=" + currency + " ]";
    }
    
}
