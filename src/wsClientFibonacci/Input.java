package wsClientFibonacci;


import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;
import javax.xml.rpc.Service;

import wsservicefibonacci.OutputService;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;

public class Input {

	 @WebServiceRef(wsdlLocation = "http://localhost:9090/wsServiceFibonacci?wsdl")
			 
	
	public static void main(String [] args) throws MalformedURLException, ServiceException, InstantiationException, IllegalAccessException {
	
		 java.net.URL wsdlLocation = new URL("http://localhost:9090/wsServiceFibonacci?wsdl");
		 javax.xml.namespace.QName qualifiedServiceName = 
		     new QName("http://wsServiceFibonacci/", "OutputService");
		 // Make a service
		 OutputService shs =  new OutputService(wsdlLocation,qualifiedServiceName);
	

	   System.out.println("Fibonacci(0) = " +shs.getOutputPort().calculateFibonacci(0));
	   System.out.println("Fibonacci(5) = " +shs.getOutputPort().calculateFibonacci(5));
	   System.out.println("Fibonacci(12) = " +shs.getOutputPort().calculateFibonacci(12));
		    
		
	    
	} 

	}


