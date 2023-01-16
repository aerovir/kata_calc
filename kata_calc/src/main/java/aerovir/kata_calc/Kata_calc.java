/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aerovir.kata_calc;
import java.util.Scanner;

/**
 *
 * @author aerovir
 */
public class Kata_calc {

    public static void main(String[] args) {
        String arifmeticExpression = null;
        System.out.println("Калькулятор работает только с целыми числами от 0 до 10, вводимые числа могут быть как арабскими, так и римскими.\n Для получения валидного результата вычисления проводятся только в одном их предложенных стилей");
        Scanner scanner = new Scanner(System.in);
        arifmeticExpression = scanner.next();
        System.out.println(arifmeticExpression);
        
    }
}
