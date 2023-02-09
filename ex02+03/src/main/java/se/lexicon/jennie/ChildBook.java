package se.lexicon.jennie;

public class ChildBook extends Book implements Loanable{

    public void loan(){
        System.out.println("Borrowed child book");
    }
}
