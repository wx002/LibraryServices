package group2.Libaray.Services.model;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.ToString;


@Data
@Entity
@Table(name = "fee")
@ToString
public class Fee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fee_id")
    private Long id;
    
    private Double fee;
    
    private Timestamp feedate;
    
    private String feedesc;
    
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userid;
    
    @Enumerated(EnumType.STRING)
    private ChargeType feetype;
    
    public enum ChargeType{
        LATE,
        RENTAL,
        REPAIR,
        REPLACE,
        BUY
    }
}
