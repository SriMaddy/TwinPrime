import java.util.Scanner;

public class TwinPrimeTest
{
 public static void main(String[] args)
 {
 Scanner scanner = new Scanner(System.in);
 TwinPrime twinPrime = new TwinPrime();
 System.out.println("Enter minLimit");
 int minLimit = scanner.nextInt();
 System.out.println("Enter maxLimit");
 int maxLimit = scanner.nextInt();
 
 while(minLimit <= maxLimit)
  {
  twinPrime.printTwinPrime(minLimit);
  minLimit++;
  }

 }
}