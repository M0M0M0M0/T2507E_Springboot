package com.example.demo.dto.req;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class StudentReq {
    private Long id;
    @NotBlank(message = "Input student's name please!")
    @Size(min = 3, message = "Input at least 3 characters!")
    private String name;
    @Past
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dob;
    @NotNull(message = "Input student's mark!")
    @Min(0)
    @Max(100)
    private Integer mark;
    @NotNull
    private Long groupId;

}
