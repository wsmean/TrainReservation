package entity;//package src;

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



        int adult = 0;
        int child = 0;
        int disabled = 0;


//        입력

        Scanner kbd = new Scanner(System.in);

        System.out.printf("\n1. 출발역을 입력하시오 : ex) 서울\n" +
                "**가능 지역** " + Arrays.toString(start));

        System.out.print("\n입력 : ");
        startin = kbd.nextLine();


        switch (startin)
        {
            case "서울":
                System.out.println("출발역이 확인 됐습니다.");
                break;
            case "수원":
                System.out.println("출발역이 확인 됐습니다.");
                break;
            case "대전":
                System.out.println("출발역이 확인 됐습니다.");
                break;
            case "김천":
                System.out.println("출발역이 확인 됐습니다.");
                break;
            case "천안아산":
                System.out.println("출발역이 확인 됐습니다.");
                break;
            case "대구":
                System.out.println("출발역이 확인 됐습니다.");
                break;
            case "경주":
                System.out.println("출발역이 확인 됐습니다.");
                break;
            case "울산":
                System.out.println("출발역이 확인 됐습니다.");
                break;
            case "부산":
                System.out.println("출발역이 확인 됐습니다.");
                break;
            default:
                System.out.println("출발 가능 지역이 아닙니다!!");
                System.out.print("\n입력 : ");
                startin = kbd.nextLine();
                System.out.println("출발역이 확인 됐습니다.");

        }



        System.out.println("\n-------------------------------------------------------------------");

        System.out.printf("\n2. 도착역을 입력하시오 : ex) 서울\n" +
                "**가능 지역** " + Arrays.toString(arrive));

        System.out.print("\n입력 : ");
        arrivein = kbd.nextLine();

        //        만약 start 배열 값과 arrive 배열 값이 같을 경우 -> 출발 지역과 도착 지역이 같습니다!!! 문구 출력

        while(startin.equals(arrivein)) {
            System.out.println("출발 지역과 도착 지역이 같습니다!!");
            System.out.print("\n입력 : ");
            startin = kbd.nextLine();
        }

        //        만약 arrive 배열에 없는 문자를 입력 했을 경우 -> 도착 가능 지역이 아닙니다 문구 출력

        switch (arrivein)
        {
            case "서울":
                System.out.println("출발역이 확인 됐습니다.");
                break;
            case "수원":
                System.out.println("출발역이 확인 됐습니다.");
                break;
            case "대전":
                System.out.println("출발역이 확인 됐습니다.");
                break;
            case "김천":
                System.out.println("출발역이 확인 됐습니다.");
                break;
            case "천안아산":
                System.out.println("출발역이 확인 됐습니다.");
                break;
            case "대구":
                System.out.println("출발역이 확인 됐습니다.");
                break;
            case "경주":
                System.out.println("출발역이 확인 됐습니다.");
                break;
            case "울산":
                System.out.println("출발역이 확인 됐습니다.");
                break;
            case "부산":
                System.out.println("출발역이 확인 됐습니다.");
                break;
            default:
                System.out.println("출발 가능 지역이 아닙니다!!");
                System.out.print("\n입력 : ");
                startin = kbd.nextLine();
                System.out.println("출발역이 확인 됐습니다.");

        }





        System.out.println("\n-------------------------------------------------------------------");

        String[] p_ip = {"가능", "불가능"};
        String day_="";

        LocalDateTime now = LocalDateTime.now();
        int day = now.getDayOfMonth();
        Month month = now.getMonth();

        System.out.print("\n3. 예약 일을 입력하시오 : ex) 12월 23일\n");

        for (int i = day; i < 32; i++) {
            System.out.println(month.getDisplayName(TextStyle.NARROW, Locale.KOREAN) + " " + day + "일" + "[예약 : " + p_ip[(int) (Math.random() * 2)] + "]");
            day++;
        }

        System.out.print("\n입력 : ");
        day_ = kbd.nextLine();

        switch(p_ip[(int) (Math.random() * 2)]){
            case "불가능":
                System.out.println("입력하신 날짜는 예약이 불가능 합니다.");
                System.out.print("\n입력 : ");
                day_ = kbd.nextLine();
                System.out.println("날짜가 확인 됐습니다.");
                break;


        }



        System.out.println("\n-------------------------------------------------------------------");


        System.out.print("\n4. 예약 시간을 입력하시오 : ex) 16시\n");

        for (int i=1; i<=24; i++){
            System.out.print("\n" + "[" + i+ "시 출발]" + "[예약 : " + p_ip[(int) (Math.random() * 2)] + "]");
        }




        System.out.print("\n입력 : ");

        String time = kbd.nextLine();

        switch(p_ip[(int) (Math.random() * 2)]){
            case "불가능":
                System.out.println("입력하신 시간은 예약이 불가능 합니다.");
                System.out.print("\n입력 : ");
                time = kbd.nextLine();
                System.out.println("시간이 확인 됐습니다.");
                break;


        }




        System.out.println("\n-------------------------------------------------------------------");
        System.out.print("\n5. 인원 수를 입력하시오 : ex)어른: 1,어린이: 1, 제외는 0 or null\n");


        System.out.print("\n 어른: ");
        adult = kbd.nextInt();
        System.out.print("어린이: ");
        child = kbd.nextInt();
        System.out.print("장애인: ");
        disabled = kbd.nextInt();

        System.out.println("\n-------------------------------------------------------------------");

        String[] seat_a = {"A", "B", "C", "D", "E", "F", "G"};
        int sum = adult + child + disabled;

        Scanner sc = new Scanner(System.in);




        while (sum == 0)
        {
            System.out.print("인원수를 다시 입력해주세요 :");
            System.out.print("\n 어른: ");
            adult = kbd.nextInt();
            System.out.print("어린이: ");
            child = kbd.nextInt();
            System.out.print("장애인: ");
            disabled = kbd.nextInt();
            sum = adult + child + disabled;

        }

        System.out.print("\n6. 좌석 번호를 입력하시오 ex) A3,A4\n");
        System.out.print("\n**입력 가능한 좌석 수는 " + sum + "명 좌석입니다\n");

        System.out.println("\n ** 좌석 안내 **");
        for (int i = 0; i < seat_a.length; i++) {
            System.out.println("[" + seat_a[i] + "1-4] " + "□ □  □ □");

        }





        String seat ="";
        if (sum >= 0) {
            for (int i = 1; i <= sum; i++) {
                System.out.print( i+".좌석 : ");
                seat = sc.nextLine();
                System.out.println("입력한 좌석명은 "+seat+"입니다");
            }
        }



        String ok = "";
        System.out.print("선택하신 좌석이 맞는지 확인 해주세요. ex) 예, 아니오");
        System.out.print("\n확인 : ");
        ok = sc.nextLine();

        while (ok.equals("아니오"))
        {
            System.out.println("좌석을 다시 입력해주세요.");
            if (sum >= 0) {
                for (int i = 1; i <= sum; i++) {
                    System.out.print( i+".좌석 : ");
                    seat = sc.nextLine();
                    System.out.println("입력한 좌석 번호는 "+seat+"입니다");
                }
                System.out.print("선택하신 좌석이 맞는지 확인 해주세요. ex) 예, 아니오");
                System.out.print("\n확인 : ");
                ok = sc.nextLine();
            }
        }

        if (ok.equals("예"))
        {

            System.out.println("예약이 완료 되었습니다. ");
        }








        System.out.println("\n-------------------------------------------------------------------");


//        System.out.print("\n7. 예약이 완료 되었습니다.\n");
        System.out.print("\n* * * * * * * * 예약 내역* * * * * * * * * * * * * *\n" +
                "*                                               *\n" +
                "*  -예약 날짜 : 2023년 " + day_ + " " + time + "              *\n" +
                "*  -출발역: " + startin + "                                   *\n" +
                "*  -도착역: " + arrivein + "                                     *\n" +
                "*  -예약 인원 : 총 " + sum + "명 (어른: " + adult + " 아이: " + child + " 장애인: " + disabled + ")     *\n" +
                "*                                                *\n" +
                "* * * * * * * * * * * * * * * * * * * * * * * * * * *\n");


    }
}

