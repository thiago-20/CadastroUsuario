package agenda.api.rest;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration

	public class WebConfig extends WebMvcConfigurerAdapter{
		
		@Override
		  public void addResourceHandlers(ResourceHandlerRegistry registry) {
			
			  registry.addResourceHandler("/img/**", "/css/**", "/js/**").addResourceLocations("classpath:/static/img/",
					  "classpath:/static/css/", "classpath:/static/js/");
		  }

}
