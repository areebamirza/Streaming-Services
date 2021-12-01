/*
  Instance Data: 4 variables, 3 data types
  String name - ie netflix, spotify, hulu
  double price - ie 6.99, 7.99, 12.99 - minimum value 0
  int userAmount - in millions ie userAmount == 131 means 131 million users - minimum value 0
  boolean available - available in the country

  Constructors: 2 constructors
  default - name "unknown", price 0, userAmount 0, available false
  name
  name, price
  name, price, userAmount
  name, price, userAmount, available

  Mutators: 4 mutators
  setName()
  setPrice()
  setUserAmount()
  setAvailable()
  
  Accessors: 4 accessors
  getName()
  getPrice()
  getUserAmount()
  getAvailable()

  Others: equals, toString
  equals() - equal if name and price are equal
  toString() - name + ": price is $" + price + "; " + userAmount + " million users; " + "available"/" not available"

  Additional: 2 methods
  sale() - sets price to 75% of original value
  addUsers() - increments userAmount by 1 - adding 1 million users
  substractUsers() - increments userAmount by -1 - substracting 1 million users
*/

public class StreamingService
{


  // Instance Data

  private String name;
  private double price;
  private int userAmount;
  private boolean available;


  // Constructors

  public StreamingService() // default
  {
    this("unknown", 0, 0, false);
  }

  public StreamingService(String n) // name
  {
    this();
    setName(n);
  }

  public StreamingService(String n, double p) // name, price
  {
    this();
    setName(n);
    setPrice(p);
  }

  public StreamingService(String n, double p, int u) // name, price, users
  {
    this();
    setName(n);
    setPrice(p);
    setUserAmount(u);
  }

  public StreamingService(String n, double p, int u, boolean a) // name, price, users, available
  {
    setName(n);
    setPrice(p);
    setUserAmount(u);
    setAvailable(a);
  }


  // Mutators

  public void setName(String n) // changes name
  {
    name = n;
  }

  public void setPrice(double p) // changes price
  {
    price = p;
  }

  public void setUserAmount(int u) // changes userAmount
  {
    userAmount = u;
  }

  public void setAvailable(boolean a) // changes available
  {
    available = a;
  }


  // Accessors

  public String getName() // returns name
  {
    return name;
  }

  public double getPrice() // returns price
  {
    return price;
  }

  public int getUserAmount() // returns userAmount
  {
    return userAmount;
  }

  public boolean getAvailable() // returns available
  {
    return available;
  }


  // Others

  public boolean equals(StreamingService s) // checks if names and prices of 2 StreamingService objects are equal
  {
    if(this.getName().equals(s.getName()) && this.getPrice() == s.getPrice())
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public String toString() // name + ": price is $" + price + "; " + userAmount + " million users; " + "available"/"not available"
  {
    String str = "";
    str += name;
    str += ": price is $" + price;
    str += "; " + userAmount + " million users; ";
    if(!available)
    {
      str += "not ";
    }
    str += "available";

    return str;
  }


  // Additional

  public void sale() // set price to 75% of original value
  {
    setPrice(price * 0.75);
  }

  public void addUsers() // userAmount + 1 - adding 1 million users
  {
    userAmount++;
  }

  public void subtractUsers() // userAmount - 1 - substracting 1 million users
  {
    userAmount--;
  }


}