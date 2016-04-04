/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/1
 * Time: 13:53
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

/**
 * 世界上有10种人，一种懂二进制，一种不懂。那么你知道两个int32整数m和n的二进制表达，有多少个位(bit)不同么？
 */
public class 懂二进制 {

    public static void main(String[] args) {

        System.out.println(countBitDiff(1999,2299));
    }

    /**
     * 获得两个整形二进制表达位数不同的数量
     *
     * @param m 整数m
     * @param n 整数n
     * @return 整型
     */
    public static int countBitDiff(int m, int n) {

        //同为1的数

        int i = m^n,count=0;
        while (i!=0){
            i&=(i-1);
            count++;
        }
        return count;


    }
}
