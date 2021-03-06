package com.kodilla.patterns2.observer.forum;

import java.util.List;

public class JavaToolsForumTopic extends ForumTopic {
    public JavaToolsForumTopic(String name) {
        super("Java Tools Group");
    }

    @Override
    public List<String> getMessages() {
        return super.getMessages();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void addPost(String post) {
        super.addPost(post);
    }

    @Override
    public void registerObserver(Observer observer) {
        super.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }

    @Override
    public void removeObserver(Observer observer) {
        super.removeObserver(observer);
    }
}
