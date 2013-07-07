package com.yohostudios.theater.play;

import java.util.Comparator;
import java.util.List;

import com.yohostudios.theater.AbstractXMLObject;
import com.yohostudios.theater.exception.XMLParsingException;
import com.yohostudios.theater.graphics.Font;
import com.yohostudios.theater.graphics.Sprite;
import com.yohostudios.theater.graphics.Text;
import com.yohostudios.theater.play.script.Dialogue;
import com.yohostudios.theater.play.script.Sound;

/**
 * This class represents the Actor. In this case, any object that can interact
 * with another. (ie. a theater prop could also be an actor)
 * 
 * @author simon
 * 
 */
public class Actor extends AbstractXMLObject {

    /** */
    private int currentSprite;
    /** */
    private String name;
    /** */
    private int x;
    /** */
    private int y;
    /** */
    private int z;
    /** */
    private int width;
    /** */
    private int height;
    /** */
    private int offsetAreaX;
    /** */
    private int offsetAreaY;
    /** */
    private int offsetAreaW;
    /** */
    private int offsetAreaH;
    /** frame in animation to display. */
    private int currentFrame;
    /** position index in animation sequence vector. */
    private int sequenceIndex;
    /** delay between frames. */
    private int animFrameDelay;
    /** counter for the delay. */
    private int animDelayCounter;
    /** index to stop at, in the animation sequence. */
    private int stopIndex;
    /** is the sprite currently animated. */
    private boolean animated;
    /** is the animation looping. */
    private boolean loopAnimation;
    /** true if the actor is visible, false if not. */
    private boolean visible;
    /** true if Actor should show a dialogue, false if not. */
    private boolean talking;
    /** can we pickup this object with the mouse? */
    private boolean takeable;
    /** is this Actor currently held ? */
    private boolean taken;
    /** the ID of the currently shown dialogue. */
    private long currentDialogueId;
    /** font used for dialogue. */
    private Font dialogueFont;
    /** sprites associated with the actor. */
    private List<Sprite> sprites;
    /** sounds associated with the actor. */
    private List<Sound> sounds;
    /** triggers associated with the actor. */
    private List<Trigger> triggers;
    /** dialogues associated with the actor. */
    private List<Dialogue> dialogues;
    /** text written on the actor. */
    private List<Text> texts;

    /**
     * Default constructor.
     */
    public Actor() {

    }

    /**
     * Returns a Comparator that checks the Z coordinate of an Actor.
     * @return the comparator
     */
    public static Comparator<Actor> getZComparator() {
        return new Comparator<Actor>() {
            public int compare(Actor actorOne, Actor actorTwo) {
                return actorOne.getZ() - actorTwo.getZ();
            }
        };
    }

    // public class ActorZComparator implements Comparator<Actor> {
    // public int compare(Actor actorOne, Actor actorTwo) {
    // return actorOne.getZ() - actorTwo.getZ();
    // }
    // }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.yohostudios.theater.AbstractXMLObject#initFromXML(java.lang.String)
     */
    @Override
    public void initFromXML(String xmlString) throws XMLParsingException {

        setXmlData(xmlString);

        setId(Long.parseLong(getValueFromParam(xmlString, "id")));

        setName(getValueFromParam(xmlString, "name"));
        setX(Integer.parseInt(getValueFromParam(xmlString, "x")));
        setY(Integer.parseInt(getValueFromParam(xmlString, "y")));
        setZ(Integer.parseInt(getValueFromParam(xmlString, "z")));
        setWidth(Integer.parseInt(getValueFromParam(xmlString, "width")));
        setHeight(Integer.parseInt(getValueFromParam(xmlString, "height")));
        setCurrentFrame(Integer.parseInt(getValueFromParam(xmlString,
                "currentFrame")));
        setSequenceIndex(Integer.parseInt(getValueFromParam(xmlString,
                "sequenceIndex")));
        setAnimated(Boolean.parseBoolean(getValueFromParam(xmlString,
                "animated")));
        setAnimFrameDelay(Integer.parseInt(getValueFromParam(xmlString,
                "animFrameDelay")));
        setCurrentDialogueId(Integer.parseInt(getValueFromParam(xmlString,
                "currentDialogueId")));
        setTalking(Boolean
                .parseBoolean(getValueFromParam(xmlString, "talking")));
        setAnimDelayCounter(Integer.parseInt(getValueFromParam(xmlString,
                "animDelayCounter")));
        setLoopAnimation(Boolean.parseBoolean(getValueFromParam(xmlString,
                "loopAnimation")));
        setVisible(Boolean
                .parseBoolean(getValueFromParam(xmlString, "visible")));

        setSprites(getObjectListFromXML(Sprite.class, xmlString));
        setSounds(getObjectListFromXML(Sound.class, xmlString));
        setTexts(getObjectListFromXML(Text.class, xmlString));
        setTriggers(getObjectListFromXML(Trigger.class,xmlString));
        setDialogues(getObjectListFromXML(Dialogue.class, xmlString));
        setProperties(getObjectListFromXML(Property.class, xmlString));

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.yohostudios.theater.AbstractXMLObject#modifyAttribute(java.lang.String
     * , java.lang.String)
     */
    @Override
    public void modifyAttribute(String attributeName, String attributeValue) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.yohostudios.theater.AbstractXMLObject#getAttribute(java.lang.String)
     */
    @Override
    public String getAttribute(String attributeName) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.yohostudios.theater.AbstractXMLObject#callMethod(java.lang.String,
     * java.lang.String)
     */
    @Override
    public void callMethod(String attributeName, String attributeValue) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.AbstractXMLObject#freeResources()
     */
    @Override
    public void freeResources() {
        // TODO Auto-generated method stub

    }

    // ////////////////////////////////////////////////////////////////////////
    // Getters and setters.
    // ////////////////////////////////////////////////////////////////////////

    /**
     * @return the current animation sprite.
     */
    public int getCurrentSprite() {
        return currentSprite;
    }

    /**
     * @param currentSprite the current animation sprite.
     */
    public void setCurrentSprite(int currentSprite) {
        this.currentSprite = currentSprite;
    }

    /**
     * @return the X coordinate of the actor.
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the X coordinate of the actor.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the Y coordinate of the actor.
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the Y coordinate of the actor.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the Z coordinate of the actor.
     */
    public int getZ() {
        return z;
    }

    /**
     * @param z the Z coordinate of the actor.
     */
    public void setZ(int z) {
        this.z = z;
    }

    /**
     * @return the width of the actor.
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width of the actor.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height of the actor.
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height of the actor.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the offset area in X coordinates of the actor.
     */
    public int getOffsetAreaX() {
        return offsetAreaX;
    }

    /**
     * @param offsetAreaX the offset area in X coordinates of the actor.
     */
    public void setOffsetAreaX(int offsetAreaX) {
        this.offsetAreaX = offsetAreaX;
    }

    /**
     * @return the offset area in Y coordinates of the actor.
     */
    public int getOffsetAreaY() {
        return offsetAreaY;
    }

    /**
     * @param offsetAreaY the offset area in Y coordinates of the actor.
     */
    public void setOffsetAreaY(int offsetAreaY) {
        this.offsetAreaY = offsetAreaY;
    }

    /**
     * @return the width offset area of the actor.
     */
    public int getOffsetAreaW() {
        return offsetAreaW;
    }

    /**
     * @param offsetAreaW the width offset area of the actor.
     */
    public void setOffsetAreaW(int offsetAreaW) {
        this.offsetAreaW = offsetAreaW;
    }

    /**
     * @return the height offset area of the actor.
     */
    public int getOffsetAreaH() {
        return offsetAreaH;
    }

    /**
     * @param offsetAreaH the height offset area of the actor.
     */
    public void setOffsetAreaH(int offsetAreaH) {
        this.offsetAreaH = offsetAreaH;
    }

    /**
     * @return the current frame of animation of the actor.
     */
    public int getCurrentFrame() {
        return currentFrame;
    }

    /**
     * @param currentFrame the current animation frame.
     */
    public void setCurrentFrame(int currentFrame) {
        this.currentFrame = currentFrame;
    }

    /**
     * @return the current animation sequence in use.
     */
    public int getSequenceIndex() {
        return sequenceIndex;
    }

    /**
     * @param sequenceIndex the current animation sequence in use.
     */
    public void setSequenceIndex(int sequenceIndex) {
        this.sequenceIndex = sequenceIndex;
    }

    /**
     * @return the delay between each frame of animation.
     */
    public int getAnimFrameDelay() {
        return animFrameDelay;
    }

    /**
     * @param animFrameDelay the delay between each frame of animation.
     */
    public void setAnimFrameDelay(int animFrameDelay) {
        this.animFrameDelay = animFrameDelay;
    }

    /**
     * @return a counter for the animation delay.
     */
    public int getAnimDelayCounter() {
        return animDelayCounter;
    }

    /**
     * @param animDelayCounter a counter for the animation delay.
     */
    public void setAnimDelayCounter(int animDelayCounter) {
        this.animDelayCounter = animDelayCounter;
    }

    /**
     * @return the index to stop at, in the animation sequence.
     */
    public int getStopIndex() {
        return stopIndex;
    }

    /**
     * @param stopIndex the index to stop at, in the animation sequence.
     */
    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    /**
     * @return true if animated, otherwise false.
     */
    public boolean isAnimated() {
        return animated;
    }

    /**
     * @param animated true so the Actor is animated, otherwise false.
     */
    public void setAnimated(boolean animated) {
        this.animated = animated;
    }

    /**
     * @return true if animation should loop, otherwise false.
     */
    public boolean isLoopAnimation() {
        return loopAnimation;
    }

    /**
     * @param loopAnimation true if animation should loop, otherwise false.
     */
    public void setLoopAnimation(boolean loopAnimation) {
        this.loopAnimation = loopAnimation;
    }

    /**
     * @return the list of sprites that represent the actor.
     */
    public List<Sprite> getSprites() {
        return sprites;
    }

    /**
     * @param sprites the list of sprites that represent the actor.
     */
    public void setSprites(List<Sprite> sprites) {
        this.sprites = sprites;
    }

    /**
     * @return the list of sounds that the actor can make.
     */
    public List<Sound> getSounds() {
        return sounds;
    }

    /**
     * @param sounds the list of sounds that the actor can make.
     */
    public void setSounds(List<Sound> sounds) {
        this.sounds = sounds;
    }

    /**
     * @return a list of triggers that would have the actor take action.
     */
    public List<Trigger> getTriggers() {
        return triggers;
    }

    /**
     * @param triggers a list of triggers that would have the actor take action.
     */
    public void setTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
    }

    /**
     * @return a list of the actor's many dialogues.
     */
    public List<Dialogue> getDialogues() {
        return dialogues;
    }

    /**
     * @param dialogues a list of dialogues.
     */
    public void setDialogues(List<Dialogue> dialogues) {
        this.dialogues = dialogues;
    }

    /**
     * @return a list of texts for the actor.
     */
    public List<Text> getTexts() {
        return texts;
    }

    /**
     * @param texts a list of texts for the actor.
     */
    public void setTexts(List<Text> texts) {
        this.texts = texts;
    }

    /**
     * @return true if the actor is visible, otherwise false.
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * @param visible true if the actor is visible, otherwise false.
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    /**
     * @return true if the Actor is talking, otherwise false.
     */
    public boolean isTalking() {
        return talking;
    }

    /**
     * @param talking true if the Actor is talking, otherwise false.
     */
    public void setTalking(boolean talking) {
        this.talking = talking;
    }

    /**
     * @return true if the Actor can be taken, otherwise false.
     */
    public boolean isTakeable() {
        return takeable;
    }

    /**
     * @param takeable true if the Actor can be taken, otherwise false.
     */
    public void setTakeable(boolean takeable) {
        this.takeable = takeable;
    }

    /**
     * @return true if the Actor is taken, otherwise false.
     */
    public boolean isTaken() {
        return taken;
    }

    /**
     * @param taken true if the Actor is taken, otherwise false.
     */
    public void setTaken(boolean taken) {
        this.taken = taken;
    }

    /**
     * @return the current dialogue of the actor.
     */
    public long getCurrentDialogueId() {
        return currentDialogueId;
    }

    /**
     * @param currentDialogueId the id of the current dialogue.
     */
    public void setCurrentDialogueId(long currentDialogueId) {
        this.currentDialogueId = currentDialogueId;
    }

    /**
     * @return the font used to display the dialogue.
     */
    public Font getDialogueFont() {
        return dialogueFont;
    }

    /**
     * @param dialogueFont the font used to display the dialogue.
     */
    public void setDialogueFont(Font dialogueFont) {
        this.dialogueFont = dialogueFont;
    }

    /**
     * @return the actor's name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the actor's name.
     */
    public void setName(String name) {
        this.name = name;
    }

}
