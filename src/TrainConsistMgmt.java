/**
 * MAIN CLASS: TrainConsistMgmt
 * Use Case 17: Sort Bogie Names using Arrays.sort()
 *author shivam
 */

import java.util.Arrays;

// ----- MAIN CLASS -----
public class TrainConsistMgmt {

    public static void main(String[] args) {

        String[] bogies = {
                "Sleeper", "AC Chair", "First Class", "General", "Luxury"
        };

        Arrays.sort(bogies);

        for (String b : bogies) {
            System.out.println(b);
        }
    }
}