/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Library.Services.Controller;
import group2.Library.DBInterfaces.TransactionRepository;
import group2.Library.Services.Model.Book;
import group2.Library.Services.Model.Transaction;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
/**
 *
 * @author ejswa
 */
@Controller @RequestMapping("/transaction")
public class TransactionController {
    
    @Autowired
    private TransactionRepository repo;
    
    public TransactionController() {}
    
    @GetMapping
    public String TransactBook(Model model){
        model.addAttribute("Transaction", new Transaction());
        return "transaction";
    }     
    
    @PostMapping
    public String confirmTransact(@Valid Transaction t, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()) {
            return "transaction";
        }        
        
        return "TransactionConfirm";
    }
    
}
