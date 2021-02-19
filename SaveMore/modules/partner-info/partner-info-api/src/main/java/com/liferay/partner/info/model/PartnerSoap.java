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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class PartnerSoap implements Serializable {

	public static PartnerSoap toSoapModel(Partner model) {
		PartnerSoap soapModel = new PartnerSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setPartnetId(model.getPartnetId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPartnername(model.getPartnername());
		soapModel.setLicensename(model.getLicensename());
		soapModel.setCountryId(model.getCountryId());
		soapModel.setCompanyemail(model.getCompanyemail());
		soapModel.setCompanyphone(model.getCompanyphone());
		soapModel.setCompanyPO(model.getCompanyPO());
		soapModel.setBusinesscategories(model.getBusinesscategories());
		soapModel.setAddress(model.getAddress());
		soapModel.setSignatory(model.getSignatory());
		soapModel.setSignatoryphone(model.getSignatoryphone());
		soapModel.setSignatoryemail(model.getSignatoryemail());
		soapModel.setPartnerStatus(model.getPartnerStatus());
		soapModel.setField1(model.getField1());
		soapModel.setField2(model.isField2());
		soapModel.setField3(model.getField3());
		soapModel.setFolderId(model.getFolderId());
		soapModel.setField5(model.getField5());
		soapModel.setRegionId(model.getRegionId());

		return soapModel;
	}

	public static PartnerSoap[] toSoapModels(Partner[] models) {
		PartnerSoap[] soapModels = new PartnerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PartnerSoap[][] toSoapModels(Partner[][] models) {
		PartnerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PartnerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PartnerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PartnerSoap[] toSoapModels(List<Partner> models) {
		List<PartnerSoap> soapModels = new ArrayList<PartnerSoap>(
			models.size());

		for (Partner model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PartnerSoap[soapModels.size()]);
	}

	public PartnerSoap() {
	}

	public long getPrimaryKey() {
		return _partnetId;
	}

	public void setPrimaryKey(long pk) {
		setPartnetId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getPartnetId() {
		return _partnetId;
	}

	public void setPartnetId(long partnetId) {
		_partnetId = partnetId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getPartnername() {
		return _partnername;
	}

	public void setPartnername(String partnername) {
		_partnername = partnername;
	}

	public String getLicensename() {
		return _licensename;
	}

	public void setLicensename(String licensename) {
		_licensename = licensename;
	}

	public long getCountryId() {
		return _countryId;
	}

	public void setCountryId(long countryId) {
		_countryId = countryId;
	}

	public String getCompanyemail() {
		return _companyemail;
	}

	public void setCompanyemail(String companyemail) {
		_companyemail = companyemail;
	}

	public String getCompanyphone() {
		return _companyphone;
	}

	public void setCompanyphone(String companyphone) {
		_companyphone = companyphone;
	}

	public String getCompanyPO() {
		return _companyPO;
	}

	public void setCompanyPO(String companyPO) {
		_companyPO = companyPO;
	}

	public String getBusinesscategories() {
		return _businesscategories;
	}

	public void setBusinesscategories(String businesscategories) {
		_businesscategories = businesscategories;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getSignatory() {
		return _signatory;
	}

	public void setSignatory(String signatory) {
		_signatory = signatory;
	}

	public String getSignatoryphone() {
		return _signatoryphone;
	}

	public void setSignatoryphone(String signatoryphone) {
		_signatoryphone = signatoryphone;
	}

	public String getSignatoryemail() {
		return _signatoryemail;
	}

	public void setSignatoryemail(String signatoryemail) {
		_signatoryemail = signatoryemail;
	}

	public String getPartnerStatus() {
		return _partnerStatus;
	}

	public void setPartnerStatus(String partnerStatus) {
		_partnerStatus = partnerStatus;
	}

	public String getField1() {
		return _field1;
	}

	public void setField1(String field1) {
		_field1 = field1;
	}

	public boolean getField2() {
		return _field2;
	}

	public boolean isField2() {
		return _field2;
	}

	public void setField2(boolean field2) {
		_field2 = field2;
	}

	public int getField3() {
		return _field3;
	}

	public void setField3(int field3) {
		_field3 = field3;
	}

	public long getFolderId() {
		return _folderId;
	}

	public void setFolderId(long folderId) {
		_folderId = folderId;
	}

	public String getField5() {
		return _field5;
	}

	public void setField5(String field5) {
		_field5 = field5;
	}

	public long getRegionId() {
		return _regionId;
	}

	public void setRegionId(long regionId) {
		_regionId = regionId;
	}

	private String _uuid;
	private long _partnetId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _partnername;
	private String _licensename;
	private long _countryId;
	private String _companyemail;
	private String _companyphone;
	private String _companyPO;
	private String _businesscategories;
	private String _address;
	private String _signatory;
	private String _signatoryphone;
	private String _signatoryemail;
	private String _partnerStatus;
	private String _field1;
	private boolean _field2;
	private int _field3;
	private long _folderId;
	private String _field5;
	private long _regionId;

}