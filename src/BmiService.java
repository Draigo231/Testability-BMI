public class BmiService {
    public int calculate(int indexM, double indexH) {
        double indexBmi;
        indexBmi = indexM / (indexH * indexH);
        return (int) indexBmi;
    }
}
