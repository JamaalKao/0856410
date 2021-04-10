import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PriorityQueueTest {
    static Stream<Arguments> stringIntAndListProvider(){
        //TODO return Stream
        arguments(new int[]{5, 4, 2, 3}, new int[]{2, 3, 4, 5});
        arguments(new int[]{5, 1, 4, 8}, new int[]{1, 4, 5, 8});
        arguments(new int[]{5, 3, 2, 9}, new int[]{2, 3, 5, 9});
        arguments(new int[]{9, 4, 5, 3}, new int[]{3, 4, 5, 9});
        arguments(new int[]{5, 7, 6, 3}, new int[]{3, 5, 6, 7});

        return Stream.of(arguments());
    }
    @ParameterizedTest(name="#{index} - Test with Argument={0},{1}")
    @MethodSource("stringIntAndListProvider")
    public void PriorityQueue_RunTest(int[] random_array,int[] correct_array){
        PriorityQueue<Integer> test=new PriorityQueue<Integer>();
        int index=0;
        Integer s;
        int[] result=new int[random_array.length];
        
        //TODO random_array add to PriorityQueue
        //--Get result
        index=0;
        while((test.poll())!=null){
            test.offer(result[index]);
            index++;
        }

        //TODO get PriorityQueue result
        
        assertArrayEquals(correct_array,result);
    }
    public void whenExceptionThrown_thenAssertionSucceeds(){
        Exception exception = assertThrows(NumberFormatException.class, ()->{
            Integer.parseInt("1a");
        });
        String expectedMessage= "For input string";
        String actualMessage= exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
    //TODO 3 unique Exceptions
}
