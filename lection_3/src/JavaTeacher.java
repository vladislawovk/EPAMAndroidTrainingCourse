import java.util.Objects;

public class JavaTeacher {

    private String firstName;
    private String lastName;
    private int age;
    private String supervisedClass;
    private double workExperience;

    public JavaTeacher(String firstName, String lastName, int age, String supervisedClass, double workExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.supervisedClass = supervisedClass;
        this.workExperience = workExperience;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSupervisedClass() {
        return supervisedClass;
    }

    public void setSupervisedClass(String supervisedClass) {
        this.supervisedClass = supervisedClass;
    }

    public double getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(double workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaTeacher that = (JavaTeacher) o;
        return age == that.age &&
                Double.compare(that.workExperience, workExperience) == 0 &&
                firstName.equals(that.firstName) &&
                lastName.equals(that.lastName) &&
                supervisedClass.equals(that.supervisedClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, supervisedClass, workExperience);
    }

    @Override
    public String toString() {
        return "JavaTeacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", supervisedClass='" + supervisedClass + '\'' +
                ", workExperience=" + workExperience +
                '}';
    }
}
