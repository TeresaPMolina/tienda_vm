package com.tienda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tienda.services.CategoriaService;

@Controller
@RequestMapping ("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping ("/listado")
    public String listado (Model model) {
        var lista=categoriaService.getCategoria(false);
        
        model.addAttribute("categorias", lista);
         model.addAttribute("totalCategorias", lista.size());
        
        
        return"/categoria/listado";
    }
    
    
}
