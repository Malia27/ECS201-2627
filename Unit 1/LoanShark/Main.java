public class Main {
    public static void main(String[] args) {
       System.out.println("Welcome to the Interest Calculator!");
       Loan loan1 = new Loan(1000, 10, 1, 12);
       System.out.println("Loan 1: Simple Interest: $" + loan1.calculateSimpleInterest());
        System.out.println("Loan 1 Total Repayment: $" + loan1.calculateTotalRepayment());    
    }
}
