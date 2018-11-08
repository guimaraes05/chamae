package br.com.chamae.gameEvent.models;

import java.util.Objects;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class GameEvent {
	@Id
	public ObjectId _id;

	public String name;
	public String description;
	public String sportType;
	public String location;
	public Integer minOfPlayers;
	public Integer maxOfPlayers;
	public Boolean isPrivate;

	public GameEvent() {

	}

	/**
	 * @param _id
	 * @param name
	 * @param description
	 * @param sportType
	 * @param location
	 * @param minOfPlayers
	 * @param maxOfPlayers
	 * @param isPrivate
	 */
	public GameEvent(ObjectId _id, String name, String description, String sportType, String location,
			Integer minOfPlayers, Integer maxOfPlayers, Boolean isPrivate) {
		this._id = _id;
		this.name = name;
		this.description = description;
		this.sportType = sportType;
		this.location = location;
		this.minOfPlayers = minOfPlayers;
		this.maxOfPlayers = maxOfPlayers;
		this.isPrivate = isPrivate;
	}

	// ObjectId needs to be converted to string
	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSportType() {
		return sportType;
	}

	public void setSportType(String sportType) {
		this.sportType = sportType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getMinOfPlayers() {
		return minOfPlayers;
	}

	public void setMinOfPlayers(Integer minOfPlayers) {
		this.minOfPlayers = minOfPlayers;
	}

	public Integer getMaxOfPlayers() {
		return maxOfPlayers;
	}

	public void setMaxOfPlayers(Integer maxOfPlayers) {
		this.maxOfPlayers = maxOfPlayers;
	}

	public Boolean getIsPrivate() {
		return isPrivate;
	}

	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(_id, description, isPrivate, location, maxOfPlayers, minOfPlayers, name, sportType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof GameEvent))
			return false;
		GameEvent other = (GameEvent) obj;
		return Objects.equals(_id, other._id) && Objects.equals(description, other.description)
				&& Objects.equals(isPrivate, other.isPrivate) && Objects.equals(location, other.location)
				&& Objects.equals(maxOfPlayers, other.maxOfPlayers) && Objects.equals(minOfPlayers, other.minOfPlayers)
				&& Objects.equals(name, other.name) && Objects.equals(sportType, other.sportType);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GameEvent [_id=" + _id + ", name=" + name + ", description=" + description + ", sportType=" + sportType
				+ ", location=" + location + ", minOfPlayers=" + minOfPlayers + ", maxOfPlayers=" + maxOfPlayers
				+ ", isPrivate=" + isPrivate + "]";
	}
}
