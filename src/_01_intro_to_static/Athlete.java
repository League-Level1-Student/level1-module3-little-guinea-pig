package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber = 1;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
       bibNumber = nextBibNumber++;
       

    }

    public static void main(String[] args) {
      Athlete a = new Athlete("a", 5);
      Athlete b = new Athlete("b", 10);
      //create two athletes
      System.out.println(a.name + " " + a.speed + " " + a.bibNumber);
      System.out.println(b.name + " " + b.speed + " " + b.bibNumber);
      raceLocation = "San Francisco";
      System.out.println(raceLocation + " " + raceStartTime);
        //print their names, bibNumbers, and the location of their race. 
    }
}