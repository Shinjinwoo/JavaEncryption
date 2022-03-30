import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class AES256 {

    private String key = "키이름을뭘로할까";
    private final String iv = key.substring(0, 16);



    public String EncryptAES256() {
        try {
            Cipher cipher = Cipher.getInstance("AES");

        /*****************************************************************************************************
         * description : Constructs a secret key from the given byte array.
         *
         * Parameter:
         *
         * 1.key –        the key material of the secret key.
         *              The contents of the array are copied to protect
         *              against subsequent modification.
         *
         * 2.algorithm –  the name of the secret-key algorithm to be associated with the given key material.
         *              See Appendix A in the Java Cryptography Architecture Reference Guide
         *              for information about standard algorithm names.
         ****************************************************************************************************/
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(),"AES");


        /*****************************************************************************************************
         * description : Creates an IvParameterSpec object using the bytes in iv as the IV.
         *
         * Parameter:
         *
         *          iv – the buffer with the IV.
         *          The contents of the buffer are copied to protect against subsequent modification.
         *
         * ****************************************************************************************************/
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes());


        cipher.init(Cipher.ENCRYPT_MODE,secretKeySpec,ivParameterSpec);

        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }

        return "";
    }



}
