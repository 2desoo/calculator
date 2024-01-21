package calculator.sky.pro.skycalculatordemo;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {

    public String helloCalculator() {
        return "Welcome to Calculator";
    }

    public String operationPlus(Integer a, Integer b) {
        if (a == null || b == null) {
            return "Both numbers are required";
        }
        int result = a + b;
        return a + " + " + b + " = " + result;
    }

    public String operationMinus(Integer a, Integer b) {
        if (a == null || b == null) {
            return "Both numbers are required";
        }
        int result = a - b;
        return a + " - " + b + " = " + result;
    }

    public String operationMultiply(Integer a, Integer b) {
        if (a == null || b == null) {
            return "Both numbers are required";
        }
        int result = a * b;
        return a + " * " + b + " = " + result;
    }

    public String operationDivision(Integer a, Integer b) {
        if (a == null || b == null) {
            return "Both numbers are required";
        } else if (b == 0) {
            return "Division by zero is not allowed";
        }
        int result = a / b;
        return a + " / " + b + " = " + result;
    }

}
