import java.util.*;
class arms
{	
static int digitC(int n){		
int c=0;
while(n!=0)
{
c++;
n=n/10;
}	
return c;
}
static int arm(int n)
{
int d=digitC(n);
int sum=0;
while(n!=0)
{
int y=n%10;         //153
int re=pow(y,d);
sum=sum+re;
n=n/10;

}
return sum;

}

static int pow(int y,int d)
{
int sum=y;
for(int i=1;i<d;i++)          // 153          1<3  2<3 3<=3  
{
sum=sum*y;

}
                                      
return sum;
}
static void arm1(int s,int e){

for(int i=s;i<=e;i++)
{
	int n=i;
	int ans=arm(i);
	if(ans==n)
		System.out.println(n);
}

}
public static void main(String arg[])
{
Scanner o=new Scanner(System.in);
int s=o.nextInt();
int e=o.nextInt();
arm1(s,e);;
}}