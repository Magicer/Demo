package xyz.magicer.daggerdemo.inject.module;

import dagger.Module;
import dagger.Provides;
import xyz.magicer.daggerdemo.Bean;
import xyz.magicer.daggerdemo.inject.PerActivity;

/**
 * Created by Jason on 2017/7/10.
 */

@PerActivity
@Module
public class MainModule {
    String id;
    String title;

    public MainModule(String id,String title) {
        this.id = id;
        this.title = title;
    }
    @Provides
    public Bean provideBeans(){
        return new Bean(id,title);
    }
}
