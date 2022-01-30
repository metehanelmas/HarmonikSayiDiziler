public class Main {
    public static void main(String[] args) {

        int [] numbers={1,2,3,4,5,6,7,8,9,10};
        double total=0;
        for (int i=0;i< numbers.length;i++){
            total += 1.0/i;
        }
        System.out.println(numbers.length/total);
    }
}