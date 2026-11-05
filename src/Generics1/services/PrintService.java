package Generics1.services;

import Exceptions2.model.entities.BexException;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    public List<T> oi = new ArrayList<>();
    public PrintService(){

    }

    public void addValue(T value){
        oi.add(value);
    }

    public T first(){
        if(oi.isEmpty()){
            throw new BexException("Ta vazio chefe");
        }
        return oi.getFirst();
    }

    public List<T> getOi() {
        return oi;
    }

}
