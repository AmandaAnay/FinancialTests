package tests;

import financing.Financing;
import financing.FinancingFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancialTest {


    @Test
    public void shouldCreateObjectWithCorrectDataWhenDataIsValid() {
        Financing financing = FinancingFactory.createFinancing();

        Assertions.assertEquals(100.0, financing.getTotalAmount());
        Assertions.assertEquals(50.0, financing.getIncome());
    }

    @Test
    public void shouldThrowExceptionInCreatingObjectWhenDataIsInvalid() {

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Financing(10.0, 2.0, 3)
        );
    }

    @Test
    public void shouldUpdateAmountWhenDataIsValid() {
        Financing financing = FinancingFactory.createFinancing();
        double newAmount = 120;
        financing.setTotalAmount(newAmount);

        Assertions.assertEquals(newAmount, financing.getTotalAmount());
    }

    @Test
    public void shouldThrowExceptionInUpdateAmountWhenDataIsInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = FinancingFactory.createFinancing();
            financing.setTotalAmount(10000.0);
        });
    }

    @Test
    public void shouldUpdateIncomeWhenDataIsValid() {
        Financing financing = FinancingFactory.createFinancing();
        double income = 100;
        financing.setIncome(income);

        Assertions.assertEquals(income, financing.getIncome());
    }

    @Test
    public void shouldThrowExceptionInUpdateIncomeWhenDataIsInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = FinancingFactory.createFinancing();
            financing.setIncome(5.0);
        });
    }

    @Test
    public void shouldUpdateMonthsWhenDataIsValid() {
        Financing financing = FinancingFactory.createFinancing();
        int months = 20;
        financing.setMonths(months);

        Assertions.assertEquals(months, financing.getMonths());
    }

    @Test
    public void shouldThrowExceptionInUpdateMonthWhenDataIsInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = FinancingFactory.createFinancing();
            financing.setMonths(2);
        });
    }

    @Test
    public void shouldCalculateEntry() {
        double entry = 20;
        Financing financing = FinancingFactory.createFinancing();

        Assertions.assertEquals(entry, financing.entry());
    }

    @Test
    public void shouldCalculateQuota() {
        Financing financing = FinancingFactory.createFinancing();

        Assertions.assertEquals(8.0, financing.quota());
    }
}
