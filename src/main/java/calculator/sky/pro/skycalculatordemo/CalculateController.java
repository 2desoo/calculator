package calculator.sky.pro.skycalculatordemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculateController {

    private final CalculateService calculateService;

    @Autowired
    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping()
    public String helloCalculator() {
        return calculateService.helloCalculator();
    }

    @GetMapping("/plus")
    public String calculatorPlus(
            @RequestParam(name = "num1", required = false) Integer a,
            @RequestParam(name = "num2", required = false) Integer b) {
        return calculateService.operationPlus(a, b);
    }

    @GetMapping("/minus")
    public String calculatorMinus(
            @RequestParam(name = "num1", required = false) Integer a,
            @RequestParam(name = "num2", required = false) Integer b) {
        return calculateService.operationMinus(a, b);
    }

    @GetMapping("/multiply")
    public String calculatorMultiply(
            @RequestParam(name = "num1", required = false) Integer a,
            @RequestParam(name = "num2", required = false) Integer b) {
        return calculateService.operationMultiply(a, b);
    }

    @GetMapping("/divide")
    public String calculatorDivision(
            @RequestParam(name = "num1", required = false) Integer a,
            @RequestParam(name = "num2", required = false) Integer b) {
        return calculateService.operationDivision(a, b);
    }
}