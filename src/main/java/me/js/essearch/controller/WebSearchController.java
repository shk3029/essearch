package me.js.essearch.controller;

import lombok.extern.slf4j.Slf4j;
import me.js.essearch.dto.WebSearchRequest;
import me.js.essearch.dto.WebSearchResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/search/web")
public class WebSearchController {

    @PostMapping
    public WebSearchResponse search(@RequestBody WebSearchRequest webSearchRequest) {
        log.info("WebSearchController : request -> {}", webSearchRequest);
        return new WebSearchResponse();
    }
}
