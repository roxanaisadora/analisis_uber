import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car {
    Map<String, ArrayList<Integer>> typeCarAccepted;
    ArrayList<Integer>  seatsMaterial;

    public UberBlack(String license, Account driver, Map<String, ArrayList<Integer>> typeCarAccepted, ArrayList<Integer>  seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
        }
}
