package com.splitwise.splitwiselite.service;

import com.splitwise.splitwiselite.dto.GroupRequest;
import com.splitwise.splitwiselite.model.Group;
import com.splitwise.splitwiselite.model.User;
import com.splitwise.splitwiselite.repository.GroupRepository;
import com.splitwise.splitwiselite.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupRepository groupRepo;
    private final UserRepository userRepo;


    // CREATE
    public Group createGroup(GroupRequest req) {

        List<User> members =
                userRepo.findAllById(
                        req.getMemberIds());

        Group group = Group.builder()
                .name(req.getName())
                .members(members)
                .build();

        return groupRepo.save(group);
    }


    // GET BY ID
    public Group getGroup(Long id) {

        return groupRepo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Group not found"));
    }


    // PUT
    public Group updateGroup(
            Long id,
            Group group) {

        Group existing =
                groupRepo.findById(id)
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "Group not found"));

        existing.setName(
                group.getName());

        existing.setMembers(
                group.getMembers());

        return groupRepo.save(existing);
    }


    // PATCH
    public Group patchGroup(
            Long id,
            Map<String,Object> updates) {

        Group existing =
                groupRepo.findById(id)
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "Group not found"));

        if(updates.containsKey("name")) {

            existing.setName(
                    updates.get("name")
                            .toString());
        }

        return groupRepo.save(existing);
    }


    // DELETE
    public void deleteGroup(Long id) {

        groupRepo.deleteById(id);
    }


    // GET ALL
    public List<Group> getAllGroups() {

        return groupRepo.findAll();
    }

}