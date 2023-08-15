package ua.com.alevel;

import ua.com.alevel.test.Message;
import ua.com.alevel.depends.Depends;
public class Hello {


    public static void main(String[] args){
        Message m = new Message();

        byte b = Byte.MAX_VALUE;
        m.print(String.valueOf(b));

        System.out.println();
        Depends d = new Depends();
        d.console("Hello World!");


    }
}