/*Implement a class Address . An address has 
 -a house number
 -a street
 -an optional apartment number
 -a city
 -a state
 -a postal code. 
 Supply two constructors: one with an apartment number and one without. Supply a print method that 
 prints the address with the street on one line and the city,state, and zip code on the next line. 
 Supply a method public boolean comesBefore(Address other) that tests whether this address comes 
 before another when the addresses are compared by postal code.*/

public class Address {
    private String houseNumber;
    private String street;
    private String state;
    private String city;
    private int apartmentNumber;
    private int postalCode;
    
    public Address(String houseNumber, String street, int apartmentNumber, String state, String city, int postalCode)
    {
        this.houseNumber=houseNumber;
        this.street=street;
        this.state=state;
        this.city=city;
        this.apartmentNumber=apartmentNumber;
        this.postalCode=postalCode;
    }
    
    public Address(String houseNumber, String street, String state, String city, int postalCode)
    {
        this.houseNumber=houseNumber;
        this.street=street;
        this.city=city;
        this.state=state;
        this.postalCode=postalCode;
    }
    
    void print()
    {
        System.out.println("Street: " + houseNumber +" "+ street);
        System.out.println("Apartment Number: "+ apartmentNumber);
        System.out.println("City: "        + city + ","
                           + " State: "       + state +","
                           + " Postal Code: " + postalCode);
    } 
    
    public boolean comesBefore(Address other)
    {
        return this.postalCode>other.postalCode;
    }
}
