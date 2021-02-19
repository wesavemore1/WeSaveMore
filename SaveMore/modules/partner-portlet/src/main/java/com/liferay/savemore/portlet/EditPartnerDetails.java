package  com.liferay.savemore.portlet;

import com.liferay.asset.kernel.model.AssetCategory;
import com.liferay.asset.kernel.model.AssetVocabulary;
import com.liferay.asset.kernel.service.AssetCategoryLocalServiceUtil;
import com.liferay.asset.kernel.service.AssetVocabularyLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.partner.info.model.Partner;
import com.liferay.partner.info.service.PartnerLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.FileItem;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.savemore.constants.PartnerPortletKeys;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
 property = {
 "javax.portlet.name=" + PartnerPortletKeys.PARTNER,
 "mvc.command.name=viewPartnerDetails",
 "mvc.command.name=savePartnerDetails"
 }, service = MVCRenderCommand.class
 )
public class EditPartnerDetails implements MVCRenderCommand {

	public final static String edit_partner_info = "/partnerInfo/partnerEditInfo.jsp";
	public final static String ERROR = "/error.jsp";
	

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
	 String cmd=ParamUtil.getString(renderRequest, "CMD-ACTION");
	
	 if(cmd.equals("EDIT")) {
				 String partnerId=ParamUtil.getString(renderRequest, "partnerId");		
				 try {
		Partner partnerDetails=	PartnerLocalServiceUtil.getPartner(Long.parseLong(partnerId));
		
		renderRequest.setAttribute("partnerDetails", partnerDetails);
		
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
				
				
			}
				

				try {
					
					List<AssetVocabulary> vocab1=	AssetVocabularyLocalServiceUtil.getAssetVocabularies(-1, -1).stream().filter(vocab->vocab.getName().equals("country")).collect(Collectors.toList());
						
					List<AssetCategory> assetCategories= AssetCategoryLocalServiceUtil.getVocabularyCategories(vocab1.get(0).getVocabularyId(),-1,-1,null).stream().filter(p->p.getParentCategoryId()==0).collect(Collectors.toList());
					 
						
					 renderRequest.setAttribute("assetCategories", assetCategories);
					 
					} catch (Exception e) {
						return ERROR;
				}	
			
			
			
			
			
		
		
	

		return edit_partner_info;
	}
	
	
	
	
	
	
	
	
	}	
	
	
