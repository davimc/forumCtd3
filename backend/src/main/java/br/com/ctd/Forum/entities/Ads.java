package br.com.ctd.Forum.entities;

import java.time.LocalDate;

public non-sealed class Ads extends SamplePost{

    private Long entry;
    public Ads() {
    }

    public Ads(Long id, User user, String message, LocalDate date, Long upVote, Long downVote, SamplePost originalPost) {
        super(id, user, message, date, upVote, downVote, originalPost);
        entry = 0L;
    }

    public void reportEntry() {
        entry++;
    }
    public Long getEntry() {
        return entry;
    }

    public void setEntry(Long entry) {
        this.entry = entry;
    }
}
