package days55;

public class Job {

    private String title;
    private String company;
    private double salary;

    public Job() {
        this.title = "undefined";
        this.company = "undefined";
        System.out.println("No argument constructor");
    }

    public Job(String title) {
        this.title = title;
        this.company="undefined";
        System.out.println("One argument constructor");

    }

    public Job(String title, String company, double salary) {
        this.title = title;
        this.company = company;
        this.salary = salary;
        System.out.println("Three arguments constructor");

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
