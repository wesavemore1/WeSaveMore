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

import com.liferay.partner.info.exception.NoSuchRegionException;
import com.liferay.partner.info.model.Region;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the region service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegionUtil
 * @generated
 */
@ProviderType
public interface RegionPersistence extends BasePersistence<Region> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RegionUtil} to access the region persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the regions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching regions
	 */
	public java.util.List<Region> findByUuid(String uuid);

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
	public java.util.List<Region> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Region> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Region>
			orderByComparator);

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
	public java.util.List<Region> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Region>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first region in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching region
	 * @throws NoSuchRegionException if a matching region could not be found
	 */
	public Region findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Region>
				orderByComparator)
		throws NoSuchRegionException;

	/**
	 * Returns the first region in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching region, or <code>null</code> if a matching region could not be found
	 */
	public Region fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Region>
			orderByComparator);

	/**
	 * Returns the last region in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching region
	 * @throws NoSuchRegionException if a matching region could not be found
	 */
	public Region findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Region>
				orderByComparator)
		throws NoSuchRegionException;

	/**
	 * Returns the last region in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching region, or <code>null</code> if a matching region could not be found
	 */
	public Region fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Region>
			orderByComparator);

	/**
	 * Returns the regions before and after the current region in the ordered set where uuid = &#63;.
	 *
	 * @param regionId the primary key of the current region
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next region
	 * @throws NoSuchRegionException if a region with the primary key could not be found
	 */
	public Region[] findByUuid_PrevAndNext(
			long regionId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Region>
				orderByComparator)
		throws NoSuchRegionException;

	/**
	 * Removes all the regions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of regions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching regions
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the regions where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @return the matching regions
	 */
	public java.util.List<Region> findByregionId(long regionId);

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
	public java.util.List<Region> findByregionId(
		long regionId, int start, int end);

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
	public java.util.List<Region> findByregionId(
		long regionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Region>
			orderByComparator);

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
	public java.util.List<Region> findByregionId(
		long regionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Region>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first region in the ordered set where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching region
	 * @throws NoSuchRegionException if a matching region could not be found
	 */
	public Region findByregionId_First(
			long regionId,
			com.liferay.portal.kernel.util.OrderByComparator<Region>
				orderByComparator)
		throws NoSuchRegionException;

	/**
	 * Returns the first region in the ordered set where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching region, or <code>null</code> if a matching region could not be found
	 */
	public Region fetchByregionId_First(
		long regionId,
		com.liferay.portal.kernel.util.OrderByComparator<Region>
			orderByComparator);

	/**
	 * Returns the last region in the ordered set where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching region
	 * @throws NoSuchRegionException if a matching region could not be found
	 */
	public Region findByregionId_Last(
			long regionId,
			com.liferay.portal.kernel.util.OrderByComparator<Region>
				orderByComparator)
		throws NoSuchRegionException;

	/**
	 * Returns the last region in the ordered set where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching region, or <code>null</code> if a matching region could not be found
	 */
	public Region fetchByregionId_Last(
		long regionId,
		com.liferay.portal.kernel.util.OrderByComparator<Region>
			orderByComparator);

	/**
	 * Removes all the regions where regionId = &#63; from the database.
	 *
	 * @param regionId the region ID
	 */
	public void removeByregionId(long regionId);

	/**
	 * Returns the number of regions where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @return the number of matching regions
	 */
	public int countByregionId(long regionId);

	/**
	 * Returns all the regions where partnetId = &#63;.
	 *
	 * @param partnetId the partnet ID
	 * @return the matching regions
	 */
	public java.util.List<Region> findBypartnetId(long partnetId);

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
	public java.util.List<Region> findBypartnetId(
		long partnetId, int start, int end);

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
	public java.util.List<Region> findBypartnetId(
		long partnetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Region>
			orderByComparator);

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
	public java.util.List<Region> findBypartnetId(
		long partnetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Region>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first region in the ordered set where partnetId = &#63;.
	 *
	 * @param partnetId the partnet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching region
	 * @throws NoSuchRegionException if a matching region could not be found
	 */
	public Region findBypartnetId_First(
			long partnetId,
			com.liferay.portal.kernel.util.OrderByComparator<Region>
				orderByComparator)
		throws NoSuchRegionException;

	/**
	 * Returns the first region in the ordered set where partnetId = &#63;.
	 *
	 * @param partnetId the partnet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching region, or <code>null</code> if a matching region could not be found
	 */
	public Region fetchBypartnetId_First(
		long partnetId,
		com.liferay.portal.kernel.util.OrderByComparator<Region>
			orderByComparator);

	/**
	 * Returns the last region in the ordered set where partnetId = &#63;.
	 *
	 * @param partnetId the partnet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching region
	 * @throws NoSuchRegionException if a matching region could not be found
	 */
	public Region findBypartnetId_Last(
			long partnetId,
			com.liferay.portal.kernel.util.OrderByComparator<Region>
				orderByComparator)
		throws NoSuchRegionException;

	/**
	 * Returns the last region in the ordered set where partnetId = &#63;.
	 *
	 * @param partnetId the partnet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching region, or <code>null</code> if a matching region could not be found
	 */
	public Region fetchBypartnetId_Last(
		long partnetId,
		com.liferay.portal.kernel.util.OrderByComparator<Region>
			orderByComparator);

	/**
	 * Returns the regions before and after the current region in the ordered set where partnetId = &#63;.
	 *
	 * @param regionId the primary key of the current region
	 * @param partnetId the partnet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next region
	 * @throws NoSuchRegionException if a region with the primary key could not be found
	 */
	public Region[] findBypartnetId_PrevAndNext(
			long regionId, long partnetId,
			com.liferay.portal.kernel.util.OrderByComparator<Region>
				orderByComparator)
		throws NoSuchRegionException;

	/**
	 * Removes all the regions where partnetId = &#63; from the database.
	 *
	 * @param partnetId the partnet ID
	 */
	public void removeBypartnetId(long partnetId);

	/**
	 * Returns the number of regions where partnetId = &#63;.
	 *
	 * @param partnetId the partnet ID
	 * @return the number of matching regions
	 */
	public int countBypartnetId(long partnetId);

	/**
	 * Caches the region in the entity cache if it is enabled.
	 *
	 * @param region the region
	 */
	public void cacheResult(Region region);

	/**
	 * Caches the regions in the entity cache if it is enabled.
	 *
	 * @param regions the regions
	 */
	public void cacheResult(java.util.List<Region> regions);

	/**
	 * Creates a new region with the primary key. Does not add the region to the database.
	 *
	 * @param regionId the primary key for the new region
	 * @return the new region
	 */
	public Region create(long regionId);

	/**
	 * Removes the region with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param regionId the primary key of the region
	 * @return the region that was removed
	 * @throws NoSuchRegionException if a region with the primary key could not be found
	 */
	public Region remove(long regionId) throws NoSuchRegionException;

	public Region updateImpl(Region region);

	/**
	 * Returns the region with the primary key or throws a <code>NoSuchRegionException</code> if it could not be found.
	 *
	 * @param regionId the primary key of the region
	 * @return the region
	 * @throws NoSuchRegionException if a region with the primary key could not be found
	 */
	public Region findByPrimaryKey(long regionId) throws NoSuchRegionException;

	/**
	 * Returns the region with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param regionId the primary key of the region
	 * @return the region, or <code>null</code> if a region with the primary key could not be found
	 */
	public Region fetchByPrimaryKey(long regionId);

	/**
	 * Returns all the regions.
	 *
	 * @return the regions
	 */
	public java.util.List<Region> findAll();

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
	public java.util.List<Region> findAll(int start, int end);

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
	public java.util.List<Region> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Region>
			orderByComparator);

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
	public java.util.List<Region> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Region>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the regions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of regions.
	 *
	 * @return the number of regions
	 */
	public int countAll();

}