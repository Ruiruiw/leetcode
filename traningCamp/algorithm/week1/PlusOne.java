class Solution {
    public int[] plusOne(int[] digits) {

      //进位和不进位
      //不进位，则可以直接退出
      //进位，继续遍历，前一位加1

      for(int i = digits.length - 1; i >= 0; i--){
          if(digits[i] + 1 < 10){
              digits[i] = digits[i] + 1;
              return digits;
          }else{
              digits[i] = 9 - digits[i];
          }
      }

      if(digits[0] == 0){
         int[] res = new int[digits.length + 1];
         res[0] = 1;
         for(int j = 1; j < res.length; j++){
             res[j] = digits[j - 1];
         }
         return res;
      }else{
          return digits;
      }
      
    }
}

作者：wurp-u
链接：https://leetcode-cn.com/problems/plus-one/solution/by-wurp-u-y15l/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
