class ascii
{
public static void main (String args[])
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
if(i%2==1)
{
System.out.print(i);}
else{
System.out.print((char)65);}
}
System.out.println();
}
}
}

/*

i%2==1
1
AA
222
BBBB
33333
*/



