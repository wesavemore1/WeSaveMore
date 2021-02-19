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

package com.liferay.partner.info.service.persistence;

import com.liferay.partner.info.exception.NoSuchPartnerException;
import com.liferay.partner.info.model.Partner;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the partner service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PartnerUtil
 * @generated
 */
@ProviderType
public interface PartnerPersistence extends BasePersistence<Partner> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PartnerUtil} to access the partner persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the partners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching partners
	 */
	public java.util.List<Partner> findByUuid(String uuid);

	/**
	 * Returns a range of all the partners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PartnerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of partners
	 * @param end the upper bound of the range of partners (not inclusive)
	 * @return the range of matching partners
	 */
	public java.util.List<Partner> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the partners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PartnerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of partners
	 * @param end the upper bound of the range of partners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching partners
	 */
	public java.util.List<Partner> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Partner>
			orderByComparator);

	/**
	 * Returns an ordered range of all the partners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PartnerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of partners
	 * @param end the upper bound of the range of partners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching partners
	 */
	public java.util.List<Partner> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Partner>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first partner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching partner
	 * @throws NoSuchPartnerException if a matching partner could not be found
	 */
	public Partner findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Partner>
				orderByComparator)
		throws NoSuchPartnerException;

	/**
	 * Returns the first partner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching partner, or <code>null</code> if a matching partner could not be found
	 */
	public Partner fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Partner>
			orderByComparator);

	/**
	 * Returns the last partner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching partner
	 * @throws NoSuchPartnerException if a matching partner could not be found
	 */
	public Partner findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Partner>
				orderByComparator)
		throws NoSuchPartnerException;

	/**
	 * Returns the last partner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching partner, or <code>null</code> if a matching partner could not be found
	 */
	public Partner fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Partner>
			orderByComparator);

	/**
	 * Returns the partners before and after the current partner in the ordered set where uuid = &#63;.
	 *
	 * @param partnetId the primary key of the current partner
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next partner
	 * @throws NoSuchPartnerException if a partner with the primary key could not be found
	 */
	public Partner[] findByUuid_PrevAndNext(
			long partnetId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Partner>
				orderByComparator)
		throws NoSuchPartnerException;

	/**
	 * Removes all the partners where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of partners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching partners
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the partner where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchPartnerException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching partner
	 * @throws NoSuchPartnerException if a matching partner could not be found
	 */
	public Partner findByUUID_G(String uuid, long groupId)
		throws NoSuchPartnerException;

	/**
	 * Returns the partner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching partner, or <code>null</code> if a matching partner could not be found
	 */
	public Partner fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the partner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching partner, or <code>null</code> if a matching partner could not be found
	 */
	public Partner fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the partner where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the partner that was removed
	 */
	public Partner removeByUUID_G(String uuid, long groupId)
		throws NoSuchPartnerException;

	/**
	 * Returns the number of partners where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching partners
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the partners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching partners
	 */
	public java.util.List<Partner> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the partners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PartnerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of partners
	 * @param end the upper bound of the range of partners (not inclusive)
	 * @return the range of matching partners
	 */
	public java.util.List<Partner> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the partners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PartnerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of partners
	 * @param end the upper bound of the range of partners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching partners
	 */
	public java.util.List<Partner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Partner>
			orderByComparator);

	/**
	 * Returns an ordered range of all the partners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PartnerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of partners
	 * @param end the upper bound of the range of partners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching partners
	 */
	public java.util.List<Partner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Partner>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first partner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching partner
	 * @throws NoSuchPartnerException if a matching partner could not be found
	 */
	public Partner findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Partner>
				orderByComparator)
		throws NoSuchPartnerException;

	/**
	 * Returns the first partner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching partner, or <code>null</code> if a matching partner could not be found
	 */
	public Partner fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Partner>
			orderByComparator);

	/**
	 * Returns the last partner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching partner
	 * @throws NoSuchPartnerException if a matching partner could not be found
	 */
	public Partner findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Partner>
				orderByComparator)
		throws NoSuchPartnerException;

	/**
	 * Returns the last partner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching partner, or <code>null</code> if a matching partner could not be found
	 */
	public Partner fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Partner>
			orderByComparator);

	/**
	 * Returns the partners before and after the current partner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param partnetId the primary key of the current partner
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next partner
	 * @throws NoSuchPartnerException if a partner with the primary key could not be found
	 */
	public Partner[] findByUuid_C_PrevAndNext(
			long partnetId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Partner>
				orderByComparator)
		throws NoSuchPartnerException;

	/**
	 * Removes all the partners where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of partners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching partners
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the partners where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the matching partners
	 */
	public java.util.List<Partner> findByField2(boolean field2);

	/**
	 * Returns a range of all the partners where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PartnerModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of partners
	 * @param end the upper bound of the range of partners (not inclusive)
	 * @return the range of matching partners
	 */
	public java.util.List<Partner> findByField2(
		boolean field2, int start, int end);

	/**
	 * Returns an ordered range of all the partners where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PartnerModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of partners
	 * @param end the upper bound of the range of partners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching partners
	 */
	public java.util.List<Partner> findByField2(
		boolean field2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Partner>
			orderByComparator);

	/**
	 * Returns an ordered range of all the partners where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PartnerModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of partners
	 * @param end the upper bound of the range of partners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching partners
	 */
	public java.util.List<Partner> findByField2(
		boolean field2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Partner>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first partner in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching partner
	 * @throws NoSuchPartnerException if a matching partner could not be found
	 */
	public Partner findByField2_First(
			boolean field2,
			com.liferay.portal.kernel.util.OrderByComparator<Partner>
				orderByComparator)
		throws NoSuchPartnerException;

	/**
	 * Returns the first partner in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching partner, or <code>null</code> if a matching partner could not be found
	 */
	public Partner fetchByField2_First(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Partner>
			orderByComparator);

	/**
	 * Returns the last partner in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching partner
	 * @throws NoSuchPartnerException if a matching partner could not be found
	 */
	public Partner findByField2_Last(
			boolean field2,
			com.liferay.portal.kernel.util.OrderByComparator<Partner>
				orderByComparator)
		throws NoSuchPartnerException;

	/**
	 * Returns the last partner in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching partner, or <code>null</code> if a matching partner could not be found
	 */
	public Partner fetchByField2_Last(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Partner>
			orderByComparator);

	/**
	 * Returns the partners before and after the current partner in the ordered set where field2 = &#63;.
	 *
	 * @param partnetId the primary key of the current partner
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next partner
	 * @throws NoSuchPartnerException if a partner with the primary key could not be found
	 */
	public Partner[] findByField2_PrevAndNext(
			long partnetId, boolean field2,
			com.liferay.portal.kernel.util.OrderByComparator<Partner>
				orderByComparator)
		throws NoSuchPartnerException;

	/**
	 * Removes all the partners where field2 = &#63; from the database.
	 *
	 * @param field2 the field2
	 */
	public void removeByField2(boolean field2);

	/**
	 * Returns the number of partners where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the number of matching partners
	 */
	public int countByField2(boolean field2);

	/**
	 * Caches the partner in the entity cache if it is enabled.
	 *
	 * @param partner the partner
	 */
	public void cacheResult(Partner partner);

	/**
	 * Caches the partners in the entity cache if it is enabled.
	 *
	 * @param partners the partners
	 */
	public void cacheResult(java.util.List<Partner> partners);

	/**
	 * Creates a new partner with the primary key. Does not add the partner to the database.
	 *
	 * @param partnetId the primary key for the new partner
	 * @return the new partner
	 */
	public Partner create(long partnetId);

	/**
	 * Removes the partner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param partnetId the primary key of the partner
	 * @return the partner that was removed
	 * @throws NoSuchPartnerException if a partner with the primary key could not be found
	 */
	public Partner remove(long partnetId) throws NoSuchPartnerException;

	public Partner updateImpl(Partner partner);

	/**
	 * Returns the partner with the primary key or throws a <code>NoSuchPartnerException</code> if it could not be found.
	 *
	 * @param partnetId the primary key of the partner
	 * @return the partner
	 * @throws NoSuchPartnerException if a partner with the primary key could not be found
	 */
	public Partner findByPrimaryKey(long partnetId)
		throws NoSuchPartnerException;

	/**
	 * Returns the partner with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param partnetId the primary key of the partner
	 * @return the partner, or <code>null</code> if a partner with the primary key could not be found
	 */
	public Partner fetchByPrimaryKey(long partnetId);

	/**
	 * Returns all the partners.
	 *
	 * @return the partners
	 */
	public java.util.List<Partner> findAll();

	/**
	 * Returns a range of all the partners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PartnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of partners
	 * @param end the upper bound of the range of partners (not inclusive)
	 * @return the range of partners
	 */
	public java.util.List<Partner> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the partners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PartnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of partners
	 * @param end the upper bound of the range of partners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of partners
	 */
	public java.util.List<Partner> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Partner>
			orderByComparator);

	/**
	 * Returns an ordered range of all the partners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PartnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of partners
	 * @param end the upper bound of the range of partners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of partners
	 */
	public java.util.List<Partner> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Partner>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the partners from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of partners.
	 *
	 * @return the number of partners
	 */
	public int countAll();

}