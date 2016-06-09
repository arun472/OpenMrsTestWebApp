package org.openmrs.module.basicexample.controller;

import org.openmrs.api.context.Context;
import org.openmrs.module.basicexample.api.BasicExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * Created by togdi on 7/6/16.
 */
@Controller
public class TestController
{
	@Autowired
	ApplicationContext applicationContext;

	@RequestMapping( value = "/getBeans", method = RequestMethod.GET )
	public
	@ResponseBody
	List<String> getBeans()
	{
		return Arrays.asList( applicationContext.getBeanDefinitionNames() );
	}

	@RequestMapping( value = "/test", method = RequestMethod.GET )
	public
	@ResponseBody
	String test21()
	{
		try
		{
			BasicExampleService bs = Context.getService( BasicExampleService.class );
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
		return "test";
	}




}
