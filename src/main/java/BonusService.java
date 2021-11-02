public class BonusService {
  public long calculate(long amount, boolean notRegistered) {
    int percent = notRegistered ? 1 : 1;
    long bonus = amount * percent / 100 / 100;
    long limit = 500;
    if (bonus > limit) {
      bonus = limit;
    }
    return bonus;
  }
}

