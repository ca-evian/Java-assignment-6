public class manager extends member{
   manager(String na, int sa, int ye,int mo,int da){
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
        System.out.println("manager "+name+" got salary "+salary+" this month");
    }
   public void getBonus(){
        System.out.println("manager "+name+" got bonus "+salary+" this month");
   }
}
