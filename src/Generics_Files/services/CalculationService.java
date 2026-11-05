package Generics_Files.services;

import Exceptions2.model.entities.BexException;

import java.util.List;

public class CalculationService  {

    public static <T extends Comparable<? super T>> T max(List<T> list){
        if(list.isEmpty()){
            throw new BexException("vazio pai");
        }
        T max = list.get(0);
        for (T item: list){
            if (item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }

}
