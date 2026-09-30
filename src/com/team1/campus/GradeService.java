package com.team1.campus;

public class GradeService {

    public String getGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public String makeReport(int score1, int score2, int score3) {
        if (score1 < 0 || score1 > 100
                || score2 < 0 || score2 > 100
                || score3 < 0 || score3 > 100) {
            return "점수는 0~100 사이로 입력하세요.";
        }

        ScoreCalculator calculator = new ScoreCalculator();
        int sum = calculator.getSum(score1, score2, score3);
        double average = calculator.getAverage(sum, 3);
        int min = calculator.getMin(score1, score2, score3);

        String grade;
        if (min < 40) {
            grade = "F (과락)";
        } else {
            grade = getGrade(average);
        }

        return "총점 " + sum + "점, 평균 " + average + "점, 등급 " + grade;
    }
}