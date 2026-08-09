public class PATTERN12 {
    public static void main(String[] args) {
        int n = 5;
        for (int r = 1; r<n*2;r++){
            int c = r;
            int j = r;
          if(r<n){
                c = r;
                j = r;
            }
            else{
                c=n*2-r;
                j = n*2-r;
            }
           for(int co=1;co<=c;co++){
              System.out.print(" ");
            }
            for(int i=n; i>=j;i--){
                System.out.print("* ");
            }System.out.println();
        }
    }
}
