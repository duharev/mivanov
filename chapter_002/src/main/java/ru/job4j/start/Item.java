package ru.job4j.start;

import java.util.Random;

/**
 * Заявка.
 */
public class Item {
    /**
     * random.
     */
    private static final Random RANDOM = new Random();
    /**
     * id.
     */
    private final String id;
    /**
     * name.
     */
    private String name;
    /**
     * task.
     */
    private String task;
    /**
     * created.
     */
    private long created;
    /**
     * comments.
     */
    private String[] comments;

    /**
     *
     * @param name name.
     * @param task task.
     * @param created created.
     */
    public Item(String name, String task, long created) {
        this.id = Long.toString(System.currentTimeMillis() + Item.RANDOM.nextInt());
        this.name = name;
        this.task = task;
        this.created = created;
    }

    /**
     *
     * @return id.
     */
    public String getId() {
        return id;
    }


    /**
     *
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return task.
     */
    public String getTask() {
        return task;
    }

    /**
     *
     * @param task task.
     */
    public void setTask(String task) {
        this.task = task;
    }

    /**
     *
     * @return created.
     */
    public long getCreated() {
        return created;
    }

    /**
     *
     * @param created created.
     */
    public void setCreated(long created) {
        this.created = created;
    }

    /**
     *
     * @return comments.
     */
    public String[] getComments() {
        return comments;
    }

    /**
     *
     * @param comments comments.
     */
    public void setComments(String[] comments) {
        this.comments = comments;
    }

    /**
     *
     * @return toString.
     */
    public String toString() {
        return "ID: " + this.id + System.getProperty("line.separator")
                + "name: " + this.name + System.getProperty("line.separator")
                + "task: " + this.task + System.getProperty("line.separator")
                + "created: " + this.created + System.getProperty("line.separator")
                + "comments: " + this.comments + System.getProperty("line.separator");
    }
}

