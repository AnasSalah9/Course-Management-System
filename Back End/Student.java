package code;



import java.io.Serializable;
import java.util.ArrayList;


public class Student extends Person implements Serializable {

    
    private int level;
    private double grade;
    
    public int[] studentCourses = new int[10];
    public double [] studentGrades = new double[10];
    
    private final String studentFileName = "Students.bin";

    public static ArrayList<Student> Students = new ArrayList<Student>();

    public Student() {

    }

    public Student(String user, String pass, int id, String fname, String lname, int age, int level) {
        super(user, pass, id, fname, lname, age);
        this.level = level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    public void setGrade(double grade){
      this.grade = grade;    
    }
    
    public int getLevel() {
        return this.level;
    }
    
    public double getGrade(){
       return this.grade; 
    }
    

    public boolean addStudent() {
        loadFromFile();
        Students.add(this);
        return commitToFile();
    }

    public boolean commitToFile() {
        return FManger.write(studentFileName, Students);
    }

    public void loadFromFile() {
        Students = (ArrayList<Student>) FManger.read(studentFileName);
    }

    private int getStudentIndex(int id) {
        for (int i = 0; i < Students.size(); i++) {
            if (Students.get(i).getID() == id) {
                return i;
            }
        }

        return -1;
    }

    public String displayAllStudents() {
        loadFromFile();
        String S = "\n   All Student Data:\n";
        for (Student x : Students) {
            S = S + x.toString();
        }
        return S;
    }

    public Student searchStudent(int id) {
        Student s = new Student();
        loadFromFile();
        int index = getStudentIndex(id);
        if (index != -1) {
            System.out.println("\nFound ...!" + Students.get(index).toString());
            return Students.get(index);
        } else {
            System.out.println( "\nNot Found ...!");
            return s;
        }
    }

    public boolean updateStudent(int oldID, Student x) {
        loadFromFile();
        int index = getStudentIndex(oldID);

        if (index != -1) {
            Students.set(index, x);
            return commitToFile();
        }

        return false;
    }

    public boolean deleteStudent(int id) {
        loadFromFile();
        int index = getStudentIndex(id);

        if (index != -1) {
            Students.remove(index);

            return commitToFile();
        }

        return false;
    }
    public boolean addGrades(int id,double grade)
    {
        loadFromFile();
        int index = getStudentIndex(id);
        if(index !=-1)
        {
        Students.get(index).setGrade(grade);
        return commitToFile();
        }
        return false;
    }
   public double showGrades(int id)
   {
        loadFromFile();
        int index = getStudentIndex(id);
        if(index !=-1)
        {
            return Students.get(index).getGrade();
        }
        else
        {
            return 0;
        }
   }
   public  void TextFromInstracror(String text)
   {
       System.out.print(text);
   }
    @Override
    public String toString() {
        return "\n   Student Name : " + fname + " " + lname + "\n" + "   ID : " + id + "\n" + "   Age : " + age + "\n"
                + "   Level : " + level + "\n" +"   UserName: " + userName + "\n" + "   Password: " + pass + "\n" + "-------------------------------------------\n";
    }
    
    
    
   public void StudentAddCourse(int courseID){
       Admin manager = new Admin();
       
       Course tempCourse = manager.searchForCourse(courseID);
       if(tempCourse.getCId() != courseID) return;
       
       
       
       
       
       
   }
    
    
    
    
    
    
    
    
    
    
    
    
    

}
