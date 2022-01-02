package financing;

public class FinancingFactory {

    private FinancingFactory() {}

    public static Financing createFinancing() {
        return new Financing(100.0, 50.0, 10);
    }
}
