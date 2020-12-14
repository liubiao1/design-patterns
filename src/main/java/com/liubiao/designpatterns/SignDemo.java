package com.liubiao.designpatterns;

import org.apache.commons.codec.digest.DigestUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/**
 * 供货平台Java的签名demo
 * TreeMap默认按照key升序排列，将所有需要签名的参数放进TreeMap
 * 有传的参数才需要签名，比如，充值笔数amt有传的话就要签名，没传的话就不参与签名
 * 所有接口都采用该签名模式，若返回code11 校验码验证失败，请检查签名方式是否与demo一致
 * 如需帮助，请将完整的请求url和加密前字符串一起发到对接群里
 * MD5加密可参考：
 * <dependency>
 * <groupId>commons-codec</groupId>
 * <artifactId>commons-codec</artifactId>
 * <version>1.11</version>
 * </dependency>
 */
public class SignDemo {

    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        //用户编号
        map.put("userId", "80800229");
        //商品编号
        map.put("itemId", "80000999");
        //校验商品面值,单位厘,比如10元话费就传10000
        map.put("checkItemFacePrice", "1000");
        map.put("itemPrice", "1000");
        map.put("amt", "1");
        //充值号码
        map.put("uid", "13927423937");
        //合作方商户系统的流水号
        String date = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        map.put("serialno", date);
        //交易时间,yyyyMMddHHmmss格式
        map.put("dtCreate", date);
        StringBuilder sb = new StringBuilder();
        //循环拼接所有value
        for (String k : map.keySet()) {
            sb.append(map.get(k));
        }
        //最后拼接上秘钥
        sb.append("4261e0829da90554679531b9a11671ea");
        System.out.println("签名前：" + sb.toString());
        //签名是md5加密32位小写
        System.out.println(date);
        System.out.println("签名后：" + DigestUtils.md5Hex(sb.toString()));
    }
}
