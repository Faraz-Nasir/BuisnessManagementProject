package com.learning.buisnessproject.entities;

import org.springframework.beans.factory.annotation.Value;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int adminId;
    private String adminName;
    private String adminEmail;
    @Value("1234")
    private String adminPassword;
    private String adminNumber;
    
    @Override
public String toString() {
	return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminEmail=" + adminEmail + ", adminPassword="
			+ adminPassword + ", adminNumber=" + adminNumber + "]";
}

}
