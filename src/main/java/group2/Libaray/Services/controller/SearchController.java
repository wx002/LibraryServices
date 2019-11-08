package group2.Libaray.Services.controller;

import group2.Libaray.Services.model.Book;
import group2.Libaray.Services.model.BookRepository;
import group2.Libaray.Services.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

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
    public String resultsByISBN(@ModelAttribute ISBNholder ISBNholder, Model model) {
        model.addAttribute("books", repo.findByisbn(ISBNholder.getISBN()));
        return "searchResults";
    }

    private class ISBNholder {
        String ISBN;

        public ISBNholder() {}

        public void setISBN(String ISBN) { this.ISBN = ISBN; }

        public String getISBN() { return ISBN; }
    }
}
