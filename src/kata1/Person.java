package kata1;

import java.util.Date;


public class Person {
    
    private final String name;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    private final Date birthday;

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public int getAge() {
        return (int) ((new Date().getTime()- birthday.getTime()) / 31536000000L);
    }
    
}
