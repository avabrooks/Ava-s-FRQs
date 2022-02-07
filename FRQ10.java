class FRQ10{

  public int LCM(int a, int b) { 
    return (a * b) / GCF(a, b); 
    } 

  public int GCF(int a, int b) { 
    if (b == 0) { 
      return a; 
      } 
      
      else { 
        return (GCF(b, a % b)); 
        } 
  }

  

  
}