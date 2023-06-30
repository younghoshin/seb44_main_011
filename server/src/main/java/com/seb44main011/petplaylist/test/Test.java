package com.seb44main011.petplaylist.test;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Validated
@RequiredArgsConstructor
public class Test {
    @GetMapping
    public String Tests(){
        return "hello Spring";
    }
}
