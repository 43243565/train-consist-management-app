/**
 * MAIN CLASS: TrainConsistMgmt
 * Use Case 18: Linear Search for Bogie ID
 */

// ----- MAIN CLASS -----
public class TrainConsistMgmt {

    public static void main(String[] args) {

        String[] ids = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String search = "BG309";
        boolean found = false;

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