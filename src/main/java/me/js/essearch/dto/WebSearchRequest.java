package me.js.essearch.dto;

import lombok.Getter;

@Getter
public class WebSearchRequest {

    private String query;

    @Override
    public String toString() {
        return "WebSearchRequest{" +
                "query='" + query + '\'' +
                '}';
    }
}
