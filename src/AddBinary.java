import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        String a;
        String b;
        String c;
        a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        c = "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000";

        BigInteger x = new BigInteger(a,2);
        BigInteger y = new BigInteger(b,2);

        x = x.add(y);

        System.out.println(x.toString(2));

//        System.out.println(Integer.parseInt(a, 2));
//        System.out.println(Integer.parseInt(b, 2));
//        System.out.println(Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2)));

    }
}
