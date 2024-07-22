public class Print_Nto1 {
    
    static void printe(int n,int i)
    {
        if(n<i)
        return;
        System.out.println(n);
        printe(n-1,i);
    }
    public static void main(String[] args) {
        int end=1;
        printe(9,end);
    }
}
