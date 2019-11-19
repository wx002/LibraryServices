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
 * This is the document keep track of modification of the database from the
 * back-end. 
 * All parameters are not finalized. Object name could be changed. String is used
 * as placeholder.
 * Things such as new books are being added would be logged to keep
 * record.
 * @author Ben Xu
 */
@Data
@Document(collection = "Logging")
public class LoggingMangement implements Serializable{
    private Date entryDate;
    private String desc;
}
