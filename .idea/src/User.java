public class User {

    private String name;
    private String gender;
    private Integer age;

    //TODO: сначала поля, затем конструкторы, затем геттеры и сеттеры, в конце метод toString
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "\n"+"(" + name + ", " + gender + ", " + age + ")";
    }

    public User(String name, String gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

}
