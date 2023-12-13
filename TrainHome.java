//package src;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.*;

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

        String[] start = {"서울", "수원", "천안아산", "대전", "김천", "대구", "경주", "울산", "부산"};
        String startin;
        String[] arrive = {"부산", "울산", "경주", "대구", "김천", "대전", "천안아산", "수원", "서울"};
        String arrivein;
        String[] seat_a = {"A", "B", "C", "D", "E", "F", "G"};
        String seat;


        int adult = 0;
        int child = 0;
        int disabled = 0;


//        입력

        Scanner kbd = new Scanner(System.in);

        System.out.printf("\n1. 출발역을 입력하시오 : ex) 서울\n" +
                "**가능 지역** " + Arrays.toString(start));

        System.out.print("\n입력 : ");
        startin = kbd.nextLine();
//        startin = Arrays.toString(new String[]{kbd.nextLine()});

        System.out.println("startIn 값 : " + startin);
        System.out.println("arrays.tostring(start) 값 : " + Arrays.toString(start));


//        만약 start 배열에 없는 문자를 입력 했을 경우 -> 출발 가능 지역이 아닙니다 문구 출력
//        for (int i = 0; i < start.length; i++) {
//                if(startin.equals(start[i])){
//                    System.out.println("출발역이 확인 됐습니다 ");
//
//                }else{
//                    System.out.println("도착 가능 지역이 아닙니다!!");
//                    System.out.print("\n입력 : ");
//                    startin = kbd.nextLine();
//                }
//            }


            System.out.println("\n-------------------------------------------------------------------");

            System.out.printf("\n2. 도착역을 입력하시오 : ex) 서울\n" +
                    "**가능 지역** " + Arrays.toString(arrive));

            System.out.print("\n입력 : ");
            arrivein = kbd.nextLine();

//        만약 arrive 배열에 없는 문자를 입력 했을 경우 -> 도착 가능 지역이 아닙니다 문구 출력
//        만약 start 배열 값과 arrive 배열 값이 같을 경우 -> 출발 지역과 도착 지역이 같습니다!!! 문구 출력


            System.out.println("\n-------------------------------------------------------------------");

            String[] p_ip = {"가능", "불가능"};

            LocalDateTime now = LocalDateTime.now();
            int day = now.getDayOfMonth();
            Month month = now.getMonth();

            System.out.print("\n3. 예약 일을 입력하시오 : ex) 12월 23일\n");

            for (int i = day; i < 32; i++) {
                System.out.println(month.getDisplayName(TextStyle.NARROW, Locale.KOREAN) + " " + day + "일" + "[예약 : " + p_ip[(int) (Math.random() * 2)] + "]");
                day++;
            }


            System.out.print("\n입력 : ");

            String day_ = kbd.nextLine();


            System.out.println("\n-------------------------------------------------------------------");


            int hour = now.getHour();


            System.out.print("\n4. 예약 시간을 입력하시오 : ex) 16시\n");

            for (int i = hour; i < 24; i++) {
                hour++;
                System.out.print("\n" + "[" + hour + "시 출발]" + "[예약 : " + p_ip[(int) (Math.random() * 2)] + "]");
            }


            System.out.print("\n입력 : ");

            String time = kbd.nextLine();


            System.out.println("\n-------------------------------------------------------------------");
            System.out.print("\n5. 인원 수를 입력하시오 : ex)어른: 1,어린이: 1, 제외는 0 or null\n");


            System.out.print("\n 어른: ");
            adult = kbd.nextInt();
            System.out.print("어린이: ");
            child = kbd.nextInt();
            System.out.print("장애인: ");
            disabled = kbd.nextInt();

            System.out.println("\n-------------------------------------------------------------------");

            int sum = adult + child + disabled;
            int seat_num = 1;



            System.out.print("\n6. 좌석 번호를 입력하시오 ex) A3,A4\n");
            System.out.print("\n**입력 가능한 좌석 수는 " + sum + "명 좌석입니다\n");


            for (int i = 0; i < seat_a.length; i++) {
                System.out.println("[" + seat_a[i] + "1-4]" + "□ □  □ □");

            }

//            System.out.print("\n입력 : ");
//            seat = kbd.nextLine();
//            System.out.println("좌석은"+seat);


            System.out.println("\n-------------------------------------------------------------------");


            System.out.print("\n7. 예약이 완료 되었습니다.\n");
            System.out.print("\n* * * * * * * * 예약 내역* * * * * * * * * * * * * \n" +
                    "*                                               *\n" +
                    "*  -예약 날짜 : 2023년 " + day_ + " " + time + "              *\n" +
                    "*  -출발역: " + startin + "                                  *\n" +
                    "*  -도착역: " + arrivein + "                                  *\n" +
                    "*  -예약 인원 : 총 " + sum + "명 (어른: " + adult + " 아이: " + child + " 장애인: " + disabled + ")   *\n" +
                    "*                                               *\n" +
                    "* * * * * * * * * * * * * * * * * * * * * * * * *\n");


        }
    }



