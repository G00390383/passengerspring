package ie.atu.micro.passengerspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path="api/passenger")
public class PassengerspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassengerspringApplication.class, args);
	}

	@GetMapping
	public List getPassengers(){
		List<Passenger> myPassengers = List.of(
				new Passenger("Mr", "Darragh", 12334563327L, 1234222567L, 23),
				new Passenger("Mr", "Darragh1", 12334563327L, 1234222267L, 33),
				new Passenger("Mr", "Darragh2", 123334563327L, 12342322567L, 23));
		return myPassengers;
	}

	@GetMapping("/{passengerID}")
	public Passenger getPassenger(String passengerID){
		Passenger myPassenger = new Passenger("Mr", "Darragh3", 1233345633127L, 123423225167L, 23);
		return myPassenger;
	}
}
