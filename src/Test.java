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
        System.out.println("uat-01");
        System.out.println("add");
        return super.clone();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    private int f(){
        return 0;
    }
}
