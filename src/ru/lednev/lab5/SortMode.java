
package ru.lednev.lab5;

import java.util.Comparator;

/**
 *  Класс содержащий в себе параметры сортировки объектов
 *
 *  @author Lednev D.I.
 */

public class SortMode implements Comparator<Polygon> 
{
      private boolean sortUp=false;
      private int sortMode=0;  
      public SortMode(boolean sortUp, int sortMode) {
          this.sortUp = sortUp;
          this.sortMode = sortMode;
      }
      @Override
		public int compare(Polygon p1, Polygon p2) {
		int res=0;
		if (sortMode==0){
		    if (p1.getId()>p2.getId()) res=1;
		    else if (p1.getId()<p2.getId()) res=-1;
		}
		else if (sortMode==1){
		     res=p1.getName().compareTo(p2.getName());
		}
		else {
		    if (p1.doPerimeter()>p2.doPerimeter()) res=1;
		    else if (p1.doPerimeter()<p2.doPerimeter()) res=-1;
		}
		if (sortUp) res*=(-1);
		return res;
		}

}
