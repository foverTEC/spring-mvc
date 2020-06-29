package zhubao.controller1;

/**
 * Created by Administrator on 2020/6/23.
 */
public class User {

    String name = "zhubao";
    public User(){

    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
