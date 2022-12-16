package ie.atu.micro.passengerspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "api/passenger")
public class PassengerController {

    private PassengerService newService;

    public PassengerController(PassengerService newService){
        this.newService = newService;
    }

    @GetMapping("")
    public List getPassengers(){
        return newService.getPassengers();
    }
    @GetMapping("/{passengerID}")
    public Passenger findPassenger(@PathVariable String passengerID){
        return (Passenger) newService.getPassenger(passengerID);
    }

}
