package xyz.magicer.daggerdemo.inject.component;

import dagger.Component;
import xyz.magicer.daggerdemo.MainActivity;
import xyz.magicer.daggerdemo.inject.module.MainModule;

/**
 * Created by Jason on 2017/7/10.
 */
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
