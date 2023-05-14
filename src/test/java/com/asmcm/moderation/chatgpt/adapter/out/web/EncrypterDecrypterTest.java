package com.asmcm.moderation.chatgpt.adapter.out.web;

import org.junit.jupiter.api.Test;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class EncrypterDecrypterTest {

    private final EncrypterDecrypter encrypterDecrypter = new EncrypterDecrypter();

    @Test
    void encryptDecrypt() throws InvalidAlgorithmParameterException, NoSuchPaddingException, IOException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeySpecException, BadPaddingException, InvalidKeyException {
        String key = "Moderation";
        String message = "Important Message to be Encrypted";
        String enc = encrypterDecrypter.encrypt(key, message);
        System.out.println("Original text: " + message);
        System.out.println("Encrypted text: " + enc);
        String decryptedMessage = encrypterDecrypter.decrypt(key, enc);
        System.out.println("Original text after decryption: " + decryptedMessage);
        assertThat(message).isEqualTo(decryptedMessage);
    }
}