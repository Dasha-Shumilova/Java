public class Student extends Person {
    // група
    private String group;
    // средній бал
    private double rating;
 
    public String getGroup() {
        return group;
    }
 
    public void setGroup(String group) {
        this.group = group;
    }
 
    public double getRating() {
        return rating;
    }
 
    public void setRating(double rating) {
        this.rating = rating;
    }
 
    public Student(String name, int age, boolean isMale, String group, double rating) {
        super(name, age, isMale);
        this.group = group;
        this.rating = rating;
    }
 
    @Override
    public String toString() {
        return "Студент " + getName() + " вчиться в групі " + getGroup()
                + " не має средній бал " + getRating();
    }
}
