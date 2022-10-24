public class Student extends Human{
    private int id;
    private String group;
    private int scores;
    public Student(String name, String surname, String group){
        super(name,surname);
        this.group = group;
    }

    public String toString() {
        return super.toString() + " " + group;
    }
}