package com.juggist.flutter_encrypt.utils;

import android.util.Base64;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/**
 * @author juggist
 * @date 2019-06-27 17:04
 */
public class DESUtil {
    private final static String DES = "DES";
    /**
     * Description 根据键值进行加密
     * @param data
     * @param key  加密键byte数组
     * @return
     */
    public static String encrypt(String data, String key)  {
        try {
            byte[] bt = encrypt(data.getBytes(), key.getBytes());
            String strs = null;//new BASE64Encoder().encode(bt);
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.FROYO) {
                strs = Base64.encodeToString(bt, Base64.DEFAULT);
            }
            return strs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    /**
     * Description 根据键值进行加密
     * @param data
     * @param key  加密键byte数组
     * @return
     */
    private static byte[] encrypt(byte[] data, byte[] key) throws Exception {
        // 生成一个可信任的随机数源
        SecureRandom sr = new SecureRandom();

        // 从原始密钥数据创建DESKeySpec对象
        DESKeySpec dks = new DESKeySpec(key);

        // 创建一个密钥工厂，然后用它把DESKeySpec转换成SecretKey对象
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
        SecretKey securekey = keyFactory.generateSecret(dks);

        // Cipher对象实际完成加密操作
        Cipher cipher = Cipher.getInstance(DES);

        // 用密钥初始化Cipher对象
        cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);

        return cipher.doFinal(data);
    }
}
