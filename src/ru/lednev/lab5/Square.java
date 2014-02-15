
package ru.lednev.lab5;

/**
* Класс "Квадрат"
*
*  @author Lednev D.I. 
*/

public class Square extends Polygon {
    private String side4Name="DA";
    private double side4Length;
    public Square(double a){
        setName("Квадрат");
        setSide1Length(a);
        setSide2Length(a);
        setSide3Length(a);
        side4Length=a;
    }

    /**
    * Метод для вычисления периметра
    * 
    */
    public double doPerimeter(){
        return this.getSide1Length()*4;
    }
    @Override
    public String toString(){
        return this.getTime() +"  "+"id="+getId()+"  "+getName()+": "+getSide1Name()+"="+getSide1Length()+"  "+getSide2Name()+"="+getSide2Length()+"   "+getSide3Name()+"="+getSide3Length()+"   "+side4Name+"="+side4Length+"  Периметр="+this.doPerimeter()+"  Площадь="+this.doArea();
    }

    /**
    * Метод для вычисления площади
    * 
    */
    public double doArea(){
        return getSide1Length()*getSide1Length();
    }
}
