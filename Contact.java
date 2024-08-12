import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact( String name, String phoneNumber, String birthDate){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = toAge(birthDate) ;
    }

    public Contact( Contact obj){
        this.name = obj.name;
        this.phoneNumber = obj.phoneNumber;

        this.birthDate = obj.birthDate;
        this.age = obj.age;
    }

    private int toAge(String birthDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         LocalDate birthdate = LocalDate.parse(birthDate,formatter);
         LocalDate currenDate = LocalDate.now();
        Period age1 = Period.between(birthdate, currenDate);
        return age1.getYears();
    }
    public String getName(){
        return this.name;
    }
    public String setName(String name){
        return this.name = name;
    }

    public String getbirthDate(){
        return this.birthDate;
    }
    public void setbirthDate(String birthDate){
         this.birthDate = birthDate;
         setAge(toAge(birthDate));
    }

    public String getphoneNumber(){
        return this.phoneNumber;
    }
    public String setphoneNumber(String phoneNumber){
        return this.phoneNumber = phoneNumber;
    }

    public  void getAge(int age){
        this.age = age;
   }
    private void setAge(int age){
         this.age = age;
    }
    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
            "Phone number: " + this.phoneNumber + "\n" +
            "Birth Date: " + this.birthDate + "\n" +
            "Age: " + this.age + " year old\n";
    }

}
