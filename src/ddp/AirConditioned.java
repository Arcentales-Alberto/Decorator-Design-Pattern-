package ddp;

public class AirConditioned extends CarDecorator
{
    public AirConditioned(Saleable saleable) { super(saleable); }
    
    @Override
    public String getDescription() 
    {
      return getSaleable().getDescription() + " with air conditioned";
    }

    @Override
    public Double getPrice() 
    {
      return getSaleable().getPrice() + 32332.323;  
    }
    
}
