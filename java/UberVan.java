import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<Integer, String>> typeCarAccepted;
    ArrayList<Integer>  seatsMaterial;
    
    public UberVan(String license, Account driver) {
        super(license, driver);
    }

    public UberVan(String license, Account driver, Map<String, Map<Integer, String>> typeCarAccepted,
            ArrayList<Integer> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            System.out.println("Passengers : " + passenger);
            }else{
               System.out.println("It's onlie 6 passenger");
            }
    }
    
}
