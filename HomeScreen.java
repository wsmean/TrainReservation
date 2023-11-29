package com.sumin.home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends JFrame implements ActionListener {

//    변수 만들기

    private JLabel start_, start_city, arrive_, arrive_city;
    private JPanel snaPannel, datePanel, passengerPanel;


    //    자판기 꾸미기
    public HomeScreen() {
        setTitle("Train_Reservation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

//        출발역
        snaPannel = new JPanel();
        start_ = new JLabel("출발 역을 선택하세요");
        String[] city1 = {"서울", "수원", "천안아산", "대전", "김천", "대구", "경주", "울산", "부산"};
        JComboBox cityList1 = new JComboBox(city1);
        cityList1.setSelectedIndex(0);

//        도착역
        String[] city2 = {"서울", "수원", "천안아산", "대전", "김천", "대구", "경주", "울산", "부산"};
        JComboBox cityList2 = new JComboBox(city2);
        cityList2.setSelectedIndex(0);



        cityList1.addActionListener(this);
        cityList2.addActionListener(this);

//      버튼 생성
        start_city = new JLabel();
        start_city.setHorizontalAlignment(JLabel.LEFT);
        arrive_city = new JLabel();
        arrive_city.setHorizontalAlignment(JLabel.RIGHT);

//      버튼 등록
        add(cityList1, BorderLayout.PAGE_START);
        add(start_city,BorderLayout.PAGE_END);
        add(cityList2, BorderLayout.PAGE_START);
        add(arrive_city,BorderLayout.PAGE_END);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

//    버튼 출력




    //    화면 출력
    public static void main(String[] args) {
        HomeScreen h = new HomeScreen();
    }
}

