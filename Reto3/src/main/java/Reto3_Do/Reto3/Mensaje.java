/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 */
package Reto3_Do.Reto3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Message")
public class Mensaje implements Serializable {
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText; 

    @ManyToOne
    @JoinColumn(name="id")
    @JsonIgnoreProperties({"Messages", "Client", "Reservations"}) 
    private Bike bike;

    @ManyToOne
    @JoinColumn(name="ClientId")
    @JsonIgnoreProperties({"Messages", "Reservations", "Client" }) 
    private Cliente client;   

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente Client) {
        this.client = Client;
    }
    
    

}

