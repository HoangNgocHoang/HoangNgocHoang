
package Person;
 
public class Student extends Person {
    private double gpa;
    private double tuitionFee;

    public Student() {
    }

    public Student(double gpa, double tuitionFee) {
        this.gpa = gpa;
        this.tuitionFee = tuitionFee;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }
   
    @Override
    public double calculateIncome() {
        if (this.gpa > 3.5) {
            return this.tuitionFee * 0.5; // Học bổng bằng 50% học phí
        }
        return 0; // Không có thu nhập/học bổng
    }  
    @Override
    public void addPerson(){
        System.out.println("student :" + getName() +"added");
    }
    @Override
    public boolean updatePerson(){
        System.out.println("Student :" +getName() + "update");
        return true;
    }
    
    @Override
    public void displayDetails(){
        System.out.println("Gpa :" +getGpa() + " Name:" +getTuitionFee() + "Scholarship :" +calculateIncome() );
    }
    
}
