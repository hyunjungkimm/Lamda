package refactoring.designPattern.observer;

public class LeMode implements Observer{

    @Override
    public void notify(String tweet) {
        if(tweet != null && tweet.contains("wine")){
            System.out.println("Today cheese, wine and news!" + tweet);
        }
    }
}
