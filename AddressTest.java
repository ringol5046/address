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
        
        assertEquals("Street: 130 Farmstead Lane\nApartment Number: 163\nCity: State College, State: PA, Zip Code: 16803",test.print());
    }
    
}
