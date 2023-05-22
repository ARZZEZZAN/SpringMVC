package edu.armenarzz.spring.Controllers;

import edu.armenarzz.spring.DAO.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/people")
public class PeopleController {
    private final PersonDao personDao;

    @Autowired
    public PeopleController(PersonDao personDao) {
        this.personDao = personDao;
    }

    @GetMapping()
    public String index( Model model) {
        return null;
    }
    @GetMapping("/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        return null;
    }
}
