/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.partner.info.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Region}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Region
 * @generated
 */
public class RegionWrapper
	extends BaseModelWrapper<Region> implements ModelWrapper<Region>, Region {

	public RegionWrapper(Region region) {
		super(region);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("regionId", getRegionId());
		attributes.put("region", getRegion());
		attributes.put("partnetId", getPartnetId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long regionId = (Long)attributes.get("regionId");

		if (regionId != null) {
			setRegionId(regionId);
		}

		String region = (String)attributes.get("region");

		if (region != null) {
			setRegion(region);
		}

		Long partnetId = (Long)attributes.get("partnetId");

		if (partnetId != null) {
			setPartnetId(partnetId);
		}
	}

	/**
	 * Returns the partnet ID of this region.
	 *
	 * @return the partnet ID of this region
	 */
	@Override
	public long getPartnetId() {
		return model.getPartnetId();
	}

	/**
	 * Returns the primary key of this region.
	 *
	 * @return the primary key of this region
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the region of this region.
	 *
	 * @return the region of this region
	 */
	@Override
	public String getRegion() {
		return model.getRegion();
	}

	/**
	 * Returns the region ID of this region.
	 *
	 * @return the region ID of this region
	 */
	@Override
	public long getRegionId() {
		return model.getRegionId();
	}

	/**
	 * Returns the uuid of this region.
	 *
	 * @return the uuid of this region
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the partnet ID of this region.
	 *
	 * @param partnetId the partnet ID of this region
	 */
	@Override
	public void setPartnetId(long partnetId) {
		model.setPartnetId(partnetId);
	}

	/**
	 * Sets the primary key of this region.
	 *
	 * @param primaryKey the primary key of this region
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the region of this region.
	 *
	 * @param region the region of this region
	 */
	@Override
	public void setRegion(String region) {
		model.setRegion(region);
	}

	/**
	 * Sets the region ID of this region.
	 *
	 * @param regionId the region ID of this region
	 */
	@Override
	public void setRegionId(long regionId) {
		model.setRegionId(regionId);
	}

	/**
	 * Sets the uuid of this region.
	 *
	 * @param uuid the uuid of this region
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected RegionWrapper wrap(Region region) {
		return new RegionWrapper(region);
	}

}