package ie.atu.micro.passengerspring;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testTitlePass(){
        Passenger myPassenger = new Passenger("Mr", "Darragh", 1234334567891L, 1233456789, 123);
        assertEquals("Mr", myPassenger.getTitle());
    }


    @Test
    void testNamePass(){
        Passenger myPassenger = new Passenger("Mr", "Darragh", 1234567891, 1233456789, 123);
        assertEquals("Darragh", myPassenger.getName());
    }



    @Test
    void testIdPass(){
        Passenger myPassenger = new Passenger("Mr", "Darragh", 1232334567891L, 1233456789, 123);
        assertEquals(1232334567891L, myPassenger.getId());
    }



    @Test
    void testPhonePass(){
        Passenger myPassenger = new Passenger("Mr", "Darragh", 1232334567891L, 1233456789, 123);
        assertEquals(1233456789, myPassenger.getPhone());
    }



    @Test
    void testAgePass(){
        Passenger myPassenger = new Passenger("Mr", "Darragh", 1232334567891L, 1233456789, 36);
        assertEquals(36, myPassenger.getAge());
    }



    @AfterEach
    void tearDown() {
    }
}