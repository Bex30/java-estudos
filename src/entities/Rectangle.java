package entities;

public class Rectangle {
   public double Width;
   public double Height;

    public double Area(){
        return Width * Height;
    }

    public double Perimeter(){
        return (Width + Height) * 2.0;
    }

    public double Diagonal(){
        return Math.sqrt((Width * Width) + (Height * Height));
    }

    public String toString(){
        return "AREA = " + String.format("%.2f",Area())
                + " \nPERIMETER =  "
                + String.format("%.2f",Perimeter())
                + " \nDIAGONAL =  "
                + String.format("%.2f",Diagonal());
    }
}
