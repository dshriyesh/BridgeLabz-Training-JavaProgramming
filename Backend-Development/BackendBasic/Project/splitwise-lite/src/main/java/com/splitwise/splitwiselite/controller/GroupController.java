package com.splitwise.splitwiselite.controller;

import com.splitwise.splitwiselite.dto.GroupRequest;
import com.splitwise.splitwiselite.model.Group;
import com.splitwise.splitwiselite.service.GroupService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/group")
@RequiredArgsConstructor
public class GroupController {

    private final GroupService service;


    // CREATE
    @PostMapping
    public Group createGroup(
            @RequestBody GroupRequest request) {

        return service.createGroup(
                request);
    }


    // GET ALL
    @GetMapping
    public List<Group> getAllGroups() {

        return service.getAllGroups();
    }


    // GET BY ID
    @GetMapping("/{id}")
    public Group getGroup(
            @PathVariable Long id) {

        return service.getGroup(id);
    }


    // PUT
    @PutMapping("/{id}")
    public Group update(
            @PathVariable Long id,
            @RequestBody Group group) {

        return service.updateGroup(
                id,
                group);
    }


    // PATCH
    @PatchMapping("/{id}")
    public Group patch(
            @PathVariable Long id,
            @RequestBody Map<String,Object> updates) {

        return service.patchGroup(
                id,
                updates);
    }


    // DELETE
    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Long id) {

        service.deleteGroup(id);

        return "Group deleted successfully";
    }

}