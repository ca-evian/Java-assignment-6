public class shareholder extends member{
    public int shares;
    shareholder(String na,int sh){
        name = na;
        shares = sh;
    }
    int getShares(int behalf)
    {
        return behalf * shares / 100;
    }
}
