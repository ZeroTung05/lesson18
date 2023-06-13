public class Main {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setName("Какоето имя");
        person1.setAge(-1);
        System.out.println("выводим значение в main методе: " + person1.getName());
        System.out.println("выводим значение в main методе: " +person1.getAge());
        person1.speak();



    }
}
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String userName) {
        if (userName.isEmpty()){
            System.out.println("ты ввел пустое имя");
        } else {
            this.name = userName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int userAge) {
        if (userAge<0){
            System.out.println("Возросто должен быть полож");
        } else {
        this.age = userAge;
    }
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() { // void это возвращает ничто
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ",мне " + age + " лет");
        }

    }
}