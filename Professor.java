package projectsHandsOn.AdvancedOOP.animals.humanBooksPerson;

public class Professor implements Human {
    @Override
    public void makeMistake() {
        double randomNum = Math.random();
        System.out.printf("%.2f \n",randomNum);
        if (randomNum > .95){
            System.out.println("Professor suspended");
        }else {
            System.out.println("Still working");
        }
    }
}
