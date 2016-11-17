import org.junit.Test;
import anselmo.Pessoa;

public class PersonTest {
    @Test
    public void test() {
        Person person = new Person("Jeremy");
        assert person.getName().equals("Jeremy");
    }
}