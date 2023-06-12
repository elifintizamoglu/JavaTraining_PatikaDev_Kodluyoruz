package Week2.Hw_SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Constructor method
    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // This method will calculate the tax applied to the salary.
    // If the employee's salary is less than 1000 TL, no tax will be applied.
    // If the employee's salary is more than 1000 TL, 3% of his salary will be taxed.
    double tax() {
        double taxAmount = 0;
        if (this.salary > 1000) {
            taxAmount = this.salary * 0.03;
        }
        return taxAmount;
    }

    // If the employee has worked more than 40 hours a week,
    // bonus will be calculated as 30 TL per hour of extra work.
    int bonus() {
        int bonus = 0;
        if (this.workHours > 40) {
            bonus = (this.workHours - 40) * 30;
        }
        return bonus;
    }

    // This method will calculate the salary increase based on the employee's starting year.
    // Current year is taken as 2021.
    // If the employee has been working for less than 10 years, his salary will be increased by 5%.
    // If the employee has worked for more than 9 years and less than 20 years, his salary will be increased by 10%.
    // If the employee has been working for more than 19 years, a 15% raise will be made.
    double raiseSalary() {
        int totalWorkYear = 2021 - this.hireYear;
        double raiseAmount = 0;
        if (totalWorkYear < 10) {
            raiseAmount = this.salary * 0.05;
        } else if (9 < totalWorkYear && totalWorkYear < 20) {
            raiseAmount = this.salary * 0.10;
        } else if (19 < totalWorkYear) {
            raiseAmount = this.salary * 0.15;
        }
        return raiseAmount;
    }

    // This method will print the employee's information on the screen.
    void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Salary Raise: " + raiseSalary());
        System.out.println("Total salary with tax, bonus, and raise: " + (this.salary-tax()+bonus()+raiseSalary()));
    }
}
