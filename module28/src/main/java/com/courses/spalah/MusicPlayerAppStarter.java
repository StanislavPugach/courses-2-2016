package com.courses.spalah;

import com.courses.spalah.reader.TrackReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ievgen Tararaka
 */
public class MusicPlayerAppStarter {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(new String[]{"music-app-context.xml"});

        MusicPlayerApp musicPlayerApp = applicationContext.getBean("musicApp", MusicPlayerApp.class);
        musicPlayerApp.play();
        System.out.println(musicPlayerApp);

        TrackReader trackReader = applicationContext.getBean("trackReader", TrackReader.class);
        System.out.println(trackReader);
    }
}
