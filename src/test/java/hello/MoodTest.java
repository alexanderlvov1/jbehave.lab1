package hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodTest {

    @Test
    public void getMoodFromColourOk(){
        assertEquals("AGGRESSIVE", new Mood("RED").getMood());
    }

    @Test
    public void getMoodFromColourNoMatchOk(){
        assertEquals("UNKNOWN", new Mood("HAZEL-DARK-BLUE").getMood());
    }
}
