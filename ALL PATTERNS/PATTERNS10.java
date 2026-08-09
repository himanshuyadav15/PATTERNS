public class PATTERNS10 {
    public static void main(String[] args) {
        int n = 5;
        for (int r = 1; r<=n;r++){
            for(int c = n-1;c>=r;c--){
                System.out.print(" ");
            }for(int d = 1;d<=r;d++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }   
}
