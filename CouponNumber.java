import java.util.*;
class CouponNumber
{
        public String createRandomCode(int codeLength)
        {
                char[] chars = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
                String s = new String();
	        Random random = new Random();
        	for (int i = 0; i < codeLength; i++)
                {
	            char c = chars[random.nextInt(chars.length)];
        	    s=s+c;
	        }
        	return s ;
    	}
        public static void main(String args[])
        {
                CouponNumber cn = new CouponNumber();
                for(int i=1;i<=10;i++)
                {
                        System.out.println("CODE="+cn.createRandomCode(6));
                }
        }
}
