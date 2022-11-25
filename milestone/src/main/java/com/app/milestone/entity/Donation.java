package com.app.milestone.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "TBL_DONATION")
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Donation extends Period {
    @Id
    @GeneratedValue
    private Long donationId;
    private int donationCount;
    private int donationReceiveCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private School school;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private People people;

    @Builder

    public Donation(int donationCount, int donationReceiveCount) {
        this.donationCount = donationCount;
        this.donationReceiveCount = donationReceiveCount;
    }
}
