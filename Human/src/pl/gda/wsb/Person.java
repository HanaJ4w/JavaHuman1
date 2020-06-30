package pl.gda.wsb;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
//Fields
    private String name;
    private String surname;
    private String dateOfBirth;

    public Person(String name, String surname, String dateOfBirth){
        this.name=name;
        this.surname=surname;
        this.dateOfBirth=dateOfBirth;
    }
    //Methods
    //Get&Set
    String getName(){ return this.name; }
    String getSurname(){return this.surname;}
    String getDateOfBirth(){return this.dateOfBirth;}



    @Override
    public String toString() {
        return "Name and surname: " + name + " " + surname + ' ' + ", date of birth:" + dateOfBirth;
    }

    public void howManyYears(){
        LocalDate now=LocalDate.now();
        LocalDate birthday= LocalDate.parse(dateOfBirth);
        long age = ChronoUnit.YEARS.between( birthday , now );
        System.out.println(getSurname()+ " is " +age + " years old. ");
    }


}



