public class TipCalculator {

    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int people, int percent){
        numPeople = people;
        tipPercentage = percent;
        totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;
    }
    public int getTipPercentage(){
        return tipPercentage;
    }
    public void addMeal(double cost){
        totalBillBeforeTip += cost;
    }
    public double tipAmount(){
        double tip = totalBillBeforeTip*(tipPercentage*0.01);
        return tip;
    }
    public double totalBill(){
        double bill = totalBillBeforeTip + tipAmount();
        return bill;
    }
    public double perPersonCostBeforeTip(){
        double perPBeforeTip = totalBillBeforeTip/numPeople;
        return perPBeforeTip;
    }
    public double perPersonTipAmount(){
        double perPTip = tipAmount()/numPeople;
        return perPTip;
    }
    public double perPersonTotalCost(){
        double perPTotalCost = totalBill()/numPeople;
        return perPTotalCost;
    }
}
