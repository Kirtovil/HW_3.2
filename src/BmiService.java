public class BmiService {
    public int calculate (double height, int weight) {
        double newHeight = height * height;
        int index =  (int) (weight / newHeight);
        return index;
    }
}
