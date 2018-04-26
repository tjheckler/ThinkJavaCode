public class Student
{
    private String name;
    private int studentId;
    private double gpa;


    public Student(String name, int studentId)
    {
        this.name = name;
        this.studentId = studentId;

    }

    public String getName()
    {
        return name;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public double getGpa()
    {
        return gpa;
    }
}
