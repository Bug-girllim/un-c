package com.team1.campus; // 팀 번호에 맞게 변경

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("===== 대학생활 계산기 =====");
            System.out.println("3. 통학 교통비");
            // (1) 각자 자기 메뉴 한 줄 추가
            System.out.println("0. 종료");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                // (2) 각자 자기 case 블록 추가
                case 0:
                    System.out.println("계산기를 종료합니다.");
                    break;

                case 3:
                    CommuteService comu = new CommuteService();
                    System.out.println("편도 요금은 얼마입니까?");
                    int oneway = sc.nextInt();
                    System.out.println("한 달에 등교를 얼마나 합니까?");
                    int attendance = sc.nextInt();
                    System.out.println("정기권 가격은 얼마입니까?");
                    int Commuter = sc.nextInt();
                    System.out.println("메뉴 선택 : 3");
                    System.out.println(comu.getAdvice(oneway, attendance, Commuter));
                    break;


                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
            }
            System.out.println();
        } while (menu != 0);
    }
}