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

import com.liferay.partner.info.model.Partner;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Partner in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PartnerCacheModel implements CacheModel<Partner>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PartnerCacheModel)) {
			return false;
		}

		PartnerCacheModel partnerCacheModel = (PartnerCacheModel)object;

		if (partnetId == partnerCacheModel.partnetId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, partnetId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", partnetId=");
		sb.append(partnetId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", partnername=");
		sb.append(partnername);
		sb.append(", licensename=");
		sb.append(licensename);
		sb.append(", countryId=");
		sb.append(countryId);
		sb.append(", companyemail=");
		sb.append(companyemail);
		sb.append(", companyphone=");
		sb.append(companyphone);
		sb.append(", companyPO=");
		sb.append(companyPO);
		sb.append(", businesscategories=");
		sb.append(businesscategories);
		sb.append(", address=");
		sb.append(address);
		sb.append(", signatory=");
		sb.append(signatory);
		sb.append(", signatoryphone=");
		sb.append(signatoryphone);
		sb.append(", signatoryemail=");
		sb.append(signatoryemail);
		sb.append(", partnerStatus=");
		sb.append(partnerStatus);
		sb.append(", field1=");
		sb.append(field1);
		sb.append(", field2=");
		sb.append(field2);
		sb.append(", field3=");
		sb.append(field3);
		sb.append(", folderId=");
		sb.append(folderId);
		sb.append(", field5=");
		sb.append(field5);
		sb.append(", regionId=");
		sb.append(regionId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Partner toEntityModel() {
		PartnerImpl partnerImpl = new PartnerImpl();

		if (uuid == null) {
			partnerImpl.setUuid("");
		}
		else {
			partnerImpl.setUuid(uuid);
		}

		partnerImpl.setPartnetId(partnetId);
		partnerImpl.setGroupId(groupId);
		partnerImpl.setCompanyId(companyId);
		partnerImpl.setUserId(userId);

		if (userName == null) {
			partnerImpl.setUserName("");
		}
		else {
			partnerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			partnerImpl.setCreateDate(null);
		}
		else {
			partnerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			partnerImpl.setModifiedDate(null);
		}
		else {
			partnerImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (partnername == null) {
			partnerImpl.setPartnername("");
		}
		else {
			partnerImpl.setPartnername(partnername);
		}

		if (licensename == null) {
			partnerImpl.setLicensename("");
		}
		else {
			partnerImpl.setLicensename(licensename);
		}

		partnerImpl.setCountryId(countryId);

		if (companyemail == null) {
			partnerImpl.setCompanyemail("");
		}
		else {
			partnerImpl.setCompanyemail(companyemail);
		}

		if (companyphone == null) {
			partnerImpl.setCompanyphone("");
		}
		else {
			partnerImpl.setCompanyphone(companyphone);
		}

		if (companyPO == null) {
			partnerImpl.setCompanyPO("");
		}
		else {
			partnerImpl.setCompanyPO(companyPO);
		}

		if (businesscategories == null) {
			partnerImpl.setBusinesscategories("");
		}
		else {
			partnerImpl.setBusinesscategories(businesscategories);
		}

		if (address == null) {
			partnerImpl.setAddress("");
		}
		else {
			partnerImpl.setAddress(address);
		}

		if (signatory == null) {
			partnerImpl.setSignatory("");
		}
		else {
			partnerImpl.setSignatory(signatory);
		}

		if (signatoryphone == null) {
			partnerImpl.setSignatoryphone("");
		}
		else {
			partnerImpl.setSignatoryphone(signatoryphone);
		}

		if (signatoryemail == null) {
			partnerImpl.setSignatoryemail("");
		}
		else {
			partnerImpl.setSignatoryemail(signatoryemail);
		}

		if (partnerStatus == null) {
			partnerImpl.setPartnerStatus("");
		}
		else {
			partnerImpl.setPartnerStatus(partnerStatus);
		}

		if (field1 == null) {
			partnerImpl.setField1("");
		}
		else {
			partnerImpl.setField1(field1);
		}

		partnerImpl.setField2(field2);
		partnerImpl.setField3(field3);
		partnerImpl.setFolderId(folderId);

		if (field5 == null) {
			partnerImpl.setField5("");
		}
		else {
			partnerImpl.setField5(field5);
		}

		partnerImpl.setRegionId(regionId);

		partnerImpl.resetOriginalValues();

		return partnerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		partnetId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		partnername = objectInput.readUTF();
		licensename = objectInput.readUTF();

		countryId = objectInput.readLong();
		companyemail = objectInput.readUTF();
		companyphone = objectInput.readUTF();
		companyPO = objectInput.readUTF();
		businesscategories = objectInput.readUTF();
		address = objectInput.readUTF();
		signatory = objectInput.readUTF();
		signatoryphone = objectInput.readUTF();
		signatoryemail = objectInput.readUTF();
		partnerStatus = objectInput.readUTF();
		field1 = objectInput.readUTF();

		field2 = objectInput.readBoolean();

		field3 = objectInput.readInt();

		folderId = objectInput.readLong();
		field5 = objectInput.readUTF();

		regionId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(partnetId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (partnername == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(partnername);
		}

		if (licensename == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licensename);
		}

		objectOutput.writeLong(countryId);

		if (companyemail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyemail);
		}

		if (companyphone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyphone);
		}

		if (companyPO == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyPO);
		}

		if (businesscategories == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(businesscategories);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (signatory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signatory);
		}

		if (signatoryphone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signatoryphone);
		}

		if (signatoryemail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signatoryemail);
		}

		if (partnerStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(partnerStatus);
		}

		if (field1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(field1);
		}

		objectOutput.writeBoolean(field2);

		objectOutput.writeInt(field3);

		objectOutput.writeLong(folderId);

		if (field5 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(field5);
		}

		objectOutput.writeLong(regionId);
	}

	public String uuid;
	public long partnetId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String partnername;
	public String licensename;
	public long countryId;
	public String companyemail;
	public String companyphone;
	public String companyPO;
	public String businesscategories;
	public String address;
	public String signatory;
	public String signatoryphone;
	public String signatoryemail;
	public String partnerStatus;
	public String field1;
	public boolean field2;
	public int field3;
	public long folderId;
	public String field5;
	public long regionId;

}