package com.example.javabasic.exercise.day13;

import org.apache.maven.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/emp")
public class EmployeeController {
    @GetMapping
    public String home(){
        return "empForm";
    }

    @PostMapping
    public String displayEmployee(@RequestParam("employee") Employee employee, org.springframework.ui.Model model){
        model.addAttribute("name",employee.getName());
        model.addAttribute("add",employee.getAddress());
        return "display";
    }

}
