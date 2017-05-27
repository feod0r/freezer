/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freezer;

import java.util.Scanner;

/**
 *
 * @author Федор
 */
public class Freezer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        product p = new product();
        p.main();
        p.setDat(23, 4, 2017);
        p.StoreTimeDAY=3;
        System.out.println(p.dat);
        p.name = "pidor";
        System.out.print("Введите количество полок: ");
        int size = in.nextInt();
        box b = new box(size);
        //b.container.get(0).shelf.add(p);
        for (int i = 0; i < b.container.size(); i++) {
            for (int j = 0; j < b.container.get(i).shelf.size(); j++) {
                b.container.get(i).shelf.get(j).fill();
            }
        }
        for (int i = 0; i < b.container.size(); i++) {
            for (int j = 0; j < b.container.get(i).shelf.size(); j++) {
                if (b.container.get(i).shelf.get(j).checkDate()) {
                    System.out.print("Удалить просроченный продукт? ");
                    int flag = in.nextInt();
                    if(flag == 1){
                        b.container.get(i).shelf.remove(j);
                    } else {
                        System.out.println("Нет так нет ");
                    }
                }
            }
        }
        /*System.out.println(b.container.get(0).shelf.get(0).name);
        System.out.println(b.container.get(0).shelf.get(0).checkDate());
        */
        //System.out.println(s.shelf.get(1).name);
    }
    
}
