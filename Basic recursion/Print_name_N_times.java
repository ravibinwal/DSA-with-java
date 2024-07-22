public class Print_name_N_times {
   
   static void name(int i,int n){
    if(i>n)
    return;
    else{
        System.out.println("Ravi");
        name(i+1,n);
    }
  
   
    
   }
   
    public static void main(String[] args) {
        name(1,5);
    }
}
