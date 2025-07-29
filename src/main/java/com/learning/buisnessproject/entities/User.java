package com.learning.buisnessproject.entities;


import java.util.List;

import jakarta.persistence.*;
import lombok.Data;;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int u_id;

    private String uname;
    private String uemail;
    private String upassword;
    private Long unumber;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Orders> orders;


    @Override
    public String toString(){
        return "User [u_id="+u_id+", uname="+uname+", uemail="+uemail+", upassword="+upassword+", unumber="+unumber+", orders="+orders+"]";
    }
}
