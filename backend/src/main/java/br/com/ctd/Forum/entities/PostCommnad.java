package br.com.ctd.Forum.entities;

public sealed interface PostCommnad permits SamplePost {
    void downVote();
    void upVote();
    Long getRelevance();
}
