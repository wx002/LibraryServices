/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Libaray.Services.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "user")
@ToString
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    
    @Column(name= "firstname")
    private String firstName;
    
    private String lastname;
    
    private String username;
    
    private String email;
    
    @Column(name = "pass")
    private String passwordHash;
    
    @Column(name = "age")
    private int userAge;
    
    private String address;
    
    
    @Enumerated(EnumType.STRING)
    private UserType usertype;
    
    public enum UserType{
        STDNT,
        ELDRY,
        CHILD,
        REGLR,
        FCLTY;
    }
}
