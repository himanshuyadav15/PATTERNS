public class PATTERN8 {
    public static void main(String[] args) {
        int n = 5;
        for(int r = 1; r<=5; r++){
            for(int c=n; c>=r; c--){
                System.out.print(" ");
            }
            for(int c2=1; c2<=r*2-1; c2++){
                System.out.print("*");
            }System.out.println();
        }
    }
}    
