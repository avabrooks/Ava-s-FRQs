import java.util.Scanner;

public class FRQ6 {
  private int [] itemsSold;
  private double [] wages;

  public FRQ6(){
    itemsSold = new int[10];
    wages = new double[10];

  }

  public double computeBonusThreshold(){
    int highest = itemsSold[0];
    int lowest = itemsSold[0];
    int sumOfItemsSold = itemsSold[0];
    double bonusThreshold =0;

    for (int i = 1; i < itemsSold.length ; i++){
      sumOfItemsSold += itemsSold[i];
      if(itemsSold[i] > highest)
      highest = itemsSold[i];
      if(itemsSold[i] < lowest )
        lowest = itemsSold[i];
      }

    bonusThreshold = (sumOfItemsSold - lowest - highest ) / (itemsSold.length -2.0);
    return bonusThreshold;
  }

  public void computeWages(double fixedWage, double perItemWage){
    double bonusThresholdForWages = computeBonusThreshold();

    for (int i = 0; i < wages.length ; i++){
      wages[i] = fixedWage + ( itemsSold[i] * perItemWage);
      if(itemsSold[i] > bonusThresholdForWages){
        wages[i] = wages[i] * 1.1 ;
      }
    }
  } 

  public void printWages(){
    for (int i = 0; i < wages.length ; i++)	{
      System.out.printf("Employee =%d , ItemsSold = %d, Wage = %.2f\n",i,itemsSold[i], wages[i]);
    }
  }

  public void scanItemSold(){

    System.out.println("Enter 10 items Sold seperated by a comma");
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    String items = myObj.nextLine();
    
    String [] itemsList = items.split(",");

    for(int i=0; i < itemsList.length; i++){
      itemsSold [i] = Integer.parseInt(itemsList[i].strip()); 
    }
    myObj.close();
  }


}