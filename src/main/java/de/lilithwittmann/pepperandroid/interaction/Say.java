package de.lilithwittmann.pepperandroid.interaction;

import com.aldebaran.qi.Future;
import com.aldebaran.qi.FutureFunction;

import de.lilithwittmann.pepperandroid.PepperSession;
import de.lilithwittmann.pepperandroid.api.ALAnimatedSpeech;
import de.lilithwittmann.pepperandroid.api.ALDialogProxy;
import de.lilithwittmann.pepperandroid.api.ALTextToSpeech;

/**
 * Created by lilith on 6/17/17.
 */

public class Say {

    ALAnimatedSpeech alAnimatedSpeech;
    ALDialogProxy alDialogProxy;
    ALTextToSpeech alTextToSpeech;

    public static String LANGUAGE_GERMAN = "German";
    public static String LANGUAGE_ENGLISH = "English";
    public static String LANGUAGE_French = "French";

    public Say(PepperSession session) throws Exception {
        this.alAnimatedSpeech = new ALAnimatedSpeech(session);
        this.alDialogProxy = new ALDialogProxy(session);
        this.alTextToSpeech = new ALTextToSpeech(session);
    }

    public Future say(String text) {
        return this.alTextToSpeech.say(text);
    }

    public Future setLanguage(String language) {
       return this.alTextToSpeech.setLanguage(language);
    }

    public Future<Object> getLanguage() {
        return this.alTextToSpeech.getLanguage();
    }

}
