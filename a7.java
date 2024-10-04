import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        if(income>7000){
            System.out.println("scholarship is available");
        }
        else{
            System.out.println("not eligible for scholarship");
        }
    }
}