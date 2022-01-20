package refactoring.designPattern.strategy;

import refactoring.designPattern.strategy.IsAllLowerCase;
import refactoring.designPattern.strategy.IsNumeric;
import refactoring.designPattern.strategy.Validator;

public class Main {
    public static void main(String[] args) {
        Validator numbericValidator = new Validator(new IsNumeric());
        boolean b1 = numbericValidator.validate("aaaa");//false
        Validator lowerCaseValidator = new Validator(new IsAllLowerCase());
        boolean b2 = lowerCaseValidator.validate("bbbb");//true

        System.out.println(b1);
        System.out.println(b2);

        //람다
        Validator numbericValidatorLamda = new Validator((String s) -> s.matches("[a-z]+"));
        boolean b11 = numbericValidatorLamda.validate("aaaa");//true
        Validator lowerCaseValidatorLamda = new Validator((String s) -> s.matches("//d+"));
        boolean b22 = lowerCaseValidatorLamda.validate("bbbb");//false

        System.out.println(b11);
        System.out.println(b22);


    }
}
