import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

class DP extends Thread{

    @Override
    public void run() {
        try {


            for (int i = 0; i < 10; i++) {
                System.out.println("Reaching in " + i + " seconds");
                Thread.sleep(3000);

            }
        }
        catch (InterruptedException ie){
            System.out.println("delivery interrupted");
        }
    }
}

class Stopper extends Thread{

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Continue?");
        String choice = sc.next();
        if(!choice.isEmpty()){
            Main.dp.interrupt();
        }
    }
}

class Main extends Thread{
    static DP dp = new DP();
    static Stopper stopper = new Stopper();

    public static void main(String[] args) {


        //stopper.start();
        //dp.start();
        char[] trial = "Pooja".toCharArray();
        for (int i = 0; i < trial.length; i++) {
            trial[i] = (char)((trial[i]+1)*10);
        }
        System.out.println(trial);
        for (int i = 0; i < trial.length; i++) {
            trial[i] = (char)((trial[i]-1)/10);
        }
        System.out.println(trial+" dfdf");
    }
}