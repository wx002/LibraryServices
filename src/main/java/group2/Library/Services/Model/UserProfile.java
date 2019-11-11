/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Library.Services.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;
/**
 * This is the document used to keep track of user data.
 * @author Ben Xu
 */
@Data
@Document(collection = "Users")
@ToString
public class UserProfile implements Serializable{
    
    
    @JsonProperty
    private long ID;
    @JsonProperty
    private String username;
    @JsonProperty
    private String email;
    @JsonProperty
    private double Fees;
    @JsonProperty
    private ArrayList<String> booksBorrowed;
    @JsonProperty
    private ArrayList<String> roomReserved;
    @JsonProperty
    private Date libraryCardExpireDate;
}
