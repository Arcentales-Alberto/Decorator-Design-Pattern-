package ddp;


public class Controller
{
    public void start()
    {
       Saleable s = new Fiat();
       s = new AirConditioned(s);
       s = new Bluetooh(s);
       s = new Computer(s);
       
       System.out.println(s.getDescription() + "\n" + 
                          "Price: " + s.getPrice());
       
        Saleable s2 = new Ford();
       s2 = new AirConditioned(s2);
       s2 = new Bluetooh(s2);
       
       System.out.println(s2.getDescription() + "\n" + 
                          "Price: " + s2.getPrice());

    }
}
