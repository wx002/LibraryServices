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
 * This is the document keep track of room schedule. This allows us to keep track
 * of who have reserved rooms at which block of time
 * @author Ben Xu
 */
@Data
@Document(collection = "RoomSchedule")
public class RoomSchedule implements Serializable{
    private int roomID;
    private ArrayList<String> userTracker; 
    // Ex String: "name:somename, date: some date, timeframe:starttime - endtime"
    
    public RoomSchedule(int roomID){
        this.roomID = roomID;
        this.userTracker = new ArrayList<>();
    }
}
