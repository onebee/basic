package com.one.xiang.proxy;



public class ProxyUtils {

    public static void generateClassFile(Class clazz,String proxyName){
        /*ProxyGenerator.generateProxyClass(
                proxyName, interfaces, accessFlags);*/
//        byte[] proxyClassFile = ProxyGenerator.generateProxyClass(
//                proxyName, new Class[]{clazz});
//        String paths = clazz.getResource(".").getPath();
//        System.out.println(paths);
//        FileOutputStream out = null;
//
//        try {
//            out = new FileOutputStream(paths+proxyName+".class");
//            out.write(proxyClassFile);
//            out.flush();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                out.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
