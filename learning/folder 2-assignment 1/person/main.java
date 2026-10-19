
public class main {
    public static void main(String[] args){
        person Driver1 = new person();
        Driver1.setFirst_Name("Samuel");
        Driver1.setLast_Name("Oddoye");
        Driver1.setGender("Male");
        Driver1.setPhone_Number("0242100866");

        System.out.println("The Drivers First Name is: " + Driver1.getFullName());
        System.out.println("The Driver's Gender is : " + Driver1.getGender());
        System.out.println("THe Driver's Phone number is : " + Driver1.getPhone_Number());
    }
    
}
