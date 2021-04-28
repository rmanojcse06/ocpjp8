package edu.ocpjp.exceptions;

import java.io.Closeable;

class DataConverter implements Closeable{
	public void copyFilesToTables() {}
	public void close() {
		throw new RuntimeException();
	}
}
public class Q95 {
	public static void main(String[] args) {
		try(DataConverter dc = new DataConverter()){
			dc.copyFilesToTables();
		}catch(Throwable t) {
			t.printStackTrace();
		}
	}
}
