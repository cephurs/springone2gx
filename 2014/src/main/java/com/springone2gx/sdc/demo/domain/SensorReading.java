package com.springone2gx.sdc.demo.domain;

import java.util.Date;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

@Table
public class SensorReading {

	@PrimaryKeyColumn(ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private String sensorId;

	@PrimaryKeyColumn(ordinal = 0)
	private Date timestamp;

	private String data;

	@SuppressWarnings("unused")
	private SensorReading() {}

	public SensorReading(String sensorId, Date time, String data) {
		setSensorId(sensorId);
		setTimestamp(time);
		setData(data);
	}

	public String getSensorId() {
		return sensorId;
	}

	public void setSensorId(String sensorId) {
		this.sensorId = sensorId;
	}

	public Date getTimestamp() {
		return timestamp == null ? null : new Date(timestamp.getTime());
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = (timestamp == null ? null : new Date(timestamp.getTime()));
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
