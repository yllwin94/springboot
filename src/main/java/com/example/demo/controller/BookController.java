package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class BookController {

    /**
     * 访问主页
     * @param model io
     * @return hello view
     */
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("tip", "first springboot project");
        return "hello";
    }

    @GetMapping("/book")
    @ResponseBody
    public ResponseEntity<Map<String, String>> book(){
        return new ResponseEntity<>(Map.of("name","lily's book", "price", "100"), HttpStatus.OK);
    }

}
