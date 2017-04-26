package com.code;

/**
 * Created by Sparky on 4/24/17.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Interactive_uploadController {

    @RequestMapping(value ="/updateDB")//, method = RequestMethod.POST)
    public @ResponseBody
    MemberResponse[] mentors() {
        MemberResponse[] mentors = {
                new MemberResponse("Austin Sparkman", "austin_sparkman@baylor.edu", "Baylor University"),
                new MemberResponse("Justin Ritter", "Justin_Ritter@Baylor.edu", "Baylor University"),
                new MemberResponse("Alicia MaGee ", "amomin@credera.com", "Baylor University"),
        };
        return mentors;
    }
}
