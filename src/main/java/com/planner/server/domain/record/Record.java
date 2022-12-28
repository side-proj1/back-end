package com.planner.server.domain.record;

import com.planner.server.domain.user.User;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Record {

    @Id
    @NotNull
    @Type(type = "uuid-char")
    private UUID id;

    private LocalDateTime recordStartTime;

    private LocalDateTime recordEndTime;

    private Duration totalStudyTime;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    User user;
}
