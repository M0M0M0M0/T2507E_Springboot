package com.example.demo.service;

import com.example.demo.dto.req.GroupReq;
import com.example.demo.dto.res.GroupRes;

import com.example.demo.entity.Group;
import com.example.demo.repository.GroupRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GroupService {
    private GroupRepository groupRepository;
    public List<GroupRes> getAllGroups() {
        return groupRepository.findAll()
                .stream()
                .map(GroupRes::toJson)
                .toList();
    }
    public GroupRes findGroupById(Long id){
        return GroupRes.toJson(groupRepository.findById(id).get());
    }
    public GroupRes create(GroupReq req){
        Group g = new Group();
        g.setName(req.getName());
        return GroupRes.toJson(groupRepository.save(g));
    }
    public GroupRes update(GroupReq req){
        Group g = groupRepository.findById(req.getId()).orElseThrow(
                () -> new RuntimeException("Group not found")
        );
        g.setName(req.getName());
        return GroupRes.toJson(groupRepository.save(g));
    }
    public GroupRes delete(GroupReq req){
        Group g = groupRepository.findById(req.getId()).orElseThrow(
                ()-> new RuntimeException("Group not found")
        );
        groupRepository.delete(g);
        return GroupRes.toJson(g);
    }
}
