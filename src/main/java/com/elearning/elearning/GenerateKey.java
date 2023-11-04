package com.elearning.elearning;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemWriter;

public class GenerateKey {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException{
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        var keyPair = keyPairGenerator.generateKeyPair();
        byte[] pub = keyPair.getPublic().getEncoded();
        byte[] sec = keyPair.getPrivate().getEncoded();
        
        PemWriter pemWriter = new PemWriter(new OutputStreamWriter(new FileOutputStream("pub.pem")));
        PemObject pemObject = new PemObject("PUBLIC KEY", pub);
        pemWriter.writeObject(pemObject);
        pemWriter.close();

        PemWriter pemWriter_ = new PemWriter(new OutputStreamWriter(new FileOutputStream("sec.pem")));
        PemObject pemObject_ = new PemObject("PRIVATE KEY", sec);
        pemWriter_.writeObject(pemObject_);
        pemWriter_.close();
        
    }
}