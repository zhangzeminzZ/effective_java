package effective_java_01;

/**
 * @author zhangzemin
 * @date 2020/4/17 17:12
 */
public class Person {

    private final SEX sex;
    private final String name;
    private final int age;

    private Person(String name, int age,SEX sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static Person getManInstace(String name,int age){
        return new Person(name,age,SEX.man);
    }

    public static Person getWoManInstace(String name,int age){
        return new Person(name,age,SEX.woman);
    }
}
