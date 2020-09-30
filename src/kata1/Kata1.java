package kata1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author jorge
 */
public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person ("Jorge Blanco", LocalDate.of(1999,Month.DECEMBER,20));
        System.out.println(person.getName() +" " + person.getAge());
    }
    
}
