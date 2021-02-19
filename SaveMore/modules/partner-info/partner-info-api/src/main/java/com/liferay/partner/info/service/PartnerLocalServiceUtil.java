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

package com.liferay.partner.info.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Partner. This utility wraps
 * <code>com.liferay.partner.info.service.impl.PartnerLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PartnerLocalService
 * @generated
 */
public class PartnerLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.partner.info.service.impl.PartnerLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the partner to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PartnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param partner the partner
	 * @return the partner that was added
	 */
	public static com.liferay.partner.info.model.Partner addPartner(
		com.liferay.partner.info.model.Partner partner) {

		return getService().addPartner(partner);
	}

	/**
	 * Creates a new partner with the primary key. Does not add the partner to the database.
	 *
	 * @param partnetId the primary key for the new partner
	 * @return the new partner
	 */
	public static com.liferay.partner.info.model.Partner createPartner(
		long partnetId) {

		return getService().createPartner(partnetId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the partner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PartnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param partnetId the primary key of the partner
	 * @return the partner that was removed
	 * @throws PortalException if a partner with the primary key could not be found
	 */
	public static com.liferay.partner.info.model.Partner deletePartner(
			long partnetId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePartner(partnetId);
	}

	/**
	 * Deletes the partner from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PartnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param partner the partner
	 * @return the partner that was removed
	 */
	public static com.liferay.partner.info.model.Partner deletePartner(
		com.liferay.partner.info.model.Partner partner) {

		return getService().deletePartner(partner);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.partner.info.model.impl.PartnerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.partner.info.model.impl.PartnerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.partner.info.model.Partner fetchPartner(
		long partnetId) {

		return getService().fetchPartner(partnetId);
	}

	/**
	 * Returns the partner matching the UUID and group.
	 *
	 * @param uuid the partner's UUID
	 * @param groupId the primary key of the group
	 * @return the matching partner, or <code>null</code> if a matching partner could not be found
	 */
	public static com.liferay.partner.info.model.Partner
		fetchPartnerByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchPartnerByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * Returns the partner with the primary key.
	 *
	 * @param partnetId the primary key of the partner
	 * @return the partner
	 * @throws PortalException if a partner with the primary key could not be found
	 */
	public static com.liferay.partner.info.model.Partner getPartner(
			long partnetId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPartner(partnetId);
	}

	/**
	 * Returns the partner matching the UUID and group.
	 *
	 * @param uuid the partner's UUID
	 * @param groupId the primary key of the group
	 * @return the matching partner
	 * @throws PortalException if a matching partner could not be found
	 */
	public static com.liferay.partner.info.model.Partner
			getPartnerByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPartnerByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the partners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.partner.info.model.impl.PartnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of partners
	 * @param end the upper bound of the range of partners (not inclusive)
	 * @return the range of partners
	 */
	public static java.util.List<com.liferay.partner.info.model.Partner>
		getPartners(int start, int end) {

		return getService().getPartners(start, end);
	}

	/**
	 * Returns all the partners matching the UUID and company.
	 *
	 * @param uuid the UUID of the partners
	 * @param companyId the primary key of the company
	 * @return the matching partners, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.partner.info.model.Partner>
		getPartnersByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getPartnersByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of partners matching the UUID and company.
	 *
	 * @param uuid the UUID of the partners
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of partners
	 * @param end the upper bound of the range of partners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching partners, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.partner.info.model.Partner>
		getPartnersByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.partner.info.model.Partner> orderByComparator) {

		return getService().getPartnersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of partners.
	 *
	 * @return the number of partners
	 */
	public static int getPartnersCount() {
		return getService().getPartnersCount();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the partner in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PartnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param partner the partner
	 * @return the partner that was updated
	 */
	public static com.liferay.partner.info.model.Partner updatePartner(
		com.liferay.partner.info.model.Partner partner) {

		return getService().updatePartner(partner);
	}

	public static PartnerLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PartnerLocalService, PartnerLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PartnerLocalService.class);

		ServiceTracker<PartnerLocalService, PartnerLocalService>
			serviceTracker =
				new ServiceTracker<PartnerLocalService, PartnerLocalService>(
					bundle.getBundleContext(), PartnerLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}