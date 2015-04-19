import java.util.Map;
import java.util.HashMap;

public class TwinPrime
{
 private Map<Integer,Boolean> checkingMap;

 public TwinPrime()
 {
 checkingMap = new HashMap<Integer,Boolean>();
 }

 private boolean isPrime(int number)
 {
 int factorsCount = 0;
 for(int divisor = 2; divisor < number; divisor++)
  {
  if((number % divisor) == 0)
   {
   factorsCount += 1;
   break;
   }
  }
 checkingMap.put(number,factorsCount==0);
 return factorsCount == 0;
 }
 
 public void printTwinPrime(int number)
 {
 int numberMinusTwo = number-2;
 int numberPlusTwo = number+2;
 if(((checkingMap.get(number) != null) || isPrime(number)) && checkingMap.get(number))
  {
  if(((checkingMap.get(numberMinusTwo) != null) || isPrime(numberMinusTwo)) && checkingMap.get(numberMinusTwo))
   {
   System.out.println(number + " is Twin Prime of " + numberMinusTwo);
   }
  else if(((checkingMap.get(numberPlusTwo) != null) || isPrime(numberPlusTwo)) && checkingMap.get(numberPlusTwo))
   {
   System.out.println(number + " is Twin Prime of " + numberPlusTwo);
   }
  else
   {
   System.out.println(number + " is Prime, but not having Twin Prime");
   }
  }
 else
  {
  System.out.println(number + "is Non Prime");
  }
 }
}