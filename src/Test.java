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
        System.out.println("uat02");
        return super.clone();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    private int f() {
        return 0;
    }
    
    public int f2(){
        return 1;
    }
}
