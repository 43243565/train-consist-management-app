/**
 * MAIN CLASS: TrainConsistMgmt
 * Use Case 19: Binary Search for Bogie ID
 */

import java.util.Arrays;

// ----- MAIN CLASS -----
public class TrainConsistMgmt {

    public static void main(String[] args) {

        String[] ids = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // IMPORTANT: sort before binary search
        Arrays.sort(ids);

        String search = "BG309";

        int low = 0;
        int high = ids.length - 1;
        boolean found = false;

        // ----- BINARY SEARCH -----
        while (low <= high) {

            int mid = (low + high) / 2;

            int result = ids[mid].compareTo(search);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("Found ✔️");
        } else {
            System.out.println("Not Found ❌");
        }
    }
}