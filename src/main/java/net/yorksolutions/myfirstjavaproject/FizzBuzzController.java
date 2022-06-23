package net.yorksolutions.myfirstjavaproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FizzBuzzController {
    FizzBuzz fizzBuzz;

    // Production
    FizzBuzzController() {
        fizzBuzz = new FizzBuzz();
    }

    // Testing
    void setFizzBuzz(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    @GetMapping("/fizzbuzz")
    String fizzbuzz(@RequestParam int input) {
        return fizzBuzz.fizzbuzz(input);
    }
}
