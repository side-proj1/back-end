package com.planner.server.domain.user_study_subject.entity;

import com.planner.server.domain.record.entity.Record;
import com.planner.server.domain.user.entity.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Table(name = "user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserStudySubject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cid;

    @Type(type = "uuid-char")
    private UUID id;

    private String title;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "userStudySubject")
    private List<Record> records;
}