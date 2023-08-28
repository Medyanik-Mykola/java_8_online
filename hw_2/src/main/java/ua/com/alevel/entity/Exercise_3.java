package ua.com.alevel.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_3 {

    public void lessons() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Exercise_3");
        System.out.println("Please enter a number of lesson: ");
        try{
            int lessonNumber = Integer.parseInt(bufferedReader.readLine());
            int firstLesson= 9 * 60;
            int lessonDuration = 45;
            int totalMinutes = firstLesson + lessonNumber * lessonDuration + (15 * ((lessonNumber - 1) / 2)) + (5 * (lessonNumber / 2));
            System.out.println(totalMinutes);
            int hours = totalMinutes / 60;
            int minutes = totalMinutes % 60;
            System.out.println("TIME " + hours + ":" + minutes);


        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

}
