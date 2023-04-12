// Returns the SmCoffee for the IfStatement
import PracticeProblems.IfStatement;

public class Shipment {
    // Creates a new Cafe.
    Cafe cf = new Cafe();
    IfStatement IF = new IfStatement();
    private double shipmentCost;
    private double shipmentDate; 
    private double SmCoffee;
    private double SmBuiscut;
    private double SmBrownie;
    private double SmCookie;
    private boolean TestStatement;

    // This method is used to initialize the shipment.
    public Shipment() { 
        shipmentCost = 0; 
        shipmentDate = 0; 
        SmBrownie = 0; 
        SmBuiscut = 0; 
        SmCoffee = 0 ; 
        SmCookie = 0;
    }
    // Sends a shipment order to the server.
    public void ShipmentOrder( double I , double B , double C , double F , double D, int A){ 
        // Calculate the shipment cost 
        shipmentCost =( ((I * A) * 1.5) + ((B * A) * 1.75) + ((C * A) * 2.25) + ((F * A) * 2));
        shipmentDate = cf.getDays() + A; 
        SmBrownie = B * A; 
        SmBuiscut = I * A; 
        SmCoffee = F * A; 
        SmCookie = C * A; 
    }
    public void Test( int a , int b , int c) { 
        IF.IsGreaterThen( a , b );
        TestStatement = IF.GetStoredStatement();
        }


    public double getShipmentCost() { 
     return shipmentCost; 
    }
    public double getShipmentDate() { 
        return shipmentDate;
    }
    public Double getSmBuiscut() { 
        return SmBuiscut;
    }
    public Double getSmCookie() { 
        return SmCookie;
    }
    // Returns true if the request was successful.
    public Double getSmBrownie() { 
        return SmBrownie;
    }
    public Double getSmCoffee() { 
        return SmCoffee;
    }
    public boolean getTestStatement(){ 
        return TestStatement;
    }
    // Returns true if the request was successful.
}
