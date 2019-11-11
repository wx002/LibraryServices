package group2.Library.Services.Controller;
import group2.Library.DBInterfaces.RoomRepository;
import group2.Library.Services.Model.RoomReserve;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 *
 * @author RR-PC
 */
@Controller
@RequestMapping("/roomreserve/room")
public class RoomController implements WebMvcConfigurer{
    
    @Autowired
    private RoomRepository RoomRepo;
    

    @GetMapping
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

       
        model.addAttribute("roomNum", roomNum);
        model.addAttribute("roomName", getRoomName(roomNum));
        model.addAttribute("reservation", new RoomReserve());
        return "roomres/form";
    }
    
    @PostMapping
    public String saveReserve(@ModelAttribute("reservation") RoomReserve reservation, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "roomres/form";
        }
        RoomRepo.save(reservation);

        return "redirect:/roomreserve";
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
