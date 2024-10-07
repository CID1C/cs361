public class inOut {

    public static int test(int x, String label) {
        System.out.println("Evaluating " + label + ": " + x);
        return x;
    }

    public static int recursive(int a, int b) {
        if (a == 0) {
            return b;
        } 
        else {
            return recursive(test(a - 1, "a - 1"), test(b + 1, "b + 1"));
        }
    }

    public static void main(String[] args) {
        System.out.println("Final Result: " + recursive(3, 0)); 
        //innermost, evaluates before recursive call
    }
}