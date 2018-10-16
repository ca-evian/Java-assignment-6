public class employee extends member{
    employee(String na, int sa, int ye,int mo,int da){
        name = na;
        salary = sa;
        year = ye;
        month = mo;
        date = da;
    }
    public void celebrate(int thisMonth){
        if (thisMonth != month)
            return;
        else System.out.println("employee "+name+" got a birthday gift");
    }
    public void pay(){
        System.out.println("employee "+name+" got salary "+salary+" this month");
    }
}

