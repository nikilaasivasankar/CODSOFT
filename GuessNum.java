import java.util.*;
class GuessNum
{
    public static void main(String[] args)
    {
        Random r=new Random();
        int min=1;
        int max=1000;
        int randomnum = r.nextInt(max-min+1)+min;
        Scanner s=new Scanner(System.in);
        System.out.print("Guess a number between "+min+" and "+max+":");
        int Guess = s.nextInt();
        System.out.println("Random number is "+ randomnum);
    }
}

/* OUTPUT 
Guess a number between 1 and 1000:508
Random number is 930  */
