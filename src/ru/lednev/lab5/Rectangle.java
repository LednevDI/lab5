
package ru.lednev.lab5;

/**
* Класс "Прямоугольник"
*
*  @author Lednev D.I. 
*/

public class Rectangle extends Polygon {
    private String side4Name="DA";
    private double side4Length;
    public Rectangle(double a,double b){
        setName("Прямоугольник");
        setSide1Length(a);
        setSide2Length(b);
        setSide3Length(a);
        side4Length=b;
    }
    /**
     * Метод для вычисления периметра
     * 
     */
    public double doPerimeter(){
        return this.getSide1Length()+this.getSide2Length()+this.getSide3Length()+side4Length;
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
        return this.getSide1Length()*this.getSide2Length();
    }
}