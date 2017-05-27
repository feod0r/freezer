/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freezer;

import static java.lang.Math.random;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Федор
 */
public class product {
    public Date dat;
    public int StoreTimeDAY;
    public int weightKG;
    public int valueSM3;
    public String artNumber;
    public String name;
    
    void main(){
         
    }    
    product(){
        dat= new Date();
    }
    product(Date bdat, int std, int weight, int sm3, String art, String bname){
        dat= bdat;
        StoreTimeDAY = std;
        weightKG = weight;
        valueSM3 = sm3;
        artNumber = art;
        name = bname;
    }
    product(product buffer){
        dat= buffer.dat;
        StoreTimeDAY = buffer.StoreTimeDAY;
        weightKG = buffer.weightKG;
        valueSM3 = buffer.valueSM3;
        artNumber = buffer.artNumber;
        name = buffer.name;
    }
    public void setDat(int day, int mounth, int year){
        dat.setDate(day);
        dat.setMonth(mounth);
        dat.setYear(year-1900);
    }
    public boolean checkDate(){
        Date cur = new Date();
        if ((dat.getTime()+ StoreTimeDAY*24*60*60*1000)<cur.getTime()) {
            //System.out.println(dat.getTime()+ StoreTimeDAY*24*60*60*1000);
            //System.out.println(cur);
            //System.out.println(cur.getTime());
            System.out.printf("Вышел срок годности у продука c названием %S", name);
            return true;
        }else{
            return false;
        }
    }
    public void fill(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введи имя продукта: ");
        name = in.nextLine();
        System.out.print("Введи артикул продукта: ");
        artNumber = in.nextLine();
        System.out.print("Введи массу продукта: ");
        weightKG = in.nextInt();
        System.out.print("Введи объем продукта: ");
        valueSM3 = in.nextInt();
        System.out.print("Введи день производства продукта: ");
        dat.setDate(in.nextInt());
        System.out.print("Введи месяц производства продукта: ");
        dat.setMonth(in.nextInt()-1);
        System.out.print("Введи год производства продукта: ");
        dat.setYear(in.nextInt()-1900);
        System.out.print("Введи срок хранения продукта: ");
        StoreTimeDAY = in.nextInt();
        
    }
}
