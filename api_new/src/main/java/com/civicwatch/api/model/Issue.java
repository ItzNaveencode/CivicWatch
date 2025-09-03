package com.civicwatch.api.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "issues")
@Data
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;

    @Column(nullable = false)
    private Double latitude;

    @Column(nullable = false)
    private Double longitude;

    @Column(nullable = false)
    private String imageUrl;

    @Enumerated(EnumType.STRING)
    private IssueStatus status = IssueStatus.REPORTED;

    @ManyToOne
    @JoinColumn(name = "reporter_id", nullable = false)
    private User reporter;

    @Column(name = "upvote_count")
    private Integer upvoteCount = 0;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
}

enum IssueStatus {
    REPORTED,
    VERIFIED,
    NOTIFIED,
    RESOLVED
}