package Selenium_11;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Java_stream_lymdaExpression
    {
        @Test
        public void regular()
        {
            ArrayList<String> names = new ArrayList<>();
            names.add("Abhijeet");
            names.add("Domu");
            names.add("Alka");
            names.add("Ram");
            names.add("mohan");
            int count = 0;

            for (int i = 0; i < names.size(); i++) {
                String actual = names.get(i);
                if (actual.startsWith("A")) {
                    count++;
                }
            }
            System.out.println(count);
        }
        @Test
        public void streamFilter()
        {
            ArrayList<String> names = new ArrayList<>();
            names.add("Abhijeet");
            names.add("Domu");
            names.add("Alka");
            names.add("Ram");
            names.add("mohan");
            //how to use filter in stream api
            long d  = names.stream().filter(s ->s.startsWith("R")).count();
            System.out.println(d);
            long p = Stream.of("Abhijeet", "domu", "Alka"," Ram", "mohan").filter(s->s.startsWith("m")).count();
            names.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
        }

        @Test
        public void streamMap()
        {
            Stream.of("Abhijeet", "domu", "Alka", "Ram", "mohan")
                    .filter(s -> s.endsWith("m"))
                    .map(s -> s.toUpperCase())
                    .forEach(s -> System.out.println(s));
        }

        @Test
        public void streamCollect()
        {
            List<String> jk = Stream.of("Abhijeet", "domu", "Alka"," Ram", "mohan").filter(s->s.startsWith("m")).map(s->s.toUpperCase()).collect(Collectors.toList());
            System.out.println(jk.get(0));

            List<Integer> values = Arrays.asList(4,4,2,2,6,6,5,7,8,1,1,1,1);
            //print unique number
            values.stream().distinct().forEach(s->System.out.println(s));

        }

    }


