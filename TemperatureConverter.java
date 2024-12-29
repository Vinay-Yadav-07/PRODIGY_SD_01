import java.util.*;
class TemperatureConverter
{
    public static void main(String args[])
    {
        int t;
        double c,f,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature");
        t=sc.nextInt();
        System.out.println("Specify if the temperature is in Celsius, Farenheits or Kelvin");
        System.out.println("Enter 1 for Celsius");
        System.out.println("Enter 2 for Farenheits");
        System.out.println("Enter 3 for Kelvin");
        int operator = sc.next().charAt(0);
        switch(operator)
        {
        case '1': f=((t*1.8)+32);
                      System.out.println("The temperature in fahrenheits:"+f);
                        k= t+273.15;
                        System.out.println("The temperature in Kelvin:"+k);
                        break;
        case '2': c=(0.555*(t-32));
                      System.out.println("The temperature in celsius:"+c);
                        k=((0.555)*(t+459.67));
                        System.out.println("The temperature in Kelvin:"+k);
                        break;
        case '3': c=(t-273.15);
                      System.out.println("The temperature in Celsius:"+c);
                     f=(1.8*(t-273)+32);
                        System.out.println("The temperature in farenheits:"+f);
                        break;
        default: System.out.println("Invalid choice!");
        
     }
        
    }
}