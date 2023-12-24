package com.example.demo.models;

import com.example.demo.models.base.BaseEntityy;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import com.example.demo.models.base.BaseEntityy;
import static jakarta.persistence.GenerationType.AUTO;

//@EqualsAndHashCode(callSuper = true)
@Entity
@Table (name="User")
@Data
public class User extends BaseEntityy{

    @Column(nullable = false)
    private String username;


    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;


    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY   )
    private List<Post>posts=new ArrayList<>();



}
