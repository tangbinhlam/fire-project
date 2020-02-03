package edu.mum.cs544.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class Authority {
    private Integer id;

    private AuthorityType name;

    public Authority(AuthorityType name) {
        this.name = name;
    }
}
