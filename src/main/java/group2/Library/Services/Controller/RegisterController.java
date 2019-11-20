/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Library.Services.Controller;
import group2.Library.DBInterfaces.UserRepo;
import group2.Library.DBInterfaces.UserRepository;
import group2.Library.Services.Model.User;
import group2.Library.Services.Model.UserProfile;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;
/**
 *
 * @author Ben Xu
 */
@Controller
public class RegisterController implements WebMvcConfigurer{

    @Autowired
    UserRepository registerRepoSQL;
    
    @Autowired
    UserRepo registerRepoMongo;
    
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    
    public RegisterController(UserRepository u, UserRepo r){
        this.registerRepoSQL = u;
        this.registerRepoMongo = r;
    }
    
    @GetMapping("/register")
    public String register(Model m){
        m.addAttribute("user", new User());
        return "register";
    }
    
    @PostMapping("/register")
    public String postRegsiter(@ModelAttribute User u)
    {   
        //SQL side
        u.setPasswordHash(encoder.encode(u.getPasswordHash()));
        int age = u.getUserAge();
        if (age < 10 ){
            u.setUsertype(User.UserType.CHILD);
        } else if (age >= 10 && age <= 18 ){
            u.setUsertype(User.UserType.STDNT);
        } else if (age >= 65){
            u.setUsertype(User.UserType.ELDRY);
        } else{
            u.setUsertype(User.UserType.REGLR);
        }
        String currentEmail = u.getEmail();
        registerRepoSQL.save(u);
        
        User fromDB = registerRepoSQL.findByemail(currentEmail);
        System.out.println("from db data = " + fromDB.toString());
        long id = fromDB.getId();
        u.setId(id);
        
        //Mongo Side
        UserProfile u2;
        u2 = new UserProfile();
        u2.setID(id);
        u2.setEmail(u.getEmail());
        u2.setFees(0.0);
        u2.setBooksBorrowed(new ArrayList<String>());
        
        //set expiration time to be 1 year
        Calendar cal = Calendar.getInstance();
        Date today = cal.getTime();
        cal.add(Calendar.YEAR, 1);
        Date expiredDate = cal.getTime();
        u2.setLibraryCardExpireDate(expiredDate);
        u2.setRoomReserved(new ArrayList<>());
        registerRepoMongo.save(u2);
        return "userProfile";
        
    }
}
