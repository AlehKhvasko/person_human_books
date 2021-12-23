package projectsHandsOn.AdvancedOOP.animals.humanBooksPerson;

import java.util.Date;

public class Person {
    private String name;
    private String sex;
    Date birthday;

    public Person(String name){
        this.name = name;
        this.sex = "none";
        this.birthday = new Date();
    }
    public Person(String name, String sex, Date birthday){
        setName(name);
        setSex(sex);
        setBirthday(birthday);
    }



    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
