/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Libaray.Services.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author RR
 */
@Data
@Entity
@Table(name = "books")
@ToString
public class Books implements Serializable{
    
    private static final long serialVersionUID = 2L;
    
    //TODO, dont use data with meaning as primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookID;
    
    private String isbn;
    
    private String title;
    
    private int copies;
    
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;
    
    /*
    @OneToMany(
            mappedBy = "pubYear",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    
    @ToString.Exclude
    private List<BooksByYear> year;
    */
    

}
