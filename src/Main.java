public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double indexH = 1.87; // рост в метрах
        int indexM = 98; // масса тела в кг
        int indexBody = service.calculate(indexM, indexH);
        System.out.println("Bндекс массы тела:" + indexBody);
    }
}
