package calculator.sky.pro.skycalculatordemo;

public interface CalculateService {

    public String helloCalculator();

    String operationPlus(Integer a, Integer b);

    String operationMinus(Integer a, Integer b);

    String operationMultiply(Integer a, Integer b);

    String operationDivision(Integer a, Integer b);
}
