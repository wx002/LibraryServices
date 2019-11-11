package group2.Library.Services.Controller;
import group2.Library.DBInterfaces.RoomRepository;
import group2.Library.Services.Model.RoomReserve;
import java.util.List;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;    
import java.time.LocalTime;
import java.util.ListIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class RoomReserveController implements WebMvcConfigurer{
    
    @Autowired
    private RoomRepository RoomRepo;
    
    @GetMapping("/roomreserve")
    public String roomres(Model model){
        model.addAttribute("room1status", isRoomReserved(1));
        model.addAttribute("room2status", isRoomReserved(2));
        model.addAttribute("room3status", isRoomReserved(3));
        
        return "/roomres/roomreserve";
    }
    
    private boolean isRoomReserved(int roomNum){
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        List<RoomReserve> roomRes = RoomRepo.findByroomid(roomNum);
        ListIterator<RoomReserve> iterator = roomRes.listIterator();
        while(iterator.hasNext()){
            RoomReserve room = iterator.next();
            LocalDateTime start = room.getReserveStart();
            if(start.toLocalDate().compareTo(currentDate)==0){
                if(start.toLocalTime().getHour()==currentTime.getHour()){
                    return true;
                };
            };
        }
        return false;
    }
}
