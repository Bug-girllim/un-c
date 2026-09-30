package com.team1.campus;

public class DuesService {


    public String getMemberLine(int number, int share, int remainder) {
        if(number==1){
            System.out.println("1번 (총무) : " + (share + remainder) +"원");
        }

        return number + "번 : " + share + "원";
        }




    public void printSettlement(int total, int people) {
        if (people<=0 || total <=0) {
            System.out.println("총 비용과 인원은 1 이상이어야 합니다.");
            return;
        }

        DuesCalculator dc = new DuesCalculator();
        int number= people;
        int share = dc.getShare(total, people);
        int remainder = dc.getRemainder(total, people);
        getMemberLine(number, share, remainder);
        if(remainder>0) {
            System.out.println("1인당 " + share + "원" + "(남는 " + remainder + "원은 총무가 더 냅니다)");
        }
        else {
            System.out.println("1인당 "+ share + "원" + "(딱 나누어떨어집니다)");
        }
        for (int i=1; i<=number; i++) {
            System.out.println(getMemberLine(i, share, remainder));
        }
    }

    }

