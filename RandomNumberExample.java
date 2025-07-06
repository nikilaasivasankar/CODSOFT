import java.util.Random;
public class RandomNumberExample 
{
    public static void main(String[] args) 
    {
        Random random = new Random();
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min;
        System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
    }
}

/* OUTPUT
Random number between 1 and 100: 99 
*/