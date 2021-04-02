package me.js.essearch.controller;

import lombok.extern.slf4j.Slf4j;
import me.js.essearch.dto.AppSearchRequest;
import me.js.essearch.dto.AppSearchResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/search/web")
public class AppSearchController {

    @PostMapping
    public AppSearchResponse search(@RequestBody AppSearchRequest appSearchRequest) {
        log.info("AppSearchController : request -> {}", appSearchRequest);
        return new AppSearchResponse();
    }
}
