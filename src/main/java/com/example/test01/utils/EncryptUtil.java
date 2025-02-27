//package com.example.test01.utils;
//
//import io.micrometer.core.instrument.util.StringUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import sun.misc.BASE64Decoder;
//import sun.misc.BASE64Encoder;
//
//import javax.crypto.Cipher;
//import javax.crypto.KeyGenerator;
//import javax.crypto.spec.SecretKeySpec;
//import java.security.MessageDigest;
//import java.security.SecureRandom;
//
//
///**
// * @Classname encryptUtil
// * @Description TODO
// * @Date 2025/1/2 下午1:25
// * @Created by ThinKPad
// */
//public class EncryptUtil {
//
//    private final static Logger logger = LoggerFactory.getLogger(EncryptUtil.class.getName());
//    /**
//     * @Description: md5加密
//     * @author tit_xuemenglin
//     * @date 2019年3月21日 下午1:25:25
//     * @version V1.0
//     * @param : 原报文+md5密钥
//     * @return String
//     */
//    private static String md5(String cPlainText) {
//        StringBuffer tBuf = new StringBuffer();
//        try {
//            MessageDigest tMd = MessageDigest.getInstance("MD5");
//            tMd.update(cPlainText.getBytes("utf-8"));
//            byte[] tByte = tMd.digest();
//
//            for (int j = 0; j < tByte.length; ++j) {
//                int i = tByte[j];
//                if (i < 0) {
//                    i += 256;
//                }
//                if (i < 16) {
//                    tBuf.append("0");
//                }
//                tBuf.append(Integer.toHexString(i));
//            }
//        } catch (Exception e) {
//            logger.error("MD5加密过程中发生错误", e);
//            return null;
//        }
//        return tBuf.toString();
//    }
//
//    /**
//     * @Function: AesEncryptStrategyImpl.java
//     * @Description: aes加密
//     *
//     * @param: orignalStr 明文
//     * @param: encryKey aes密钥
//     * @return：返回结果描述
//     * @throws：异常描述
//     *
//     * @author: tit_xuemenglin
//     * @date: 2019年3月23日 下午3:48:47
//     *
//     * Modification History:
//     * Date         Author          Version            Description
//     *---------------------------------------------------------*
//     * 2019年3月23日     tit_xuemenglin           v1.0.0               修改原因
//     */
//
//    public static String encrypt(String orignalStr,String encryKey) {
//        String encryptMsg = "";
//        try {
//            encryptMsg = base64Encode(aesEncryptToBytes(orignalStr, encryKey));
//        } catch (Exception e) {
//            logger.error("AES加密失败" , e);
//        }
//        return encryptMsg;
//    }
//
//    public static byte[] aesEncryptToBytes(String content, String encryptKey) throws Exception {
//        KeyGenerator kgen = KeyGenerator.getInstance("AES");
//        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
//        random.setSeed(encryptKey.getBytes());
//        kgen.init(128, random);
//        Cipher cipher = Cipher.getInstance("AES");
//        cipher.init(1, new SecretKeySpec(kgen.generateKey().getEncoded(), "AES"));
//        return cipher.doFinal(content.getBytes("utf-8"));
//    }
//
//    public static String base64Encode(byte[] bytes) {
//        return (new BASE64Encoder()).encode(bytes);
//    }
//
//    /**
//     * @Function: AesEncryptStrategyImpl.java
//     * @Description: AES解密
//     *
//     * @param:@param encryptStr 密文
//     * @param:@param encryKey  aes密钥
//     * @param:@return 描述：
//     * @return：返回结果描述
//     * @throws：异常描述
//     *
//     * @author: tit_xuemenglin
//     * @date: 2019年3月23日 下午3:56:59
//     *
//     * Modification History:
//     * Date         Author          Version            Description
//     *---------------------------------------------------------*
//     * 2019年3月23日     tit_xuemenglin           v1.0.0               修改原因
//     */
//    public static String decrypt(String encryptStr,String encryKey) {
//        String decrypMsg = "";
//        try {
//            decrypMsg = aesDecryptByBytes(base64Decode(encryptStr), encryKey);
//        } catch (Exception e) {
//            logger.error("AES解密失败" , e);
//        }
//        return decrypMsg;
//    }
//
//    private static byte[] base64Decode(String base64Code) throws Exception {
//        if(StringUtils.isNotEmpty(base64Code)) {
//            return (new BASE64Decoder()).decodeBuffer(base64Code);
//        }
//        return null;
//    }
//
//    private static String aesDecryptByBytes(byte[] encryptBytes, String decryptKey) throws Exception {
//        KeyGenerator kgen = KeyGenerator.getInstance("AES");
//        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
//        random.setSeed(decryptKey.getBytes());
//        kgen.init(128, random);
//        Cipher cipher = Cipher.getInstance("AES");
//        cipher.init(2, new SecretKeySpec(kgen.generateKey().getEncoded(), "AES"));
//        byte[] decryptBytes = cipher.doFinal(encryptBytes);
//        return new String(decryptBytes);
//    }
//}
