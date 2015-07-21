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
    private String postalCode;
    
    public Address(String houseNumber, String street, int apartmentNumber, String state, String city, String postalCode){
        
        this.houseNumber=houseNumber;
        this.street=street;
        this.state=state;
        this.city=city;
        this.apartmentNumber=apartmentNumber;
        this.postalCode=postalCode;
    }
    
    public Address(String houseNumber, String street, String state, String city, String postalCode){
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;

    
    public void print() {
        StringBuilder s = new StringBuilder();
        s.append("Street: " + houseNumber + " " + street)
        .append("\nApartment Number: " + apartmentNumber)
        .append("\nCity: " + city + ", State: " + state + ", Zip Code: "+ postalCode);
        
        System.out.println(s.toString());
    }
    
    public boolean comesBefore(Address other){
        int zipCode1 = Integer.parseInt(this.postalCode);
        int zipCode2 = Integer.parseInt(other.postalCode);
        return zipCode1>zipCode2;
    }
}
