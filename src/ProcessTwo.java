import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Jamison Czech <A HREF="mailto:main@jamisonczech@gmail.com">
 * (jamisonczech@gmail.com) </A>
 */
public class ProcessTwo implements Runnable {
    BufferedWriter bw = null;
    FileWriter fw = null;

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
            int counter = 1;

        for (int i = 0; i < 10; i++) {
            /**
             * creates a randomNumber
             */
            RandomNumber randomNumber = new RandomNumber();
            int randomInt = randomNumber.getRandomNumberInRange(1, 3);

            try {
                File file = new File("OutPutFile.txt");
                fw = new FileWriter(file.getAbsoluteFile(), true);
                bw = new BufferedWriter(fw);
                /**
                 * /**
                 * Causes the currently executing thread to sleep (temporarily cease
                 * execution) for the specified number of milliseconds plus the specified
                 * number of nanoseconds, subject to the precision and accuracy of system
                 * timers and schedulers. The thread does not lose ownership of any
                 * monitors.
                 *
                 * @param  millis
                 *         the length of time to sleep in milliseconds
                 *
                 */
                Thread.sleep(randomInt);

                /**
                 * Output to console
                 */
                System.out.println(counter + ". " + "Thread Two + \t" + "Sleep: " + "\t" + randomInt);
                /**
                 * Output to file
                 */
                bw.write("Thread Two + \t" + "Sleep: " + "\t" + randomInt + "\r\n");
                bw.flush();
                bw.close();
                counter++;

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }// end run()
}
