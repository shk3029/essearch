package me.js.essearch.application;

import lombok.extern.slf4j.Slf4j;
import me.js.essearch.dto.AppSearchRequest;
import me.js.essearch.dto.SearchResponse;
import me.js.essearch.dto.WebSearchRequest;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SearchService {

    public SearchResponse getWebSearchResponse(WebSearchRequest webSearchRequest) {

        try {
            log.info(">>>>> Web Search 데이터 조회중...");
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SearchResponse searchResponse = new SearchResponse();
        searchResponse.setType("web");
        searchResponse.setQuery(webSearchRequest.getQuery());
        searchResponse.setData(webSearchRequest.getQuery() + " 웹 데이터");

        return searchResponse;
    }

    public SearchResponse getAppSearchResponse(AppSearchRequest appSearchRequest) {

        try {
            log.info(">>>>> App Search 데이터 조회중...");
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SearchResponse searchResponse = new SearchResponse();
        searchResponse.setType("app");
        searchResponse.setQuery(appSearchRequest.getQuery());
        searchResponse.setData(appSearchRequest.getQuery() + " 앱 데이터");

        return searchResponse;
    }
}
