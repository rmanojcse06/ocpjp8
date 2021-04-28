package edu.ocpjp.samples;

import java.io.Closeable;
import java.io.IOException;

class MyResource1 implements AutoCloseable {
	public void close() throws Exception {
		System.out.print("1 ");
	}
}

class MyResource2 implements Closeable {
	public void close() throws IOException {
		throw new IOException();
	}
}

public class QS3 {
	public static void main(String[] args) {
		try (MyResource1 r1 = new MyResource1(); MyResource2 r2 = new MyResource2();) {
			System.out.print("T ");
		} catch (Exception ioe) {
			System.out.print("IOE ");
		} finally {
			System.out.print("F ");
		}
	}
}
