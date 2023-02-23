public class MainDemo {
    public static void main(String[] args) {

        //  я точно знаю ,что все числа от 1 до 10
        // как найти число , которое повторяется больше всего раз
        int numbers[] = {1, 1, 5, 6, 6, 6, 5, 10, 2, 8, 8, 9, 8, 1};

        int counts[] = new int [10];

        for (int i = 0; i < numbers.length; i++){
            int currentNumber = numbers[i];
            counts[currentNumber]++;
        }
    }
}
