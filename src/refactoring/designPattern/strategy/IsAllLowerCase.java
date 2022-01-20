package refactoring.designPattern.strategy;

public class IsAllLowerCase implements ValidationStrategy{

    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}
