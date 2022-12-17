package ie.atu.micro.passengerspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/passenger")
public class PassengerController {

    private PassengerService newService;

    @Autowired
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        SpringApplication.run(PassengerspringApplication.class, args);
    }
    public PassengerController(PassengerService newService){
        this.newService = newService;
    }

    @GetMapping("")
    public List getPassengers(){
        return newService.getPassenger();
    }
    @GetMapping("/{passengerID}")
    public Passenger findPassenger(@PathVariable String passengerID){
        return (Passenger) newService.getPassenger();
    }

    @PostMapping("")
    public void savePassenger(
            @RequestBody Passenger passenger) {
        newService.savePassenger(passenger);
    }

    //find passenger by name
    @GetMapping("/name/{name}")
    public Passenger getPassengerName(@PathVariable("name") String name) {
        return newService.findPassengerByName(name);
    }

    @DeleteMapping("/delete/{count}")
    public void deletePassenger(@PathVariable("count") long count){
        newService.deletePassenger(count);
    }

    @GetMapping("/age")
    public List<Passenger> getPassengerByAge(@RequestParam(name = "age_start") int age1, @RequestParam(name = "age_end") int age2){
        return newService.findPassengerByAgeRange(age1, age2);
    }
}
