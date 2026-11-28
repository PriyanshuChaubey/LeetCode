class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        int number1 = num1.length()-1;
        int number2 = num2.length()-1;
        StringBuilder res = new StringBuilder();

        while(number1 >= 0 || number2 >= 0 || carry != 0){
            int digit1 = number1 >= 0 ? num1.charAt(number1)-'0':0;
            int digit2 = number2 >= 0 ? num2.charAt(number2)-'0':0;

            int sum = digit1 + digit2 + carry;

            carry = sum /10;
            res.append(sum%10);

            number1--;
            number2--;
        }
        return res.reverse().toString();
    }
}