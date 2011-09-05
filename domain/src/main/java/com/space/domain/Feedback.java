package com.space.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Document(collection="feedback")
@XmlRootElement(name = "Feedback")
public class Feedback {
    @Id
    private ObjectId id;
    private Date creationTime;
    private String text;

    public Feedback() {
    }

    public Feedback(Date creationTime, String text) {
        this.creationTime = creationTime;
        this.text = text;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", creationTime=" + creationTime +
                ", text='" + text + '\'' +
                '}';
    }
}
