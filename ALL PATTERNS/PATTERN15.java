public class PATTERN15 {
    public static void main(String[] args) {
        int n = 5;
        for(int r = 1; r<=n;r++){
            for(int c = 1;c<=r;c++){
                System.out.print(" ");
            }for(int c2 = n*2-r; c2>=r;c2--){
                if(r==1){System.out.print("*");}
                else if(c2==n*2-r || c2==r){System.out.print("*");}
                else{System.out.print(" ");}
            }System.out.println();
        }
    }
}
