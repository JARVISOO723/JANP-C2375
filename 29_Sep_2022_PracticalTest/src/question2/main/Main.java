package question2.main;

import question2.thread.ThankYou;
import question2.thread.Welcome;

public class Main {
    public static void main(String args[]){

        Thread wc = new Welcome();
        Thread ty = new ThankYou();
        wc.start();
        ty.start();      
      
}
}