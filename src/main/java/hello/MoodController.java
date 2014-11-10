package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/getMood")
public class MoodController {

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Mood guessMoodByColour(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
        return new Mood(name);
    }

}