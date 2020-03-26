package interview.bytedance;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/22
 * <p>
 * 字符串相乘 与 字符串相加
 * <p>
 *    1 2
 *    1 2
 *  ----------
 *    2 4
 *  1 2
 * ----------
 *  1 4 4
 */

public class Solution0004 {

    public String multiply(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int m = num1.length(), n = num2.length();
        int[] temp = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int x = num1.charAt(i) - '0';
                int y = num2.charAt(j) - '0';
                int multi = x * y;
                int p = i + j, q = i + j + 1, sum = multi + temp[q];
                temp[p] += sum / 10;
                temp[q] = sum % 10;
            }
        }
        for (int i : temp) {
            if (sb.length() != 0 || i != 0) {
                sb.append(i);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public String add(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] temp = new int[Math.max(m, n) + 1];

        return "";
    }

}
