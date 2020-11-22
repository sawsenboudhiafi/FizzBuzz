package com.mn.fizzbuzz;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/fizzbuzz")
public class FizzBuzzController {
	
    @RequestMapping("/{number}")
    public String fizzBuzz(@PathVariable("number") int number) {
        return toFizzBuzz(number);
    }
    
   
        public String toFizzBuzz(int n) {
        	 if (n % 3 == 0 && n % 5 == 0) {
                 return "FizzBuzz";
             }

            if (n % 3 == 0) {
                return "Fizz";
            }

            if (n % 5 == 0) {
                return "Buzz";
            }
            
            
            return String.valueOf(n+1);
        }
}
