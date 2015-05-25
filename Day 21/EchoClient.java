package day21;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class EchoClient {
	
	private void launch() throws MalformedURLException, RemoteException, NotBoundException {
		// 1. If there is no security manager, start one
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		
		Remote service = Naming.lookup("//127.0.0.1:1099/echo");
		EchoService echoService = (EchoService) service;

		String returnedText = echoService.echo("Hello");
		System.out.println(returnedText);
	}
}
