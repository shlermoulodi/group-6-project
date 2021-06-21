import java.util.*;
public class RandomNumber {

    public int getRandomNumber(int a) {
        Random random = new Random();
        int upperbound = a;
        int ri = random.nextInt(upperbound);

        return ri;

    }
}
