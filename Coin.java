/**
   A coin with a monetary value.
*/
public class Coin implements Comparable
{
  private double value;
  private String name;
    
  /**
      Constructs a coin.
      @param aValue the monetary value of the coin.
      @param aName the name of the coin
   */
   public Coin(double aValue, String aName) 
   { 
      value = aValue; 
      name = aName;
   }

  /**
      Gets the coin value.
      @return the value
   */
   public double getValue() 
   {
      return value;
   }

  /**
      Gets the coin name.
      @return the name
   */
   public String getName() 
   {
      return name;
   }
  
  public String toString()
   {
      return "Coin[value=" + value + ",name=" + name + "]";
   }
   
  public int compareTo(Object otherObject)
  {
      Coin other = (Coin) otherObject;
      if(value < other.value) 
      {
          return -1; 
      }
      else if(value > other.value)
      {
          return 1;
      }
      else
      {
          return 0;    
      }
    }
}