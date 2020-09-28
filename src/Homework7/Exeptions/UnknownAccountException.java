package Homework7.Exeptions;

public class UnknownAccountException extends Exception{
    public UnknownAccountException(String message){
        super(message);
    }
}
