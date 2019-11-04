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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.ToString;


@Data
@Entity
@ToString
public class RoomReserve implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Long id;
    
    private Timestamp reserveDate;
    
    private Double reserveDuration;
    
    private int roomid;
    
    private String reserveDesc;
    
    @OneToOne
    private User reservee;

    
}
