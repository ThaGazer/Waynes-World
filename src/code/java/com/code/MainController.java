package com.code;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/members")
	public @ResponseBody MemberResponse[] members() {
		MemberResponse[] members = {
			new MemberResponse("Austin Sparkman", "SparkyDaddy@Baylor.edu", "Baylor University"),
			new MemberResponse("Justin Ritter", "Justin_Ritter@Baylor.edu", "Baylor University"),
			new MemberResponse("Alicia MaGee ", "falicia@Baylor.edu", "Baylor University"),
		};
		return members;
	}
}
