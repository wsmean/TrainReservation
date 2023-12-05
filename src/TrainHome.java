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


//        출발지 입력

        String[] start = {"서울","수원","천안아산","대전","김천","대구","경주","울산","부산"};
        String StartIn = Arrays.toString(start);
        String[] arrive= {"서울","수원","천안아산","대전","김천","대구","경주","울산","부산"};

        Scanner kbd = new Scanner(System.in);

        System.out.printf("\n1. 출발역을 입력하시오 : ex) 서울\n" +
                "**가능 지역** "+ Arrays.toString(start));


        System.out.print("\n입력 : ");
        StartIn = kbd.nextLine();








    }
}
