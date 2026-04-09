/**
 * MAIN CLASS: TrainConsistMgmt
 * Use Case 15: Safe Cargo Assignment
 * author shivam pur
 */

// ----- CUSTOM RUNTIME EXCEPTION -----
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String msg) {
        super(msg);
    }
}

// ----- GOODS BOGIE CLASS -----
class GoodsBogie {
    String shape;
    String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {
        try {
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe Cargo ❌");
            }
            this.cargo = cargo;
            System.out.println("Cargo Assigned ✔️: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Operation Completed 🔄");
        }
    }
}

// ----- MAIN CLASS -----
public class TrainConsistMgmt {
    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");
    }
}