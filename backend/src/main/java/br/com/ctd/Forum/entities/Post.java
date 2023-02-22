package br.com.ctd.Forum.entities;

import java.time.LocalDate;

public non-sealed class Post extends SamplePost{
    public Post() {
    }

    public Post(Long id, User user, String message, LocalDate date, Long upVote, Long downVote, SamplePost originalPost) {
        super(id, user, message, date, upVote, downVote, originalPost);
    }
}
