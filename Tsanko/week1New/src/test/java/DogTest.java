import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void getName() {

        Dog dogy=new Dog("harold", "putka", 2,"zelen");
        assertEquals("da",dogy.getName());
    }

    @Test
    public void getBreed() {
    }

    @Test
    public void getAge() {
    }

    @Test
    public void getColor() {
    }


    @Test
    public void main() {
    }
}