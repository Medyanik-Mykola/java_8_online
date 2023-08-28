package ua.com.alevel.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_2 {

    public void convert(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Exercise_2");
        System.out.println("Please enter a string ");
        try {
            String stroka2 = bufferedReader.readLine();
            Map<Character, Integer> charCountMap = countAndSortLatinCharacters(stroka2);

            int count = 1;

            for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
                System.out.println(count + ". " + entry.getKey() + " - " + entry.getValue());
                count++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<Character, Integer> countAndSortLatinCharacters(String stroka2){
        Map<Character, Integer> charCountMap = new TreeMap<>();

        String regex = "[a-zA-Z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(stroka2);

        while (matcher.find()){
            char character = matcher.group().charAt(0);
            charCountMap.put(character, charCountMap.getOrDefault(character, 0) + 1);
        }

        return charCountMap;
    }
}

