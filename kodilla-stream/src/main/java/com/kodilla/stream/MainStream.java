package com.kodilla.stream;

import com.kodilla.stream.iterate.NumberGenerator;
import com.kodilla.stream.person.People;

import java.util.Locale;

public class MainStream {
    public static void main(String[] args) {

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ')+2)+".")
                .filter(s -> s.charAt(0) == 'M')
                .forEach(System.out::println);
    }
}
