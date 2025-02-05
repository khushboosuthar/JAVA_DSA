public class Typecasting {
    public static void main(String[] args) {

        // Explicit type conversion 0r typecasting

        int num = (int) 56.67f;
        System.out.println(num);

        // Implicit type conversion or automatic type conversion

        float a = 4.67f;
        float b = 56;
        System.out.println(a + " " + b);

        // type Promotion

        int i1 = 257; // 256 % 257 = 1
        int i2 = 251; // 256 % 251 = -5
        byte b3 = (byte) (i1);
        byte b4 = (byte) (i2);
        System.out.println(b3);
        System.out.println(b4);
    }
}