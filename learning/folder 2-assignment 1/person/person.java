
public class person {
   public String First_Name ;
   public String Last_Name ;
   public int Age ;
   public String Gender ;
   public String Phone_Number ;

   public void setFirst_Name(String newFirst_Name){
    First_Name = newFirst_Name;
   }

   public void setLast_Name(String newLast_Name){
    Last_Name = newLast_Name;
   }

   public String getFullName(){
    return First_Name + " " + Last_Name;
   }

   public void setAge(int newAge){
    Age = newAge;
   }

   public int getAge(){
    return Age;
   }

   public void setGender(String newGender){
    Gender = newGender ;
   }

   public String getGender(){
     return Gender;
   }

   public void setPhone_Number(String newPhone_Number){
    Phone_Number = newPhone_Number;
   }

   public String getPhone_Number(){
    return Phone_Number;
   }

}
