/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freezer;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Федор
 */
public class shelf {
    public ArrayList<product> shelf = new ArrayList<product>();
    public int maxSize;

    public void add(product buff){
        if (maxSize>shelf.size()) {
            shelf.add(new product(buff));
        } else {
            System.out.println("Ошибка! Shelf.add полка полна");
        }       
    }
    /*public boolean checkDate(int id){
        Date cur = new Date();
        if ((shelf.get(id).dat.getTime()+ shelf.get(id).StoreTimeDAY*24*60*60*1000)<cur.getTime()) {
            System.out.println(shelf.get(id).dat.getTime()+ shelf.get(id).StoreTimeDAY*24*60*60*1000);
            System.out.println(cur);
            System.out.println(cur.getTime());
            System.out.printf("Вышел срок годности у продука с id %d",id);
            return true;
        }else{
            return false;
        }
    }*/
    shelf(int size){
        maxSize= size;
        for (int i = 0; i < size; i++) {
            shelf.add(new product());
        }
    }
}
