package effective_java_01;

/**
 * @author zhangzemin
 * @date 2020/5/15 15:30
 */
public class Demo {
    public static void main(String[] args) {
//        String name = Color.getName(1);
//        System.out.println(name);
//        test01();
//        test02();
        test03();
    }

    public static void test01(){
        Color[] colors = Color.values();
        for(Color c : colors){
            System.out.println(c + "_ordinal:" + c.ordinal());
        }
    }

    public static void test02(){
        for(ZtEnum zt :ZtEnum.values()){
            System.out.println(zt.getName()+"--"+zt.getAge()+"--"+zt.name()+"--"+zt+"--"+zt.ordinal());
        }
    }

    public static void test03(){
        System.out.println(ZtEnum.CG.name());
//        System.out.println(ZtEnum.CG.getName());
//        String name = "01";
//        String age = "1";
//        ZtEnum ztEnum = ZtEnum.fromZtEnumName(name, age);
//        if(ZtEnum.CG.equals(ztEnum)){
//            System.out.println("正确");
//        }
    }
}
