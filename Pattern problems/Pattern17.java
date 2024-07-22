class Pattern17 {

    public static void main(String[]
    
    args) {
    
    int n = 4;
    
    for(int i = 0 ;i<n;i++)
    
    {
    
    for(int j = 0 ; j < (n - i) ;j++)
    
    {
    
    System.out.print(" "); }
    
    for(int k = 0 ;k<=i;k++) {
    
    int asciival = 65 + k ;
    
    char character=(char )asciival;
    
    System.out.print(character);
    
    }
    
    for(int k = (i - 1) ;k>=0;k--) {
    
    int asciival = 65 + k ; char character=(char )asciival; System.out.print(character);
    
    
    
    }
    System.out.println(" ");
    }
    
}
}
