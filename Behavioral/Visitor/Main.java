package Behavioral.Visitor;

interface Visitor {
    void visit(Engineer engineer);
    void visit(Manager manager);
}

interface Employee {
    void accept(Visitor visitor);
}

class Engineer implements Employee {
    private String name;
    private double salary;
    private int experience;

    public Engineer(String name, double salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class Manager implements Employee {
    private String name;
    private double salary;
    private int experience;

    public Manager(String name, double salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class IncomeVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.getName() + " has a salary of $" + engineer.getSalary());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(manager.getName() + " has a salary of $" + manager.getSalary());
    }
}

class ExperienceVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.getName() + " has " + engineer.getExperience() + " years of experience");
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(manager.getName() + " has " + manager.getExperience() + " years of experience");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
            new Engineer("John Doe", 10000, 5),
            new Manager("Jane Doe", 20000, 10)
        };

        IncomeVisitor incomeVisitor = new IncomeVisitor();
        ExperienceVisitor experienceVisitor = new ExperienceVisitor();

        for (Employee employee : employees) {
            employee.accept(incomeVisitor);
            employee.accept(experienceVisitor);
        }
    }
}
