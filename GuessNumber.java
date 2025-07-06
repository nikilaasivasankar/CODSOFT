import java.util.*;
class GuessNumber
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
        if(Guess==randomnum)
        {
            System.out.println("Your guess is correct");
        }
        else if(Guess>randomnum)
        {
            System.out.println("Your guess is too high!");
        }
        else if(Guess<randomnum)
        {
            System.out.println("Your guess is too low!");
        }
    }
}
    
    
/*OUTPUT
Guess a number between 1 and 1000:298
Random number is 692
Your guess is too low! */
    
