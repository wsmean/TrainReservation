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
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setTitle("Train_Reservation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

//        출발역
        snaPannel = new JPanel();

        start_ = new JLabel("출발역을 선택하세요");
        String[] start = {"서울", "수원", "천안아산", "대전", "김천", "대구", "경주", "울산", "부산"};
        JComboBox startcombo = new JComboBox(start);
        startcombo.addActionListener(this);

//        도착역
        arrive_ = new JLabel("도착역을 선택하세요");
        String[] arrive = {"서울", "수원", "천안아산", "대전", "김천", "대구", "경주", "울산", "부산"};
        JComboBox arrivecombo = new JComboBox(arrive);
        arrivecombo.addActionListener(this);




//      버튼 생성
        start_ = new JLabel();
        arrive_ = new JLabel();

        start_city = new JLabel();
        start_city.setHorizontalAlignment(JLabel.LEFT);
        arrive_city = new JLabel();
        arrive_city.setHorizontalAlignment(JLabel.RIGHT);

//      버튼 등록
        add(start_);
        add(arrive_);
        add(startcombo, BorderLayout.PAGE_START);
        add(start_city,BorderLayout.PAGE_END);
        add(arrivecombo, BorderLayout.PAGE_START);
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

