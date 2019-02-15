package day1;

/*
题目描述
请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class replaceSpace {
    public static String replaceSpace(StringBuffer str) {
        int len = str.length() - 1;
        while (len >= 0) {
            char sign = str.charAt(len);
            if (sign == ' ') {
                str.replace(len, len+1, "%20");
            }
            len--;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("我 是 中 国 人");
        System.out.println(replaceSpace(stringBuffer));

    }
    }

