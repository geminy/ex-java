// TestJNI.java
class TestJNI
{
	private native int testJniAdd(int v1, int v2); // using native to declaration

	private void test()
	{
		System.out.println("called native from java: testJniAdd(10, 11) is " + testJniAdd(10, 11));
	}

	public static void main(String args[])
	{
		new TestJNI().test();
	}

	static
	{
		System.loadLibrary("jnitest"); // load native lib with xxx of libxxx.so from the right path
	}
}
