/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Library.Services.Model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;


@Data
@Entity
@ToString
@Table(uniqueConstraints={
        @UniqueConstraint(columnNames = {"reserve_start", "roomid"})
})
public class RoomReserve implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roomstat_id")
    private Long id;
    
    @Column(name = "reserve_start")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime reserveStart;
    
    @Column(name = "reserve_end")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime reserveEnd;
    
    
    @Min(1)
    @Max(3)
    private int roomid;
    @Column(name = "reserve_desc")
    private String reserveDesc;
    
    private Long reservee;
    
}
