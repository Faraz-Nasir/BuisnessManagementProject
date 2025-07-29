package com.learning.buisnessproject.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int oId;
    private String oName;
    private double oPrice;
    private int oQuantity;
    private Date orderDate;
    private double totalAmount;

    @ManyToOne
    @JoinColumn(name="user_u_id")
    private User user;

    @Override
	public String toString() {
		return "Orders [oId=" + oId + ", oName=" + oName + ", oPrice=" + oPrice + ", oQuantity=" + oQuantity
				+ ", orderDate=" + orderDate + ", totalAmount=" + totalAmount + ", user=" + user + "]";
	}
}
