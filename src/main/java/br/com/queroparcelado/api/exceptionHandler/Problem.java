package br.com.queroparcelado.api.exceptionHandler;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Builder
public class Problem {
    private final Integer status;
    private final String type;
    private final String title;
    private final LocalDateTime data;
    private final String detail;
}
