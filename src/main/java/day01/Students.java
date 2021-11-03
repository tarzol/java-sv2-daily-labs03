package day01;

import java.util.ArrayList;
import java.util.List;

public class Students {

    List<Integer> childrenHeight = new ArrayList<>();
     public void addHeight(int height) {
         childrenHeight.add(height);
     }

    public boolean isHeightsIncreasing() {
         boolean isIncreasing = true;
         for ( int i=1; i<childrenHeight.size(); i++ ) {
             if (childrenHeight.get(i) < childrenHeight.get(i-1)) {
                 isIncreasing = false;
                 return isIncreasing;
             }
         }
         return isIncreasing;
    }
}
