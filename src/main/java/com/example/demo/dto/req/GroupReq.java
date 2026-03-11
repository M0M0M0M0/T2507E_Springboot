package com.example.demo.dto.req;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupReq {
    private Long id;
    @NotNull
    @Size(min = 3,message = "Input at least 3 characters!")
    private String name;
}
