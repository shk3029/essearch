package me.js.essearch.dto;

import lombok.Getter;

@Getter
public class AppSearchRequest {

    private String query;

    @Override
    public String toString() {
        return "AppSearchRequest{" +
                "query='" + query + '\'' +
                '}';
    }
}
