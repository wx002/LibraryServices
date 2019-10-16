/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Libaray.Services.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author RR
 */
@Data
@Entity
@Table(name = "Members")
public class Members {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;
    
    @ManyToOne
    @JoinColumn(name="LibID")
    private Library primaryLib;
    
    private String userType;
    
    private String firstName;
    
    private String lastName;
    
    
}
