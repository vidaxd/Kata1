package kata1;

import java.util.Date;

public class Kata1 {
    
    public static void main(String[] args) {
        Person person;
        person = new Person("David", new Date(96,9,14));
        System.out.println(person.getName()+ " tiene " + person.getAge());
    }
    
}
