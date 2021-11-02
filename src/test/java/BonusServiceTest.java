import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateNotRegisteredAndAnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean notRegistered = true;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, notRegistered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegistered() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean notRegistered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, notRegistered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
