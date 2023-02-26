package br.com.ctd.Forum.controllers;

import br.com.ctd.Forum.dtos.SamplePostDTO;
import br.com.ctd.Forum.entities.SamplePost;
import br.com.ctd.Forum.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService service;

    @GetMapping
    public ResponseEntity<List<SamplePostDTO>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }
}
