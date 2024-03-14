package com.mycalculator.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/greet-me/{name}")
    public String greetMe(@PathVariable("name") String pathVariableValue){
        return "Hello " + pathVariableValue;
    }

    @GetMapping("/sum")
    public int sum(@RequestParam("num1") int n1,@RequestParam("num2") int n2){
        return (n1 + n2);
    }

    @GetMapping("/sub")
    public int sub(@RequestParam("num1") int n1,@RequestParam("num2") int n2){
        return (n1 - n2);
    }

    @GetMapping("/mul")
    public int mul(@RequestParam("num1") int n1,@RequestParam("num2") int n2){
        return (n1 * n2);
    }

    @GetMapping("/div")
    public double div(@RequestParam("num1") int n1,@RequestParam("num2") int n2){
        return (double) n1 / n2;
    }
}
