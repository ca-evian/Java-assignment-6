import java.util.*;
import java.io.*;
public class run
{
    public static void main(String args[]) throws IOException {
        Scanner s = new Scanner(System.in);
        int stuffNumber;
        int managerNumber;
        int shareholderNumber;
        String nameTemp;
        int salaryTemp;
        int yearTemp;
        int monthTemp;
        int dateTemp;
        int sharesTemp;
        int benefit = 0;
        int benefit_final = 0;
        PrintStream mytxt=new PrintStream("/Users/caihao/Documents/log.txt");
        List<employee> allEmployee = new ArrayList<>();
        List<manager> allManager = new ArrayList<>();
        List<shareholder> allShareholder = new ArrayList<>();
        System.out.println("输入员工数量");
        stuffNumber = s.nextInt();
        s.nextLine();
        System.out.println("输入所有员工信息");
        mytxt.println("员工信息表：");
        mytxt.print(String.format("%-8s", "name"));
        mytxt.print(String.format("%-8s", "salary"));
        mytxt.print(String.format("%-8s", "year"));
        mytxt.print(String.format("%-8s", "month"));
        mytxt.println(String.format("%-8s", "date"));
        for(int i = 1; i <= stuffNumber; ++i){
            System.out.println("输入员工"+i+"信息");
            System.out.println("输入姓名");
            nameTemp = s.nextLine();
            mytxt.print(String.format("%-8s", nameTemp));
            System.out.println("输入每月工资");
            salaryTemp = s.nextInt();
            s.nextLine();
            mytxt.print(String.format("%-8s", salaryTemp));
            System.out.println("输入出生年份");
            yearTemp = s.nextInt();
            s.nextLine();
            mytxt.print(String.format("%-8s", yearTemp));
            System.out.println("输入出生月份");
            monthTemp = s.nextInt();
            s.nextLine();
            mytxt.print(String.format("%-8s", monthTemp));
            System.out.println("输入出生日期");
            dateTemp = s.nextInt();
            s.nextLine();
            mytxt.println(String.format("%-8s", dateTemp));
            employee temp = new employee(nameTemp,salaryTemp,yearTemp,monthTemp
                    ,dateTemp);
            allEmployee.add(temp);
        }
        System.out.println("输入经理数量");
        mytxt.println("经理信息表：");
        mytxt.print(String.format("%-8s", "name"));
        mytxt.print(String.format("%-8s", "salary"));
        mytxt.print(String.format("%-8s", "bonus"));
        mytxt.print(String.format("%-8s", "year"));
        mytxt.print(String.format("%-8s", "month"));
        mytxt.println(String.format("%-8s", "date"));
        managerNumber = s.nextInt();
        s.nextLine();
        System.out.println("输入所有经理信息");
        for(int i = 1; i <= managerNumber; ++i){
            System.out.println("输入经理"+i+"信息");
            System.out.println("输入姓名");
            nameTemp = s.nextLine();
            mytxt.print(String.format("%-8s", nameTemp));
            System.out.println("输入每月工资");
            salaryTemp = s.nextInt();
            s.nextLine();
            mytxt.print(String.format("%-8s", salaryTemp));
            mytxt.print(String.format("%-8s", salaryTemp));
            System.out.println("输入出生年份");
            yearTemp = s.nextInt();
            s.nextLine();
            mytxt.print(String.format("%-8s", yearTemp));
            System.out.println("输入出生月份");
            monthTemp = s.nextInt();
            s.nextLine();
            mytxt.print(String.format("%-8s", monthTemp));
            System.out.println("输入出生日期");
            dateTemp = s.nextInt();
            s.nextLine();
            mytxt.println(String.format("%-8s", dateTemp));
            manager temp = new manager(nameTemp,salaryTemp,yearTemp,monthTemp
                    ,dateTemp);
            allManager.add(temp);
        }
        System.out.println("输入股东数量");
        mytxt.println("股东信息表：");
        mytxt.print(String.format("%-8s", "name"));
        mytxt.println(String.format("%-8s", "share"));
        shareholderNumber = s.nextInt();
        s.nextLine();
        System.out.println("输入所有股东信息");
        for(int i = 1; i <= shareholderNumber; ++i){
            System.out.println("输入股东"+i+"信息");
            System.out.println("输入姓名");
            nameTemp = s.nextLine();
            mytxt.print(String.format("%-8s", nameTemp));
            System.out.println("输入所占股份比例");
            sharesTemp = s.nextInt();
            mytxt.println(String.format("%-8s", sharesTemp));
            s.nextLine();
            shareholder temp = new shareholder(nameTemp,sharesTemp);
            allShareholder.add(temp);
        }
        int monthInput;
        System.out.println("输入月份");
        monthInput = s.nextInt();
        s.nextLine();
        for(int i = 1;i <= 12; ++i){
            if (i != monthInput)
                continue;
            System.out.println(i+"月");
            for (employee temp : allEmployee){
                temp.pay();
                temp.celebrate(i);
                benefit += temp.salary;
            }
            for (manager temp : allManager){
                temp.pay();
                temp.celebrate(i);
                temp.getBonus();
                benefit += temp.salary * 2;
            }
        }
        benefit_final = (int) (benefit * Math.random() * 9) + benefit;
        for (shareholder temp : allShareholder){
                System.out.println("Shareholder "+ temp.name + " got bonus " + temp.getShares(benefit_final / 10)+ " this year");
        }
    }
}

