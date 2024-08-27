public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index_h = 1.87; // рост в метрах
        int index_m = 98; // масса тела в кг
        int indexbody = service.calculate(index_m, index_h);
        System.out.println("Bндекс массы тела:" + indexbody);
    }
}