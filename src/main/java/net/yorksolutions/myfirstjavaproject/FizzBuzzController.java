package net.yorksolutions.myfirstjavaproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FizzBuzzController {
    @GetMapping("/fizzbuzz")
    String fizzbuzz(@RequestParam int input) {
        return FizzBuzz.fizzbuzz(input);
    }
}
