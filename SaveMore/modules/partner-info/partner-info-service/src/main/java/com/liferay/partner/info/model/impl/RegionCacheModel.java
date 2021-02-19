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

package com.liferay.partner.info.model.impl;

import com.liferay.partner.info.model.Region;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Region in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RegionCacheModel implements CacheModel<Region>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RegionCacheModel)) {
			return false;
		}

		RegionCacheModel regionCacheModel = (RegionCacheModel)object;

		if (regionId == regionCacheModel.regionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, regionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", regionId=");
		sb.append(regionId);
		sb.append(", region=");
		sb.append(region);
		sb.append(", partnetId=");
		sb.append(partnetId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Region toEntityModel() {
		RegionImpl regionImpl = new RegionImpl();

		if (uuid == null) {
			regionImpl.setUuid("");
		}
		else {
			regionImpl.setUuid(uuid);
		}

		regionImpl.setRegionId(regionId);

		if (region == null) {
			regionImpl.setRegion("");
		}
		else {
			regionImpl.setRegion(region);
		}

		regionImpl.setPartnetId(partnetId);

		regionImpl.resetOriginalValues();

		return regionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		regionId = objectInput.readLong();
		region = objectInput.readUTF();

		partnetId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(regionId);

		if (region == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(region);
		}

		objectOutput.writeLong(partnetId);
	}

	public String uuid;
	public long regionId;
	public String region;
	public long partnetId;

}