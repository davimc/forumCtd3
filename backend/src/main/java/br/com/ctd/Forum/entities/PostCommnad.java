package br.com.ctd.Forum.entities;

import java.util.List;
import java.util.Map;

public sealed interface PostCommnad permits SamplePost {
    void downVote();
    void upVote();
    Long getRelevance();
    void execute();
    Map<String, ?> getInfos();
}
