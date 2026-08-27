package entities;

public class TrimesterNota {
    public String Name;
    public double Nota1;
    public double Nota2;
    public double Nota3;

    public double notatotal(){
        return Nota1 + Nota2 + Nota3;
    }
    public String toString(){
        return "FINAL GRADE ="
                + String.format("%.2f",notatotal());
    }
}
