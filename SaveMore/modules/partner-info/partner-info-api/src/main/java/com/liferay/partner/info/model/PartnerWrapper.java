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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Partner}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Partner
 * @generated
 */
public class PartnerWrapper
	extends BaseModelWrapper<Partner>
	implements ModelWrapper<Partner>, Partner {

	public PartnerWrapper(Partner partner) {
		super(partner);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("partnetId", getPartnetId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("partnername", getPartnername());
		attributes.put("licensename", getLicensename());
		attributes.put("countryId", getCountryId());
		attributes.put("companyemail", getCompanyemail());
		attributes.put("companyphone", getCompanyphone());
		attributes.put("companyPO", getCompanyPO());
		attributes.put("businesscategories", getBusinesscategories());
		attributes.put("address", getAddress());
		attributes.put("signatory", getSignatory());
		attributes.put("signatoryphone", getSignatoryphone());
		attributes.put("signatoryemail", getSignatoryemail());
		attributes.put("partnerStatus", getPartnerStatus());
		attributes.put("field1", getField1());
		attributes.put("field2", isField2());
		attributes.put("field3", getField3());
		attributes.put("folderId", getFolderId());
		attributes.put("field5", getField5());
		attributes.put("regionId", getRegionId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long partnetId = (Long)attributes.get("partnetId");

		if (partnetId != null) {
			setPartnetId(partnetId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String partnername = (String)attributes.get("partnername");

		if (partnername != null) {
			setPartnername(partnername);
		}

		String licensename = (String)attributes.get("licensename");

		if (licensename != null) {
			setLicensename(licensename);
		}

		Long countryId = (Long)attributes.get("countryId");

		if (countryId != null) {
			setCountryId(countryId);
		}

		String companyemail = (String)attributes.get("companyemail");

		if (companyemail != null) {
			setCompanyemail(companyemail);
		}

		String companyphone = (String)attributes.get("companyphone");

		if (companyphone != null) {
			setCompanyphone(companyphone);
		}

		String companyPO = (String)attributes.get("companyPO");

		if (companyPO != null) {
			setCompanyPO(companyPO);
		}

		String businesscategories = (String)attributes.get(
			"businesscategories");

		if (businesscategories != null) {
			setBusinesscategories(businesscategories);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String signatory = (String)attributes.get("signatory");

		if (signatory != null) {
			setSignatory(signatory);
		}

		String signatoryphone = (String)attributes.get("signatoryphone");

		if (signatoryphone != null) {
			setSignatoryphone(signatoryphone);
		}

		String signatoryemail = (String)attributes.get("signatoryemail");

		if (signatoryemail != null) {
			setSignatoryemail(signatoryemail);
		}

		String partnerStatus = (String)attributes.get("partnerStatus");

		if (partnerStatus != null) {
			setPartnerStatus(partnerStatus);
		}

		String field1 = (String)attributes.get("field1");

		if (field1 != null) {
			setField1(field1);
		}

		Boolean field2 = (Boolean)attributes.get("field2");

		if (field2 != null) {
			setField2(field2);
		}

		Integer field3 = (Integer)attributes.get("field3");

		if (field3 != null) {
			setField3(field3);
		}

		Long folderId = (Long)attributes.get("folderId");

		if (folderId != null) {
			setFolderId(folderId);
		}

		String field5 = (String)attributes.get("field5");

		if (field5 != null) {
			setField5(field5);
		}

		Long regionId = (Long)attributes.get("regionId");

		if (regionId != null) {
			setRegionId(regionId);
		}
	}

	/**
	 * Returns the address of this partner.
	 *
	 * @return the address of this partner
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the businesscategories of this partner.
	 *
	 * @return the businesscategories of this partner
	 */
	@Override
	public String getBusinesscategories() {
		return model.getBusinesscategories();
	}

	/**
	 * Returns the companyemail of this partner.
	 *
	 * @return the companyemail of this partner
	 */
	@Override
	public String getCompanyemail() {
		return model.getCompanyemail();
	}

	/**
	 * Returns the company ID of this partner.
	 *
	 * @return the company ID of this partner
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the companyphone of this partner.
	 *
	 * @return the companyphone of this partner
	 */
	@Override
	public String getCompanyphone() {
		return model.getCompanyphone();
	}

	/**
	 * Returns the company po of this partner.
	 *
	 * @return the company po of this partner
	 */
	@Override
	public String getCompanyPO() {
		return model.getCompanyPO();
	}

	/**
	 * Returns the country ID of this partner.
	 *
	 * @return the country ID of this partner
	 */
	@Override
	public long getCountryId() {
		return model.getCountryId();
	}

	/**
	 * Returns the create date of this partner.
	 *
	 * @return the create date of this partner
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the field1 of this partner.
	 *
	 * @return the field1 of this partner
	 */
	@Override
	public String getField1() {
		return model.getField1();
	}

	/**
	 * Returns the field2 of this partner.
	 *
	 * @return the field2 of this partner
	 */
	@Override
	public boolean getField2() {
		return model.getField2();
	}

	/**
	 * Returns the field3 of this partner.
	 *
	 * @return the field3 of this partner
	 */
	@Override
	public int getField3() {
		return model.getField3();
	}

	/**
	 * Returns the field5 of this partner.
	 *
	 * @return the field5 of this partner
	 */
	@Override
	public String getField5() {
		return model.getField5();
	}

	/**
	 * Returns the folder ID of this partner.
	 *
	 * @return the folder ID of this partner
	 */
	@Override
	public long getFolderId() {
		return model.getFolderId();
	}

	/**
	 * Returns the group ID of this partner.
	 *
	 * @return the group ID of this partner
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the licensename of this partner.
	 *
	 * @return the licensename of this partner
	 */
	@Override
	public String getLicensename() {
		return model.getLicensename();
	}

	/**
	 * Returns the modified date of this partner.
	 *
	 * @return the modified date of this partner
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the partnername of this partner.
	 *
	 * @return the partnername of this partner
	 */
	@Override
	public String getPartnername() {
		return model.getPartnername();
	}

	/**
	 * Returns the partner status of this partner.
	 *
	 * @return the partner status of this partner
	 */
	@Override
	public String getPartnerStatus() {
		return model.getPartnerStatus();
	}

	/**
	 * Returns the partnet ID of this partner.
	 *
	 * @return the partnet ID of this partner
	 */
	@Override
	public long getPartnetId() {
		return model.getPartnetId();
	}

	/**
	 * Returns the primary key of this partner.
	 *
	 * @return the primary key of this partner
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the region ID of this partner.
	 *
	 * @return the region ID of this partner
	 */
	@Override
	public long getRegionId() {
		return model.getRegionId();
	}

	/**
	 * Returns the signatory of this partner.
	 *
	 * @return the signatory of this partner
	 */
	@Override
	public String getSignatory() {
		return model.getSignatory();
	}

	/**
	 * Returns the signatoryemail of this partner.
	 *
	 * @return the signatoryemail of this partner
	 */
	@Override
	public String getSignatoryemail() {
		return model.getSignatoryemail();
	}

	/**
	 * Returns the signatoryphone of this partner.
	 *
	 * @return the signatoryphone of this partner
	 */
	@Override
	public String getSignatoryphone() {
		return model.getSignatoryphone();
	}

	/**
	 * Returns the user ID of this partner.
	 *
	 * @return the user ID of this partner
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this partner.
	 *
	 * @return the user name of this partner
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this partner.
	 *
	 * @return the user uuid of this partner
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this partner.
	 *
	 * @return the uuid of this partner
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this partner is field2.
	 *
	 * @return <code>true</code> if this partner is field2; <code>false</code> otherwise
	 */
	@Override
	public boolean isField2() {
		return model.isField2();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the address of this partner.
	 *
	 * @param address the address of this partner
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the businesscategories of this partner.
	 *
	 * @param businesscategories the businesscategories of this partner
	 */
	@Override
	public void setBusinesscategories(String businesscategories) {
		model.setBusinesscategories(businesscategories);
	}

	/**
	 * Sets the companyemail of this partner.
	 *
	 * @param companyemail the companyemail of this partner
	 */
	@Override
	public void setCompanyemail(String companyemail) {
		model.setCompanyemail(companyemail);
	}

	/**
	 * Sets the company ID of this partner.
	 *
	 * @param companyId the company ID of this partner
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the companyphone of this partner.
	 *
	 * @param companyphone the companyphone of this partner
	 */
	@Override
	public void setCompanyphone(String companyphone) {
		model.setCompanyphone(companyphone);
	}

	/**
	 * Sets the company po of this partner.
	 *
	 * @param companyPO the company po of this partner
	 */
	@Override
	public void setCompanyPO(String companyPO) {
		model.setCompanyPO(companyPO);
	}

	/**
	 * Sets the country ID of this partner.
	 *
	 * @param countryId the country ID of this partner
	 */
	@Override
	public void setCountryId(long countryId) {
		model.setCountryId(countryId);
	}

	/**
	 * Sets the create date of this partner.
	 *
	 * @param createDate the create date of this partner
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the field1 of this partner.
	 *
	 * @param field1 the field1 of this partner
	 */
	@Override
	public void setField1(String field1) {
		model.setField1(field1);
	}

	/**
	 * Sets whether this partner is field2.
	 *
	 * @param field2 the field2 of this partner
	 */
	@Override
	public void setField2(boolean field2) {
		model.setField2(field2);
	}

	/**
	 * Sets the field3 of this partner.
	 *
	 * @param field3 the field3 of this partner
	 */
	@Override
	public void setField3(int field3) {
		model.setField3(field3);
	}

	/**
	 * Sets the field5 of this partner.
	 *
	 * @param field5 the field5 of this partner
	 */
	@Override
	public void setField5(String field5) {
		model.setField5(field5);
	}

	/**
	 * Sets the folder ID of this partner.
	 *
	 * @param folderId the folder ID of this partner
	 */
	@Override
	public void setFolderId(long folderId) {
		model.setFolderId(folderId);
	}

	/**
	 * Sets the group ID of this partner.
	 *
	 * @param groupId the group ID of this partner
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the licensename of this partner.
	 *
	 * @param licensename the licensename of this partner
	 */
	@Override
	public void setLicensename(String licensename) {
		model.setLicensename(licensename);
	}

	/**
	 * Sets the modified date of this partner.
	 *
	 * @param modifiedDate the modified date of this partner
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the partnername of this partner.
	 *
	 * @param partnername the partnername of this partner
	 */
	@Override
	public void setPartnername(String partnername) {
		model.setPartnername(partnername);
	}

	/**
	 * Sets the partner status of this partner.
	 *
	 * @param partnerStatus the partner status of this partner
	 */
	@Override
	public void setPartnerStatus(String partnerStatus) {
		model.setPartnerStatus(partnerStatus);
	}

	/**
	 * Sets the partnet ID of this partner.
	 *
	 * @param partnetId the partnet ID of this partner
	 */
	@Override
	public void setPartnetId(long partnetId) {
		model.setPartnetId(partnetId);
	}

	/**
	 * Sets the primary key of this partner.
	 *
	 * @param primaryKey the primary key of this partner
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the region ID of this partner.
	 *
	 * @param regionId the region ID of this partner
	 */
	@Override
	public void setRegionId(long regionId) {
		model.setRegionId(regionId);
	}

	/**
	 * Sets the signatory of this partner.
	 *
	 * @param signatory the signatory of this partner
	 */
	@Override
	public void setSignatory(String signatory) {
		model.setSignatory(signatory);
	}

	/**
	 * Sets the signatoryemail of this partner.
	 *
	 * @param signatoryemail the signatoryemail of this partner
	 */
	@Override
	public void setSignatoryemail(String signatoryemail) {
		model.setSignatoryemail(signatoryemail);
	}

	/**
	 * Sets the signatoryphone of this partner.
	 *
	 * @param signatoryphone the signatoryphone of this partner
	 */
	@Override
	public void setSignatoryphone(String signatoryphone) {
		model.setSignatoryphone(signatoryphone);
	}

	/**
	 * Sets the user ID of this partner.
	 *
	 * @param userId the user ID of this partner
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this partner.
	 *
	 * @param userName the user name of this partner
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this partner.
	 *
	 * @param userUuid the user uuid of this partner
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this partner.
	 *
	 * @param uuid the uuid of this partner
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected PartnerWrapper wrap(Partner partner) {
		return new PartnerWrapper(partner);
	}

}