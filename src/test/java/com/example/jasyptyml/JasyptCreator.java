package com.example.jasyptyml;

import org.assertj.core.api.Assertions;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;

public class JasyptCreator {

    private final String PASSWORD = "password";

    @Test
    void jasypt(){
        String password = "1234";

        String encryptPassword = jasyptEncrypt(password);

        System.out.println("encryptPassword = " + encryptPassword);

        Assertions.assertThat(password).isEqualTo(jasyptDecryt(encryptPassword));
    }

    private String jasyptEncrypt(String input) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setAlgorithm("PBEWithMD5AndDES");
        encryptor.setPassword(PASSWORD);
        return encryptor.encrypt(input);
    }

    private String jasyptDecryt(String input){
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setAlgorithm("PBEWithMD5AndDES");
        encryptor.setPassword(PASSWORD);
        return encryptor.decrypt(input);
    }

}
