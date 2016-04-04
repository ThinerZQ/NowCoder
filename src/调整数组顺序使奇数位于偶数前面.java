/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/30
 * Time: 22:01
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class 调整数组顺序使奇数位于偶数前面 {

    public static void main(String[] args) {

    }
    public void reOrderArray(int [] array) {

        int even=0,odd=0;

        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) ==0){
               //even
                even++;
            }else{
                //odd
                odd++;
            }
        }
        int oddLocation =odd,evenLocation=even;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) ==0){
                //even add swap

            }else{
                //odd
            }
        }

    }
}
