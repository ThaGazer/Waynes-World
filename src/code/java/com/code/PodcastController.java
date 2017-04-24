package com.code;

import com.code.PodcastService.PodcastRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

// RestTemplate

@Controller
public class PodcastController { 
	@Autowired
	private PodcastService podcastService;
	
	// Maps a url after podsurfer-g4.herokuapp.com,
	// so here its podsurfer-g4.herokuapp.com/loginAPI
	// This also sets up for it to receive via POST
	@RequestMapping(value = "/podcastAPI", method = RequestMethod.POST, headers="Accept=application/json")
	@ResponseBody
	public String loginUserToCredera(@RequestBody PodcastRequest podcastRequest)
	{
		/* Only doing required well name and loginToken (authorization)
		 * for now . . . add extra functionality later
		 */
		String authorization = podcastRequest.getAuthorization();
		String name = podcastRequest.getName();
		
		// Debug output name for testing
		System.out.println(name);
		
    	// URL to Credera API - Login Existing User POST
    	final String uri = "https://podsurfer-4.herokuapp.com/api/well/";
    	
    	// Setup some parameter mapping for the API parameters
    	MultiValueMap<String, String> podcastParameters = new LinkedMultiValueMap<String, String>();
    	podcastParameters.add("Authorization", /*"Bearer " +  this is taken care of in angular */ authorization);
    	podcastParameters.add("name", name);
    	
    	// Declare a Rest Template to Post to the Credera API
    	RestTemplate restTemplate = new RestTemplate();
		
    	// POST Statement function from the restTemplate
    	// It stores the token in result and sends it back as a string
    	String result = restTemplate.postForObject(uri, podcastParameters, String.class);

    	return result;
	}   
}