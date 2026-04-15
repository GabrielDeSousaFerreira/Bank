package entities;

import java.time.LocalDate;

public class BusinessAccount extends Account{
    private String cnpj;
    private String companyName;
    private LocalDate foundationDate;
    private double annualRevenue;

    public static final double MIN_INCOME = 50000.0;

    public BusinessAccount(String cnpj, String companyName, LocalDate foundationDate, double annualRevenue,String password) {
        super(password);
        this.cnpj = cnpj;
        this.companyName = companyName;
        this.foundationDate = foundationDate;
        this.annualRevenue = annualRevenue;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public double getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public boolean isEligible() {
        return this.annualRevenue >= MIN_INCOME;
    }

    @Override
    public String toString() {
        return "\nBusiness Account data:" +
                "\nCNPJ: " + cnpj +
                "\nCompany Name: " + companyName +
                "\nFundation date: " + foundationDate +
                "\nAnnual revenue: " + annualRevenue;
    }

    @Override
    public String getDocument() {
        return cnpj;
    }

    @Override
    public String getDisplayName() {
        return companyName;
    }
}
