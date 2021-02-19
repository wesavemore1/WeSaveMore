package com.liferay.savemore.portlet;

import com.liferay.savemore.constants.PartnerPortletKeys;

import java.io.IOException;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.partner.info.model.Partner;
import com.liferay.partner.info.model.Region;
import com.liferay.partner.info.service.PartnerLocalServiceUtil;
import com.liferay.partner.info.service.RegionLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.persistence.CountryUtil;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author RSTPL065
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Partner",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PartnerPortletKeys.PARTNER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PartnerPortlet extends MVCPortlet {
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		
		/*
		 * for (Partner string : PartnerLocalServiceUtil.getPartners(-1,-1)) {
		 * 
		 * try { PartnerLocalServiceUtil.deletePartner(string.getPartnetId()); } catch
		 * (PortalException e) { // TODO Auto-generated catch block e.printStackTrace();
		 * } }
		 */
		
		super.render(renderRequest, renderResponse);
	}
}