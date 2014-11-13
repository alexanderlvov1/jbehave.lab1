package hello.controller;

import hello.Mood;
import hello.request.MoodRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/getMood")
public class MoodController {

    @RequestMapping(method=RequestMethod.POST)
    public @ResponseBody
    Mood guessMoodByColour(@RequestBody final MoodRequest moodRequest) {
        return new Mood(moodRequest.getName());
    }

}