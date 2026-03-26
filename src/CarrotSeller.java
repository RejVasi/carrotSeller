import java.time.LocalDate;

public class CarrotSeller
{
    private String sellerName;
    private LocalDate birthDate;
    private int contractsMade;
    private double soldCarrots; // in tons
    private boolean isSeniorSeller;

    public CarrotSeller(String _name, LocalDate _date, int _contractsMade, double _soldCarrots, boolean _isSeniorSeller)
    {
        this.sellerName = _name;
        this.birthDate = _date;

        this.contractsMade = _contractsMade;
        this.soldCarrots = _soldCarrots;
        this.isSeniorSeller = _isSeniorSeller;
    }


    //  Getters
    public String getSellerName()
    {
        return this.sellerName;
    }

    public LocalDate getBirthDate()
    {
        return this.birthDate;
    }

    public int getContractsMade()
    {
        return this.contractsMade;
    }

    public double getSoldCarrots()
    {
        return this.soldCarrots;
    }

    public boolean isSeniorSeller()
    {
        return this.isSeniorSeller;
    }


    //  Setters
    public void setSellerName(String sellerName)
    {
        this.sellerName = sellerName;
    }

    public void setBirthDate(LocalDate birthDate)
    {
        this.birthDate = birthDate;
    }

    public void setContractsMade(int contractsMade)
    {
        this.contractsMade = contractsMade;
    }

    public void setSoldCarrots(double soldCarrots)
    {
        this.soldCarrots = soldCarrots;
    }

    public void setSeniorSeller(boolean seniorSeller)
    {
        isSeniorSeller = seniorSeller;
    }

}

