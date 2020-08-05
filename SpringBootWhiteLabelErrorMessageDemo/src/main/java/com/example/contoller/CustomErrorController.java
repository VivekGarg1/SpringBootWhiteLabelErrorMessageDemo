package com.example.contoller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.example.demo.model.ErrorJson;

@RestController
public class CustomErrorController implements ErrorController {
	
	private static final String PATH="/error";
	
	@Value( "${debug}")
	private boolean debug;
	
	@Autowired
	private ErrorAttributes errorAttributes;

	@GetMapping(PATH)
	ErrorJson error(HttpServletRequest request,WebRequest webRequest,HttpServletResponse response) {
		return new ErrorJson(response.getStatus(), getErrorAttributes(webRequest,debug));
	}
	
	@Override
	public String getErrorPath() {
		return PATH;
	}
	
	private Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        return errorAttributes.getErrorAttributes(webRequest,includeStackTrace);
    }

}
