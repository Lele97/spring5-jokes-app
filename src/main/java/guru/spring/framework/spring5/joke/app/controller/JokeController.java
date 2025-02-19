package guru.spring.framework.spring5.joke.app.controller;

import guru.spring.framework.spring5.joke.app.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/joke")
public class JokeController {

    @Autowired
    private JokeService jokeService;

    @GetMapping("/getjoke")
    public String getJoke(Model model) {
        model.addAttribute("textJoke", jokeService.getJoke());
        model.addAttribute("text", "Message.");
        return "index";
    }


}
