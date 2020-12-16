public class ArabicNumerals { //V2
    public void scoringArabic (String arabDigits){

        String [] digits = arabDigits.split("[\\+\\-\\*\\/]");

        int a = Integer.parseInt(digits[0].trim());
        int b = Integer.parseInt(digits[1].trim());
        int c = 0;

        if (a >= 1 & a <= 10 & b >= 1 & b <= 10) {
            if (arabDigits.contains("+")) {
                c = a + b;
            }

            if (arabDigits.contains("-")) {
                c = a - b;
            }

            if (arabDigits.contains("*")) {
                c = a * b;
            }
            if (arabDigits.contains("/")) {
                c = a / b;
            }
            System.out.println(c);
        } else {
            System.err.println("Введите числа в диапазоне от 1 до 10");
        }

    }
}
