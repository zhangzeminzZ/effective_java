package effective_java_01;

/**
 * @author zhangzemin
 * @date 2020/5/15 15:30
 */
public enum Color {
    RED("红色",1),GREEN("绿色",2),BLANK("黑色",3),YELLOW("黄色",4);

    private String name;
    private int index;

    private Color(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public static String getName(int index){
        for(Color c :Color.values()){
            if(c.index == index){
                return c.name;
            }
        }
        return null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
