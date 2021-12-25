import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        Scanner sc = new Scanner(System.in);
        
        
        int n,count,a,b;
        a=b=0;
        System.out.println("Enter no.");
        n = sc.nextInt();
        int s = 3*n;
        
        int arr[] = new int[s];
        
        for(int i=0;i<n;i++){
            count =0;
            System.out.println("Enter 3 no. betn 0 or 1");
            for(int j=0;j<3;j++){
                arr[i] = sc.nextInt();
                if(arr[i] == 1){
                    count++;
                }
            }
            //System.out.println("count: "+count);
            if(count >= 2){
                a++;
                //System.out.println("count for 2 and more: "+a);
                if(count==3){
                    b++;
                    //System.out.println("count for 3: "+b);
                }
            }
                 
        }
        
        if(b <= a){
            System.out.println("\nThe number of problems they can solve " +a);
        }
        else if(b > a){
           System.out.println("\nThe number of problems they can solve " +b); 
        }
      
    }
}
