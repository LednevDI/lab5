
package ru.lednev.lab5;

/**
* Класс "Треугольник"
*
*  @author Lednev D.I. 
*/


public class Triangle extends Polygon{
    public Triangle(double a,double b,double c){
        setName("Треугольник");
        setSide1Length(a);
        setSide2Length(b);
        setSide3Length(c);
    }
    @Override
    public String toString(){
        return this.getTime() +"  "+"id="+getId()+"  "+getName()+": "+getSide1Name()+"="+getSide1Length()+"  "+getSide2Name()+"="+getSide2Length()+"   "+getSide3Name()+"="+getSide3Length()+"  Периметр="+this.doPerimeter()+"  Площадь="+this.doArea();
    }
    /**
     * Метод для вычисления периметра
     * 
     */
    @Override
    public double doPerimeter(){
        return this.getSide1Length()+this.getSide2Length()+this.getSide3Length();
    }
    /**
     * Метод для вычисления площади
     * 
     */
    public double doArea(){
        double p=doPerimeter()/2;
        return Math.sqrt(p*(p-this.getSide1Length())*(p-this.getSide2Length())*(p-this.getSide3Length()));
    }
    
}
