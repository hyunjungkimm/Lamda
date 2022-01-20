package refactoring.designPattern.observer;

public class Main {
    public static void main(String[] args) {
        Feed f = new Feed();
        f.registerObserver(new NYTimes());
        f.registerObserver(new Guardian());
        f.registerObserver(new LeMode());
        f.notifyObserver("The queen said her favourite book is Modern Java in Action!");

        //람다
        f.registerObserver((String tweet) -> {
            if(tweet != null && tweet.contains("money")){
                System.out.println("Breaking new in NY! " + tweet);
            }
        });

        f.registerObserver((String tweet) -> {
            if(tweet != null && tweet.contains("queen")){
                System.out.println("Yet more news from London ... " + tweet);
            }
        });

        f.notifyObserver("The queen said money is favourite things");
    }
}
