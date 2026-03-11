package com.example.demo.controller;

import com.example.demo.dto.res.GroupRes;
import com.example.demo.service.GroupService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/groups")
@AllArgsConstructor
public class GroupController {
    private GroupService groupService;
    @GetMapping()
    public List<GroupRes> getAllGroup(){
        return groupService.getAllGroups();
    }
    @GetMapping("/{id}")
    public GroupRes findGroupById(@PathVariable Long id){
        return groupService.findGroupById(id);
    }
}
