package ua.com.alevel.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_2 {

    public void convert(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a string ");
        try {
            String stroka2 = bufferedReader.readLine();
            char[] charArray = stroka2.toCharArray();
            int count = 0;
            for (int i = 0; i < charArray.length; i++){
                byte b = (byte) charArray[i];
                if (b >= 97 && b <= 122){
                    if (charArray[i] == charArray[i + 1]){
                        count += 1;
                        System.out.println("Елемент " + charArray[i] + ", Повторюється: " + count);



                    }
                }

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}


