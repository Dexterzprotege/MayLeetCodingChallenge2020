/**Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Example 1:
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 
Example 2:
Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0 **/
class Solution {
    public int findComplement(int num) {
        int ans = 0;
        int pow = 0;
        while(num!=0){
            int bit =  num>>0 &1 ;
            if(bit == 0)
                bit = 1;
            else
                bit = 0;
            System.out.print(bit+" ");
            ans += bit*Math.pow(2, pow);
            pow++;
            num = num>>1;
        }
        return ans;
    }
}
