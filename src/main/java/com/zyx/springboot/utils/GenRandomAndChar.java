package com.zyx.springboot.utils;

import java.util.Random;

public class GenRandomAndChar {


    //ASSI码中 33-47是符号
    private static final int INT_33 = 33;
    private static final int INT_14 = 14;
    private static final int INT_65 = 65;
    private static final int INT_97 = 97;
    private static final int TEN = 10;
    private static final int INT_26 = 26;
    private static final int TWO = 2;
    private static final int ZERO = 0;
    private static final String CAHR = "char";
    private static final String NUM = "num";

    public static String creatStr(int strLength)
    {
        String str = "";
        Random random = new Random();
        String charOrNum;
        for(int i = 0;i< strLength;i++)
        {
            charOrNum = random.nextInt(TWO) % TWO == ZERO ? CAHR : NUM; // 输出字母还是数字
            if (NUM.equals(charOrNum))
            {
                //判断输出数字还是符号
                boolean flag = random.nextBoolean();
                if (flag){
                    str += String.valueOf(random.nextInt(TEN));
                }else {
                    str += (char) (INT_33 + random.nextInt(INT_14));
                }
            }
            else {
                //判断输出大写字母还是小写字母
                //小写字母65开始，大写97开始
                int temp = random.nextInt(TWO) % TWO == ZERO ? INT_65 : INT_97;
                str += (char) (temp + random.nextInt(INT_26));
            }
        }

        return str;
    }

    //获取验证过的随机密码
    public static String getRandomPassword(int len) {
        String result = "";
        while(len >= 4)
        {
            result = makeRandomPassword(len);
            //通过正则来判断生成的随机码是否符合需要的条件
            if (result.matches(".*[a-z]{1,}.*")
                    && result.matches(".*[A-Z]{1,}.*")
                    && result.matches(".*\\d{1,}.*")
                    && result.matches(".*[~!@#$%^&*\\.?]{1,}.*"))
            {
                return result;
            }

        }
        return "length less 4!.";
    }

    //随机密码生成
    private static String makeRandomPassword(int len){
        char charr[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890~!@#$%^&*.?".toCharArray();
        //System.out.println("字符数组长度:" + charr.length);	//可以看到调用此方法多少次
        StringBuilder sb = new StringBuilder();
        Random r = new Random();

        for (int x = 0; x < len; ++x) {
            sb.append(charr[r.nextInt(charr.length)]);
        }
        return sb.toString();
    }


}
