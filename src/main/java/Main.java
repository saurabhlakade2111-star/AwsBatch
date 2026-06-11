public class Main {

    public static void main(String[] args) {

        System.out.println("AWS Batch Java Demo Started");

        for(int i = 1; i <= 10; i++) {
            System.out.println("Processing record " + i);
        }

        System.out.println("Job Completed");
    }
}