package jianzhi;

/**
 * 爱是一个动态的圆，是你将爱传递给对方，对方感受到并传递回给你的一个良性循环。
 * 一段感情出现了问题，无论表面呈现的是什么复杂的问题，其底层都是传递和回传这个两个环节的问题。
 * 你那么聪明，一定会发现你们之间有效的传递和让她回传的方法的，我看好你，也支持你。
 *
 *
 *
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/9 17:24
 * @Description:
 *
 *
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 *
 * 示例 1：
 *
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *  
 *
 * 限制：
 *
 * 0 <= s 的长度 <= 10000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/ti-huan-kong-ge-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class 剑指Offer05替换空格 {
    public static String replaceSpace(String s) {
        int length = s.length();
        StringBuilder res = new StringBuilder();
        for (int i=0;i<length;i++){
            char c = s.charAt(i);
            if (c == ' ') {
                res.append("%20");
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = new String("We are happy.");
        System.out.println(replaceSpace(s));
    }

}
