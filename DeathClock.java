import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
//Trevor Hornsby
//Jack Hendrickson
public class DeathClock
{
    public static void main(String[] args)
    {
        Random rand = new Random();

        ArrayList<String> hendricksonQuote = new ArrayList<String>();
        hendricksonQuote.add("How good was your life anyways?");
        hendricksonQuote.add("You still have time to go to smoothie king?");
        hendricksonQuote.add(" Life is hardly worth living after 25 anyway.");
        hendricksonQuote.add("rack up some debt while you still can");
        hendricksonQuote.add("Time to order the box for your worm food");
        hendricksonQuote.add("There's one way to beat the IRS");
        hendricksonQuote.add("Your addictions wont plague you forever");
        hendricksonQuote.add("It's time to join the winning team");
        hendricksonQuote.add("Swing low");
        hendricksonQuote.add("If you're scared, try a religion... or hard drugs");
        hendricksonQuote.add("You really died a long time ago, didn't you? The you who mattered at least");
        hendricksonQuote.add("At least Castro is there");
        hendricksonQuote.add("at least you won't have to worry about climate change");
        hendricksonQuote.add("There's always time to turn things around. But not enough where it's worth it.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Welcome to the death clock~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("It does however have a margin of error of a few years, \"What with free will and all....\"");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in lbs:");
        double weight = input.nextDouble();
        System.out.print("Enter your height in inches:");
        double height = input.nextDouble();
        System.out.print("Enter the year you were born:");
        double year = input.nextDouble();
        double age = 2019 - year;
        double timeLeft = 81 - age;
        double death;
        double BMI = (weight * 703)/ (height * height);
        System.out.println();
        if(BMI <= 18){
            death = timeLeft * .95;
            int deathInt = (int)death;
            int deathYear = +2019 + deathInt;
            System.out.println("You have "+death+" years left on this miserable planet, or you will probably die around the year "+deathYear);
            System.out.println();
            System.out.println(hendricksonQuote.get( rand.nextInt(13)));
        }else if(18 < BMI && BMI <= 24){
            death = timeLeft * 1;
            int deathInt = (int)death;
            int deathYear = +2019 + deathInt;
            System.out.println("You have "+death+" years left on this miserable planet, or you will probably die around the year "+deathYear);
            System.out.println();
            System.out.println(hendricksonQuote.get( rand.nextInt(13)));
        }else if(24 < BMI && BMI <= 29){
            death = timeLeft * .95;
            int deathInt = (int)death;
            int deathYear = +2019 + deathInt;
            System.out.println("You have "+death+" years left on this miserable planet, or you will probably die around the year "+deathYear);
            System.out.println();
            System.out.println(hendricksonQuote.get( rand.nextInt(13)));
        }else if(29 < BMI && BMI <= 39){
            death = timeLeft * .9;
            int deathInt = (int)death;
            int deathYear = +2019 + deathInt;
            System.out.println("You have "+death+" years left on this miserable planet, or you will probably die around the year "+deathYear);
            System.out.println();
            System.out.println(hendricksonQuote.get( rand.nextInt(13)));
        }else if(39 < BMI){
            death = timeLeft * .8;
            int deathInt = (int)death;
            int deathYear = +2019 + deathInt;
            System.out.println("You have "+death+" years left on this /miserable planet, or you will probably die around the year "+deathYear);
            System.out.println();
            System.out.println(hendricksonQuote.get( rand.nextInt(13)));
        }
        System.out.println();
        System.out.println("      .-.");
        System.out.println("     (o.o)");
        System.out.println("      |=|");
        System.out.println("     __|__");
        System.out.println("   //.=|=.\\\\");
        System.out.println("  // .=|=. \\\\");
        System.out.println("  \\\\ .=|=. //");
        System.out.println("   \\\\(_=_)//");
        System.out.println("    (:| |:)");
        System.out.println("     || ||");
        System.out.println("     () ()");
        System.out.println("     || ||");
        System.out.println("     || ||");
        System.out.println("    ==' '==");

    }
}
