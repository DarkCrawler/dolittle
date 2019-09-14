package sample.tags.bootandreact.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

@Configuration
@EnableWebMvc
public class WebSpring implements WebMvcConfigurer {
   @Override public void addFormatters(FormatterRegistry registry) {

   }

   @Override public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

   }

   @Override public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {

   }

   @Override public Validator getValidator() {
      return null;
   }

   @Override public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {

   }

   @Override public void configureAsyncSupport(AsyncSupportConfigurer configurer) {

   }

   @Override public void configurePathMatch(PathMatchConfigurer configurer) {

   }

   @Override public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {

   }

   @Override public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> returnValueHandlers) {

   }

   @Override public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {

   }

   @Override public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {

   }

   @Override public void addInterceptors(InterceptorRegistry registry) {

   }

   @Override public MessageCodesResolver getMessageCodesResolver() {
      return null;
   }

   @Override public void addViewControllers(ViewControllerRegistry registry) {

   }

   @Override public void configureViewResolvers(ViewResolverRegistry registry) {

   }

   @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry) {

      registry.addResourceHandler("swagger-ui.html")
         .addResourceLocations("classpath:/META-INF/resources/");

      registry.addResourceHandler("/webjars/**")
         .addResourceLocations("classpath:/META-INF/resources/webjars/");
   }

   @Override public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

   }

   @Override public void addCorsMappings(CorsRegistry registry) {

   }
}
