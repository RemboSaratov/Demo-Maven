package pro.sky.skyprospringmycalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String hello () {
        return "Добро пожаловать в калькулятор";
    }

    public String plus (int a, int b) {
        int c = 0;
        c = a + b;
        return a + " + " + b + " = " + c;
    }
    public String minus (int a, int b) {
        int c = 0;
        c = a - b;
        return a + " - " + b + " = " + c;
    }
    public String multiply (int a, int b) {
        int c = 0;
        c = a * b;
        return a + " * " + b + " = " + c;
    }
    public String divide (int a, int b) {
        int c = 0;
        c = a / b;
        return a + " / " + b + " = " + c;
    }
}
