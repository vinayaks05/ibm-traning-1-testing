// run two test using xml fle testfile.xml
// and test Activity4 and Activit4Part2

package suitExample;
import org.testng.annotations.Test;

public class Activity4 {
    @Test
        public void firstTestCase() {
            System.out.println("I'm in first test case from demoOne Class");
        }

        @Test
        public void secondTestCase() {
            System.out.println("I'm in second test case from demoOne Class");
        }
}
