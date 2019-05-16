package com.atguigu.jvm.test;


public class JvmTest {
	
	public static void test() {
		test();
	}

	public static void main(String[] args) {
		//应用程序类加载器（AppClassLoader）
		System.out.println(JvmTest.class.getClassLoader());
		java.lang.String str = new java.lang.String();
		//获取自己创建的java.lang包下的String的加载器
		System.out.println(str.getClass().getClassLoader());
		//获取应用程序类加载器的父加载器：扩展类加载器（ExtClassLoader）
		System.out.println(JvmTest.class.getClassLoader().getParent());
		//获取扩展类加载器的父加载器：启动类加载器
		System.out.println(JvmTest.class.getClassLoader().getParent().getParent());
		
//		new Thread().start();
		test();
	}
}
