
public class MainLambdaTestStrings {

    public interface Message{
        public String compileMessage(String a, String b);
    }
    
    public interface PrintMessage{
        public void outputMessage(String c);
    }
    
    public String compileMessage(String a, String b, Message msg) {
        return msg.compileMessage(a, b);
    }
    
    public void outputMessage(String c, PrintMessage print) {
        print.outputMessage(c);
    }
    
    public static void main(String[] args) {
    
        MainLambdaTestStrings test = new MainLambdaTestStrings();

        // Lambda expressions
        Message message = (a, b) -> "Your first name is: " + a + ". \n" +
                "And your last name is " + b + ".";

        PrintMessage print = c -> System.out.println(c);
        
        // Strings as parameters
        String a = "Walter";
        String b = "Borremans";
        
        // Combining the texts via lambda expressions
        String combinedmessage = test.compileMessage(a, b, message);
        System.out.println(combinedmessage);
        
        // Printing out via lambda expression.
        test.outputMessage("Hallllooooo", print);
        // Calling a lambda expression on a lambda expression.
        test.outputMessage(test.compileMessage(a, b, message), print);
        
        
    }
    
}
