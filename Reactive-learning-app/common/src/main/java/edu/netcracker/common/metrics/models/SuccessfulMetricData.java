package edu.netcracker.common.metrics.models;

import edu.netcracker.common.metrics.microservice.MicroserviceName;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;

@Data
@EqualsAndHashCode(callSuper = true)
@Table("successful_metrics")
public class SuccessfulMetricData extends MetricData {
    @Builder
    public SuccessfulMetricData(Integer id, Instant startTimeOfProcess, Instant endTimeOfProcess, MetricType metricType, MicroserviceName microserviceName) {
        super(id, startTimeOfProcess, endTimeOfProcess, metricType, microserviceName);
    }
}
