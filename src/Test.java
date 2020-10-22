/**
 * description
 *
 * @author liuzhixiang 2020/10/16 9:57
 */
public class Test {
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("uat02");
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public int f2(){
        return 1;
    }

    public void add(){
        System.out.println("uat_02 添加了add方法");
    }
}
