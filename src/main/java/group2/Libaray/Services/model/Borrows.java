/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Libaray.Services.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author RR
 */
@Data
@Entity
@Table(name = "Borrows")
public class Borrows implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long borrowID;
    
    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private Members userID;
    
    @OneToOne
    @JoinColumn(name = "isbn", nullable = false)
    private Books isbn;
    
    private LocalDate checkoutDate;
    
    private LocalDate dueDate;
    
    private String userType;
    
}
