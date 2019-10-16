/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Library.Services.Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * This is the document used to keep track of user data.
 * @author Ben Xu
 */
@Data
@Document(collection = "Users")
public class UserProfile implements Serializable{
    private int libraryID;
    private String username;
    private String dateOfBirth;
    private String email;
    private Float Fees;
    private ArrayList<String> booksBorrowed;
    private ArrayList<String> roomReserved;
    private Date libraryCardExpireDate;
}
