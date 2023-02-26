package br.com.ctd.Forum.dtos;

import br.com.ctd.Forum.entities.Ads;
import br.com.ctd.Forum.entities.SamplePost;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AdsDTO extends SamplePostDTO{

    private Long entry;

    public AdsDTO() {
    }

    public AdsDTO(Long id, String message, LocalDate date, Long upVote, Long downVotes, Long relevance, Long entry) {
        super(id, message, date, upVote, downVotes, relevance);
        this.entry = entry;
    }

    public AdsDTO(SamplePost obj) {
        super(obj);
        Ads p = (Ads) obj;
        entry = p.getEntry();
    }

    public Long getEntry() {
        return entry;
    }
}
