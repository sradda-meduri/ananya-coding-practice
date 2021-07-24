package in.sradda.Udemy.stack_through_linked_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testCaseInput(){
        LinkedStack stack = new LinkedStack();


        Assertions.assertEquals(stack.isEmpty(),true);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        Assertions.assertEquals(stack.peek().getId(),78);

        Assertions.assertEquals(stack.pop().getId(),78);

        Assertions.assertEquals(stack.isEmpty(),false);

        Assertions.assertEquals(stack.peek().getId(),3245);

    }

}