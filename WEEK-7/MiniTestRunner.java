import java.lang.annotation.*;
import java.lang.reflect.*;

// Create Run annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Run {
}

// Class containing test methods
class MyTests {

    @Run
    public void test1() {
        System.out.println("Test 1 is running");
    }

    public void test2() {
        System.out.println("Test 2 is running");
    }

    @Run
    public void test3() {
        System.out.println("Test 3 is running");
    }

    public void test4() {
        System.out.println("Test 4 is running");
    }
}

public class MiniTestRunner {

    public static void main(String[] args) {

        MyTests tests = new MyTests();

        int count = 0;

        Method[] methods = MyTests.class.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(Run.class)) {

                try {
                    method.invoke(tests);
                    count++;
                } catch (Exception e) {
                    System.out.println("Error running test");
                }
            }
        }

        System.out.println("Total tests ran: " + count);
    }
}