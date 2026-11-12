package kr.ac.kumoh.s2025111381.w26w11_thymeleaf_java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SongController {
    @GetMapping("/songs/random")
    String getRandomSong(Model model) {
        model.addAttribute("songTitle", "Cosmic Echo");
        return "random";
    }
}
