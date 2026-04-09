/**
 * MAIN CLASS: TrainConsistMgmt
 * Use Case 20: Exception Handling During Search
 */

// ----- MAIN CLASS -----
public class TrainConsistMgmt {

    public static void main(String[] args) {

        String[] ids = {}; // EMPTY ARRAY

        String search = "BG101";

        // ----- FAIL FAST VALIDATION -----
        if (ids.length == 0) {
            throw new IllegalStateException("No bogies available ❌");
        }

        boolean found = false;

        // SEARCH (runs only if not empty)
        for (String id : ids) {
            if (id.equals(search)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found ✔️");
        } else {
            System.out.println("Not Found ❌");
        }
    }
}