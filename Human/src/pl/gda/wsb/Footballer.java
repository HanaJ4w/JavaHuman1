package pl.gda.wsb;



public class Footballer extends Person{

    //Fields
    private String club;
    private Position position;
    private int numberOfGoals;





    //constructor
    public Footballer(String name, String surname, String dateOfBirth, String club, Position position, int numberOfGoals) {
        super(name, surname, dateOfBirth);
        this.club = club;
        this.position = position;
        this.numberOfGoals = numberOfGoals;
    }

    //Get
    public String getClub() { return club; }
    public Position getPosition() { return position; }
    public int getNumberOfGoals() { return numberOfGoals; }

    //Methods

    public void scoreAGoal(){
        numberOfGoals++;
        System.out.println( club + " Goal!!!!!!");
    }


    public String toString() {
        return "Name and surname: " + this.getName() + " " + this.getSurname() + " " + ", date of birth:" + " " + this.getDateOfBirth() +"\n"
                + "Footballer's club: " + this.getClub()+ ", position " + this.getPosition() +"\n"
                + "Number of goals: " + this.getNumberOfGoals() + ".";



    }
}
