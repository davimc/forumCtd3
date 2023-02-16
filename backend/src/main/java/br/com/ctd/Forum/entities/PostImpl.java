package br.com.ctd.Forum.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class PostImpl implements Post{

    //private User user;
    private String message;
    private LocalDate date;
    private Long upVote;
    private Long downVote;
    private Post originalPost;
    private List<Post> answers = new ArrayList();

    public PostImpl() {
    }

    public PostImpl(String message, LocalDate date, Long upVote, Long downVote, Post originalPost) {
        this.message = message;
        this.date = date;
        this.upVote = upVote;
        this.downVote = downVote;
        this.originalPost = originalPost;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getUpVote() {
        return upVote;
    }

    public void setUpVote(Long upVote) {
        this.upVote = upVote;
    }

    public Long getDownVote() {
        return downVote;
    }

    public void setDownVote(Long downVote) {
        this.downVote = downVote;
    }

    public Post getOriginalPost() {
        return originalPost;
    }

    public void setOriginalPost(Post originalPost) {
        this.originalPost = originalPost;
    }

    public List<Post> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Post> answers) {
        this.answers = answers;
    }

    @Override
    public void downVote() {
        downVote++;
    }

    @Override
    public void upVote() {
        upVote++;
    }

    @Override
    public Long getRelevance() {
           return upVote - downVote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostImpl post = (PostImpl) o;
        return message.equals(post.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}
