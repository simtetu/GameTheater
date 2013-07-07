package com.yohostudios.theater;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Canvas;

import com.yohostudios.theater.fx.FadeFilter;
import com.yohostudios.theater.graphics.Font;
import com.yohostudios.theater.play.Action;
import com.yohostudios.theater.play.Actor;
import com.yohostudios.theater.play.Scene;

/**
 * The game engine and its main functions.
 * @author simon
 */
/**
 * @author simon
 * 
 */
public class Play {

    /** The current scene's id. */
    private long currentSceneId;
    /** The next scene's id. */
    private long nextSceneId;
    /** indicates that a scene change is needed or not. */
    private boolean sceneChangeNeeded;
    /** List of Scenes. */
    private List<Scene> scenes = new ArrayList<Scene>();
    /** The hud portion of the screen. */
    private Scene hud;
    /** The touched actor. */
    private Actor touchedActor;
    /** Held actor. */
    private Actor heldActor;
    /** The fade filter. */
    private FadeFilter fadeFilter;
    /** The text font. */
    private Font font;

    /**
     * Constructs a Play with XML data from a file named resourceFileName.
     * @param resourceFileName the xml file name.
     */
    public Play(final String resourceFileName) {
        addScene(resourceFileName);
    }

    /**
     * Adds a scene to the scene list.
     * @param resourceFileName The xml file name.
     */
    public final void addScene(String resourceFileName) {

        Scene scene = new Scene(resourceFileName); // Create and load a scene.

        currentSceneId = scene.getId();
        scenes.add(scene);

        if (scene.isOpeningWithEffect()) {
            // TODO implement from opaque to
            // transparent in a certain amount of
            // steps.
            fadeFilter = new FadeFilter();
        }

    }

    /**
     * 
     */
    public void processTouch() {
        // TODO implement this
    }

    /**
     * @param action the XMLObject action
     */
    public void handleXMLObjectAction(Action action) {
        // TODO implement this
    }

    /**
     * @param nextRoom prepare information from the next room.
     */
    public void setNextRoom(String nextRoom) {
        // TODO implement this
    }

    /**
     * @param nextRoom Change of Room.
     */
    public void changeRoom(int nextRoom) {
        // TODO implement this
    }

    /**
     * @param nextDialogue Change of Dialogue.
     */
    public void changeDialogue(long nextDialogue) {
        // TODO implement this
    }

    /**
     * Change in the Actors.
     */
    public void updateActors() {
        // TODO implement this
    }

    /**
     * To prepare the stage to show the new canvas
     * @param canvas the new canvas
     */
    public void render(Canvas canvas) {
        // TODO implement this
    }

    /**
     * Find the actor from a list of actors that is located at specific
     * coordinates.
     * @param actors a list of actors.
     * @return the actor if found, otherwise null.
     */
    public Actor findActorFromCoordinates(List<Actor> actors) {
        // TODO implement this
        return new Actor();
    }

    /**
     * @param paramValue the name of ParamValue
     * @return the String of ParamValue
     */
    public String findParamValue(String paramValue) {
        // TODO implement this
        return "";
    }

    /**
     * TODO: rename this method to make it explicit. Handles events triggered by
     * touch.
     * @param actors those accessible by the onTouch trigger.
     * @return true if an actor was triggered, otherwise false.
     */
    public boolean validateTouchTriggers(List<Actor> actors) {
        // TODO implement this and use input coordinates to match an actor.
        return false;
    }

    /**
     * Look for a specific Actor's Trigger and execute its Actions
     * @param triggerType is the trigger to look for. (ie: touch, hold, drag)
     * @param actor an Actor that gets triggered.
     */
    public void validateTrigger(String triggerType, Actor actor) {
        // TODO implement this
    }

    /**
     * @param action contains the conditions to validate.
     * @return true if all conditions are true, otherwise false.
     */
    public boolean validateActionConditions(Action action) {
        return false;
    }

    /**
     * @param actions List actions for Attributes On Targets
     */
    public void clearModifiedAttributesOnTargets(List<Action> actions) {

    }

    // ////////////////////////////////////////////////////////////////////////
    // Getters and setters.
    // ////////////////////////////////////////////////////////////////////////

    /**
     * @return access values List of Scene.
     */
    public List<Scene> getScenes() {
        return scenes;
    }

    /**
     * @param scenes taint or change List of Scene
     */
    public void setScenes(List<Scene> scenes) {
        this.scenes = scenes;
    }

    /**
     * @return access values Touched Actor.
     */
    public Actor getTouchedActor() {
        return touchedActor;
    }

    /**
     * @param touchedActor taint or change Touched Actor.
     */
    public void setTouchedActor(Actor touchedActor) {
        this.touchedActor = touchedActor;
    }

    /**
     * @return access values Help Actor.
     */
    public Actor getHeldActor() {
        return heldActor;
    }

    /**
     * @param heldActor taint or change Help Actor.
     */
    public void setHeldActor(Actor heldActor) {
        this.heldActor = heldActor;
    }

    /**
     * @return access values Fade Filter.
     */
    public FadeFilter getFadeFilter() {
        return fadeFilter;
    }

    /**
     * @param fadeFilter taint or change Fade Filter.
     */
    public void setFadeFilter(FadeFilter fadeFilter) {
        this.fadeFilter = fadeFilter;
    }

    /**
     * @return access values Font.
     */
    public Font getFont() {
        return font;
    }

    /**
     * @param font taint or change Font.
     */
    public void setFont(Font font) {
        this.font = font;
    }

    /**
     * @return access values Hud.
     */
    public Scene getHud() {
        return hud;
    }

    /**
     * @param hud taint or change hud.
     */
    public void setHud(Scene hud) {
        this.hud = hud;
    }

    /**
     * @return access values to Current Scene Id.
     */
    public long getCurrentSceneId() {
        return currentSceneId;
    }

    /**
     * @param currentSceneId taint or change to Current Scene Id.
     */
    public void setCurrentSceneId(long currentSceneId) {
        this.currentSceneId = currentSceneId;
    }

    /**
     * @return access values Next Scene Id.
     */
    public long getNextSceneId() {
        return nextSceneId;
    }

    /**
     * @param nextSceneId taint or change Next Scene Id.
     */
    public void setNextSceneId(long nextSceneId) {
        this.nextSceneId = nextSceneId;
    }

    /**
     * @return access values Scene Change Needed
     */
    public boolean isSceneChangeNeeded() {
        return sceneChangeNeeded;
    }

    /**
     * @param sceneChangeNeeded taint or change Scene Change Needed
     */
    public void setSceneChangeNeeded(boolean sceneChangeNeeded) {
        this.sceneChangeNeeded = sceneChangeNeeded;
    }

}
