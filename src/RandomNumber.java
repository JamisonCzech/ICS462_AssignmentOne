import java.util.Random;

/**
 * @author Jamison Czech <A HREF="mailto:main@jamisonczech@gmail.com">
 * (jamisonczech@gmail.com) </A>
 */
public class RandomNumber {


    /**
     * Empty constructor
     */
    public RandomNumber() {
    }

    private int minimum = 1;
    private int maximum = 3;

    /**
     * Random.ints(int origin, int bound) or Random.ints(int min, int max)
     * generates a random integer from origin (inclusive) to bound (exclusive).
     *
     * @param min value of one
     * @param max value of three
     * @return random int int the range from 1 - 3.
     */
    public int getRandomNumberInRange(int min, int max) {
        this.minimum = min;
        this.maximum = max;
        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();

    }
}
