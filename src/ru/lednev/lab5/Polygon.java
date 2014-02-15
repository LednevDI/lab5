
package ru.lednev.lab5;

/**
* Абстрактный класс "плоскость"
*
*  @author Lednev D.I.  
*/


public abstract class Polygon implements Perimeter, Area
{
      private int id;
      private String name;
      private String side1Name="AB";
      private String side2Name="BC";
      private String side3Name="CD";
      /**Длины сторон фигур*/
      private double side1Length;
      private double side2Length;
      private double side3Length;
      static int nextId=1;
      private boolean sortUp=false;
      private int sortMode=0;
    { id = nextId++; }
  
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSide1Name() {
        return side1Name;
    }

    public int getId(){
          return id;
      }

    public String getSide2Name() {
        return side2Name;
    }

    public String getSide3Name() {
        return side3Name;
    }

    public double getSide1Length() {
        return side1Length;
    }

    public void setSide1Length(double side1Length) {
        this.side1Length = side1Length;
    }

    public double getSide2Length() {
        return side2Length;
    }

    public void setSide2Length(double side2Length) {
        this.side2Length = side2Length;
    }

    public double getSide3Length() {
        return side3Length;
    }

    public void setSide3Length(double side3Length) {
        this.side3Length = side3Length;
    }
    public void setSortMode(int m){
          sortMode=m;
      }
      public void setSortUp(boolean b){
          sortUp=b;
      }

  
}
