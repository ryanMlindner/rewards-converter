public class RewardValue {
  double cashValue;
  double milesValue;
  public RewardValue(double cash) {
    cashValue = cash;
  }
  public RewardValue(double miles) {
    milesValue = miles;
  }
  getCashValue() {
    return cashValue;
  }
  getMilesValue() {
    milesValue = cashValue * 0.0035;
    return milesValue;
  }
}