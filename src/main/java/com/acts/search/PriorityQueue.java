package com.acts.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * The method must insert an element at the desired position.
     * The position is determined by the priority field.
     * To insert used add(int index, E value)
     *
     * @param task task.
     */
    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (task.getPriority() < element.getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
