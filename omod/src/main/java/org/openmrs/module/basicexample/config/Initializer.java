package org.openmrs.module.basicexample.config;


import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by togdi on 7/6/16.
 */
public class Initializer implements WebApplicationInitializer
{
	@Override
	public void onStartup( final ServletContext servletContext ) throws ServletException
	{
		//Load application context
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register( CandoApplicationContext.class );
		rootContext.refresh();

		//Context loader listener
		servletContext.addListener( new ContextLoaderListener( rootContext ) );


		DispatcherServlet dispatcherServlet = new DispatcherServlet( rootContext );
		dispatcherServlet.setThrowExceptionIfNoHandlerFound( true );


		//Dispatcher servlet
		ServletRegistration.Dynamic dispatcher =
				servletContext.addServlet( "dispatcher", dispatcherServlet );
		dispatcher.setLoadOnStartup( 1 );
		dispatcher.addMapping( "/" );


	}


}
