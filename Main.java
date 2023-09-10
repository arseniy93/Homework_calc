import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<String, Integer> map = new HashMap<String, Integer>();
    static Map<Integer, String> map1 = new HashMap<Integer, String>();

    public static void main(String[] args) {
        map.put("I", 1);
        map1.put(1,"I");
        Scanner console = new Scanner(System.in);
        String strocha = console.nextLine();
        System.out.println(calc(strocha));

       
       


    }

    public static String calc(String s) {
        String[] exit=new String[3];

        map.put("I", 1);
        map.put("II", 2);
        map.put("III", 3);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("VI", 6);
        map.put("VII", 7);
        map.put("VIII", 8);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XI", 11);
        map.put("XII", 12);
        map.put("XIII", 13);
        map.put("XIV", 14);
        map.put("XV", 15);
        map.put("XVI", 16);
        map.put("XVII", 17);
        map.put("XVIII", 18);
        map.put("XIX", 19);
        map.put("XX", 20);
        map.put("XXI", 21);
        map.put("XXII", 22);
        map.put("XXIII", 23);
        map.put("XXIV", 24);
        map.put("XXV", 25);
        map.put("XXVI", 26);
        map.put("XXVII", 27);
        map.put("XXVIII", 28);
        map.put("XXIX", 29);
        map.put("XXX", 30);
        map.put("XXXI", 31);
        map.put("XXXII", 32);
        map.put("XXXIII", 33);
        map.put("XXXIV", 34);
        map.put("XXXV", 35);
        map.put("XXXVI", 36);
        map.put("XXXVII", 37);
        map.put("XXXVIII", 38);
        map.put("XXXIX", 39);
        map.put("XL", 40);
        map.put("XLI", 41);
        map.put("XLII", 42);
        map.put("XLIII", 43);
        map.put("XLIV", 44);
        map.put("XLV", 45);
        map.put("XLVI", 46);
        map.put("XLVII", 47);
        map.put("XLVIII", 48);
        map.put("XLIX", 49);
        map.put("L", 50);
        map.put("LI", 51);
        map.put("LII", 52);
        map.put("LIII", 53);
        map.put("LIV", 54);
        map.put("LV", 55);
        map.put("LVI", 56);
        map.put("LVII", 57);
        map.put("LVIII", 58);
        map.put("LIX", 59);
        map.put("LX", 60);
        map.put("LXI", 61);
        map.put("LXII", 62);
        map.put("LXIII", 63);
        map.put("LXIV", 64);
        map.put("LXV", 65);
        map.put("LXVI", 66);
        map.put("LXVII", 67);
        map.put("LXVIII", 68);
        map.put("LXIX", 69);
        map.put("LXX", 70);
        map.put("LXXI", 71);
        map.put("LXXII", 72);
        map.put("LXXIII", 73);
        map.put("LXXIV", 74);
        map.put("LXXV", 75);
        map.put("LXXVI", 76);
        map.put("LXXVII", 77);
        map.put("LXXVIII", 78);
        map.put("LXXIX", 79);
        map.put("LXXX", 80);
        map.put("LXXXI", 81);
        map.put("LXXXII", 82);
        map.put("LXXXIII", 83);
        map.put("LXXXIV", 84);
        map.put("LXXXV", 85);
        map.put("LXXXVI", 86);
        map.put("LXXXVII", 87);
        map.put("LXXXVIII", 88);
        map.put("LXXXIX", 89);
        map.put("XC", 90);
        map.put("XCI", 91);
        map.put("XCII", 92);
        map.put("XCIII", 93);
        map.put("XCIV", 94);
        map.put("XCV", 95);
        map.put("XCVI", 96);
        map.put("XCVII", 97);
        map.put("XCVIII", 98);
        map.put("XCIX", 99);
        map.put("C", 100);


        map1.put(1, "I");
        map1.put(2, "II");
        map1.put(3, "III");
        map1.put(4, "IV");
        map1.put(5, "V");
        map1.put(6, "VI");
        map1.put(7, "VII");
        map1.put(8, "VIII");
        map1.put(9, "IX");
        map1.put(10, "X");
        map1.put(11, "XI");
        map1.put(12, "XII");
        map1.put(13, "XIII");
        map1.put(14, "XIV");
        map1.put(15, "XV");
        map1.put(16, "XVI");
        map1.put(17, "XVII");
        map1.put(18, "XVIII");
        map1.put(19, "XIX");
        map1.put(20, "XX");
        map1.put(21, "XXI");
        map1.put(22, "XXII");
        map1.put(23, "XXIII");
        map1.put(24, "XXIV");
        map1.put(25, "XXV");
        map1.put(26, "XXVI");
        map1.put(27, "XXVII");
        map1.put(28, "XXVIII");
        map1.put(29, "XXIX");
        map1.put(30, "XXX");
        map1.put(31, "XXXI");
        map1.put(32, "XXXII");
        map1.put(33, "XXXIII");
        map1.put(34, "XXXIV");
        map1.put(35, "XXXV");
        map1.put(36, "XXXVI");
        map1.put(37, "XXXVII");
        map1.put(38, "XXXVIII");
        map1.put(39, "XXXIX");
        map1.put(40, "XL");
        map1.put(41, "XLI");
        map1.put(42, "XLII");
        map1.put(43, "XLIII");
        map1.put(44, "XLIV");
        map1.put(45, "XLV");
        map1.put(46, "XLVI");
        map1.put(47, "XLVII");
        map1.put(48, "XLVIII");
        map1.put(49, "XLIX");
        map1.put(50, "L");
        map1.put(51, "LI");
        map1.put(52, "LII");
        map1.put(53, "LIII");
        map1.put(54, "LIV");
        map1.put(55, "LV");
        map1.put(56, "LVI");
        map1.put(57, "LVII");
        map1.put(58, "LVIII");
        map1.put(59, "LIX");
        map1.put(60, "LX");
        map1.put(61, "LXI");
        map1.put(62, "LXII");
        map1.put(63, "LXIII");
        map1.put(64, "LXIV");
        map1.put(65, "LXV");
        map1.put(66, "LXVI");
        map1.put(67, "LXVII");
        map1.put(68, "LXVIII");
        map1.put(69, "LXIX");
        map1.put(70, "LXX");
        map1.put(71, "LXXI");
        map1.put(72, "LXXII");
        map1.put(73, "LXXIII");
        map1.put(74, "LXXIV");
        map1.put(75, "LXXV");
        map1.put(76, "LXXVI");
        map1.put(77, "LXXVII");
        map1.put(78, "LXXVIII");
        map1.put(79, "LXXIX");
        map1.put(80, "LXXX");
        map1.put(81, "LXXXI");
        map1.put(82, "LXXXII");
        map1.put(83, "LXXXIII");
        map1.put(84, "LXXXIV");
        map1.put(85, "LXXXV");
        map1.put(86, "LXXXVI");
        map1.put(87, "LXXXVII");
        map1.put(88, "LXXXVIII");
        map1.put(89, "LXXXIX");
        map1.put(90, "XC");
        map1.put(91, "XCI");
        map1.put(92, "XCII");
        map1.put(93, "XCIII");
        map1.put(94, "XCIV");
        map1.put(95, "XCV");
        map1.put(96, "XCVI");
        map1.put(97, "XCVII");
        map1.put(98, "XCVIII");
        map1.put(99, "XCIX");
        map1.put(100, "C");
        String r1=null;
        String r2=null;
        int n1=0;
        int n2=0;
        String znak=null;
        if ((s.length() <= 9) && (s.length() >= 3)) {

        } else {
            String a = " длина введенный строки несоответсвует условию";
            try {
                throw new Exception(a);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        switch (s.length()) {

            case (3):
                String s1 = (String.valueOf(s.charAt(1)));
                if (((s1.equals("/")) || (s1.equals("-")) || (s1.equals("+")) || (s1.equals("*")))) {
                    String s2 = (String.valueOf(s.charAt(0)));
                    String s3 = (String.valueOf(s.charAt(2)));
                    if (((s2.equals("I"))||(s2.equals("V"))|| (s2.equals("X"))) && ((s3.equals("X"))|| (s3.equals("V"))||(s3.equals("I")))) {
                        r1 = s2;
                        r2 = s3;
                        exit[0]=r1;
                        exit[2]=r2;
                        exit[1]=s1;
                    }
                    else if  (((s2.equals("1")) || (s2.equals("2")) || (s2.equals("3")) || (s2.equals("4")) || (s2.equals("5")) || (s2.equals("6")) || (s2.equals("7")) || (s2.equals("8")) || (s2.equals("9"))) &&
                            ((s3.equals("1")) || (s3.equals("2")) || (s3.equals("3")) || (s3.equals("4")) || (s3.equals("5")) || (s3.equals("6")) || (s3.equals("7")) || (s3.equals("8")) || (s3.equals("9")))) {
                        {
                            n1 = Integer.parseInt(s2);
                            n2 = Integer.parseInt(s3);
                            exit[0]=s2;
                            exit[2]=s3;
                            exit[1]=s1;
                        }
                    }
                    else{
                        try {
                            throw new Exception("введены не те значения");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                break;
            case(4):
                s1 = (String.valueOf(s.charAt(1)));
                String s11=(String.valueOf(s.charAt(2)));
                if ((((s1.equals("/"))||(s1.equals("-"))||(s1.equals("+"))||(s1.equals("*"))))&&(((s11.equals("/"))||(s11.equals("-"))||(s11.equals("+"))||(s11.equals("*"))))) {
                    System.out.println(s1 + s11);
                    try {
                        throw new Exception("не тот аривмитический знак");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                  if ((s1.equals("/")) || (s1.equals("-")) || (s1.equals("+")) || (s1.equals("*"))) {
                    String s2 = (String.valueOf(s.charAt(0)));
                    String s3 = (String.valueOf(s.charAt(2))+String.valueOf(s.charAt(3)));
                    if (((s2.equals("I"))||(s2.equals("V"))||(s2.equals("X"))) && ((s3.equals("II"))||(s3.equals("IV"))||(s3.equals("VI"))||(s3.equals("IX")))) {
                        r1 = s2;
                        r2 = s3;
                        exit[0]=r1;
                        exit[2]=r2;
                        exit[1]=s1;
                    }
                    else if  (((s2.equals("1")) || (s2.equals("2")) || (s2.equals("3")) || (s2.equals("4")) || (s2.equals("5")) || (s2.equals("6")) || (s2.equals("7")) || (s2.equals("8")) || (s2.equals("9"))) &&
                            ((s3.equals("10")))) {
                            n1 = Integer.parseInt(s2);
                            n2 = Integer.parseInt(s3);
                            exit[0]=s2;
                            exit[2]=s3;
                            exit[1]=s1;
                    }
                    else{
                        try {
                            throw new Exception("введены не те значения");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
                if (((s11.equals("/")) || (s11.equals("-")) || (s11.equals("+")) || (s11.equals("*")))) {
                    String s2 = (String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1)));
                    String s3 = (String.valueOf(s.charAt(3)));
                    if (((s2.equals("II"))||(s2.equals("IV")) || (s2.equals("VI")) ||(s2.equals("IX"))) && ((s3.equals("I"))||(s3.equals("V"))|| (s3.equals("X")))) {
                        r1 = s2;
                        r2 = s3;
                        exit[0]=r1;
                        exit[2]=r2;
                        exit[1]=s11;
                    }
                    else if  (((s3.equals("1")) || (s3.equals("2")) || (s3.equals("3")) || (s3.equals("4")) || (s3.equals("5")) || (s3.equals("6")) || (s3.equals("7")) || (s3.equals("8")) || (s3.equals("9"))) &&
                            ((s2.equals("10")))) {
                        n1 = Integer.parseInt(s2);
                        n2 = Integer.parseInt(s3);
                        exit[0]=s2;
                        exit[2]=s3;
                        exit[1]=s11;
                    }
                    else{
                        try {
                            throw new Exception("введены не те значения");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
                break;
            case(5):
                s1 = (String.valueOf(s.charAt(1)));
                s11=(String.valueOf(s.charAt(2)));
                String s13=(String.valueOf(s.charAt(3)));
                if ((((s1.equals("/"))||(s1.equals("-"))||(s1.equals("+"))||(s1.equals("*"))))&&(((s11.equals("/"))||(s11.equals("-"))||(s11.equals("+"))||(s11.equals("*"))))&&
                        (((s13.equals("/"))||(s13.equals("-"))||(s13.equals("+"))||(s13.equals("*"))))) {
                    System.out.println(s1 + s11+s13);
                    try {
                        throw new Exception("не тот аривмитический знак");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                if ((s1.equals("/")) || (s1.equals("-")) || (s1.equals("+")) || (s1.equals("*"))) {
                    String s2 = (String.valueOf(s.charAt(0)));
                    String s3 = (String.valueOf(s.charAt(2))+String.valueOf(s.charAt(3))+String.valueOf(s.charAt(4)));
                    if (((s2.equals("I"))||(s2.equals("V"))||(s2.equals("X"))) && ((s3.equals("VII"))||(s3.equals("III")))) {
                        r1 = s2;
                        r2 = s3;
                        exit[0]=r1;
                        exit[2]=r2;
                        exit[1]=s1;
                    }

                    else{
                        try {
                            throw new Exception("введены не те значения");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
                if ((s11.equals("/")) || (s11.equals("-")) || (s11.equals("+")) || (s11.equals("*"))) {
                    String s2 = (String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1)));
                    String s3 = (String.valueOf(s.charAt(3))+String.valueOf(s.charAt(4)));
                    if (((s2.equals("II"))||(s2.equals("IV"))||(s2.equals("VI"))||(s2.equals("IX"))) &&
                            ((s3.equals("II"))||(s3.equals("IV"))||(s3.equals("VI"))||(s3.equals("IX")))) {
                        r1 = s2;
                        r2 = s3;
                        exit[0]=r1;
                        exit[2]=r2;
                        exit[1]=s11;
                    }
                    else if  (( (s3.equals("10"))) &&
                            ((s2.equals("10")))) {
                        n1 = Integer.parseInt(s2);
                        n2 = Integer.parseInt(s3);
                        exit[0]=s2;
                        exit[2]=s3;
                        exit[1]=s11;
                    }


                    else{
                        try {
                            throw new Exception("введены не те значения");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
                if ((s13.equals("/")) || (s13.equals("-")) || (s13.equals("+")) || (s13.equals("*"))) {
                    String s2 = (String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1))+String.valueOf(s.charAt(2)));
                    String s3 = (String.valueOf(s.charAt(4)));
                    if (((s3.equals("I"))||(s3.equals("V"))||(s3.equals("X"))) && ((s2.equals("VII"))||(s2.equals("III")))) {
                        r1 = s2;
                        r2 = s3;
                        exit[0]=r1;
                        exit[2]=r2;
                        exit[1]=s11;
                    }
                    else if  (( (s3.equals("10"))) &&
                            ((s2.equals("10")))) {
                        n1 = Integer.parseInt(s2);
                        n2 = Integer.parseInt(s3);
                        exit[0]=s2;
                        exit[2]=s3;
                        exit[1]=s11;
                    }


                    else{
                        try {
                            throw new Exception("введены не те значения");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
                break;
            case(6):
                s1 = (String.valueOf(s.charAt(1)));
                s11=(String.valueOf(s.charAt(2)));
                s13=(String.valueOf(s.charAt(3)));
                String s14=(String.valueOf(s.charAt(4)));

                if ((((s1.equals("/"))||(s1.equals("-"))||(s1.equals("+"))||(s1.equals("*"))))&&(((s11.equals("/"))||(s11.equals("-"))||(s11.equals("+"))||(s11.equals("*"))))&&
                        (((s13.equals("/"))||(s13.equals("-"))||(s13.equals("+"))||(s13.equals("*"))))&&(((s14.equals("/"))||(s14.equals("-"))||(s14.equals("+"))||(s14.equals("*"))))) {
                    System.out.println(s1 + s11+s13+s14);
                    try {
                        throw new Exception("не тот аривмитический знак");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                if ((s1.equals("/")) || (s1.equals("-")) || (s1.equals("+")) || (s1.equals("*"))) {
                    String s2 = (String.valueOf(s.charAt(0)));
                    String s3 = (String.valueOf(s.charAt(2))+String.valueOf(s.charAt(3))+String.valueOf(s.charAt(4))+String.valueOf(s.charAt(5)));
                    if (((s2.equals("I"))||(s2.equals("V"))||(s2.equals("X"))) && ((s3.equals("VIII")))) {
                        r1 = s2;
                        r2 = s3;
                        exit[0]=r1;
                        exit[2]=r2;
                        exit[1]=s1;
                    }

                    else{
                        try {
                            throw new Exception("введены не те значения");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
                if ((s11.equals("/")) || (s11.equals("-")) || (s11.equals("+")) || (s11.equals("*"))) {
                    String s2 = (String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1)));
                    String s3 = (String.valueOf(s.charAt(3))+String.valueOf(s.charAt(4))+String.valueOf(s.charAt(5)));
                    if (((s2.equals("II"))||(s2.equals("IV"))||(s2.equals("VI"))||(s2.equals("IX"))) &&
                            ((s3.equals("III"))||(s3.equals("VII")))) {
                        r1 = s2;
                        r2 = s3;
                        exit[0]=r1;
                        exit[2]=r2;
                        exit[1]=s11;
                    }

                    else{
                        try {
                            throw new Exception("введены не те значения");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
                if ((s13.equals("/")) || (s13.equals("-")) || (s13.equals("+")) || (s13.equals("*"))) {
                    String s2 = (String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1))+String.valueOf(s.charAt(2)));
                    String s3 = (String.valueOf(s.charAt(4))+String.valueOf(s.charAt(5)));
                    if (((s3.equals("II"))||(s3.equals("IV"))||(s3.equals("VI"))||(s3.equals("IX"))) &&
                            ((s2.equals("III"))||(s2.equals("VII")))) {
                        r1 = s2;
                        r2 = s3;
                        exit[0]=r1;
                        exit[2]=r2;
                        exit[1]=s13;
                    }
                    else{
                        try {
                            throw new Exception("введены не те значения");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }

                }

                if ((s14.equals("/")) || (s14.equals("-")) || (s14.equals("+")) || (s14.equals("*"))) {
                    String s3 = (String.valueOf(s.charAt(5)));
                    String s2 = (String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1))+String.valueOf(s.charAt(2))+String.valueOf(s.charAt(3)));
                    if (((s3.equals("I"))||(s3.equals("V"))||(s3.equals("X"))) && ((s2.equals("VIII")))) {
                        r1 = s2;
                        r2 = s3;
                        exit[0]=r1;
                        exit[2]=r2;
                        exit[1]=s14;
                    }

                    else{
                        try {
                            throw new Exception("введены не те значения");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
                break;
            case(7):


                s11=(String.valueOf(s.charAt(2)));
                s13=(String.valueOf(s.charAt(3)));
                s14=(String.valueOf(s.charAt(4)));

                if ((((s11.equals("-"))||(s11.equals("+"))||(s11.equals("*"))))&&
                        (((s13.equals("/"))||(s13.equals("-"))||(s13.equals("+"))||(s13.equals("*"))))&&(((s14.equals("/"))||(s14.equals("-"))||(s14.equals("+"))||(s14.equals("*"))))) {
                    System.out.println(s11+s13+s14);
                    try {
                        throw new Exception("не тот аривмитический знак");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                if ((s11.equals("/")) || (s11.equals("-")) || (s11.equals("+")) || (s11.equals("*"))) {
                    String s2 = (String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1)));
                    String s3 = (String.valueOf(s.charAt(3))+String.valueOf(s.charAt(4))+String.valueOf(s.charAt(5))+String.valueOf(s.charAt(6)));
                    if (((s2.equals("II"))||(s2.equals("IV"))||(s2.equals("VI"))||(s2.equals("IX"))) && ((s3.equals("VIII")))) {
                        r1 = s2;
                        r2 = s3;
                        exit[0]=r1;
                        exit[2]=r2;
                        exit[1]=s11;
                    }

                    else{
                        try {
                            throw new Exception("введены не те значения");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
                if ((s14.equals("/")) || (s14.equals("-")) || (s14.equals("+")) || (s14.equals("*"))) {
                    String s2 = (String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1))+String.valueOf(s.charAt(2))+String.valueOf(s.charAt(3)));
                    String s3 = (String.valueOf(s.charAt(5))+String.valueOf(s.charAt(6)));
                    if (((s3.equals("II"))||(s3.equals("IV"))||(s3.equals("VI"))||(s3.equals("IX"))) && ((s2.equals("VIII")))) {
                        r1 = s2;
                        r2 = s3;
                        exit[0]=r1;
                        exit[2]=r2;
                        exit[1]=s14;
                    }

                    else{
                        try {
                            throw new Exception("введены не те значения");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }

                }

                if ((s13.equals("/")) || (s13.equals("-")) || (s13.equals("+")) || (s13.equals("*"))) {
                    String s2 = (String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1))+String.valueOf(s.charAt(2)));
                    String s3 = (String.valueOf(s.charAt(4))+String.valueOf(s.charAt(5))+String.valueOf(s.charAt(6)));
                    if (((s3.equals("III"))||(s3.equals("VII"))) && ((s2.equals("III"))||(s2.equals("VII")))) {
                        r1 = s2;
                        r2 = s3;
                        exit[0]=r1;
                        exit[2]=r2;
                        exit[1]=s13;
                    }

                    else{
                        try {
                            throw new Exception("введены не те значения");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }

                }

                break;
            case(8):


                s13=(String.valueOf(s.charAt(3)));
                s14=(String.valueOf(s.charAt(4)));

                if ((((s13.equals("/"))||(s13.equals("-"))||(s13.equals("+"))||(s13.equals("*"))))&&(((s14.equals("/"))||(s14.equals("-"))||(s14.equals("+"))||(s14.equals("*"))))) {
                    System.out.println(s13+s14);
                    try {
                        throw new Exception("не тот аривмитический знак");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                if ((s13.equals("/")) || (s13.equals("-")) || (s13.equals("+")) || (s13.equals("*"))) {
                    String s2 = (String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1))+String.valueOf(s.charAt(2)));
                    String s3 = (String.valueOf(s.charAt(4))+String.valueOf(s.charAt(5))+String.valueOf(s.charAt(6))+String.valueOf(s.charAt(7)));
                    if (((s2.equals("III"))||(s2.equals("VII"))) && ((s3.equals("VIII")))) {
                        r1 = s2;
                        r2 = s3;
                        exit[0]=r1;
                        exit[2]=r2;
                        exit[1]=s13;
                    }

                    else{
                        try {
                            throw new Exception("введены не те значения");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
                if ((s14.equals("/")) || (s14.equals("-")) || (s14.equals("+")) || (s14.equals("*"))) {
                    String s2 = (String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1))+String.valueOf(s.charAt(2))+String.valueOf(s.charAt(3)));
                    String s3 = (String.valueOf(s.charAt(5))+String.valueOf(s.charAt(6))+String.valueOf(s.charAt(7)));
                    if (((s3.equals("III"))||(s3.equals("VII"))) && ((s2.equals("VIII")))) {
                        r1 = s2;
                        r2 = s3;
                        exit[0]=r1;
                        exit[2]=r2;
                        exit[1]=s14;
                    }

                    else{
                        try {
                            throw new Exception("введены не те значения");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
            case(9):

                s14=(String.valueOf(s.charAt(4)));


                if ((s14.equals("/")) || (s14.equals("-")) || (s14.equals("+")) || (s14.equals("*"))) {
                    String s2 = (String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1))+String.valueOf(s.charAt(2))+String.valueOf(s.charAt(3)));
                    String s3 = (String.valueOf(s.charAt(5))+String.valueOf(s.charAt(6))+String.valueOf(s.charAt(7))+String.valueOf(s.charAt(8)));
                    if (((s2.equals("VIII"))) && ((s3.equals("VIII")))) {
                        r1 = s2;
                        r2 = s3;
                        exit[0]=r1;
                        exit[2]=r2;
                        exit[1]=s14;
                    }

                    else{
                        try {
                            throw new Exception("введены не те значения");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
                break;
            default:
                try {
                    throw new Exception("Выходит запределы условий 1-10 I-X");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }
        String[]  rome= {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] arabian = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String f1=null;
        String f2=null;
        String result=null;
       int k=0;
        for (int i = 0; i < arabian.length; i++) {
            if (exit[0].equals(arabian[i])) {
                k=0;
                f1 = exit[0];
                f2 = exit[2];
               // System.out.println("arab");

            }
        }
        for (int i = 0; i < rome.length; i++) {
            if (exit[0].equals(rome[i])) {
                k=1;
                f1 = String.valueOf(map.get( exit[0]));
                f2 = String.valueOf(map.get( exit[2]));
              //  System.out.println("rome");

            }
        }

        switch (exit[1]){
            case("/"):
                result=String.valueOf(Integer.parseInt(f1)/Integer.parseInt(f2));
                break;
            case("*"):
                result=String.valueOf(Integer.parseInt(f1)*Integer.parseInt(f2));
                break;
            case("+"):
                result=String.valueOf(Integer.parseInt(f1)+Integer.parseInt(f2));
                break;
            case("-"):
                String.valueOf(Integer.parseInt(f1)-Integer.parseInt(f2));
                break;
        }
        if (k==1){
            result=map1.get(Integer.parseInt(result));
        }

        return String.valueOf(result);
    }
}

