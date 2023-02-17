package br.com.ctd.Forum.entities;

import java.time.LocalDate;

public non-sealed class Ads extends SamplePost{

    private Long positive;
    private Long negative;
    public Ads() {
    }

    public Ads(Long id, User user, String message, LocalDate date, Long upVote, Long downVote, SamplePost originalPost, Long positive, Long negative) {
        super(id, user, message, date, upVote, downVote, originalPost);
        this.positive = positive;
        this.negative = negative;
    }
}
