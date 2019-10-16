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
 * The document keep track of fees accumulated by users.
 * @author Ben Xu
 */
@Data
@Document(collection = "Income")
public class income implements Serializable {
    private int userID;
    private float paidFee;
    private float currentFeeTotal;
}
