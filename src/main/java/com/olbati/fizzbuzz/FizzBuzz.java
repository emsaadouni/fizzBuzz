package com.olbati.fizzbuzz;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {

    private Map<Integer, String> config = new HashMap<>();
    {
        config.put(3, "Fizz");
        config.put(5, "Buzz");
        config.put(7, "Fazz");
    }

        public String processNew(int input) {
            StringBuilder result = new StringBuilder();
            for (Map.Entry<Integer, String> entry : config.entrySet()) {
                if ((input % entry.getKey()) == 0) {
                    result.append(entry.getValue());
                }
            }
            if(result.length() == 0){r
                result.append((input));
            }
            return result.toString();
        }

    public String process(int input) {
        if(input < 1 || input > 100) {
            throw new IllegalArgumentException();
        }
        if (isDivisibleBy3(input) && isDivisibleBy5(input)) {
            return "FizzBuzz";
        }
        if (isDivisibleBy3(input)) {
            return "Fizz";
        }
        if (isDivisibleBy5(input)) {
            return "Buzz";
        }
        return Integer.toString(input);
    }
    private boolean isDivisibleBy5(int input) {
        return input % 5 == 0;
    }
    private boolean isDivisibleBy3(int input) {
        return input % 3 == 0;
    }
}