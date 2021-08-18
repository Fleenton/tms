package Task.exception;

public class MyException extends Exception{
    public String errorText(){
        return "Error. No connection.";
    }
}
