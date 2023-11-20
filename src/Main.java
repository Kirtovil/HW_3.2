public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double heigth = 1.87;
        int weight = 98;
        int index = service.calculate(heigth, weight);
        System.out.println(index);

        }
    }