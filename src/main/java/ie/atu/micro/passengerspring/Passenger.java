package ie.atu.micro.passengerspring;
//test
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Passenger {
    String title;
    String name;
    long id;
    long phone;
    int age;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long count;
    public Passenger(String title, String name, long id, long phone, int age) {
        setTitle(title);
        setName(name);
        setId(id);
        setPhone(phone);
        setAge(age);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String thisTitle) {
        if("Mr".equalsIgnoreCase(thisTitle) || "Mrs".equalsIgnoreCase(thisTitle) || "Ms".equalsIgnoreCase(thisTitle)){
            this.title = thisTitle;
        }
        else {
            throw new IllegalArgumentException("This is not a valid title");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 3){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("This is not a valid name");
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if(String.valueOf(id).length() >= 10){
            this.id = id;
        }
        else{
            throw new IllegalArgumentException("This is not a valid ID");
        }
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        if(String.valueOf(phone).length() >= 7){
            this.phone = phone;
        }
        else{
            throw new IllegalArgumentException("This is not a valid phone number");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 16){
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("You Are too Young");
        }
    }

}
