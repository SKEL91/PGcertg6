import java.time.LocalDate;
import java.util.regex.*;

/**
 * Created by Sean Kelly on 21/02/2021
 * Program to read in the Users input as attributes
 */

abstract public class Citizen1 { //not entirely sure what type of class we should be creating? Abstract? Because of the data security issues?

   private String prefix; //maybe can create a list for this using politically correct gender prefixes..
   private String firstName;
   private String lastName;
   private int mobileNo;
   private java.time.LocalDate dob;
   private String email;
   Pattern nino = Pattern.compile("/^[A-CEGHJ-PR-TW-Z]{1}[A-CEGHJ-NPR-TW-Z]{1}[0-9]{6}[A-D]{1}$/i\n" +
         "\n"); // Still trying to understand how this pattern and matcher thing works. Found some code online that allows us to check whether a
   // national insurance number is a national insurance number (after being input by a user) - should also be able to do the same with email.
   // Useful for building in error handling from the start


public Citizen1(){
   //default constructor
}

public Citizen1(String citizenPrefix, String citizenFirstName, String citizenLastName, String citizenEmail, int citizenMobileNo,
                java.time.LocalDate citizenDOB, Pattern citizenNino){
   prefix=citizenPrefix;
   firstName=citizenFirstName;
   lastName=citizenLastName;
   email=citizenEmail;
   mobileNo=citizenMobileNo;
   dob=citizenDOB;
   nino=citizenNino;
}

   public String getPrefix() {
      return prefix;
   }

   public void setPrefix(String prefix) {
      this.prefix = prefix;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public int getMobileNo() {
      return mobileNo;
   }

   public void setMobileNo(int mobileNo) {
      this.mobileNo = mobileNo;
   }

   public LocalDate getDob() {
      return dob;
   }

   public void setDob(LocalDate dob) {
      this.dob = dob;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Pattern getNino() {
      return nino;
   }

   public void setNino(Pattern nino) {
      this.nino = nino;
   }

   @Override
   public String toString() {
      return "Based on the information you have entered, your details are:" +
             "Prefix: " + prefix + "\n" +
             "First Name: " + firstName + "\n" +
             "Last Name: " + lastName + "\n" +
             "Mobile No: " + mobileNo + "\n" +
             "Date of Birth:  " + dob + "\n" +
             "Email: " + email + "\n" +
             "National Insurance Number: " + nino + "\n";
   }

public String getStatus();

}//class