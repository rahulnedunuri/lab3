import static org.junit.Assert.*;
import org.junit.*;


public class LinkedListTests {
    @Test
    public void testAppend() {
        //Node front = new Node(1, null);
        LinkedList linkedlist = new LinkedList();
        for(int i = 0; i < 10; i++) { linkedlist.append(i);  }
        assertEquals("0 1 2 3 4 5 6 7 8 9", linkedlist.toString());
    }
}
