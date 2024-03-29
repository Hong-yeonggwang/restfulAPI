package com.example.restfulAPI.JPA.Entity.bus;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "DEVICEINFO")
public class DeviceInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="DEVICEINFOSEQ")
    private Long deviceInfoSeq;

    @Column(name = "DEVICEREGDATE")
    private LocalDateTime deviceRegdate;

    @Column(name = "DEVICESTATE")
    private String diveState;

    @OneToOne
    @JoinColumn(name = "DEVICESEQ")
    private Device deviceSeq;

    @Column(name = "BUSNUMBER")
    private String busNumber;

    @Column(name = "BUSALIAS")
    private String busAlias;

    @ManyToOne
    @JoinColumn(name = "BUSTYPESEQ")
    private BusType busType;

    @ManyToOne
    @JoinColumn(name = "BUSNLINESEQ")
    private BusLine busLine;

}
