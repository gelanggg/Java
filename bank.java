import java.util.*;
public class bank
{
public static void main (String [] args)
{int num,error=1,itype=0;
char type =0;
double min,cur =0,balance =0,rate=0, fee = 0;
Scanner in=new Scanner(System.in);
System.out.println("Enter account number: ");
num=in.nextInt();
while(error==1)
{
System.out.println("Enter account type(s-savings or c-checking):");
type=in.next().charAt(0);
if(type=='c'||type=='C')
{itype=1;
error=0;
rate=5/100.;
}
else if(type=='s'||type=='S')
{itype=0;
error=0;
rate=4/100.;
}
if(error==1)
System.out.println("Invalid type-re enter");
}
System.out.println("Enter minimum balance: ");
min=in.nextDouble();
System.out.println("Enter current balance: ");
cur=in.nextDouble();

if(itype==1)
if(cur>min+5000)
{
rate=3/100.;
balance = cur * rate + cur;
}

else if(cur<min)
{
fee =  25;
balance = cur - fee;
}

else if (cur  > min)
{
balance = cur * rate + cur;
}

if(itype==0)
if(cur<min)
{
fee = (cur - 10);
balance= fee;
}

else if(cur>min)
{
balance = cur * rate + cur;
}
System.out.printf("After interest and fees your balance is = $%.2f\n", balance);
System.out.println("Your account number: " + num);
System.out.println("Your account type: " + type);
System.out.printf("Your current balance: $%.2f\n ", cur);
System.out.printf("Your new balance: $%.2fn", balance);

}
}