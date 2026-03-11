package com.example.demo.dto.res;

import com.example.demo.entity.Group;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class GroupRes {
    private Long id;
    private String name;

    public static GroupRes toJson(Group group){
        return  new GroupRes(group.getId(),group.getName());
    }
}
