package com.example.demo.models;

import com.example.demo.models.base.BaseEntityy;
import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import jakarta.persistence.Entity;

import javax.print.DocFlavor;
import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Table (name="Post")
@Data

public class Post extends BaseEntityy {


    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;


    private String image_url ;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


}


