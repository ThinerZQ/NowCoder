/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/30
 * Time: 21:13
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class 变态跳台阶 {


    public static void main(String[] args) {

        System.out.println(JumpFloorII(3));
    }
    public static int JumpFloorII(int target) {

        if (target ==0){
            return 1;
        }else if (target==1){
            return 1;
        }

        return 2*JumpFloorII(target-1);

    }
}


