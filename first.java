 //WAP to print Hello student.
public class first{

    public static void main(String[] args){
    System.out.println("Hello student");
    }

}
/*
public class first{git
    public static void main(String[]arg){
        System.out.println("Hello\nstudent");
    }
}


wap to print "My Sir G" 
public class first{
    public static void main(String[]arg){
        System.out.println("\"My Sir G\"");
        
    }
}
wap to print "My Sir G"

public class first {
    public static void main(String[]arg){
        System.out.println("\"Teacher's Day\"");
    }
}

WAPtoprint the value of int
public class first{
    public static void main(String[]arg){
        int x=10;
       // System.out.println(x);
        System.out.println("x="+x);
    }
}
WAPtoprint the value of float

   public class first{
    public static void main(String[]arg){
        float b=7.8f;
        System.out.println("b="+b);
    }
   }/*
7. What is the difference between
        pascal case, snake case and camel case?

        Answer:
        Pascal Case (UpperCamelCase):
        _____________________________
        First letter of every word is capitalized.
        Commonly used for class names, interfaces, and modules
        (e.g., PascalCase, UserProfile, InvoiceManager).

        Camel Case (LowerCamelCase):
        ____________________________
        First letter of the first word is lowercase, and
        subsequent words are capitalized.
        Commonly used for variables, functions, and methods
        in languages like Java and JavaScript
        (e.g., camelCase, userProfile, calculateTotal).

        Snake Case:
        ___________
        All letters are lowercase, with words separated by
        underscores (_). Very popular in C, C++, Python and SQL for
        variable and function names
        (e.g., snake_case, user_profile, total_amount)
         */
        /*
        8. Why main method is static in Java?

        Answer:
        The main method in Java is declared as static primarily
        to allow the Java Virtual Machine (JVM) to initiate
        program execution without needing to instantiate
        the class first.

        If main were an instance method, the JVM would have to
        create an object of the class to call it.
        This would raise complex questions: Which constructor should
        be used if there are several?
        What arguments should be passed to that constructor?
        Using a static method avoids these edge cases.

        By not requiring an object just to call the starting method,
        Java avoids unnecessary memory allocation for a "launcher"
        object that might never be used again.

        Note on Java 21+: Recent versions of Java introduced
        Unnamed Classes and Instance Main Methods as a preview
        feature, which allows simpler main signatures
        (including non-static ones) specifically to help
        beginners get started without understanding these
        complex keywords immediately.
         */

        /*
        9. What is the difference between print() and
        println() method of PrintStream class?

        Answer:

        print() and println() are methods of the PrintStream class
        used to output data to a stream (typically the console via
        System.out).
        The primary differences are as follows:
        - Line Termination
        - print() requires at least one parameter, println() requires
        none
        - Automatic flushing in println()

         */

        /*
        10. What is JRE in Java?

        Answer:

        The JRE (Java Runtime Environment) is a software package that
        provides the minimum requirements for executing Java
        applications on a computer. It acts as an abstraction layer
        between the Java program and the underlying operating system,
        enabling the "Write Once, Run Anywhere" (WORA) capability.

        Core Components of JRE
        - JVM
        - Java Class Libraries
        - Class Loader
        - Configuration files
         */ 







