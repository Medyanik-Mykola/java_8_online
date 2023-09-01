package ua.com.alevel.entity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise_1 {
    public void java() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Exercise_1");
        System.out.println("Please enter a string ");
        try {
            String stroka = bufferedReader.readLine();
            char[] charArray = stroka.toCharArray();
            byte sum = 0;
            for (int i = 0; i < charArray.length; i++) {
                byte b = (byte) charArray[i];
                if (b >= 48 && b <= 57) {
                    int digitValue = Character.getNumericValue(charArray[i]);
                    sum += digitValue;
                }
            }
            System.out.println("SUM: " + sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
