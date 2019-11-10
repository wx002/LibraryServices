package group2.Library.Services.Controller;

import group2.Library.DBInterfaces.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import javax.validation.Valid;


@Controller @RequestMapping("/search")
public class SearchController {

    @Autowired
    private BookRepository repo;

    public SearchController() {}

    @GetMapping
    public String showSearchPage(Model model) {
        model.addAttribute("ISBNholder", new ISBNholder());
        return "search";
    }

    @PostMapping
    public String showISBN(@Valid ISBNholder isbnholder, BindingResult br, Model model) {
        if(br.hasErrors())
            return "search";
        model.addAttribute("books", repo.findByisbn(isbnholder.getISBN()));
        return "searchResults";
    }

    public class ISBNholder {
        private String ISBN;

        public void setISBN(String ISBN) {this.ISBN = ISBN;}

        public String getISBN() {return this.ISBN;}
    }
}
