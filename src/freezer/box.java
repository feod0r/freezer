/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freezer;

import java.util.ArrayList;

/**
 *
 * @author Федор
 */
public class box {
    public ArrayList<shelf> container = new ArrayList<shelf>();
    box(int size){
        for (int i = 0; i < size; i++) {
            container.add(new shelf(size));
        }
    }
}
