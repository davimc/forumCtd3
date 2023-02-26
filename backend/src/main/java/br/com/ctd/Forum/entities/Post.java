package br.com.ctd.Forum.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.Map;

@Entity
@DiscriminatorValue("POST")
public non-sealed class Post extends SamplePost{
    public Post() {
    }

    public Post(Long id, User user, String message, SamplePost originalPost) {
        super(id, user, message, originalPost);
    }

    @Override
    public void execute() {
        System.out.println("I'm a basic implementation and that's why i don't have a specific action :)");
    }

    public static PostCommnad getInstance(PostCommnad obj) {
        SamplePost newObj = (SamplePost) obj;
        newObj = new Post(newObj.getId(), newObj.getUser(),newObj.getMessage(), newObj.getOriginalPost());
        return newObj;
    }
}
