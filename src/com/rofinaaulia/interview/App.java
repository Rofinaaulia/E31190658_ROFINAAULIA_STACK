package com.rofinaaulia.interview;

import com.rofinaaulia.interview.stack.Stack;
import java.util.List;
/**
 *
 * @author Rofina Aulia Noviati
 */
public class App {
    public static void main( String[] args ){
        Stack stack=new Stack();
        stack.push("Rofina");
        stack.push("Aulia");
        stack.push("http://rofina-aulia.com");
        
        int count=stack.count();
        Object object=stack.peek();
        System.out.println("Jumlah Data Pada Stack : "+count);
        System.out.println("Data Teratas Pada Stack : "+object);
        
        System.out.println("==================================");
        
        object=stack.pop();
        System.out.println("Object yang dikeluarkan (Pop):"+object);
        count=stack.count();
        System.out.println("Jumlah Data Pada Stack setelah pop: "+count);
        object=stack.peek();
        System.out.println("Data Teratas Pada Stack setelah Pop: "+object);
    }
    
}
