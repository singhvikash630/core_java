/*In case of abstract, the implementation of a method may exist in a subclass of the class 
 * in which the abstract method is declared.
But in the case of native, the implementation of the method exists in a library outside the JVM.
*/
package com.jspider.nativevolatile;
public class A
{
	public native int square(int i);
	public static void main(String[] args)
	{
    	 System.loadLibrary("a");
		A d1=new A();
		System.out.println(d1.square(2));
	}
}

/*Main.c:

#include <jni.h>
#include "Main.h"

JNIEXPORT jint JNICALL Java_Main_square(
    JNIEnv *env, jobject obj, jint i) {
  return i * i;
}

*
*Native methods are currently needed when

You need to call a library from Java that is written in other language.
*
*
*/