package com.team1.campus;

public class WageCalculator {

    public int pay(int wage, int hours) {
        return (wage * hours);
    }

    public int weekpay(int wage, int hours) {
        return ((wage * hours) / 5);
    }

}
