package com.sumin.home;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {

        //    출발일
        LocalDate now = LocalDate.now();
        String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 (E)"));
        System.out.println(formatedNow);



    }
}


