package com.team1.campus;

public class WageService {

    public int weekpay(int hours) {
        // (hours >40) ? 40 : hours;
        if (hours > 40) {
            hours = 40;
            return hours;
        }
        else {
            return hours;
        }
    }

    public String nowpay(int wage, int hours) {
        if (wage <= 0 || hours <= 0) {
            return "시급과 근무 시간은 1 이상이어야 합니다";
        }

        WageCalculator wageCalculator = new WageCalculator();

        int pay = wageCalculator.pay(wage, hours);

        if(hours < 15) {
            return "기본급 " + pay + "원 (주 15시간 미만이라 주휴수당 없음)" ;
        }

        int weekpay = wageCalculator.weekpay(wage, hours);

        return "기본급 " + pay
                + "원 + 주휴수당 " + weekpay
                + "원 = 총 " + (pay + weekpay) + "원";


        }
    }
