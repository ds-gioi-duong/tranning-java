package memory;

public class Memory {
    //    Vùng nhớ Heap và Stack
//    Stack: Lưu trữ các biến kiểu dữ liệu nguyên thủy (int, float, etc.) và các tham chiếu đến đối tượng.
//    Dữ liệu trong Stack được quản lý theo kiểu LIFO (Last In, First Out).
//
//    Heap: Dùng để lưu trữ các đối tượng. Khi tạo một đối tượng bằng từ khóa new, nó sẽ được lưu trong Heap,
//    còn biến tham chiếu đến đối tượng này được lưu trong Stack.
    public static void main(String[] args) {
        String str = new String("uwu"); // "Hello" được lưu trong Heap
//    String Pool
//    Trong Java, String là bất biến (immutable). String Pool là một vùng nhớ đặc biệt trong Heap để quản lý các chuỗi.
//    Khi một chuỗi mới được tạo, nếu chuỗi đó đã tồn tại trong Pool thì Java sẽ không tạo mới, mà sẽ sử dụng lại chuỗi có sẵn.
        String str_1 = "uwu";
        String str_2 = "uwu";
        System.out.println(str == str_1); // false
        System.out.println(str_1 == str_2); // true
        System.out.println(str.equals(str_1)); // true

    }


}
