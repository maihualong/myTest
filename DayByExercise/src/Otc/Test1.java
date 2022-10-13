package Otc;

public class Test1 {
    public static void main(String[] args) {

    }

    /**
     * 8. 字符串转换整数 (atoi)
     * @param s
     * @return
     */
    public static int myAtoi(String s) {
        int res = 0;
        char[] arr = s.toCharArray();
        int index = 0;
        //去除前导空格
        while(index < arr.length && arr[index] == ' '){
            index++;
        }
        if (index==arr.length){
            return 0;
        }
        boolean flag = true;//true为正数
        if (arr[index] == '-'){
            flag = false;
            index++;
        }else if (arr[index] == '+'){
            index++;
        }else if (!Character.isDigit(arr[index])){
            return 0;
        }
        while (index<arr.length && Character.isDigit(arr[index])){
            int digit = arr[index] - '0';
            if (res > (Integer.MAX_VALUE - digit)/10){
                return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + digit;
            index++;
        }
        return flag ? res : -res;
    }
}
