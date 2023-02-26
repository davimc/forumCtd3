package br.com.ctd.Forum.entities.enums;

import br.com.ctd.Forum.entities.*;

import java.lang.reflect.InvocationTargetException;

public enum PostMapper {
    ADS("Propaganda", Ads.class), QUESTION("Pergunta", Question.class),
    POST("Postagem", Post.class);

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
    static PostCommnad instantiate(String type,PostCommnad obj) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        switch (type){
            case "QUESTION":
                return Question.getInstance(obj);
            case "ADS":
                return Ads.getInstance(obj);
            case "POST":
                return Post.getInstance(obj);
            default:
                throw new ClassNotFoundException("Não foi possível encontrar " + type);
        }
    }
}
