package com.mycloset.test.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="test")
public class Test implements Serializable {
    @Id
    @NotNull
    private Long seq;
}
