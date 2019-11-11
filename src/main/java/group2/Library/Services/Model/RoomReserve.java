/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Library.Services.Model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.Data;
import lombok.ToString;


@Data
@Entity
@ToString
public class RoomReserve implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roomstat_id")
    private Long id;
    
    @Column(columnDefinition = "DATE")
    private Date reserveDate;
    @Column(columnDefinition = "TIME")
    private Time reserveStart;
    @Column(columnDefinition = "TIME")
    private Time reserveEnd;
    
    
    @Min(1)
    @Max(3)
    private int roomid;
    
    private String reserveDesc;
    
    @OneToOne
    private User reservee;
    
}
