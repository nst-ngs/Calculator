public class RomanNumerals { //v2
    private int a;
    private int b;
    private int c;
    private boolean aIsDigit = false;
    private boolean bIsDigit = false;

    String[] romanDigitsArray = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public void scoringRoman (String romanDigits) {

        String[] digits = romanDigits.split("[\\+\\-\\*\\/]");
        String aStr = digits[0].trim();
        String bStr = digits[1].trim();

        for (int i = 0; i < romanDigitsArray.length; i++) {
            if (aStr.equals(romanDigitsArray[i])) {
                a = i + 1;
                aIsDigit = true;
            }
        }

        for (int j = 0; j < romanDigitsArray.length; j++) {
            if (bStr.equals(romanDigitsArray[j])) {
                b = j + 1;
                bIsDigit = true;
            }
        }

        if (aIsDigit & bIsDigit) {
            if (romanDigits.contains("+")) {
                c = a + b;
            }

            if (romanDigits.contains("-")) {
                c = a - b;
            }

            if (romanDigits.contains("*")) {
                c = a * b;
            }

            if (romanDigits.contains("/")) {
                c = a / b;
            }

            c2Roman(c);

        } else {
            System.out.println("Введите корректные римские цифры");
        }
    }

    private void c2Roman (int index){
        String romanC = romanDigitsArray[index - 1];
        System.out.println(romanC);
    }
}
