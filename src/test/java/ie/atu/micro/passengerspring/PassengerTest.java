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

    @Test
    void testTitleFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mister", "John Doe", 1235473822, 1222222223, 19);});
        assertEquals("This is not a valid title", exMessage.getMessage());
    }

    @Test
    void testNameFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "ls", 1235422173822L, 1222222223, 19);});
        assertEquals("This is not a valid name", exMessage.getMessage());
    }

    @Test
    void testIdFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "John Doe", 123542, 1222222223, 19);});
        assertEquals("This is not a valid ID", exMessage.getMessage());
    }

    @Test
    void testPhoneFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "John Doe", 1235423221213L, 122222, 19);});
        assertEquals("This is not a valid phone number", exMessage.getMessage());
    }

    @Test
    void testAgeFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "John Doe", 1235423243243L, 1222222223, 13);});
        assertEquals("You Are too Young", exMessage.getMessage());
    }


    @AfterEach
    void tearDown() {
    }
}