package com.team1.campus;

public class CommuteService {
    FareCalculator fare = new FareCalculator();

    public String getAdvice(int monthlyFare, int day, int passPrice) {
        if (monthlyFare > 0 && day > 0 && passPrice > 0) {
            int monthcost = fare.getMonthlyFare(monthlyFare, day);
            int difference2 = fare.getDifference(monthcost, passPrice);
            System.out.println("편도 요금 : " + monthlyFare);
            System.out.println("한 달 등교일 : " + day);
            System.out.println("정기권 가격 : " + passPrice);
            if (difference2 < 0) {
                return "한 달 교통비 " + monthcost + "원, 정기권 " + passPrice + "원: 그냥 타는 게 " + Math.abs(difference2) + "원 더 쌉니다.";
            } else if (difference2 == 0) {
                return"두 방법의 요금이 같습니다.";
            } else {
                return "한 달 교통비 " + monthcost + "원, 정기권 " + passPrice + "원: 정기권이 " + Math.abs(difference2) + "원 더 쌉니다.";
            }
        } else {
            return("요금, 등교일, 정기권 가격은 모두 1 이상이어야 합니다.");
        }
    }
}
