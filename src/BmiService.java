public class BmiService {
    public int calculate(int index_m, double index_h) {
        double indexbody;
        indexbody = index_m / (index_h * index_h);
        return (int) indexbody;
    }
}