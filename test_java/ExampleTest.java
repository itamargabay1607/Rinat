import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exampletest {

  @Test
   
   Public void returnsOneifGivenOne() {

      Example example = new Example();
      
      String result = example.getResult(1);

      assertEquals("1", result);
      }

}
