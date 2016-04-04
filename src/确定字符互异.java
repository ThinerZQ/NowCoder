/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/1
 * Time: 14:48
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

/**
 * 请实现一个算法，确定一个字符串的所有字符是否全都不同。这里我们要求不允许使用额外的存储结构。
 给定一个string iniString，请返回一个bool值,True代表所有字符全都不同，False代表存在相同的字符。保证字符串中的字符为ASCII字符。字符串的长度小于等于3000。
 测试样例：
 */
public class 确定字符互异 {

    public static void main(String[] args) {

    }

    public boolean checkDifferent(String iniString) {
        // write code here

        for (int i = 0; i < iniString.length(); i++) {
            for (int j = i + 1; j < iniString.length(); j++) {
                if (iniString.charAt(i) == iniString.charAt(j)) {
                    return false;
                }
            }

        }
        return true;
    }

}
