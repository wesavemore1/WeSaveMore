create table Partner_Partner (
	uuid_ VARCHAR(75) null,
	partnetId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	partnername VARCHAR(75) null,
	licensename VARCHAR(75) null,
	countryId LONG,
	companyemail VARCHAR(75) null,
	companyphone VARCHAR(75) null,
	companyPO VARCHAR(75) null,
	businesscategories VARCHAR(75) null,
	address VARCHAR(75) null,
	signatory VARCHAR(75) null,
	signatoryphone VARCHAR(75) null,
	signatoryemail VARCHAR(75) null,
	partnerStatus VARCHAR(75) null,
	field1 VARCHAR(75) null,
	field2 BOOLEAN,
	field3 INTEGER,
	folderId LONG,
	field5 VARCHAR(75) null,
	regionId LONG
);

create table Partner_Region (
	uuid_ VARCHAR(75) null,
	regionId LONG not null primary key,
	region VARCHAR(75) null,
	partnetId LONG
);