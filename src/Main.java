/***************************************************************************************
 *   *********************************************************************************
 *
 *     Jamison Czech
 *     Assignment #1
 *     Due September 13th, 2017
 *
 *     Processes/Threads Homework problem ICS 462 Operating Systems *
 *
 ***************************************************************************************/

/***************************************************************************************
 *   *********************************************************************************
 *
 *   Title: title of program/source code
 *    Author: author(s) names: Dave Marshall
 *    Date Accessed: September 8th, 2017
 *    Availability: https://users.cs.cf.ac.uk/Dave.Marshall/C/node32.html
 *
 ***************************************************************************************/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Jamison Czech <A HREF="mailto:main@jamisonczech@gmail.com">
 * (jamisonczech@gmail.com) </A>
 */

public class Main {

    public static void main(String[] args) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        /**
         * Create the initial thread
         */
        ProcessOne processOne = new ProcessOne();
        Thread threadOne = new Thread(processOne);

        /**
         * Create the second thread
         */
        ProcessTwo processTwo = new ProcessTwo();
        Thread threadTwo = new Thread(processTwo);

         /**
         * Start thread processes
         */
        threadOne.start();// start thread one
        threadTwo.start();// start thread two


        /**
         * Create file for output with name and date to begin with.
         */
        File file = new File("OutPutFile.txt");
        try {
            fw = new FileWriter(file.getAbsoluteFile(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        bw = new BufferedWriter(fw);
        try {
            bw.write("Jamison Czech\r\n" + "Assignment One\r\n" +
                    "Due September 13th, 2017\r\n\r\n" );
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
