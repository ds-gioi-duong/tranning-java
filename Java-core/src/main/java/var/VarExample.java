package var;

public class VarExample {
    int x;

    public static void main(String[] args) {
        int x;
        x = 5;
        int y = 10;
        System.out.println(x);
        System.out.println(y);
        String str1 = "Hello";
        String str2 = "Hello";
        boolean isEqual = str1.equals(str2); // isEqual = true


        //type casting
        int i = 100;
        long l = i; // Ngầm định: int -> long

        long j = 100L;
        int k = (int) l; // Tường minh: long -> int
        //  Chuyển đổi từ kiểu dữ liệu lớn sang nhỏ thì phải cần

    }
}
