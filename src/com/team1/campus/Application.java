package com.team1.campus; // 팀 번호에 맞게 변경

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("===== 대학생활 계산기 =====");
            System.out.println("1. 알바 급여");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {

                case 1: {
                    System.out.print("시급: ");
                    int wage = sc.nextInt();
                    System.out.print("이번 주 근무 시간 : ");
                    int hours = sc.nextInt();

                    WageService wageService = new WageService();

                    String result = wageService.nowpay(wage, hours);

                    System.out.println(result);

                    break;
                }

                case 0:
                    System.out.println("계산기를 종료합니다.");
                    break;
                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
            }
            System.out.println();
        } while (menu != 0);
    }
}