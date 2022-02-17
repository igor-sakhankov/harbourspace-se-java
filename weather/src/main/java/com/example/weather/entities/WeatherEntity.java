package com.example.weather.entities;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "weather")
public class WeatherEntity {

    public WeatherEntity(String latitude, String longitude, String summary, String newFieldShouldNotBeVisibleToTheUser) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.summary = summary;
        this.newFieldShouldNotBeVisibleToTheUser = newFieldShouldNotBeVisibleToTheUser;
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column
    private String latitude;

    @Column
    private String longitude;

    @Column
    private String summary;

    @Column
    private String newFieldShouldNotBeVisibleToTheUser;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WeatherEntity)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        WeatherEntity that = (WeatherEntity) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getLatitude(), that.getLatitude())
            && Objects.equals(getLongitude(), that.getLongitude()) && Objects.equals(getSummary(), that.getSummary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getLatitude(), getLongitude(), getSummary());
    }

    @Override
    public String toString() {
        return "WeatherEntity{" + "super=" + super.toString() + "id=" + id + ", latitude='" + latitude + '\''
            + ", longitude='" + longitude + '\'' + ", summary='" + summary + '\'' + '}';
    }
}
