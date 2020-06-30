package pl.gda.wsb;

public class Student extends Person{

    //Fields
    private int yearOfStudy;
    private int group;
    private int indexNumber;

    public Student(String name, String surname, String dateOfBirth, int yearOfStudy, int group, int indexNumber) {
        super(name, surname, dateOfBirth);
        this.yearOfStudy = yearOfStudy;
        this.group = group;
        this.indexNumber = indexNumber;
    }

    //Get&Set

     public int getYearOfStudy() { return yearOfStudy; }
     public int getGroup() { return group; }
     public int getIndexNumber() { return indexNumber; }

//Method

    @Override
    public String toString() {
        return "Name and surname: " + this.getName() + " " + this.getSurname() + " " + ", date of birth:" + " " + this.getDateOfBirth() +"\n"
                + "Student index Number: " + indexNumber + ", " + "year of study: " + yearOfStudy + "," + "group: " + group;

    }




}
