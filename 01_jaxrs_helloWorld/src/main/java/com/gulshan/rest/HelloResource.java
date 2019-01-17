/**
 * 
 */
package com.gulshan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.spi.resource.Singleton;

/**
 * @author gulsh
 *
 */

@Path("/hellores")
@Singleton
public class HelloResource {

	public HelloResource() {
		System.out.println("Hello Resources");
	}
	
	//This method is called if text_plain is request
	@GET
	@Produces("text/plain")
	public String sayHelloText() {
		
		return "Hello Jersy";
	}
	
	//This method is called if XML is request
	@GET
	@Produces("text/xml")
	@Path("/abc")
	public String sayHelloXml() {
		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
	}
	
	//This method is called if HTML is request
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/xyz")
	public String sayHelloHtml() {
		
		return "<html> " + "<title>" + "Hello Jersey" + "</title>"
		        + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
	}
}
