import Data.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    @Test
    public void serializeTest(){
        Author aut = new Author(23, "Juris", "Spare");
        String result = Main.serialize(aut);

        assertEquals("{\"id\":23,\"firstName\":\"Juris\",\"lastName\":\"Spare\"}", result);
    }

    @Test
    public void deserializeTest(){
        String json = "{\"id\":23,\"firstName\":\"Juris\",\"lastName\":\"Spare\"}";

        Author result = Main.deserialize(json);
        Author expected = new Author(23, "Juris", "Spare");

        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getFirstName(), result.getFirstName());
        assertEquals(expected.getLastName(), result.getLastName());
    }
}
