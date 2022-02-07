public class FRQ3 {
    private boolean rsvp;
    private int selection;
    private String option1;
    private String option2;

    public FRQ3(boolean rsvp, int selection, String option1, String option2){
      this.rsvp = rsvp;
      this.selection = selection;
      this.option1 = option1;
      this.option2 = option2;
    }

    public void printFoodSelection() {
      if (selection == 1) {
        System.out.println("beef.");
      }else if (selection == 2) {
        System.out.println("chicken.");
      }else if (selection == 3) {
        System.out.println("pasta.");
      }else {
        System.out.println("fish.");
      }
    }

    public void storeFoodSelectionWithRSVPInfo() {
        if (rsvp == true) {
            String food = "fish" ;
            option1 = "Thank you for attending! You will be served ";
            if (selection == 1) {
               food = "beef.";
            }
            else if (selection == 2) {
                food = "chicken.";
            }
            else if(selection == 3) {
                food = "pasta.";
            } 
            option1 = option1.concat(food);
        } else {
            option1 = "Sorry you can't make it";
        }
    }


    public void printAttending(){
      if (rsvp){
        System.out.println("attending");
      }else{
        System.out.println("not attending");
      }
    }

    public void compareOptions(){
      if(option1.equals(option2)){
        System.out.println("true.");
      }else{
        System.out.println("false.");
      }
    }
}

