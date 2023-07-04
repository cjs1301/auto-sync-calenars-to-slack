package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("webhook/calender")
public class CalenderWebhookController {

    @PostMapping("google")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("ok");
    }
}
