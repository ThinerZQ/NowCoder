/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/30
 * Time: 21:31
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class 矩形覆盖 {

    public static void main(String[] args) {

        System.out.println(new 矩形覆盖().RectCover(0));
    }
    public int RectCover(int target) {

        if (target <=0)
            return 0;
        if (target==1)
            return 1;
        else if (target ==2)
            return 2;
        else
            return RectCover(target-1)+RectCover(target-2);
    }
}
