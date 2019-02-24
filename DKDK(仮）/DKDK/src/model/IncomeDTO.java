package model;

public class IncomeDTO
{
    private int income_id;
    private String income;


    public int getIncomeId()
    {
        return this.income_id;
    }
    public void setIncomeId(int income_id)
    {
        this.income_id = income_id;
    }

    public String getIncome()
    {
        return this.income;
    }

    public void setIncome(String in)
    {
        this.income = in;
    }
}
