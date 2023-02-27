package Bus;

public class Bus
{
    private int seats;
    private int number;
    private String company;
    private int passengers;


    public Bus(int seats, int number, String company)
    {
        this.seats = seats;
        this.number = number;
        this.company = company;
        this.passengers = 0;
    }

    public Bus()
    {
        this.seats = 40;
        this.number = 0;
        this.company = "";
        this.passengers = 0;
    }

    public int getSeats()
    {
        return seats;
    }

    public int getNumber()
    {
        return number;
    }

    public String getCompany()
    {
        return company;
    }

    public int getPassengers()
    {
        return passengers;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public void exit(int passengers){
        if(this.passengers > 0){
            if(this.passengers >= passengers){
                this.passengers-=passengers;
            }
            else{
                this.passengers-=passengers-this.passengers;
            }
        }
    }

    public void onboard(int passengers){
        if((this.passengers + passengers)<=seats){
            this.passengers+=passengers;
        }
        else{
            int i = (this.passengers+passengers)-seats;
            this.passengers+=passengers-i;
        }
    }

    public void exitAll(){
        this.passengers=0;
    }

    @Override
    public String toString()
    {
        return String.format(
                "Autobus číslo %d společnosti %s s počtem sedadel %d veze %d cestujicich.",
                number, company, seats, passengers);
    }
}
