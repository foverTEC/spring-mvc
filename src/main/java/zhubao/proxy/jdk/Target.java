package zhubao.proxy.jdk;

/**基于jdk的动态代理：基于接口的代理
 *
 * Created by Administrator on 2020/6/26.
 */
public class Target implements TargetInterface {
    @Override
    public void save() {
        System.out.print("save running");
    }
}
