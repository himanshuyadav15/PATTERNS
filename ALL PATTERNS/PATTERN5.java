public class PATTERN5{
    public static void main(String[] args) {
        int n = 5;
        for(int r = 1; r<n*2; r++){
            int c = r;
            if(c>n){
                c = n*2 - c;
            }
            else{c = r;}
            for(int co=1 ; co<=c; co++){
                System.out.print("*");
            }System.out.println();
        }
    }
}