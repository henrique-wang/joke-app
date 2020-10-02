package guru.springframework.joke.jokeapp.controllers;

import guru.springframework.joke.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})          // Define an endpoint
    public String showJoke(Model model) {
        model.addAttribute("jooke", jokeService.getJoke()); // Define the name of a variable in .html file
        return "chucknorris";           // Define the name of .html file (resources/templates)
    }
}
