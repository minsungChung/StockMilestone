package fisa.stockmilestone.modules.account.domain;

import fisa.stockmilestone.modules.board.domain.Post;

import javax.persistence.*;
import java.time.LocalDateTime;

public class UserLikePost {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
