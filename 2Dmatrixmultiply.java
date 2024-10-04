import java.util.*;
class main{
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int row=s.nextInt();
    int col=s.nextInt();
    int arr[][]=new int[row][col];
    int arr1[][]=new int[row][col];
    int arr2[][]=new int[row][col];
    for(int i=0;i<row;i+=1){
        for(int j=0;j<col;j+=1){
            arr[i][j]=s.nextInt();
        }
    }
    for(int i=0;i<row;i+=1){
        for(int j=0;j<col;j+=1){
            arr1[i][j]=s.nextInt();
        }
    }
    int sum=0;
    for(int i=0;i<row;i+=1){
        for(int j=0;j<col;j+=1){
            for(int k=0;k<row;k+=1){
                arr2[i][j]+=arr[i][k]*arr1[k][j];
            }
            System.out.print(arr2[i][j]+" ");
        }
        System.out.println();
    }

    }
    }
