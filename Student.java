public class Student{
    private String name, grade_level;
    private int OSIS;
    
    public Student(){
        name = "Jane Doe";
        OSIS = 000000000;
        grade_level = "9th Grade";
    }
    public Student(String n, int o, String g){
        name = n;
        OSIS = o;
        grade_level = g;
    }
    
    public void Students(String name, int OSIS, String grade_level){
        this.name = name;
        this.OSIS = OSIS;
        this.grade_level = grade_level;
    }
    
    public String getName(){
        return name;
    }
    
    public int getOSIS(){
        return OSIS;
    }
    public int getRandomOSIS(){
        return (int) ((Math.random() * 899999999) + 100000000);
    }
    
    public String getGrade(){
        return grade_level;
    }
}