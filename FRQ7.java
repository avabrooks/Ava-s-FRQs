import java.util.*;

class UserName{

  ArrayList<String> possibleNames;

  UserName(String firstName, String lastName){

    if(this.isValidName(firstName) && this.isValidName(lastName)){

      possibleNames = new ArrayList<String>();

      for(int i=1;i<firstName.length()+1;i++){

        possibleNames.add(lastName+firstName.substring(0,i));

      }

      }
      else
      {
       System.out.println("firstName and lastName must contain letters only.");
      }

      }

  public boolean isUsed(String name, String[] arr){
    for(int i=0;i<arr.length;i++){
      if(name.equals(arr[i]))
      return true;
  }
    return false;

  }

  public void setAvailableUserNames(String[] usedNames){
    String[] names = new String[this.possibleNames.size()];

    names = this.possibleNames.toArray(names);

    for(int i=0;i<usedNames.length;i++){
     if(isUsed(usedNames[i],names)){
     int index = this.possibleNames.indexOf(usedNames[i]);
    this.possibleNames.remove(index);
    names = new String[this.possibleNames.size()];
    names = this.possibleNames.toArray(names);
    }
  }

}

  public boolean isValidName(String str){     
    if(str.length()==0) return false;
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)<'a'||str.charAt(i)>'z' && (str.charAt(i)<'A' || str.charAt(i)>'Z'))
      return false;
      }
    return true;

  }


}