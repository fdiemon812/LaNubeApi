package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Clase para configurar rutas CORS
 * @author estudiante
 *
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				
				registry.addMapping("/login")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedHeaders("GET","POST","OPTIONS","PUT" ,"HEAD", "PATCH", "Content-Type","X-Requested-With",
						"accept","Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				registry.addMapping("/register")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedHeaders("GET","POST","OPTIONS","PUT" ,"HEAD", "PATCH","Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				
				
				//Estos comprueban token AUTHORIZATION
				registry.addMapping("/home/token")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedHeaders("GET","POST","OPTIONS","PUT" ,"HEAD", "PATCH","Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				registry.addMapping("/home/usuario")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedHeaders("GET","POST","OPTIONS","PUT" ,"HEAD", "PATCH","Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				registry.addMapping("/centro")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedHeaders("GET","POST","OPTIONS","PUT" ,"HEAD", "PATCH","Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				
				registry.addMapping("/centro/{id}")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedHeaders("GET","POST","OPTIONS","DELETE","PUT" ,"HEAD", "PATCH","Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				registry.addMapping("/centros")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedHeaders("GET","POST","OPTIONS","DELETE","PUT" ,"HEAD", "PATCH","Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				registry.addMapping("/centro/{id}/aulas")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedHeaders("GET","POST","OPTIONS","DELETE","PUT" ,"HEAD", "PATCH","Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				registry.addMapping("/centro/{id}/aula")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedHeaders("GET","POST","OPTIONS","DELETE","PUT" ,"HEAD", "PATCH","Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				registry.addMapping("/centro/{id}/alumno")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedHeaders("GET","POST","OPTIONS","DELETE","PUT" ,"HEAD", "PATCH","Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				
				registry.addMapping("/centro/{id}/alumnos")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedHeaders("GET","POST","OPTIONS","DELETE","PUT" ,"HEAD", "PATCH","Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				
				registry.addMapping("/centro/{id}/alumno/{idAlumno}")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedHeaders("Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.allowedMethods("PUT", "DELETE","OPTIONS", "GET", "POST", "HEAD")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				registry.addMapping("/centro/{id}/aula/{idAula}")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedHeaders("GET","POST","OPTIONS","DELETE","PUT" ,"HEAD", "PATCH","Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				
				registry.addMapping("/centro/{id}/aula/{idAula}/alumnos")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedHeaders("GET","POST","OPTIONS","DELETE","PUT" ,"HEAD", "PATCH","Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				
				registry.addMapping("/alumno")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedMethods("PUT", "OPTIONS", "GET", "POST", "HEAD")
				.allowedHeaders("GET","POST","OPTIONS","PUT" ,"HEAD", "PATCH","Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				registry.addMapping("/alumno/{idAlumno}")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedMethods("PUT", "OPTIONS", "GET", "POST", "HEAD")
				.allowedHeaders("GET","POST","OPTIONS","PUT" ,"HEAD", "PATCH","Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method:PUT, OPTIONS","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				
				
				registry.addMapping("/aula")
				.allowedOrigins("https://fdiemon812.github.io/")
//				.allowedMethods("PUT", "OPTIONS", "GET", "POST", "HEAD")
				.allowedHeaders("GET","POST","OPTIONS","PUT" ,"HEAD", "PATCH","Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method:PUT, OPTIONS","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				
		
				
				registry.addMapping("/aula/{id}")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedMethods("PUT", "OPTIONS", "GET", "POST", "HEAD")
				.allowedHeaders("GET","POST","OPTIONS","PUT" ,"HEAD", "PATCH","Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method:PUT, OPTIONS","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				registry.addMapping("/aulas")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedMethods("PUT", "OPTIONS", "GET", "POST", "HEAD")
				.allowedHeaders("GET","POST","OPTIONS","PUT" ,"HEAD", "PATCH","Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method:PUT, OPTIONS","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				
				registry.addMapping("/usuario")
				.allowedOrigins("https://fdiemon812.github.io/")
				.allowedMethods("PUT", "OPTIONS", "GET", "POST", "HEAD")
				.allowedHeaders("GET","POST","OPTIONS","PUT" ,"HEAD", "PATCH","Content-Type","X-Requested-With",
						"accept","Authorization","Origin","Access-Control-Request-Method:PUT, OPTIONS","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
//				registry.addMapping("/alumno/{idAlumno}")
//				.allowedOrigins("http://localhost:4200")
//				.allowedHeaders("GET","PUT","Content-Type","X-Requested-With",
//						"accept","Authorization","Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
//				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				
				

				
				
			}
		};
	}


}