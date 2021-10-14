public class paramPassing {

    public static void main(String[] args) {
        int data = 10;
        System.out.println("Data before calling method: " + data);
        processData(data);
        System.out.println("Data after calling method: " + data);
    }

    private static void processData(int data) {
        data = data * 10;
    }
}