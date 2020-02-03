package edu.mum.cs544.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class User implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private LocalDateTime dateCreated;
    private Set<Authority> authorities = new HashSet<>();

    public void addRole(Authority role) {
        authorities.add(role);
    }
}
