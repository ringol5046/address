import static org.junit.Assert.*;

import org.junit.Test;

public class AddressTest {
    
    @Test
    public void test() {
        Address test = new Address("130","Farmstead Lane", 163, "PA", "State College", "16803");
        Address test2 = new Address("130 1/2", "Farmstead Lane", "PA", "State College", "00053");
        test.print();
        test2.print();
        test.comesBefore(test2);
    }
    
}


/*
 Junit output:
 
 Street: 130 Farmstead Lane
 Apartment Number: 163
 City: State College, State: PA, Postal Code: 16803
 Street: 130 1/2 Farmstead Lane
 Apartment Number: 0
 City: State College, State: PA, Postal Code: 00053
*/