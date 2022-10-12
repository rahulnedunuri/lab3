import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


public class ListTests {
    @Test
    public void testsFilter(){
        List<String> list = new ArrayList<String>();
        list.add("Test"); 
        list.add("Aaaaaa");
        ListExamples.filter(list, new ContainsA());
        assertEquals(true, list.contains("Aaaaaa"));
    }   

    @Test
    public void testsMerge() {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        list1.add("a"); list1.add("y"); list1.add("c");
        list2.add("x"); list2.add("b"); list2.add("z");
        List<String> sorted = new ArrayList<String>();
        sorted.add("a");
        sorted.add("b");        
        sorted.add("c");
        sorted.add("x");
        sorted.add("y");
        sorted.add("z");
        assertEquals(sorted, ListExamples.merge(list1, list2));
    }
}
