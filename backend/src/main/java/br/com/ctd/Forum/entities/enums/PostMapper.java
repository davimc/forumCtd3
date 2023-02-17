package br.com.ctd.Forum.entities.enums;

import br.com.ctd.Forum.entities.Poll;
import br.com.ctd.Forum.entities.SamplePost;

public enum PostMapper {
    POLL("enquete", Poll.class);

    private String postType;
    private Class<? extends SamplePost> postClass;

    PostMapper(String postType, Class postClass) {
        this.postType = postType;
        this.postClass = postClass;
    }

    public String getPostType() {
        return postType;
    }

    public Class getPostClass() {
        return postClass;
    }

    public static PostMapper toEnum(String desc) {
        if(desc == null) return null;
        for(PostMapper l: PostMapper.values())
            if(desc.equals(l.getPostType()))
                return l;
        throw new IllegalArgumentException("Tipo de post inválido");
    }
}
