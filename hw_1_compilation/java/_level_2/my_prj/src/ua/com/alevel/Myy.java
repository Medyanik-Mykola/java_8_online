package ua.com.alevel;

import ua.com.alevel.test.Message_1;

import org.apache.commons.lang3.math.NumberUtils;
public class Myy {


    public static void main(String[] args){
        Message_1 m = new Message_1();

        byte b = Byte.MAX_VALUE;
        m.print(String.valueOf(b));

        double max = NumberUtils.max(1.34, 2.34, 3.34, 1.74, 0.34);
        System.out.println(max);


    }
}