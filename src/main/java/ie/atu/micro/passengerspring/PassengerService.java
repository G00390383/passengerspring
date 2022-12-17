package ie.atu.micro.passengerspring;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PassengerService {

    private final PassengerRepo passengerRepo;
    public List <Passenger> getPassenger()
    {
        return passengerRepo.findAll();
    }
    public void savePassenger(Passenger passenger){
        passengerRepo.save(passenger);
    }

    public Passenger findPassengerByName(String name){
        return passengerRepo.findPassengerByName(name);
    }
}
