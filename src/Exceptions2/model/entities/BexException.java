package Exceptions2.model.entities;

public class BexException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public BexException(String msg){
        super(msg);
    }
}
