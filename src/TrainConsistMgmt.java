/**
 * MAIN CLASS: TrainConsistMgmt
 * Use Case 16: Sort Passenger Bogies by Capacity (Bubble Sort)
 *
 * Description:
 * Sorts passenger bogie capacities manually using Bubble Sort
 * without using built-in sorting methods.
 * author shivam
 */


import java.util.ArrayList;
import java.util.List;

// ----- PASSENGER BOGIE CLASS -----
class PassengerBogie {
    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println("Bogie Type: " + type + " | Capacity: " + capacity);
    }
}

// ----- MAIN CLASS -----
public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("UC16 - Sort Passenger Bogies using Bubble Sort");
        System.out.println("==================================================\n");

        List<PassengerBogie> bogieList = new ArrayList<>();

        // ----- ADD BOGIES -----
        bogieList.add(new PassengerBogie("Sleeper", 72));
        bogieList.add(new PassengerBogie("AC Chair", 56));
        bogieList.add(new PassengerBogie("First Class", 24));
        bogieList.add(new PassengerBogie("Sleeper", 70));
        bogieList.add(new PassengerBogie("AC Chair", 60));

        // ----- DISPLAY ORIGINAL ORDER -----
        System.out.println("Original Bogies:\n");
        for (PassengerBogie b : bogieList) {
            b.display();
        }

        // ----- BUBBLE SORT LOGIC -----
        int n = bogieList.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (bogieList.get(j).capacity > bogieList.get(j + 1).capacity) {

                    // Swap bogies
                    PassengerBogie temp = bogieList.get(j);
                    bogieList.set(j, bogieList.get(j + 1));
                    bogieList.set(j + 1, temp);
                }
            }
        }

        // ----- DISPLAY SORTED RESULT -----
        System.out.println("\nSorted Bogies (Ascending Capacity):\n");
        for (PassengerBogie b : bogieList) {
            b.display();
        }

        System.out.println("\nUC16 sorting completed...");
    }
}