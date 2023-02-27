package alg2_MoneyBox;

public class MoneyBox
{
    private int singles;
    private int doubles;
    private String owner;

    public MoneyBox(int singles, int doubles, String owner){
        this.singles = singles;
        this.doubles = doubles;
        this.owner = owner;
    }
    public MoneyBox(String owner){
        this.owner = owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public int getSum(){
        int sum = 0;
        for(int i = 0; i < singles;i++){
            sum+=1;
        }
        for(int i = 0; i < doubles;i++){
            sum+=2;
        }
        return sum;
    }

    public void insertSingle(){
        singles++;
    }
    public void insertDouble(){
        doubles++;
    }
    public void insert(int singles, int doubles){
        this.singles+=singles;
        this.doubles+=doubles;
    }

    @Override
    public String toString() {
        int sum = getSum();
        return String.format("%s má v pokladničce %dKč - %dx1Kč, %dx2Kč.", owner, sum, singles, doubles);
    }

    public boolean isEnough(int price){
        if(getSum() >= price){
            return true;
        }
        return false;
    }


}
