package ru.gb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, path = "/products")

public class ProductController {

}