package example;

import javax.jws.WebService;

@WebService(targetNamespace = "http://example/")
public class PersonalTaxCalculatorImpl {

    public double calculateTax(double income) {
        // 简单的个人所得税计算逻辑
        if (income <= 5000) {
            return 0; // 起征点
        } else {
            return (income - 5000) * 0.1; // 10% 的税率
        }
    }
}
