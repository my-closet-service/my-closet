package com.mycloset.member.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;

@Data
@Entity
@Table(name="MEMBER")
public class Member implements Serializable {

    @Id
    @NotNull
    @Column(name="USER_ID")
    private String userId;

    @Column(name="USER_PWD")
    private String userPwd;

    @Column(name="USER_NM")
    private String userNm;

    private String gender;

    private Integer height;

    private Integer weight;

    @Column(name="PRIVATE_YN")
    private String privateYn;

    private Instant regdate;
}
