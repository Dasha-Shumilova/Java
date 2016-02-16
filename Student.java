public class Student extends Person {
    // группа
    private String group;
    // средний бал
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
        return "Студент " + getName() + " учится в групе " + getGroup()
                + " и имеет средний бал " + getRating();
    }
}
