package practice.patika;

public class Employee {

    public String name;
    public double salary;
    public double workHours;
    public int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(double salary){
        double taxAmount;
        if (salary<1000){
            taxAmount = 0.0;
        } else {
            taxAmount = salary * 0.03;
        }
        return taxAmount;
    }

    public double bonus(double workHours){
        if (workHours>40){
            return (workHours-40)*30;
        } else {
            return 0.0;
        }
    }

    public double raiseSalary(int hireYear){
        double raiseSalaryAmount;
        double salaryWithTaxAndBonus = salary + tax(salary) + bonus(workHours);
        if ( (2021-hireYear) < 10 ) {
            raiseSalaryAmount = salaryWithTaxAndBonus * 0.05;
        } else if ( (2021-hireYear) > 9 && (2021-hireYear) < 20 ){
            raiseSalaryAmount = salaryWithTaxAndBonus *  0.1;
        } else {
            raiseSalaryAmount = salaryWithTaxAndBonus * 0.15;
        }
        return raiseSalaryAmount;

    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + ( salary + raiseSalary(hireYear) ) +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                ", tax =" + tax(salary) +
                ", bonus =" + bonus(workHours) +
                ", raise in salary =" + raiseSalary(hireYear) +
                ", salary with tax and bonus =" + ( salary + raiseSalary(hireYear) + bonus(workHours) + tax(salary) ) +
                ", total salary=" + ( salary + raiseSalary(hireYear) + bonus(workHours) ) +
                '}';
    }
}
