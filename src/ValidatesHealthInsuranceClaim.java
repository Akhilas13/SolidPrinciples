public class ValidatesHealthInsuranceClaim {
    public static void main(String[] args) {
        Customer customer=new Customer();
        InsuranceSurveyor surveyor=new InsuranceSurveyor();
        ClaimManager manager=new ClaimManager();

        customer.fileClaim();
        surveyor.validateClaim();
        manager.acceptOrRejectClaim(true);
    }

    }

class Person{
    String name;
    int age;

}

class Customer extends Person{
    int customerId;
    public void fileClaim(){
        System.out.println("Filing claim");
    }


}
class InsuranceSurveyor extends Person{
    int surveyorId;
    public void validateClaim(){
        System.out.println("Validating claim");
    }



}

class ClaimManager extends  Person {
    int managerId;

    public void acceptOrRejectClaim(boolean isValid) {
        if (isValid == true) {
            System.out.println("Acceptig claim");
        } else {
            System.out.println("Rejecting Claim");
        }


    }
}
