package com.code;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping("/map")
	public @ResponseBody
    String map()
	{
		return "map";
	}

	@RequestMapping("/members")
	public @ResponseBody
	MemberResponse[] mentors() {
		MemberResponse[] mentors = {
			new MemberResponse("Austin Sparkman", "kmaroney@credera.com", "Baylor University"),
			new MemberResponse("Justin Ritter", "Justin_Ritter@Baylor.edu", "Baylor University"),
			new MemberResponse("Alicia MaGee ", "amomin@credera.com", "Baylor University"),

		};
		return mentors;
	}
}
