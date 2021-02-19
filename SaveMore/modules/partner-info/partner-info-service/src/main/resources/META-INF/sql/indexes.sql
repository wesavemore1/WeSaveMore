create index IX_783C8883 on Partner_Partner (field2);
create index IX_5C7B15CB on Partner_Partner (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_78D4930D on Partner_Partner (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_D93365C4 on Partner_Region (partnetId);
create index IX_8FD11903 on Partner_Region (uuid_[$COLUMN_LENGTH:75$]);