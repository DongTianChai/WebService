package example;

import javax.xml.ws.Endpoint;

public class   Publisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/taxCalculator", new PersonalTaxCalculatorImpl());
        System.out.println("Tax Service is published at http://localhost:8080/taxCalculator");
    }
}
