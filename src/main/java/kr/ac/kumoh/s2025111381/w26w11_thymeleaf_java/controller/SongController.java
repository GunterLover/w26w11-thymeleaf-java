package kr.ac.kumoh.s2025111381.w26w11_thymeleaf_java.controller;

import kr.ac.kumoh.s2025111381.w26w11_thymeleaf_java.model.Song;
import kr.ac.kumoh.s2025111381.w26w11_thymeleaf_java.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class SongController {
    private final SongService service;

    @GetMapping("/songs/random")
    public String getRandomSong(Model model) {
        model.addAttribute(
            "songTitle",
            service.getRandomSong()
                .map(Song::title) // Song이 null이 아닐 때만 title만 꺼내서 String으로 변환
                .orElse("노래 없음") // Song이 null 이면 "노래 없음"으로 변환
        );
        return "random";
    }
}
