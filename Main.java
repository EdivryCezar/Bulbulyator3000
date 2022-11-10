import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение с числами до 10");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(calc(input));
    }

    public static String calc(String input) throws Exception {
        int num1 = 0;
        int num2 = 0;
        char op = 0;
        char[] znak = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            znak[i] = input.charAt(i);
            if (znak[i] == '+') {
                op = '+';
            } else if (znak[i] == '-') {
                op = '-';
            } else if (znak[i] == '*') {
                op = '*';
            } else if (znak[i] == '/') {
                op = '/';
            }
        }
        if (znak.length <= 2) {
            throw new Exception("throws Exception //т.к. строка не является математической операцией");
        }
        int res = 0;
        String[] romans = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String[] console = input.split("[+*/-]");
        String sp00 = console[0].trim();
        String sp01 = console[1].trim();
        if (console.length > 2) {
            throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)"); //Сюда вставляем исключение
        }
        if ((sp00.contains(romans[1])||sp00.contains(romans[2])||sp00.contains(romans[3])||sp00.contains(romans[4])||sp00.contains(romans[5])||sp00.contains(romans[6])||sp00.contains(romans[7])||sp00.contains(romans[8])||sp00.contains(romans[9])||sp00.contains(romans[10]))&(sp01.contains(romans[1])||sp01.contains(romans[2])||sp01.contains(romans[3])||sp01.contains(romans[4])||sp01.contains(romans[5])||sp01.contains(romans[6])||sp01.contains(romans[7])||sp01.contains(romans[8])||sp01.contains(romans[9])||sp01.contains(romans[10]))){
            switch (sp00) {
                case "I" -> sp00 = "1";
                case "II" -> sp00 = "2";
                case "III" -> sp00 = "3";
                case "IV" -> sp00 = "4";
                case "V" -> sp00 = "5";
                case "VI" -> sp00 = "6";
                case "VII" -> sp00 = "7";
                case "VIII" -> sp00 = "8";
                case "IX" -> sp00 = "9";
                case "X" -> sp00 = "10";
            }
            switch (sp01) {
                case "I" -> sp01 = "1";
                case "II" -> sp01 = "2";
                case "III" -> sp01 = "3";
                case "IV" -> sp01 = "4";
                case "V" -> sp01 = "5";
                case "VI" -> sp01 = "6";
                case "VII" -> sp01 = "7";
                case "VIII" -> sp01 = "8";
                case "IX" -> sp01 = "9";
                case "X" -> sp01 = "10";
            }
            int num3 = Integer.parseInt(sp00); //Начало для римских!!!!
            int num4 = Integer.parseInt(sp01);
            if (num3 >= 11 || num4 >= 11) {
                throw new Exception("throws Exception //т.к. необходимо ввести числа до 10");
            } else if (num3 < 0 || num4 < 0) {
                System.out.println("Ввести можно только положительные числа больше нуля!");
            } else {
                switch (op) {
                    case '+' -> res = num3 + num4;
                    case '-' -> res = num3 - num4;
                    case '*' -> res = num3 * num4;
                    case '/' -> res = num3 / num4;
                }

                if (res<=0){
                    throw new Exception("throws Exception //т.к. в римской системе нет отрицательных чисел");
                }
                return romans[res];
            }
        }else if (sp00.contains(romans[0])){
            throw new Exception("throws Exception //т.к. в римской системе нет нуля");
        }else {
            if (sp00.contains(romans[1])||sp00.contains(romans[2])||sp00.contains(romans[3])||sp00.contains(romans[4])||sp00.contains(romans[5])||sp00.contains(romans[6])||sp00.contains(romans[7])||sp00.contains(romans[8])||sp00.contains(romans[9])||sp00.contains(romans[10])){
            throw new Exception("throws Exception //т.к. используются одновременно разные системы счисления");
        }
            if (sp01.contains(romans[1])||sp01.contains(romans[2])||sp01.contains(romans[3])||sp01.contains(romans[4])||sp01.contains(romans[5])||sp01.contains(romans[6])||sp01.contains(romans[7])||sp01.contains(romans[8])||sp01.contains(romans[9])||sp01.contains(romans[10])){
                throw new Exception("throws Exception //т.к. используются одновременно разные системы счисления");
            }
                num1 = Integer.parseInt(sp00);
                num2 = Integer.parseInt(sp01);

                if (num1 >= 11 || num2 >= 11) {
                    System.out.println("Введите числа до 10");
                } else if (num1 < 0 || num2 < 0) {
                    System.out.println("Ввести можно только положительные числа больше нуля!");
                } else {
                    switch (op) {
                        case '+' -> res = num1 + num2;
                        case '-' -> res = num1 - num2;
                        case '*' -> res = num1 * num2;
                        case '/' -> res = num1 / num2;
                        default -> System.out.println("Введите корректное выражение!");
                    }
                }
            }
                    return Integer.toString(res);
        }
    }