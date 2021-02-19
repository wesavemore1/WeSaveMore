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

import com.liferay.partner.info.model.Region;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the region service. This utility wraps <code>com.liferay.partner.info.service.persistence.impl.RegionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegionPersistence
 * @generated
 */
public class RegionUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Region region) {
		getPersistence().clearCache(region);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Region> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Region> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Region> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Region> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Region> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Region update(Region region) {
		return getPersistence().update(region);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Region update(Region region, ServiceContext serviceContext) {
		return getPersistence().update(region, serviceContext);
	}

	/**
	 * Returns all the regions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching regions
	 */
	public static List<Region> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the regions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of regions
	 * @param end the upper bound of the range of regions (not inclusive)
	 * @return the range of matching regions
	 */
	public static List<Region> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the regions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of regions
	 * @param end the upper bound of the range of regions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching regions
	 */
	public static List<Region> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Region> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the regions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of regions
	 * @param end the upper bound of the range of regions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching regions
	 */
	public static List<Region> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Region> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first region in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching region
	 * @throws NoSuchRegionException if a matching region could not be found
	 */
	public static Region findByUuid_First(
			String uuid, OrderByComparator<Region> orderByComparator)
		throws com.liferay.partner.info.exception.NoSuchRegionException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first region in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching region, or <code>null</code> if a matching region could not be found
	 */
	public static Region fetchByUuid_First(
		String uuid, OrderByComparator<Region> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last region in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching region
	 * @throws NoSuchRegionException if a matching region could not be found
	 */
	public static Region findByUuid_Last(
			String uuid, OrderByComparator<Region> orderByComparator)
		throws com.liferay.partner.info.exception.NoSuchRegionException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last region in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching region, or <code>null</code> if a matching region could not be found
	 */
	public static Region fetchByUuid_Last(
		String uuid, OrderByComparator<Region> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the regions before and after the current region in the ordered set where uuid = &#63;.
	 *
	 * @param regionId the primary key of the current region
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next region
	 * @throws NoSuchRegionException if a region with the primary key could not be found
	 */
	public static Region[] findByUuid_PrevAndNext(
			long regionId, String uuid,
			OrderByComparator<Region> orderByComparator)
		throws com.liferay.partner.info.exception.NoSuchRegionException {

		return getPersistence().findByUuid_PrevAndNext(
			regionId, uuid, orderByComparator);
	}

	/**
	 * Removes all the regions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of regions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching regions
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the regions where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @return the matching regions
	 */
	public static List<Region> findByregionId(long regionId) {
		return getPersistence().findByregionId(regionId);
	}

	/**
	 * Returns a range of all the regions where regionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegionModelImpl</code>.
	 * </p>
	 *
	 * @param regionId the region ID
	 * @param start the lower bound of the range of regions
	 * @param end the upper bound of the range of regions (not inclusive)
	 * @return the range of matching regions
	 */
	public static List<Region> findByregionId(
		long regionId, int start, int end) {

		return getPersistence().findByregionId(regionId, start, end);
	}

	/**
	 * Returns an ordered range of all the regions where regionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegionModelImpl</code>.
	 * </p>
	 *
	 * @param regionId the region ID
	 * @param start the lower bound of the range of regions
	 * @param end the upper bound of the range of regions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching regions
	 */
	public static List<Region> findByregionId(
		long regionId, int start, int end,
		OrderByComparator<Region> orderByComparator) {

		return getPersistence().findByregionId(
			regionId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the regions where regionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegionModelImpl</code>.
	 * </p>
	 *
	 * @param regionId the region ID
	 * @param start the lower bound of the range of regions
	 * @param end the upper bound of the range of regions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching regions
	 */
	public static List<Region> findByregionId(
		long regionId, int start, int end,
		OrderByComparator<Region> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByregionId(
			regionId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first region in the ordered set where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching region
	 * @throws NoSuchRegionException if a matching region could not be found
	 */
	public static Region findByregionId_First(
			long regionId, OrderByComparator<Region> orderByComparator)
		throws com.liferay.partner.info.exception.NoSuchRegionException {

		return getPersistence().findByregionId_First(
			regionId, orderByComparator);
	}

	/**
	 * Returns the first region in the ordered set where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching region, or <code>null</code> if a matching region could not be found
	 */
	public static Region fetchByregionId_First(
		long regionId, OrderByComparator<Region> orderByComparator) {

		return getPersistence().fetchByregionId_First(
			regionId, orderByComparator);
	}

	/**
	 * Returns the last region in the ordered set where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching region
	 * @throws NoSuchRegionException if a matching region could not be found
	 */
	public static Region findByregionId_Last(
			long regionId, OrderByComparator<Region> orderByComparator)
		throws com.liferay.partner.info.exception.NoSuchRegionException {

		return getPersistence().findByregionId_Last(
			regionId, orderByComparator);
	}

	/**
	 * Returns the last region in the ordered set where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching region, or <code>null</code> if a matching region could not be found
	 */
	public static Region fetchByregionId_Last(
		long regionId, OrderByComparator<Region> orderByComparator) {

		return getPersistence().fetchByregionId_Last(
			regionId, orderByComparator);
	}

	/**
	 * Removes all the regions where regionId = &#63; from the database.
	 *
	 * @param regionId the region ID
	 */
	public static void removeByregionId(long regionId) {
		getPersistence().removeByregionId(regionId);
	}

	/**
	 * Returns the number of regions where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @return the number of matching regions
	 */
	public static int countByregionId(long regionId) {
		return getPersistence().countByregionId(regionId);
	}

	/**
	 * Returns all the regions where partnetId = &#63;.
	 *
	 * @param partnetId the partnet ID
	 * @return the matching regions
	 */
	public static List<Region> findBypartnetId(long partnetId) {
		return getPersistence().findBypartnetId(partnetId);
	}

	/**
	 * Returns a range of all the regions where partnetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegionModelImpl</code>.
	 * </p>
	 *
	 * @param partnetId the partnet ID
	 * @param start the lower bound of the range of regions
	 * @param end the upper bound of the range of regions (not inclusive)
	 * @return the range of matching regions
	 */
	public static List<Region> findBypartnetId(
		long partnetId, int start, int end) {

		return getPersistence().findBypartnetId(partnetId, start, end);
	}

	/**
	 * Returns an ordered range of all the regions where partnetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegionModelImpl</code>.
	 * </p>
	 *
	 * @param partnetId the partnet ID
	 * @param start the lower bound of the range of regions
	 * @param end the upper bound of the range of regions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching regions
	 */
	public static List<Region> findBypartnetId(
		long partnetId, int start, int end,
		OrderByComparator<Region> orderByComparator) {

		return getPersistence().findBypartnetId(
			partnetId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the regions where partnetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegionModelImpl</code>.
	 * </p>
	 *
	 * @param partnetId the partnet ID
	 * @param start the lower bound of the range of regions
	 * @param end the upper bound of the range of regions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching regions
	 */
	public static List<Region> findBypartnetId(
		long partnetId, int start, int end,
		OrderByComparator<Region> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBypartnetId(
			partnetId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first region in the ordered set where partnetId = &#63;.
	 *
	 * @param partnetId the partnet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching region
	 * @throws NoSuchRegionException if a matching region could not be found
	 */
	public static Region findBypartnetId_First(
			long partnetId, OrderByComparator<Region> orderByComparator)
		throws com.liferay.partner.info.exception.NoSuchRegionException {

		return getPersistence().findBypartnetId_First(
			partnetId, orderByComparator);
	}

	/**
	 * Returns the first region in the ordered set where partnetId = &#63;.
	 *
	 * @param partnetId the partnet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching region, or <code>null</code> if a matching region could not be found
	 */
	public static Region fetchBypartnetId_First(
		long partnetId, OrderByComparator<Region> orderByComparator) {

		return getPersistence().fetchBypartnetId_First(
			partnetId, orderByComparator);
	}

	/**
	 * Returns the last region in the ordered set where partnetId = &#63;.
	 *
	 * @param partnetId the partnet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching region
	 * @throws NoSuchRegionException if a matching region could not be found
	 */
	public static Region findBypartnetId_Last(
			long partnetId, OrderByComparator<Region> orderByComparator)
		throws com.liferay.partner.info.exception.NoSuchRegionException {

		return getPersistence().findBypartnetId_Last(
			partnetId, orderByComparator);
	}

	/**
	 * Returns the last region in the ordered set where partnetId = &#63;.
	 *
	 * @param partnetId the partnet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching region, or <code>null</code> if a matching region could not be found
	 */
	public static Region fetchBypartnetId_Last(
		long partnetId, OrderByComparator<Region> orderByComparator) {

		return getPersistence().fetchBypartnetId_Last(
			partnetId, orderByComparator);
	}

	/**
	 * Returns the regions before and after the current region in the ordered set where partnetId = &#63;.
	 *
	 * @param regionId the primary key of the current region
	 * @param partnetId the partnet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next region
	 * @throws NoSuchRegionException if a region with the primary key could not be found
	 */
	public static Region[] findBypartnetId_PrevAndNext(
			long regionId, long partnetId,
			OrderByComparator<Region> orderByComparator)
		throws com.liferay.partner.info.exception.NoSuchRegionException {

		return getPersistence().findBypartnetId_PrevAndNext(
			regionId, partnetId, orderByComparator);
	}

	/**
	 * Removes all the regions where partnetId = &#63; from the database.
	 *
	 * @param partnetId the partnet ID
	 */
	public static void removeBypartnetId(long partnetId) {
		getPersistence().removeBypartnetId(partnetId);
	}

	/**
	 * Returns the number of regions where partnetId = &#63;.
	 *
	 * @param partnetId the partnet ID
	 * @return the number of matching regions
	 */
	public static int countBypartnetId(long partnetId) {
		return getPersistence().countBypartnetId(partnetId);
	}

	/**
	 * Caches the region in the entity cache if it is enabled.
	 *
	 * @param region the region
	 */
	public static void cacheResult(Region region) {
		getPersistence().cacheResult(region);
	}

	/**
	 * Caches the regions in the entity cache if it is enabled.
	 *
	 * @param regions the regions
	 */
	public static void cacheResult(List<Region> regions) {
		getPersistence().cacheResult(regions);
	}

	/**
	 * Creates a new region with the primary key. Does not add the region to the database.
	 *
	 * @param regionId the primary key for the new region
	 * @return the new region
	 */
	public static Region create(long regionId) {
		return getPersistence().create(regionId);
	}

	/**
	 * Removes the region with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param regionId the primary key of the region
	 * @return the region that was removed
	 * @throws NoSuchRegionException if a region with the primary key could not be found
	 */
	public static Region remove(long regionId)
		throws com.liferay.partner.info.exception.NoSuchRegionException {

		return getPersistence().remove(regionId);
	}

	public static Region updateImpl(Region region) {
		return getPersistence().updateImpl(region);
	}

	/**
	 * Returns the region with the primary key or throws a <code>NoSuchRegionException</code> if it could not be found.
	 *
	 * @param regionId the primary key of the region
	 * @return the region
	 * @throws NoSuchRegionException if a region with the primary key could not be found
	 */
	public static Region findByPrimaryKey(long regionId)
		throws com.liferay.partner.info.exception.NoSuchRegionException {

		return getPersistence().findByPrimaryKey(regionId);
	}

	/**
	 * Returns the region with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param regionId the primary key of the region
	 * @return the region, or <code>null</code> if a region with the primary key could not be found
	 */
	public static Region fetchByPrimaryKey(long regionId) {
		return getPersistence().fetchByPrimaryKey(regionId);
	}

	/**
	 * Returns all the regions.
	 *
	 * @return the regions
	 */
	public static List<Region> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the regions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of regions
	 * @param end the upper bound of the range of regions (not inclusive)
	 * @return the range of regions
	 */
	public static List<Region> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the regions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of regions
	 * @param end the upper bound of the range of regions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of regions
	 */
	public static List<Region> findAll(
		int start, int end, OrderByComparator<Region> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the regions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of regions
	 * @param end the upper bound of the range of regions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of regions
	 */
	public static List<Region> findAll(
		int start, int end, OrderByComparator<Region> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the regions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of regions.
	 *
	 * @return the number of regions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RegionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RegionPersistence, RegionPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(RegionPersistence.class);

		ServiceTracker<RegionPersistence, RegionPersistence> serviceTracker =
			new ServiceTracker<RegionPersistence, RegionPersistence>(
				bundle.getBundleContext(), RegionPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}