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

package com.liferay.partner.info.service.persistence.impl;

import com.liferay.partner.info.exception.NoSuchRegionException;
import com.liferay.partner.info.model.Region;
import com.liferay.partner.info.model.impl.RegionImpl;
import com.liferay.partner.info.model.impl.RegionModelImpl;
import com.liferay.partner.info.service.persistence.RegionPersistence;
import com.liferay.partner.info.service.persistence.impl.constants.PartnerPersistenceConstants;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the region service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = RegionPersistence.class)
public class RegionPersistenceImpl
	extends BasePersistenceImpl<Region> implements RegionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RegionUtil</code> to access the region persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RegionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the regions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching regions
	 */
	@Override
	public List<Region> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Region> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Region> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Region> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Region> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Region> orderByComparator, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Region> list = null;

		if (useFinderCache) {
			list = (List<Region>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Region region : list) {
					if (!uuid.equals(region.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_REGION_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(RegionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Region>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first region in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching region
	 * @throws NoSuchRegionException if a matching region could not be found
	 */
	@Override
	public Region findByUuid_First(
			String uuid, OrderByComparator<Region> orderByComparator)
		throws NoSuchRegionException {

		Region region = fetchByUuid_First(uuid, orderByComparator);

		if (region != null) {
			return region;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchRegionException(sb.toString());
	}

	/**
	 * Returns the first region in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching region, or <code>null</code> if a matching region could not be found
	 */
	@Override
	public Region fetchByUuid_First(
		String uuid, OrderByComparator<Region> orderByComparator) {

		List<Region> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last region in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching region
	 * @throws NoSuchRegionException if a matching region could not be found
	 */
	@Override
	public Region findByUuid_Last(
			String uuid, OrderByComparator<Region> orderByComparator)
		throws NoSuchRegionException {

		Region region = fetchByUuid_Last(uuid, orderByComparator);

		if (region != null) {
			return region;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchRegionException(sb.toString());
	}

	/**
	 * Returns the last region in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching region, or <code>null</code> if a matching region could not be found
	 */
	@Override
	public Region fetchByUuid_Last(
		String uuid, OrderByComparator<Region> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Region> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Region[] findByUuid_PrevAndNext(
			long regionId, String uuid,
			OrderByComparator<Region> orderByComparator)
		throws NoSuchRegionException {

		uuid = Objects.toString(uuid, "");

		Region region = findByPrimaryKey(regionId);

		Session session = null;

		try {
			session = openSession();

			Region[] array = new RegionImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, region, uuid, orderByComparator, true);

			array[1] = region;

			array[2] = getByUuid_PrevAndNext(
				session, region, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Region getByUuid_PrevAndNext(
		Session session, Region region, String uuid,
		OrderByComparator<Region> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_REGION_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(RegionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(region)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Region> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the regions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Region region :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(region);
		}
	}

	/**
	 * Returns the number of regions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching regions
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_REGION_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "region.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(region.uuid IS NULL OR region.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByregionId;
	private FinderPath _finderPathWithoutPaginationFindByregionId;
	private FinderPath _finderPathCountByregionId;

	/**
	 * Returns all the regions where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @return the matching regions
	 */
	@Override
	public List<Region> findByregionId(long regionId) {
		return findByregionId(
			regionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Region> findByregionId(long regionId, int start, int end) {
		return findByregionId(regionId, start, end, null);
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
	@Override
	public List<Region> findByregionId(
		long regionId, int start, int end,
		OrderByComparator<Region> orderByComparator) {

		return findByregionId(regionId, start, end, orderByComparator, true);
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
	@Override
	public List<Region> findByregionId(
		long regionId, int start, int end,
		OrderByComparator<Region> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByregionId;
				finderArgs = new Object[] {regionId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByregionId;
			finderArgs = new Object[] {regionId, start, end, orderByComparator};
		}

		List<Region> list = null;

		if (useFinderCache) {
			list = (List<Region>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Region region : list) {
					if (regionId != region.getRegionId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_REGION_WHERE);

			sb.append(_FINDER_COLUMN_REGIONID_REGIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(RegionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(regionId);

				list = (List<Region>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first region in the ordered set where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching region
	 * @throws NoSuchRegionException if a matching region could not be found
	 */
	@Override
	public Region findByregionId_First(
			long regionId, OrderByComparator<Region> orderByComparator)
		throws NoSuchRegionException {

		Region region = fetchByregionId_First(regionId, orderByComparator);

		if (region != null) {
			return region;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("regionId=");
		sb.append(regionId);

		sb.append("}");

		throw new NoSuchRegionException(sb.toString());
	}

	/**
	 * Returns the first region in the ordered set where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching region, or <code>null</code> if a matching region could not be found
	 */
	@Override
	public Region fetchByregionId_First(
		long regionId, OrderByComparator<Region> orderByComparator) {

		List<Region> list = findByregionId(regionId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last region in the ordered set where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching region
	 * @throws NoSuchRegionException if a matching region could not be found
	 */
	@Override
	public Region findByregionId_Last(
			long regionId, OrderByComparator<Region> orderByComparator)
		throws NoSuchRegionException {

		Region region = fetchByregionId_Last(regionId, orderByComparator);

		if (region != null) {
			return region;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("regionId=");
		sb.append(regionId);

		sb.append("}");

		throw new NoSuchRegionException(sb.toString());
	}

	/**
	 * Returns the last region in the ordered set where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching region, or <code>null</code> if a matching region could not be found
	 */
	@Override
	public Region fetchByregionId_Last(
		long regionId, OrderByComparator<Region> orderByComparator) {

		int count = countByregionId(regionId);

		if (count == 0) {
			return null;
		}

		List<Region> list = findByregionId(
			regionId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the regions where regionId = &#63; from the database.
	 *
	 * @param regionId the region ID
	 */
	@Override
	public void removeByregionId(long regionId) {
		for (Region region :
				findByregionId(
					regionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(region);
		}
	}

	/**
	 * Returns the number of regions where regionId = &#63;.
	 *
	 * @param regionId the region ID
	 * @return the number of matching regions
	 */
	@Override
	public int countByregionId(long regionId) {
		FinderPath finderPath = _finderPathCountByregionId;

		Object[] finderArgs = new Object[] {regionId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_REGION_WHERE);

			sb.append(_FINDER_COLUMN_REGIONID_REGIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(regionId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_REGIONID_REGIONID_2 =
		"region.regionId = ?";

	private FinderPath _finderPathWithPaginationFindBypartnetId;
	private FinderPath _finderPathWithoutPaginationFindBypartnetId;
	private FinderPath _finderPathCountBypartnetId;

	/**
	 * Returns all the regions where partnetId = &#63;.
	 *
	 * @param partnetId the partnet ID
	 * @return the matching regions
	 */
	@Override
	public List<Region> findBypartnetId(long partnetId) {
		return findBypartnetId(
			partnetId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Region> findBypartnetId(long partnetId, int start, int end) {
		return findBypartnetId(partnetId, start, end, null);
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
	@Override
	public List<Region> findBypartnetId(
		long partnetId, int start, int end,
		OrderByComparator<Region> orderByComparator) {

		return findBypartnetId(partnetId, start, end, orderByComparator, true);
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
	@Override
	public List<Region> findBypartnetId(
		long partnetId, int start, int end,
		OrderByComparator<Region> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBypartnetId;
				finderArgs = new Object[] {partnetId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBypartnetId;
			finderArgs = new Object[] {
				partnetId, start, end, orderByComparator
			};
		}

		List<Region> list = null;

		if (useFinderCache) {
			list = (List<Region>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Region region : list) {
					if (partnetId != region.getPartnetId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_REGION_WHERE);

			sb.append(_FINDER_COLUMN_PARTNETID_PARTNETID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(RegionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(partnetId);

				list = (List<Region>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first region in the ordered set where partnetId = &#63;.
	 *
	 * @param partnetId the partnet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching region
	 * @throws NoSuchRegionException if a matching region could not be found
	 */
	@Override
	public Region findBypartnetId_First(
			long partnetId, OrderByComparator<Region> orderByComparator)
		throws NoSuchRegionException {

		Region region = fetchBypartnetId_First(partnetId, orderByComparator);

		if (region != null) {
			return region;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("partnetId=");
		sb.append(partnetId);

		sb.append("}");

		throw new NoSuchRegionException(sb.toString());
	}

	/**
	 * Returns the first region in the ordered set where partnetId = &#63;.
	 *
	 * @param partnetId the partnet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching region, or <code>null</code> if a matching region could not be found
	 */
	@Override
	public Region fetchBypartnetId_First(
		long partnetId, OrderByComparator<Region> orderByComparator) {

		List<Region> list = findBypartnetId(partnetId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last region in the ordered set where partnetId = &#63;.
	 *
	 * @param partnetId the partnet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching region
	 * @throws NoSuchRegionException if a matching region could not be found
	 */
	@Override
	public Region findBypartnetId_Last(
			long partnetId, OrderByComparator<Region> orderByComparator)
		throws NoSuchRegionException {

		Region region = fetchBypartnetId_Last(partnetId, orderByComparator);

		if (region != null) {
			return region;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("partnetId=");
		sb.append(partnetId);

		sb.append("}");

		throw new NoSuchRegionException(sb.toString());
	}

	/**
	 * Returns the last region in the ordered set where partnetId = &#63;.
	 *
	 * @param partnetId the partnet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching region, or <code>null</code> if a matching region could not be found
	 */
	@Override
	public Region fetchBypartnetId_Last(
		long partnetId, OrderByComparator<Region> orderByComparator) {

		int count = countBypartnetId(partnetId);

		if (count == 0) {
			return null;
		}

		List<Region> list = findBypartnetId(
			partnetId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Region[] findBypartnetId_PrevAndNext(
			long regionId, long partnetId,
			OrderByComparator<Region> orderByComparator)
		throws NoSuchRegionException {

		Region region = findByPrimaryKey(regionId);

		Session session = null;

		try {
			session = openSession();

			Region[] array = new RegionImpl[3];

			array[0] = getBypartnetId_PrevAndNext(
				session, region, partnetId, orderByComparator, true);

			array[1] = region;

			array[2] = getBypartnetId_PrevAndNext(
				session, region, partnetId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Region getBypartnetId_PrevAndNext(
		Session session, Region region, long partnetId,
		OrderByComparator<Region> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_REGION_WHERE);

		sb.append(_FINDER_COLUMN_PARTNETID_PARTNETID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(RegionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(partnetId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(region)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Region> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the regions where partnetId = &#63; from the database.
	 *
	 * @param partnetId the partnet ID
	 */
	@Override
	public void removeBypartnetId(long partnetId) {
		for (Region region :
				findBypartnetId(
					partnetId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(region);
		}
	}

	/**
	 * Returns the number of regions where partnetId = &#63;.
	 *
	 * @param partnetId the partnet ID
	 * @return the number of matching regions
	 */
	@Override
	public int countBypartnetId(long partnetId) {
		FinderPath finderPath = _finderPathCountBypartnetId;

		Object[] finderArgs = new Object[] {partnetId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_REGION_WHERE);

			sb.append(_FINDER_COLUMN_PARTNETID_PARTNETID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(partnetId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PARTNETID_PARTNETID_2 =
		"region.partnetId = ?";

	public RegionPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Region.class);

		setModelImplClass(RegionImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the region in the entity cache if it is enabled.
	 *
	 * @param region the region
	 */
	@Override
	public void cacheResult(Region region) {
		entityCache.putResult(RegionImpl.class, region.getPrimaryKey(), region);
	}

	/**
	 * Caches the regions in the entity cache if it is enabled.
	 *
	 * @param regions the regions
	 */
	@Override
	public void cacheResult(List<Region> regions) {
		for (Region region : regions) {
			if (entityCache.getResult(
					RegionImpl.class, region.getPrimaryKey()) == null) {

				cacheResult(region);
			}
		}
	}

	/**
	 * Clears the cache for all regions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RegionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the region.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Region region) {
		entityCache.removeResult(RegionImpl.class, region);
	}

	@Override
	public void clearCache(List<Region> regions) {
		for (Region region : regions) {
			entityCache.removeResult(RegionImpl.class, region);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(RegionImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new region with the primary key. Does not add the region to the database.
	 *
	 * @param regionId the primary key for the new region
	 * @return the new region
	 */
	@Override
	public Region create(long regionId) {
		Region region = new RegionImpl();

		region.setNew(true);
		region.setPrimaryKey(regionId);

		String uuid = PortalUUIDUtil.generate();

		region.setUuid(uuid);

		return region;
	}

	/**
	 * Removes the region with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param regionId the primary key of the region
	 * @return the region that was removed
	 * @throws NoSuchRegionException if a region with the primary key could not be found
	 */
	@Override
	public Region remove(long regionId) throws NoSuchRegionException {
		return remove((Serializable)regionId);
	}

	/**
	 * Removes the region with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the region
	 * @return the region that was removed
	 * @throws NoSuchRegionException if a region with the primary key could not be found
	 */
	@Override
	public Region remove(Serializable primaryKey) throws NoSuchRegionException {
		Session session = null;

		try {
			session = openSession();

			Region region = (Region)session.get(RegionImpl.class, primaryKey);

			if (region == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRegionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(region);
		}
		catch (NoSuchRegionException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Region removeImpl(Region region) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(region)) {
				region = (Region)session.get(
					RegionImpl.class, region.getPrimaryKeyObj());
			}

			if (region != null) {
				session.delete(region);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (region != null) {
			clearCache(region);
		}

		return region;
	}

	@Override
	public Region updateImpl(Region region) {
		boolean isNew = region.isNew();

		if (!(region instanceof RegionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(region.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(region);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in region proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Region implementation " +
					region.getClass());
		}

		RegionModelImpl regionModelImpl = (RegionModelImpl)region;

		if (Validator.isNull(region.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			region.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(region);
			}
			else {
				region = (Region)session.merge(region);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(RegionImpl.class, regionModelImpl, false, true);

		if (isNew) {
			region.setNew(false);
		}

		region.resetOriginalValues();

		return region;
	}

	/**
	 * Returns the region with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the region
	 * @return the region
	 * @throws NoSuchRegionException if a region with the primary key could not be found
	 */
	@Override
	public Region findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRegionException {

		Region region = fetchByPrimaryKey(primaryKey);

		if (region == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRegionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return region;
	}

	/**
	 * Returns the region with the primary key or throws a <code>NoSuchRegionException</code> if it could not be found.
	 *
	 * @param regionId the primary key of the region
	 * @return the region
	 * @throws NoSuchRegionException if a region with the primary key could not be found
	 */
	@Override
	public Region findByPrimaryKey(long regionId) throws NoSuchRegionException {
		return findByPrimaryKey((Serializable)regionId);
	}

	/**
	 * Returns the region with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param regionId the primary key of the region
	 * @return the region, or <code>null</code> if a region with the primary key could not be found
	 */
	@Override
	public Region fetchByPrimaryKey(long regionId) {
		return fetchByPrimaryKey((Serializable)regionId);
	}

	/**
	 * Returns all the regions.
	 *
	 * @return the regions
	 */
	@Override
	public List<Region> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Region> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Region> findAll(
		int start, int end, OrderByComparator<Region> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Region> findAll(
		int start, int end, OrderByComparator<Region> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Region> list = null;

		if (useFinderCache) {
			list = (List<Region>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_REGION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_REGION;

				sql = sql.concat(RegionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Region>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the regions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Region region : findAll()) {
			remove(region);
		}
	}

	/**
	 * Returns the number of regions.
	 *
	 * @return the number of regions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_REGION);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "regionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_REGION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RegionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the region persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new RegionModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", Region.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathWithPaginationFindByregionId = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByregionId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"regionId"}, true);

		_finderPathWithoutPaginationFindByregionId = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByregionId",
			new String[] {Long.class.getName()}, new String[] {"regionId"},
			true);

		_finderPathCountByregionId = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByregionId",
			new String[] {Long.class.getName()}, new String[] {"regionId"},
			false);

		_finderPathWithPaginationFindBypartnetId = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBypartnetId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"partnetId"}, true);

		_finderPathWithoutPaginationFindBypartnetId = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBypartnetId",
			new String[] {Long.class.getName()}, new String[] {"partnetId"},
			true);

		_finderPathCountBypartnetId = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBypartnetId",
			new String[] {Long.class.getName()}, new String[] {"partnetId"},
			false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(RegionImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	@Override
	@Reference(
		target = PartnerPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = PartnerPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = PartnerPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_REGION =
		"SELECT region FROM Region region";

	private static final String _SQL_SELECT_REGION_WHERE =
		"SELECT region FROM Region region WHERE ";

	private static final String _SQL_COUNT_REGION =
		"SELECT COUNT(region) FROM Region region";

	private static final String _SQL_COUNT_REGION_WHERE =
		"SELECT COUNT(region) FROM Region region WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "region.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Region exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Region exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		RegionPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	static {
		try {
			Class.forName(PartnerPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;
	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();

	private static class RegionModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			RegionModelImpl regionModelImpl = (RegionModelImpl)baseModel;

			long columnBitmask = regionModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(regionModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |= regionModelImpl.getColumnBitmask(
						columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(regionModelImpl, columnNames, original);
			}

			return null;
		}

		private Object[] _getValue(
			RegionModelImpl regionModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = regionModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = regionModelImpl.getColumnValue(columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}