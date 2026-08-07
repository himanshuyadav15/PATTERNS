public class PATTERN9 {
    public static void main(String[] args) {
        int n = 5;
        for(int r=1; r<=n; r++){
            for(int c=1; c<=r;c++){
                System.out.print(" ");
            }
            for(int c2=(n*2)-(r*2-1); c2>=1;c2--){
                System.out.print("*");
            }System.out.println();
        }
    }
}