package br.com.ctd.Forum.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

@Entity
@Table(name = "tb_post")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="post_type",
        discriminatorType = DiscriminatorType.STRING)
public abstract sealed class SamplePost implements PostCommnad, Serializable permits Ads, Post, Question {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String message;
    private LocalDate date;
    private Long upVote;
    private Long downVote;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private SamplePost originalPost;

    @OneToMany(mappedBy = "id")
    private List<SamplePost> answers = new ArrayList();

    public SamplePost() {
    }

    public SamplePost(Long id, User user, String message,  SamplePost originalPost) {
        this.id = id;
        this.user = user;
        this.message = message;
        this.date = LocalDate.now();
        this.upVote = 0L;
        this.downVote = 0L;
        this.originalPost = originalPost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public SamplePost getOriginalPost() {
        return originalPost;
    }

    public void setOriginalPost(SamplePost originalPost) {
        this.originalPost = originalPost;
    }

    public List<SamplePost> getAnswers() {
        return answers;
    }

    public void setAnswers(List<SamplePost> answers) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    static PostCommnad getInstance(PostCommnad obj) {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SamplePost post = (SamplePost) o;
        return message.equals(post.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}
