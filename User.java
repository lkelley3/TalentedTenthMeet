public class Finance{
    private int frugalityRating;
    private double income;
    private double incomePreferenceMin;

    public int getFrugalityRating() {
        return frugalityRating;
    }

    public void setFrugalityRating(int frugalityRating) {
        this.frugalityRating = frugalityRating;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getIncomePreferenceMin() {
        return incomePreferenceMin;
    }

    public void setIncomePreferenceMin(double incomePreferenceMin) {
        this.incomePreferenceMin = incomePreferenceMin;
    }

    public double getIncomePreferenceMax() {
        return incomePreferenceMax;
    }

    public void setIncomePreferenceMax(double incomePreferenceMax) {
        this.incomePreferenceMax = incomePreferenceMax;
    }

    private double incomePreferenceMax;

}
