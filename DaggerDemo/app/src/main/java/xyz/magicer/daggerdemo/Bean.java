package xyz.magicer.daggerdemo;

import javax.inject.Inject;

/**
 * Created by Jason on 2017/7/10.
 */

public class Bean {
    private String id;
    private String title;

    @Inject
    public Bean(){
        this.id = "id";
        this.title = "title";
    }

    public Bean(String id,String title){
        this.id = id;
        this.title = title;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
