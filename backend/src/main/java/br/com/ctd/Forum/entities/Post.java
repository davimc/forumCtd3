package br.com.ctd.Forum.entities;

public interface Post {
    void downVote();
    void upVote();
    Long getRelevance();

}
