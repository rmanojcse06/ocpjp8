package edu.ocpjp.threads;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Q118 {
public static void main(String[] args) throws Exception {
	Instant loginTime=Instant.now();
	Thread.sleep(1000L);
	Instant logoutTime=Instant.now();
	
	loginTime=loginTime.truncatedTo(ChronoUnit.MINUTES);
	logoutTime=logoutTime.truncatedTo(ChronoUnit.MINUTES);
	
	if(logoutTime.isAfter(loginTime))
		System.out.println("Logged out at:"+logoutTime);
	else
		System.out.println("Cant logout");
}
}
