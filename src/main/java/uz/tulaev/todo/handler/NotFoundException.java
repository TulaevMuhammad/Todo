package uz.tulaev.todo.handler;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message){
        super(message);
    }
}
