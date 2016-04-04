/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/30
 * Time: 10:51
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class StringRotation {
    public static void main(String[] args) {
        System.out.println( rotateString("asgksa",6,3));

    }

    public static String rotateString(String A, int n, int p) {
        // write code here
        String b = A.substring(0,p+1);
        return A.substring(p+1,n)+b;
    }

}
