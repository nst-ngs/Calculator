public class ArabicNumerals {
    public void scoringArabic (String arabDigits){

        String [] digits = arabDigits.split("[\\+\\-\\*\\/]");

        int a = Integer.parseInt(digits[0].trim());
        int b = Integer.parseInt(digits[1].trim());
        int c = 0;

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
    }
}
