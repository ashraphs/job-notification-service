package com.tng.abt.jobnotificationservice.repositories;

import com.tng.abt.jobnotificationservice.entities.JobConfiguration;

public interface JobConfigurationRepository extends MasterEntityRepository<JobConfiguration> {

    JobConfiguration findByIsEnableTrueAndJobName(String jobName);

}
