package br.com.ctd.Forum.dtos;

import br.com.ctd.Forum.entities.SamplePost;

import java.io.Serializable;
import java.time.LocalDate;

public class SamplePostNewDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String message;
    private LocalDate date;
    private Long upVote;
    private Long downVote;

    private Long originalPostId;

    private String postType;

    public SamplePostNewDTO() {
    }

    public SamplePostNewDTO(String message, LocalDate date, Long upVote, Long downVote, String postType, Long originalPostId) {
        this.message = message;
        this.date = date;
        this.upVote = upVote;
        this.downVote = downVote;
        this.postType = postType;
        this.originalPostId = originalPostId;
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

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public Long getOriginalPostId() {
        return originalPostId;
    }

    public void setOriginalPostId(Long originalPostId) {
        this.originalPostId = originalPostId;
    }
}
