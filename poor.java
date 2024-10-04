import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=2;i<=n;i++){
            s=(s+2)%i;
        }
        System.out.println(s+1);
        
    }
}