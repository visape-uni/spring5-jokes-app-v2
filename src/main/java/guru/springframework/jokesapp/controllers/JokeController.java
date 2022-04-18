package guru.springframework.jokesapp.controllers;

import guru.springframework.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
