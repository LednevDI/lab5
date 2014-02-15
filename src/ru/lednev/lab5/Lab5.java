
package ru.lednev.lab5;

/**
 * Основной класс программы
 *
 *  @author Lednev D.I.  
 */

import java.io.*;
import java.util.*;

public class Lab5 {
 
    private static ArrayList<Polygon> list;
    
    private static void init(){ // создание и заполнение списка
        list=new ArrayList<>();
        
        list.add(new Triangle(3,4,3));
        list.add(new Square(5));
        list.add(new Parallelogram(2,1));
        list.add(new Rectangle(7,1));
    }
    
    
public static void main(String[] args)throws IOException   {
  init();
  // подготовка к вводу
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  for(;;){ // начинаем бесконечный цикл
        System.out.println();
        System.out.println("Выберите тип сортировки (выйти - пустая строка):");
        System.out.println("--------------------------------------------------");
        System.out.println("1 - по возраcтанию id");
        System.out.println("2 - по убыванию id");
        System.out.println("3 - по возраcтанию имени");
        System.out.println("4 - по убыванию имени");
        System.out.println("5 - по возрастанию периметра");
        System.out.println("6 - по убыванию периметра");
        System.out.println("--------------------------------------------------");

        String mode = br.readLine(); // читаем строку из буфера ввода
        if (mode.isEmpty()) break; // прерываем цикл, если строка пустая
        boolean sortUp=false;
        int sortMode=0;
        switch(mode){
                case "1":{sortUp=false; sortMode=0; break;}
                case "2":{sortUp=true; sortMode=0; break;}
                case "3":{sortUp=false; sortMode=1; break;}
                case "4":{sortUp=true; sortMode=1; break;}
                case "5":{sortUp=false; sortMode=2; break;}
                case "6":{sortUp=true; sortMode=2; break;}
        }
        Collections.sort(list,new SortMode(sortUp,sortMode));
        for(Polygon p:list){
            System.out.println(p);
        }
  }
}
}
