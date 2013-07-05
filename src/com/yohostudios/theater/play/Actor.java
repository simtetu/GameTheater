package com.yohostudios.theater.play;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.yohostudios.theater.AbstractXMLObject;
import com.yohostudios.theater.exception.XMLTagNotFoundException;
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
     * @see com.yohostudios.theater.AbstractXMLObject#initFromXML(java.lang.String)
     */
    @Override
    public void initFromXML(String xmlString) {

        setXmlData(xmlString);

        try {
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
            setTalking(Boolean.parseBoolean(getValueFromParam(xmlString,
                    "talking")));
            setAnimDelayCounter(Integer.parseInt(getValueFromParam(xmlString,
                    "animDelayCounter")));
            setLoopAnimation(Boolean.parseBoolean(getValueFromParam(xmlString,
                    "loopAnimation")));
            setVisible(Boolean.parseBoolean(getValueFromParam(xmlString,
                    "visible")));

            sprites = new ArrayList<Sprite>();
            sounds = new ArrayList<Sound>();
            texts = new ArrayList<Text>();
            triggers = new ArrayList<Trigger>();
            dialogues = new ArrayList<Dialogue>();
            setProperties(new ArrayList<Property>());

            // parse objects from XML and fill lists
            fillListFromXML(sprites, Sprite.class, xmlString);
            fillListFromXML(sounds, Sound.class, xmlString);
            fillListFromXML(texts, Text.class, xmlString);
            fillListFromXML(triggers, Trigger.class, xmlString);
            fillListFromXML(dialogues, Dialogue.class, xmlString);
            fillListFromXML(getProperties(), Property.class, xmlString);

        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (XMLTagNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.AbstractXMLObject#modifyAttribute(java.lang.String,
     * java.lang.String)
     */
    @Override
    public void modifyAttribute(String attributeName, String attributeValue) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.AbstractXMLObject#getAttribute(java.lang.String)
     */
    @Override
    public String getAttribute(String attributeName) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.AbstractXMLObject#callMethod(java.lang.String,
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
     * @return
     */
    public int getCurrentSprite() {
        return currentSprite;
    }

    /**
     * @param currentSprite
     */
    public void setCurrentSprite(int currentSprite) {
        this.currentSprite = currentSprite;
    }

    /**
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return
     */
    public int getZ() {
        return z;
    }

    /**
     * @param z
     */
    public void setZ(int z) {
        this.z = z;
    }

    /**
     * @return
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return
     */
    public int getOffsetAreaX() {
        return offsetAreaX;
    }

    /**
     * @param offsetAreaX
     */
    public void setOffsetAreaX(int offsetAreaX) {
        this.offsetAreaX = offsetAreaX;
    }

    /**
     * @return
     */
    public int getOffsetAreaY() {
        return offsetAreaY;
    }

    /**
     * @param offsetAreaY
     */
    public void setOffsetAreaY(int offsetAreaY) {
        this.offsetAreaY = offsetAreaY;
    }

    /**
     * @return
     */
    public int getOffsetAreaW() {
        return offsetAreaW;
    }

    /**
     * @param offsetAreaW
     */
    public void setOffsetAreaW(int offsetAreaW) {
        this.offsetAreaW = offsetAreaW;
    }

    /**
     * @return
     */
    public int getOffsetAreaH() {
        return offsetAreaH;
    }

    /**
     * @param offsetAreaH
     */
    public void setOffsetAreaH(int offsetAreaH) {
        this.offsetAreaH = offsetAreaH;
    }

    /**
     * @return
     */
    public int getCurrentFrame() {
        return currentFrame;
    }

    /**
     * @param currentFrame
     */
    public void setCurrentFrame(int currentFrame) {
        this.currentFrame = currentFrame;
    }

    /**
     * @return
     */
    public int getSequenceIndex() {
        return sequenceIndex;
    }

    /**
     * @param sequenceIndex
     */
    public void setSequenceIndex(int sequenceIndex) {
        this.sequenceIndex = sequenceIndex;
    }

    /**
     * @return
     */
    public int getAnimFrameDelay() {
        return animFrameDelay;
    }

    /**
     * @param animFrameDelay
     */
    public void setAnimFrameDelay(int animFrameDelay) {
        this.animFrameDelay = animFrameDelay;
    }

    /**
     * @return
     */
    public int getAnimDelayCounter() {
        return animDelayCounter;
    }

    /**
     * @param animDelayCounter
     */
    public void setAnimDelayCounter(int animDelayCounter) {
        this.animDelayCounter = animDelayCounter;
    }

    /**
     * @return
     */
    public int getStopIndex() {
        return stopIndex;
    }

    /**
     * @param stopIndex
     */
    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    /**
     * @return
     */
    public boolean isAnimated() {
        return animated;
    }

    /**
     * @param animated
     */
    public void setAnimated(boolean animated) {
        this.animated = animated;
    }

    /**
     * @return
     */
    public boolean isLoopAnimation() {
        return loopAnimation;
    }

    /**
     * @param loopAnimation
     */
    public void setLoopAnimation(boolean loopAnimation) {
        this.loopAnimation = loopAnimation;
    }

    /**
     * @return
     */
    public List<Sprite> getSprites() {
        return sprites;
    }

    /**
     * @param sprites
     */
    public void setSprites(List<Sprite> sprites) {
        this.sprites = sprites;
    }

    /**
     * @return
     */
    public List<Sound> getSounds() {
        return sounds;
    }

    /**
     * @param sounds
     */
    public void setSounds(List<Sound> sounds) {
        this.sounds = sounds;
    }

    /**
     * @return
     */
    public List<Trigger> getTriggers() {
        return triggers;
    }

    /**
     * @param triggers
     */
    public void setTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
    }

    /**
     * @return
     */
    public List<Dialogue> getDialogues() {
        return dialogues;
    }

    /**
     * @param dialogues
     */
    public void setDialogues(List<Dialogue> dialogues) {
        this.dialogues = dialogues;
    }

    /**
     * @return
     */
    public List<Text> getTexts() {
        return texts;
    }

    /**
     * @param texts
     */
    public void setTexts(List<Text> texts) {
        this.texts = texts;
    }

    /**
     * @return
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * @param visible
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    /**
     * @return
     */
    public boolean isTalking() {
        return talking;
    }

    /**
     * @param talking
     */
    public void setTalking(boolean talking) {
        this.talking = talking;
    }

    /**
     * @return
     */
    public boolean isTakeable() {
        return takeable;
    }

    /**
     * @param takeable
     */
    public void setTakeable(boolean takeable) {
        this.takeable = takeable;
    }

    /**
     * @return
     */
    public boolean isTaken() {
        return taken;
    }

    /**
     * @param taken
     */
    public void setTaken(boolean taken) {
        this.taken = taken;
    }

    /**
     * @return
     */
    public long getCurrentDialogueId() {
        return currentDialogueId;
    }

    /**
     * @param currentDialogueId
     */
    public void setCurrentDialogueId(long currentDialogueId) {
        this.currentDialogueId = currentDialogueId;
    }

    /**
     * @return
     */
    public Font getDialogueFont() {
        return dialogueFont;
    }

    /**
     * @param dialogueFont
     */
    public void setDialogueFont(Font dialogueFont) {
        this.dialogueFont = dialogueFont;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
