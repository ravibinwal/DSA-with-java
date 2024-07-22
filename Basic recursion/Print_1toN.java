public class Print_1toN {
static void printe(int i,int n)
{
    if(i>n)
return;
System.out.println(i);
printe(i+1,n);
}
public static void main(String[] args) {
    int start=1;
    printe(start,11);

}
}
