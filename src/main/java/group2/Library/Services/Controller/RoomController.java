/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Library.Services.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 *
 * @author Ben Xu
 */
@Controller
public class RoomController implements WebMvcConfigurer{
    
    @GetMapping("/room")
    public String getRoomInfo(@RequestParam Long roomId, Model model){
        model.addAttribute("roomId", roomId);
        return "/roomres/room";
    }
}
