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
        String StartIn = Arrays.toString(start);
        String[] arrive= {"서울","수원","천안아산","대전","김천","대구","경주","울산","부산"};
        String arriveIn = Arrays.toString(arrive);
        LocalTime now = LocalTime.now();
        LocalTime Tomorrow = now.plusHours(1);
        String possible = "가능";
        String impossible = "불가";



//        입력

        Scanner kbd = new Scanner(System.in);

        System.out.printf("\n1. 출발역을 입력하시오 : ex) 서울\n" +
                "**가능 지역** "+ Arrays.toString(start));


        System.out.print("\n입력 : ");
        StartIn = kbd.nextLine();

        System.out.println("\n-------------------------------------------------------------------");

        System.out.printf("\n2. 도착역을 입력하시오 : ex) 서울\n" +
                "**가능 지역** "+ Arrays.toString(arrive));


        System.out.print("\n입력 : ");
        arriveIn = kbd.nextLine();

        System.out.println("\n-------------------------------------------------------------------");

        String formatedNow = now.format(DateTimeFormatter.ofPattern("HH시 출발"));
        String formatedNow_ = now.format(DateTimeFormatter.ofPattern("HH시 출발"));
        System.out.printf("\n3. 도착역을 입력하시오 : ex) 오후 4시\n");
            System.out.print("\n"+"["+formatedNow+"]"+"[예약 : ");
            for (int i = 0; i <10 ; i++) {
                System.out.print("\n"+"["+formatedNow_+"]"+"[예약 : ");
            }

        System.out.print("\n입력 : ");
        now = LocalTime.parse(kbd.nextLine());












    }
}
