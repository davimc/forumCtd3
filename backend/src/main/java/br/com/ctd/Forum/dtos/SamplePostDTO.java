package br.com.ctd.Forum.dtos;

import br.com.ctd.Forum.entities.SamplePost;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class SamplePostDTO {

    private Long id;
    private String message;
    private LocalDate date;
    private Long upVote;
    private Long downVotes;
    private Long relevance;

    private List infos = new ArrayList();

    public SamplePostDTO() {
    }

    public SamplePostDTO(Long id, String message, LocalDate date, Long upVote, Long downVotes, Long relevance) {
        this.id = id;
        this.message = message;
        this.date = date;
        this.upVote = upVote;
        this.downVotes = downVotes;
        this.relevance = relevance;
    }
    public SamplePostDTO(SamplePost obj) {
        this.id = obj.getId();
        this.message = obj.getMessage();
        this.date = obj.getDate();
        this.upVote = obj.getUpVote();
        this.downVotes = obj.getDownVote();
        this.relevance = obj.getRelevance();

    }
}
