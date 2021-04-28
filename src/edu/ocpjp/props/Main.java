package edu.ocpjp.props;

import java.nio.charset.StandardCharsets;

public class Main {
public static void main(String[] args) {
	byte[] bx = new byte[]{-28, -91, -79, -26, -95, -92, -26, -116, -85, -28, -123, -94, -27, -115, -105, -30, -84, -85, -26, -68, -85, -29, -95, -94, -28, -91, -104, -27, -127, -127, -28, -111, -116, -28, -119, -73, -26, -115, -77, -29, -76, -126};
	for(byte b : bx) {
		System.out.println(b+128);
	}
}
}
