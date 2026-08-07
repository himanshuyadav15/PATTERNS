public class PATTERN6 {
    public static void main(String[] args) {
        int n = 5;
        for(int r = 1; r<=n; r++){
            for(int c=r; c<=n; c++){
                System.out.print(" ");
            
            }
            for(int c2=1; c2<=r;c2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
