package net.storage.controller;

import net.storage.service.NotebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProductController {

    @Autowired
    NotebookService notebookService;

    @RequestMapping (value = "/product/{id}")
    public String getNotebook(@PathVariable("id") int id, Model model){
        model.addAttribute("notebook",notebookService.getById(id));
        return "product";
    }
}
