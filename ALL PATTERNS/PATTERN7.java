public class PATTERN7 {
    public static void main(String[] args) {
        int n = 5;
        for(int r=1; r<=n; r++){
            for(int c=2; c<=r;c++){
                System.out.print(" ");
            }
            for(int c2=n;c2>=r;c2--){
                System.out.print("*");
            }System.out.println();

        }
    }
    
}
