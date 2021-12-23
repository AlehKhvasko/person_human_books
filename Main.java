package projectsHandsOn.AdvancedOOP.animals.humanBooksPerson;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", "Adventure and death", 500, "J. K. Rowling");
        System.out.println(harryPotter.getName());
        System.out.println(harryPotter.getAuthorsName());
        Student newbie = new Student("Al", "male",new Date());
        newbie.setSemesterFee(-1);
        System.out.println(newbie.birthday);
        Professor einstein = new Professor();
        einstein.makeMistake();
    }

}
