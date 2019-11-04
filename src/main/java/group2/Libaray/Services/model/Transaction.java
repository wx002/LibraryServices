/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Libaray.Services.model;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "transactions")
@ToString
public class Transaction implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private long id;
    
    private Timestamp transactiondate;
    
    @ManyToOne
    @JoinColumn(name = "bookID", nullable = false)
    private Book bookID;
    
    @ManyToOne
    @JoinColumn(name = "userid", nullable = false)
    private User userid;
    
    @Enumerated(EnumType.STRING)
    private Status itemstatus;
    
    public enum Status{
        HOLD,
        RSRV,
        LATE,
        COUT //Checked out
    
    }
    
}
