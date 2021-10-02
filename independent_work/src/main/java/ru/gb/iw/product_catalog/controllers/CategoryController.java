package ru.gb.iw.product_catalog.controllers;

import org.springframework.web.bind.annotation.*;
import ru.gb.iw.product_catalog.models.Category;


@RestController
@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, path = "/categories")

public class CategoryController {

    @GetMapping(path = "/")
    public Category getCategories(@RequestParam("name")String categoryName) {
        if(categoryName==null) {
            // list categories
        }else {
            // fetch and return given category
        }
        return null;
    }
}