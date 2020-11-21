import java.util.Scanner;

public class Nomor02
{
    public static void main(String[] args)
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            int y = scan.nextInt();
            for(int i = 1; i<=y; i++)
            {
                if(i%x==0)
                    System.out.println(i+" ");
                else
                    System.out.print(i+" ");

            }
        }
        catch(Exception e)
        {
            System.out.println("data harus bilangan bulat");
        }
    }
}