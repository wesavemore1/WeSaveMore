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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RegionSoap implements Serializable {

	public static RegionSoap toSoapModel(Region model) {
		RegionSoap soapModel = new RegionSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setRegionId(model.getRegionId());
		soapModel.setRegion(model.getRegion());
		soapModel.setPartnetId(model.getPartnetId());

		return soapModel;
	}

	public static RegionSoap[] toSoapModels(Region[] models) {
		RegionSoap[] soapModels = new RegionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RegionSoap[][] toSoapModels(Region[][] models) {
		RegionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RegionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RegionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RegionSoap[] toSoapModels(List<Region> models) {
		List<RegionSoap> soapModels = new ArrayList<RegionSoap>(models.size());

		for (Region model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RegionSoap[soapModels.size()]);
	}

	public RegionSoap() {
	}

	public long getPrimaryKey() {
		return _regionId;
	}

	public void setPrimaryKey(long pk) {
		setRegionId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getRegionId() {
		return _regionId;
	}

	public void setRegionId(long regionId) {
		_regionId = regionId;
	}

	public String getRegion() {
		return _region;
	}

	public void setRegion(String region) {
		_region = region;
	}

	public long getPartnetId() {
		return _partnetId;
	}

	public void setPartnetId(long partnetId) {
		_partnetId = partnetId;
	}

	private String _uuid;
	private long _regionId;
	private String _region;
	private long _partnetId;

}