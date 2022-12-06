package ie.atu.micro.passengerspring;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PassengerService {
    public List getPassengers(){
        List<Passenger> myPassengers = List.of(
                new Passenger("Mr", "Darragh", 12334563327L, 1234222567L, 23),
                new Passenger("Mr", "Darragh1", 12334563327L, 1234222267L, 33),
                new Passenger("Mr", "Darragh2", 123334563327L, 12342322567L, 23));
        return myPassengers;
    }
    public Passenger getPassenger(String passengerID){
        Passenger myPassenger = new Passenger("Mr", "Darragh3", 1233345633127L, 123423225167L, 23);
        return myPassenger;
    }
}
