import java.util.Scanner;

class Diamond
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = s.nextInt();
        int space =1,star=1;
        s.close();

        for(int i=1;i<=rows;i++)
        {
            for(int j =rows;j>=space;j--)
            {
                System.out.print(" ");
            }
            for(int k =1;k<=star;k++)
            {
                System.out.print("*");
            }
            if(i<=rows/2)
            {
                space++;
                star +=2;
            }
            else{
                space--;
                star-=2;
            }
            System.out.println();
        }
        
    }
}