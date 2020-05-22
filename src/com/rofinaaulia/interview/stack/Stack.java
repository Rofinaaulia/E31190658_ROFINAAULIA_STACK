package com.rofinaaulia.interview.stack;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Rofina Aulia Noviati
 */
public class Stack {

    private ArrayList<Object> list=new ArrayList<Object>();
    private int currentIndex=-1;
    //ArrayList disisni digunakan untuk menyimpan objek yang dimasukkan ke Stack.
    //Variabel currentIndex digunakan untuk menandai index teratas pada list.
    
     public void push(Object object) {
         list.add(object);
         currentIndex++;
     }
     //Method diatas digunakan untuk menambah data ke dalam stack yang sebenarnya
     //adalah menambah data ke dalam array list, kemudian nilai currentIndex dinilai
     //sebesar 1 angka
     
     public Object pop(){
         Object object=list.remove(currentIndex);
         currentIndex--;
        return object;
     }
     //Pop digunakan untuk membuag data dari Stack (data teratas).
     
     public int count(){
         return list.size();
    }
     //Method diatas dipanggil untuk mengetahui jumlah data pada Stack.
     
     public Object peek(){
         return list.get(currentIndex);
     }
     //peek() berfungsi melihat data teratas yang ada pada Stack.
     
     public void clear(){
         list.clear();
         currentIndex=-1;
     }
    //clear digunakan untuk menghapus seluruh data pada stack dan mengembalikan
     //index ke nilai semula
}
