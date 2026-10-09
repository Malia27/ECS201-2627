public class Loan {
    double principal;
    double rate; 
    double time;
    int number;

    public Loan(double p, double r, double t, int n) {
        this.principal=p;
        this.rate=r;
        this.time=t;
        this.number=n;
    
    }

    public double calculateSimpleInterest() {
        return this.principal * this.rate * this.time;
    }

    public double calculateTotalRepayment() {
        return this.principal * Math.pow(1.0 + (this.rate / this.number), this.number * this.time);
    }
}