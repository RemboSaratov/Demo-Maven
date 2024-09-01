package pro.sky.skyprospringmycalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public int plus(Integer a, Integer b) {
        return a + b;
    }

    public int minus(Integer a, Integer b) {
        return a - b;
    }

    public int multiply(Integer a, Integer b) {
        return a * b;
    }

    public float divide(Integer a, Integer b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль");
        }
        return (float) a / b;
    }
}
