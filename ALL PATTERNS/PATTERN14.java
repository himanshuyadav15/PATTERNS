public class PATTERN14 {
    public static void main(String[] args) {
        int n = 5;
        for(int r = 0;r<n;r++){
            for(int c = n;c>=r;c--){
                System.out.print(" ");
            }for(int c2 = 1;c2<=2*r+1;c2++){
                if(r==n-1){
                    System.out.print("*");
                }else if(c2==1 || c2==2*r+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
