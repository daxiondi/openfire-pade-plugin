package org.jivesoftware.openfire.plugin.ofmeet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FeedbackServlet extends HttpServlet {

	private static final long serialVersionUID = -8057457730888335346L;

	private static final Logger Log = LoggerFactory.getLogger( FeedbackServlet.class );
	
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
        // Add response headers that instruct not to cache this data.
        response.setHeader( "Expires",       "Sat, 6 May 1995 12:00:00 GMT" );
        response.setHeader( "Cache-Control", "no-store, no-cache, must-revalidate" );
        response.addHeader( "Cache-Control", "post-check=0, pre-check=0" );
        response.setHeader( "Pragma",        "no-cache" );
        response.setHeader( "Content-Type",  "text/html" );
        response.setHeader( "Connection",    "close" );
        
        String resultMsg = "Hello world!";
		response.getOutputStream().println(resultMsg);       
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.doPost(request, response);
	}
}
