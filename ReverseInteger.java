public class ReverseInteger {
    public static void main(String[] agrs) {
        int data = -129;

        int res = reverseInteger(data);
        System.out.println(res);
    }

    public static int reverseInteger(int data) {
      int absNumber = Math.abs(data);
      int reverse = 0;

      while (absNumber != 0) {
        int d = absNumber % 10;
        reverse = reverse * 10 + d;
        absNumber = absNumber / 10;    
      }

      return (data < 0) ? (-reverse) : reverse;
    }

    

}
