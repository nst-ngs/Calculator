import java.util.Scanner;

public class Mane {
    public static void main(String[] args) {
        while (true){

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            String trimInput = input.trim();

            ArabicNumerals arabCalc = new ArabicNumerals();
            RomanNumerals romanCalc = new RomanNumerals();

            if (input.equals("0")){
                break;
            }

            try {
                if (trimInput.matches("^\\d*\\s?[\\+\\-\\*\\/]{1}\\s?\\d*")){
                    arabCalc.scoringArabic(trimInput);
                } else

                if (trimInput.matches("^[I]{0,3}[VX]?\\s?[\\+\\-\\*\\/]\\s?[I]{0,3}[VX]?")){
                    romanCalc.scoringRoman(trimInput);
                } else {
                    System.err.println("Некорректный ввод!");
                    break;
                }
            } catch (ArithmeticException e){
                System.err.println("Деление на ноль!");
                break;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.err.println("Римские цифры поддерживают операции от 1 до 10!");
                break;
            }
        }
    }
}
