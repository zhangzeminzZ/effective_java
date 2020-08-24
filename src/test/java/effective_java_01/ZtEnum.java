package effective_java_01;

/**
 * @author zhangzemin
 * @date 2020/5/15 15:52
 */
public enum ZtEnum {
    CG("01","1"),YFB("02","2"),YSH("03","3"),YZZ("04","4"),YFZ("05","5");

    private String name;
    private String age;
    ZtEnum(String name,String age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public String getAge(){
        return this.age;
    }

    public static ZtEnum fromZtEnumName(String name,String age){
        for(ZtEnum ztEnum : ZtEnum.values()){
            if(ztEnum.getName().equals(name) && ztEnum.getAge().equals(age)){
                return ztEnum;
            }
        }
        return null;
    }
}
