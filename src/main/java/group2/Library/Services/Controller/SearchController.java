package group2.Library.Services.Controller;

import group2.Library.DBInterfaces.BookRepository;
import group2.Library.DBInterfaces.LoggingRepo;
import group2.Library.Services.Model.Book;
import group2.Library.Services.Model.LoggingMangement;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;


@Controller @RequestMapping("/search")
public class SearchController {

    @Autowired
    private BookRepository repo;
    
    @Autowired
    private LoggingRepo mongoRepo;

    public SearchController() {}

    @GetMapping
    public String showSearchPage(Model model) {
        model.addAttribute("SearchTermHolder", new SearchTermHolder());
        return "search";
    }

    @PostMapping
    public String showResults(@Valid SearchTermHolder searchtermholder, BindingResult br, Model model) {
        if(br.hasErrors())
            return "search";

        ArrayList<Book> books = new ArrayList<Book>();
        String searchTerm = searchtermholder.getSearchTerm().toLowerCase();

        for(Book b : repo.findAll()) {
            String title = b.getTitle().toLowerCase();
            String author = b.getAuthor().getAuthname().toLowerCase();
            String isbn = b.getIsbn();
            if(title.contains(searchTerm) || author.contains(searchTerm) || isbn.contains(searchTerm))
                books.add(b);
        }

        if(searchTerm.equals(""))
            books.clear();

        model.addAttribute("books", books);
        LoggingMangement l = new LoggingMangement();
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        l.setEntryDate(date);
        l.setDesc("User has serached: " + searchTerm);
        mongoRepo.save(l);

        return "searchResults";
    }

    public class SearchTermHolder {
        private String searchTerm;

        public void setSearchTerm(String searchTerm) {this.searchTerm = searchTerm;}

        public String getSearchTerm() {return this.searchTerm;}
    }
}
