/*
 * COPYRIGHT (C) 2016 Niyasys Technologies Pvt Ltd (Niyasys). All Rights Reserved.
 * All information contained herein is, and remains the property of Niyasys. The intellectual
 * and technical concepts contained herein are proprietary  to Niyasys and may be covered
 * by International Patents,and are protected by trade secret or copyright law. Dissemination
 * of this information or reproduction of this material is strictly forbidden unless prior written
 * permission is obtained from Niyasys.
 */

package org.openmrs.module.basicexample.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Package Name: com.cando.configuration
 * Author: Arun"
 */
@Configuration
@ComponentScan( basePackages = {"org.openmrs.**"} )
//@ImportResource( value = { "classpath*:moduleApplicationContext.xml", "classpath*:applicationContext-service.xml","classpath*:moduleApplicationContext.xml", "classpath*:webModuleApplicationContext.xml"})
@ImportResource( value = {"classpath*:webModuleApplicationContext.xml"} )
public class CandoApplicationContext extends WebMvcConfigurerAdapter
{
	public CandoApplicationContext()
	{
		System.out.println( "Initializing CandoApplicationContext" );
	}
}
