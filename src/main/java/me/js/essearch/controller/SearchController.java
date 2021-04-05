package me.js.essearch.controller;

import lombok.extern.slf4j.Slf4j;
import me.js.essearch.application.SearchService;
import me.js.essearch.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/api/search", produces = MediaType.APPLICATION_JSON_VALUE)
public class SearchController {

    @Autowired
    private SearchService searchService;

    @PostMapping(value = "/web")
    public ResponseEntity<SearchResponse> searchWeb(@RequestBody WebSearchRequest webSearchRequest) {
        log.info("WebSearchController : request -> {}", webSearchRequest);
        SearchResponse searchResponse = searchService.getWebSearchResponse(webSearchRequest);

        log.info("WebSearchResponse : {} ", searchResponse);
        return ResponseEntity.ok(searchResponse);
    }

    @PostMapping(value = "/app")
    public ResponseEntity<SearchResponse> searchApp(@RequestBody AppSearchRequest appSearchRequest) {

        log.info("AppSearchController : request -> {}", appSearchRequest);
        SearchResponse searchResponse = searchService.getAppSearchResponse(appSearchRequest);

        log.info("AppSearchResponse : {}", searchResponse);
        return ResponseEntity.ok(searchResponse);
    }
}
