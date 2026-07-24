package cn.lito.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {
    @GetMapping("/cicd")
    public String cicd() {
        return "CICD is working!";
    }
}
