package br.com.ctd.Forum.dtos;

import br.com.ctd.Forum.entities.SamplePost;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class SamplePostDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String message;
    private LocalDate date;
    private Long upVote;
    private Long downVote;
    private Long relevance;

    public SamplePostDTO() {
    }

    public SamplePostDTO(Long id, String message, LocalDate date, Long upVote, Long downVote, Long relevance) {
        this.id = id;
        this.message = message;
        this.date = date;
        this.upVote = upVote;
        this.downVote = downVote;
        this.relevance = relevance;
    }
    public SamplePostDTO(SamplePost obj) {
        this.id = obj.getId();
        this.message = obj.getMessage();
        this.date = obj.getDate();
        this.upVote = obj.getUpVote();
        this.downVote = obj.getDownVote();
        this.relevance = obj.getRelevance();

    }
    public SamplePostDTO(SamplePostNewDTO dto) {
        this.message = dto.getMessage();
        this.date = dto.getDate();
        this.upVote = dto.getUpVote();
        this.downVote = dto.getDownVote();
    }
    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public LocalDate getDate() {
        return date;
    }

    public Long getUpVote() {
        return upVote;
    }

    public Long getDownVote() {
        return downVote;
    }

    public Long getRelevance() {
        return relevance;
    }
}
