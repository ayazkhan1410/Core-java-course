package ninth_Chpter;

class Student {
    private String name;
    private double cgpa;

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 2.00) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Your CGPA is less than 2");
        }
    }

    private String rollno;

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class getters_setters {
    public static void main(String[] args) {
        Student ss = new Student();
        ss.setName("Ayaz khan");
        System.out.println(ss.getName());
        ss.setRollno("F20");
        System.out.println(ss.getRollno());
        ss.setCgpa(3.79);
        System.out.println(ss.getCgpa());
    }
}