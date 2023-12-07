package src;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class TrainHome {
    public static void main(String[] args) {
//        시작 화면
        System.out.print("          _____               _            ___   _   _ \n" +
                "         |_   _|             (_)          /   | | | | |\n" +
                "           | |   _ __   __ _  _  _ __    / /| | | | | |\n" +
                "           | |  | '__| / _` || || '_ \\  / /_| | | | | |\n" +
                "           | |  | |   | (_| || || | | | \\___  | | |_| |\n" +
                "           \\_/  |_|    \\__,_||_||_| |_|     |_/  \\___/ ");

        System.out.println("\n-------------------------------------------------------------------");


//        변수

        String[] start = {"서울","수원","천안아산","대전","김천","대구","경주","울산","부산"};
        String StartIn;
        String[] arrive= {"부산","울산","경주","대구","김천","대전","천안아산","수원","서울"};
        String ArriveIn;
        LocalTime now = LocalTime.now();
        LocalTime Tomorrow = now.plusHours(1);
        String possible = "가능";
        String impossible = "불가";
        int adult=0;
        int child=0;
        int disabled=0;




//        입력

        Scanner kbd = new Scanner(System.in);

        System.out.printf("\n1. 출발역을 입력하시오 : ex) 서울\n" +
                "**가능 지역** "+ Arrays.toString(start));

        System.out.print("\n입력 : ");
        StartIn = kbd.nextLine();
        System.out.println("startIn 값 : "+ StartIn);
        System.out.println("arrays.tostring(start) 값 : "+ Arrays.toString(start));


//        만약 start 배열에 없는 문자를 입력 했을 경우 -> 출발 가능 지역이 아닙니다 문구 출력
        for (int i = 0; i < start.length; i++) {
            if (StartIn != )
        }
            if (boolean equals()){
                System.out.println("출발 가능 지역이 아닙니다!!");
                System.out.print("\n입력 : ");
                StartIn = kbd.nextLine();
            }

        System.out.println("\n-------------------------------------------------------------------");

        System.out.printf("\n2. 도착역을 입력하시오 : ex) 서울\n" +
                "**가능 지역** "+ Arrays.toString(arrive));

        System.out.print("\n입력 : ");
        ArriveIn = kbd.nextLine();

//        만약 arrive 배열에 없는 문자를 입력 했을 경우 -> 도착 가능 지역이 아닙니다 문구 출력
//        만약 start 배열 값과 arrive 배열 값이 같을 경우 -> 출발 지역과 도착 지역이 같습니다!!! 문구 출력
        if (ArriveIn != Arrays.toString(arrive)){
            System.out.println("도착 가능 지역이 아닙니다!!");
            System.out.print("\n입력 : ");
            ArriveIn = kbd.nextLine();
        } else if (Arrays.toString(start) == Arrays.toString(arrive)) {
            System.out.println("출발 지역과 도착 지역이 같습니다!!");
            System.out.print("\n입력 : ");
            ArriveIn = kbd.nextLine();
        }

        System.out.println("\n-------------------------------------------------------------------");

        String formatedNow = now.format(DateTimeFormatter.ofPattern("HH시 출발"));
        String formatedTm = Tomorrow.format(DateTimeFormatter.ofPattern("HH시 출발"));
        System.out.print("\n3. 도착역을 입력하시오 : ex) 오후 4시\n");
            System.out.print("\n"+"["+formatedNow+"]"+"[예약 : ");

            for (int i = 0; i <5; i++) {
                System.out.print("\n"+"["+formatedTm+"]"+"[예약 : ");

            }

        System.out.print("\n입력 : ");
//        now = kbd.next();

        System.out.println("\n-------------------------------------------------------------------");
        System.out.print("\n4. 인원 수를 입력하시오 : ex)어른: 1,어린이: 1, 제외는 0 or null\n");

        System.out.print("\n 어른: ");
        adult = kbd.nextInt();
        System.out.print("어린이: ");
        child = kbd.nextInt();
        System.out.print("장애인: ");
        disabled = kbd.nextInt();

        System.out.println("\n-------------------------------------------------------------------");
        System.out.print("\n5. 좌석 번호를 입력하시오 ex) A3,A4\n");


        System.out.println("\n-------------------------------------------------------------------");
        int sum = adult+child+disabled;

        System.out.print("\n6. 예약이 완료 되었습니다.\n");
        System.out.print("\n* * * * * * * * 예약 내역* * * * * * * * * * * *\n" +
                "*                                                 *\n" +
                "*  -예약 날짜 : 2023년 12월 4일 오후 4시              *\n" +
                "*  -출발역: "+StartIn+"                                  *\n" +
                "*  -도착역: "+ArriveIn+"                                  *\n" +
                "*  -예약 인원 : 총 "+sum+"명 (어른: "+adult+" 아이: "+child+" 장애인: "+disabled+")  *\n" +
                "*                                               *\n" +
                "* * * * * * * * * * * * * * * * * * * * * * * * *\n");
















    }


}
