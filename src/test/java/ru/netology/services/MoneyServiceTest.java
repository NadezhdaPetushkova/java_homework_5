package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class MoneyServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/moneycalc.csv")
    public void shouldCalculateForRest(int expected, int income, int expenses, int threshold) {
        MoneyService service = new MoneyService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
        System.out.println("Количество месяцев отдыха " + actual + ", если зарабатывать " + income + ", а тратить " + expenses + ". Отдых учитывается, если есть на счету " + threshold + " рублей");
    }
}

