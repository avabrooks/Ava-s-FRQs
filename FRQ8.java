public class FRQ8

{
  public class Plot{
    private String cropType;
    private int cropYield;
    public Plot(String crop, int yield)
    {
      this.cropType = crop;
      this.cropYield = yield;
    }

    public String getCropType()
    {
      return cropType;
    }

    public int getCropYield()
    {
      return cropYield;
    }

    public String toString() {
      return this.cropType+", "+this.getCropYield();
    }
  }

    
  public class ExperimentalFarm
  {
    private Plot[][] farmPlots;
  
  public ExperimentalFarm(Plot[][] p)
  {
    this.farmPlots = p;
  }

  public Plot getHighestYield(String c)
  {
    Plot plot = null;
    int highest = this.farmPlots[0][0].getCropYield();
    for(int i=0;i<4;i++)
    {
      for(int j=0;j<3;j++)

      {
        if(farmPlots[i][j].getCropType().equalsIgnoreCase(c) && farmPlots[i][j].getCropYield()>highest)
        {
            highest = farmPlots[i][j].getCropYield();
            plot = farmPlots[i][j];
        }
      }
    }
    if(plot != null)
      return plot;
    else
      return null;


  }

  public boolean sameCrop(int col)
  {   
    boolean check = true;;
    String crop = farmPlots[0][col].getCropType();
    for(int i=0;i<4;i++)
    {
        if(!farmPlots[i][col].getCropType().equalsIgnoreCase(crop))
          {
          check = false;
          break;
          }
      }
    return check;
    }

  }

}