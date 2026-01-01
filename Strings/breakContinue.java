public class breakContinue {
    public static void main(String[] args) {
        int numbers[] = { 1, 22, 3, 44, 5, 6, 77, 8 };
        int target = 5;

        for (int num : numbers) {
            if (num == target) {
                System.out.println("Target value is :" + target);
                break;// after founding target , it wont execute further in this loop
            }
            System.out.println("Checking num:" + num);
        }
        for (int num : numbers) {
            if (num % 2 == 0) {
                //System.out.println("EVEN NUMBERS ");
                continue;// even no. will be skipped!
            }
            System.out.println("ODD NUMBERS ARE :" + num);
        }
    }
}
