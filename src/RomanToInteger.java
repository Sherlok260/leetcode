public class RomanToInteger {
    public static int romanToInt(String s) {
        int nunmber = 0;
        for(int i=0; i<s.length(); i++) {
            switch (String.valueOf(s.charAt(i))){
                case "I":
                    if(i != s.length()-1) {
                        if(s.charAt(i+1) == 'X') {
                            nunmber += 9;
                            i+=1;
                        } else if (s.charAt(i+1) == 'V') {
                            nunmber += 4;
                            i+=1;
                        } else nunmber += 1;
                    } else nunmber += 1;
                    break;
                case "V":
                    nunmber += 5;
                    break;
                case "X":
                    if(i != s.length()-1) {
                        if(s.charAt(i+1) == 'L') {
                            nunmber += 40;
                            i+=1;
                        } else if(s.charAt(i+1) == 'C') {
                            nunmber += 90;
                            i+=1;
                        } else nunmber += 10;
                    } else nunmber += 10;
                    break;
                case "L":
                    nunmber += 50;
                    break;
                case "C":
                    if(i != s.length()-1) {
                        if(s.charAt(i+1) == 'D') {
                            nunmber += 400;
                            i+=1;
                        } else if(s.charAt(i+1) == 'M') {
                            nunmber += 900;
                            i+=1;
                        } else nunmber += 100;
                    } else nunmber += 100;
                    break;
                case "D":
                    nunmber += 500;
                    break;
                case "M":
                    nunmber += 1000;
                    break;
            }
        }
    return nunmber;
    }

    public static void main(String[] args) {
        String s = "DCXXI";
        System.out.println(romanToInt(s));
    }
}
