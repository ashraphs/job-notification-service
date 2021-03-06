package com.tng.abt.jobnotificationservice.entities;

import com.touchngo.abt.utils.entities.MasterEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "jbn_jobs")
public class AbtJob extends MasterEntity {

    @Column(name = "job_name")
    private String jobName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "job_query_datetime")
    private Date jobQueryDatetime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "job_start_datetime")
    private Date abtJobStartDatetime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "job_end_datetime")
    private Date abtJobEndDatetime;

    @Column(name = "is_successful_run")
    private Boolean isSuccessfulRun;

    @Column(name = "has_job_enabled")
    private Boolean isJobEnabled;

    @Column(name = "exit_code")
    private String exitCode;

    @Column(name = "error_message", columnDefinition = "TEXT")
    private String errorMessage;

}
