package com.team1.campus; // 팀 번호에 맞게 변경

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("===== 대학생활 계산기 =====");
            // (1) 각자 자기 메뉴 한 줄 추가
            System.out.println("0. 종료");
            System.out.println("4. 동아리 회비 정산");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                // (2) 각자 자기 case 블록 추가
                case 0:
                    System.out.println("계산기를 종료합니다.");
                    break;
                case 4:
                    System.out.println("동아리 회비 정산을 시작합니다.");
                    System.out.println("행사 총비용 : ");
                    int total= sc.nextInt();
                    System.out.println("참석 인원 : ");
                    int people= sc.nextInt();
                    DuesService ds = new DuesService();
                    ds.printSettlement(total,people);
                    System.out.println("동아리 회비 정산을 종료합니다.");
                    break;
                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
            }
            System.out.println();
        } while (menu != 0);
    }
}