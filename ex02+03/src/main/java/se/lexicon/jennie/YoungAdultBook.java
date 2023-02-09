package se.lexicon.jennie;

public class YoungAdultBook extends Book implements Loanable{

    public void loan(){
        System.out.println("Borrowed young adult book");
    }
}
