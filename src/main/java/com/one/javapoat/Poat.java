package com.one.javapoat;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import javax.lang.model.element.Modifier;
import java.io.IOException;

public class Poat {

    public static void main(String[] args) throws IOException {


        MethodSpec method = MethodSpec.methodBuilder("main")
                .addModifiers(Modifier.PUBLIC,Modifier.STATIC)
                .returns(Void.class)
                .addParameter(String[].class,"args")
                .addStatement("$T.out.println($S)",System.class,"Hello,JavaPoet !")
                .build();

        TypeSpec helloWorld = TypeSpec.classBuilder("HelloWorld").
                addModifiers(Modifier.PUBLIC,Modifier.FINAL)
                .addMethod(method)
                .build();


        JavaFile javaFile = JavaFile.builder("com.one.javapoat.generate",helloWorld)
                .build();


        javaFile.writeTo(System.out);


    }
}
