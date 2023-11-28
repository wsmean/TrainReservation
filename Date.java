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


//예시
//public class Quiz05 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("[달력 출력 프로그램]");
//        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
//        int year = sc.nextInt();
//        System.out.print("달력의 월을 입력 주세요.(mm):");
//        int month = sc.nextInt();
//
//        LocalDate monthstart = LocalDate.of(year, month, 1);
//        int monthday = monthstart.get(ChronoField.DAY_OF_WEEK); //해당 월의 첫 번째 요일 확인
//        int monthend = monthstart.lengthOfMonth();  // 해당 월의 마지막일
//
//        System.out.println();
//
//        System.out.println("[" + year + "년 " + month + "월" + "]");
//        System.out.println("일\t월\t화\t수\t목\t금\t토");
////                          0   1  2   3  4   5  6
//        int totalCount = 0;
//
//        for (int i = 0; i < monthday; i++) {
//            totalCount++;
//        }
//        for (int j = 1; j <= monthend; j++) {
//            System.out.printf(String.format("%02d\t", j));
//            totalCount++;
//            if (totalCount % 7 == 0) {
//                System.out.println();
//            }