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


        //예약할 날짜 입력하기
//        Scanner kbd = new Scanner(System.in);
//        System.out.print("예약하실 날짜를 입력해주세요 : ");
//        int day = kbd.nextInt();

    }
}


