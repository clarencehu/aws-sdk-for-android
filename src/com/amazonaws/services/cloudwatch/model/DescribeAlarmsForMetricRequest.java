/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudwatch.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudwatch.AmazonCloudWatch#describeAlarmsForMetric(DescribeAlarmsForMetricRequest) DescribeAlarmsForMetric operation}.
 * 
 *
 * @see com.amazonaws.services.cloudwatch.AmazonCloudWatch#describeAlarmsForMetric(DescribeAlarmsForMetricRequest)
 */
public class DescribeAlarmsForMetricRequest extends AmazonWebServiceRequest {

    private String metricName;

    private String namespace;

    private String statistic;

    private java.util.List<Dimension> dimensions;

    private Integer period;

    private String unit;

    /**
     * Returns the value of the MetricName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The value of the MetricName property for this object.
     */
    public String getMetricName() {
        return metricName;
    }
    
    /**
     * Sets the value of the MetricName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName The new value for the MetricName property for this object.
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }
    
    /**
     * Sets the value of the MetricName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName The new value for the MetricName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAlarmsForMetricRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    
    
    /**
     * Returns the value of the Namespace property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @return The value of the Namespace property for this object.
     */
    public String getNamespace() {
        return namespace;
    }
    
    /**
     * Sets the value of the Namespace property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace The new value for the Namespace property for this object.
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
    /**
     * Sets the value of the Namespace property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace The new value for the Namespace property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAlarmsForMetricRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    
    
    /**
     * Returns the value of the Statistic property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SampleCount, Average, Sum, Minimum, Maximum
     *
     * @return The value of the Statistic property for this object.
     *
     * @see Statistic
     */
    public String getStatistic() {
        return statistic;
    }
    
    /**
     * Sets the value of the Statistic property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SampleCount, Average, Sum, Minimum, Maximum
     *
     * @param statistic The new value for the Statistic property for this object.
     *
     * @see Statistic
     */
    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }
    
    /**
     * Sets the value of the Statistic property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SampleCount, Average, Sum, Minimum, Maximum
     *
     * @param statistic The new value for the Statistic property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see Statistic
     */
    public DescribeAlarmsForMetricRequest withStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }
    
    
    /**
     * Returns the value of the Dimensions property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return The value of the Dimensions property for this object.
     */
    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new java.util.ArrayList<Dimension>();
        }
        return dimensions;
    }
    
    /**
     * Sets the value of the Dimensions property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions The new value for the Dimensions property for this object.
     */
    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        java.util.List<Dimension> dimensionsCopy = new java.util.ArrayList<Dimension>();
        if (dimensions != null) {
            dimensionsCopy.addAll(dimensions);
        }
        this.dimensions = dimensionsCopy;
    }
    
    /**
     * Sets the value of the Dimensions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions The new value for the Dimensions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAlarmsForMetricRequest withDimensions(Dimension... dimensions) {
        for (Dimension value : dimensions) {
            getDimensions().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Dimensions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions The new value for the Dimensions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAlarmsForMetricRequest withDimensions(java.util.Collection<Dimension> dimensions) {
        java.util.List<Dimension> dimensionsCopy = new java.util.ArrayList<Dimension>();
        if (dimensions != null) {
            dimensionsCopy.addAll(dimensions);
        }
        this.dimensions = dimensionsCopy;

        return this;
    }
    
    /**
     * Returns the value of the Period property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @return The value of the Period property for this object.
     */
    public Integer getPeriod() {
        return period;
    }
    
    /**
     * Sets the value of the Period property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @param period The new value for the Period property for this object.
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }
    
    /**
     * Sets the value of the Period property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @param period The new value for the Period property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAlarmsForMetricRequest withPeriod(Integer period) {
        this.period = period;
        return this;
    }
    
    
    /**
     * Returns the value of the Unit property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @return The value of the Unit property for this object.
     *
     * @see StandardUnit
     */
    public String getUnit() {
        return unit;
    }
    
    /**
     * Sets the value of the Unit property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @param unit The new value for the Unit property for this object.
     *
     * @see StandardUnit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    /**
     * Sets the value of the Unit property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @param unit The new value for the Unit property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see StandardUnit
     */
    public DescribeAlarmsForMetricRequest withUnit(String unit) {
        this.unit = unit;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("MetricName: " + metricName + ", ");
        sb.append("Namespace: " + namespace + ", ");
        sb.append("Statistic: " + statistic + ", ");
        sb.append("Dimensions: " + dimensions + ", ");
        sb.append("Period: " + period + ", ");
        sb.append("Unit: " + unit + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    