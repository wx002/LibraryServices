package group2.Library.Services.Controller;
import group2.Library.DBInterfaces.RoomRepository;
import group2.Library.Services.Model.RoomReserve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 *
 * @author RR-PC
 */
@Controller
public class RoomController implements WebMvcConfigurer{
    
    @Autowired
    private RoomRepository RoomRepo;
        
    @GetMapping("roomreserve/room")
    public String getRoomInfo(@RequestParam Integer roomId, Model model){
        String welcome = null;
        switch(roomId){
            case 1:  welcome = "Study Room";
            break;
            case 2: welcome = "Meeting Room";
            break;
            case 3: welcome = "Entertainment Room";
            break;
        }
        model.addAttribute("roomReserves", RoomRepo.findByroomid(roomId));
        model.addAttribute("roomId", getRoomName(roomId));
        model.addAttribute("roomNum", roomId);
        return "roomres/room";
    }
    
    @GetMapping(params = "add")
    public String add(@RequestParam Integer roomNum, Model model) {

        model.addAttribute("roomRes", new RoomReserve());
        model.addAttribute("roomName", getRoomName(roomNum));
        return "roomres/form";
    }
    
    private String getRoomName(Integer roomNum){
        String name = null;
        switch(roomNum){
            case 1:  name = "Study Room";
            break;
            case 2: name = "Meeting Room";
            break;
            case 3: name = "Entertainment Room";
            break;
        }
        return name;
    }
}
