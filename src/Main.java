/***************************************************************************************
 *   *********************************************************************************
 *
 *     Jamison Czech
 *     Due September 13th, 2017
 *     Assignment #1
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

/**
 * @author Jamison Czech <A HREF="mailto:main@jamisonczech@gmail.com">
 * (jamisonczech@gmail.com) </A>
 */

public class Main {

    public static void main(String[] args) {
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

        threadOne.start();// start thread one
        threadTwo.start();// start thread two


    }


}
