public class FRQ2 {

  private String sequence;

  public FRQ2(String sequence){
      this.sequence = sequence;

  }

  public void display(){
      System.out.println(this.sequence);
  }
  /** Updates the sequence to the value in seq
  */
  public void changeSequence(String newSequence){
      this.sequence = newSequence;
  }
  
/** Inserts the string segment in the current sequence,
* starting at the index ind. Returns the new sequence.
*/
  public String insertSegment(String segment, int index){
      StringBuffer sb = new StringBuffer(this.sequence);
      sb.insert(index + 1, segment);
      this.sequence = sb.toString();
      return this.sequence;

  }

  public String removeSegment(String segment){
      
      this.sequence = sequence.replaceFirst(segment, "");
      return this.sequence;
  }
  
}