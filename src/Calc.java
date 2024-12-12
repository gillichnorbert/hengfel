/*
* File: Calc.java
* Author: Gillich Norbert
* Copyright: 2024, Gillich Norbert
* Group: Szoft II-II-N
* Date: 2024-12-12
* Github: https://github.com/gillichnorbert/
* Licenc: MIT
*/
import java.util.Scanner;
public class Calc {
static Scanner scanner = new Scanner(System.in);
  public static void  startCalc() {
    System.out.print("Írd be a henger sugarát: ");
    double r = scanner.nextDouble();
    System.out.print("Írd be a henger magasságát: ");
    double h = scanner.nextDouble();
    double s = 2 * Math.PI * Math.pow(r, 2) + 2 * Math.PI * r * h;
    System.out.printf("A henger felszíne: %f", s);
  }
}