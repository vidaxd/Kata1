package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Kata1 {
    
    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1996,10,14);
        Person person = new Person("David", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
        
    }
    
}
