package com.damonkhan;

public class Main {

  public static void main(String[] args) {

    int newScore = calculateScore("Damon", 1000);
    System.out.println("new score is " + newScore);
    int unnamedScore = calculateScore(500);
    System.out.println("unnamed score is " + unnamedScore);
    calculateScore();

    calcFeetandInchestoCentimeters(6, 0);
    calcFeetandInchestoCentimeters(7, 5);
    calcFeetandInchestoCentimeters(100);


  }

  public static int calculateScore(String name, int score) {

    System.out.println("player " + name + " scored " + score + " points");
    return score * 1000;

  }

  public static int calculateScore(int score) {

    System.out.println("unnamed player scored " + score + " points");
    return score * 1000;

  }

  public static int calculateScore() {

    System.out.println("no player name or score");
    return 0;

  }

  public static double calcFeetandInchestoCentimeters(double feet, double inches) {

    if (feet < 0 || (inches < 0 || inches > 12)) {
      return -1;
    }

    double centimeters = (feet * 12) * 2.54;
    centimeters += inches * 2.54;

    System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");

    return centimeters;

  }

  public static double calcFeetandInchestoCentimeters(double inches) {

    if (inches < 0 ) {
      return -1;
    }

    double feet = (int) inches / 12;
    double remainingInches = (int) inches % 12;

    System.out.println("Inches = " + feet + " feet " + remainingInches + " inches");
    return calcFeetandInchestoCentimeters(feet, remainingInches);

  }
}
