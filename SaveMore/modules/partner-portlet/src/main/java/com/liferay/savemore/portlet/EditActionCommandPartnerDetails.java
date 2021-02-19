package  com.liferay.savemore.portlet;

import com.liferay.asset.kernel.service.AssetCategoryLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.model.DLVersionNumberIncrease;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.partner.info.model.Partner;
import com.liferay.partner.info.model.Region;
import com.liferay.partner.info.service.PartnerLocalServiceUtil;
import com.liferay.partner.info.service.RegionLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.FileItem;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.savemore.constants.PartnerPortletKeys;

import java.io.IOException;
import java.io.InputStream;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

@Component(
 property = {
 "javax.portlet.name=" + PartnerPortletKeys.PARTNER,
 "mvc.command.name=uploadFileAction"
 }, service = MVCActionCommand.class
 )
public class EditActionCommandPartnerDetails implements MVCActionCommand {

	public final static String edit_partner_info = "/partnerInfo/partnerEditInfo.jsp";
	public final static String ERROR = "/error.jsp";
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	
	
	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
	
		System.out.println("in process action");
		 String CMD;
		String partnerId;
		String folderName;
		ThemeDisplay themeDisplay;
		Partner partner;
		folderName = ParamUtil.getString(actionRequest, "licenseNumber");
		String description="";
		themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		Region region;
		try {
			  CMD=ParamUtil.getString(actionRequest, "CMD-ACTION");	
			  System.out.println("the comd value is "+ CMD);
			  
	if(CMD.equals("EDIT")) {
		partner = PartnerLocalServiceUtil.createPartner(CounterLocalServiceUtil.increment(Partner.class.getName()));
		region=RegionLocalServiceUtil.createRegion(CounterLocalServiceUtil.increment(Region.class.getName())); 
		}else {
			partnerId=ParamUtil.getString(actionRequest, "partnerId");	
			partner =PartnerLocalServiceUtil.getPartner(Long.parseLong(partnerId));
			region=	RegionLocalServiceUtil.getRegion(partner.getRegionId());
		}		
	
		String[] arr=ParamUtil.getStringValues(actionRequest, "region");
				StringBuilder sb = new StringBuilder();
				for (String obj : arr) {
					sb.append(obj.toString()).append(",");
				}
			sb.substring(0, sb.length() - 1);
			region.setRegion(sb.toString());
			region.setPartnetId(partner.getPartnetId());
			RegionLocalServiceUtil.updateRegion(region);	  
			partner.setPartnername(ParamUtil.getString(actionRequest, "companyName")); 
			partner.setRegionId(region.getRegionId());
			partner.setLicensename(folderName);
			String categoryId=ParamUtil.getString(actionRequest, "country");
			partner.setCountryId(Long.parseLong(categoryId));
			partner.setAddress(ParamUtil.getString(actionRequest, "address"));  
  
			partner.setCompanyphone(ParamUtil.getString(actionRequest, "companyPhone"));
			partner.setCompanyPO(ParamUtil.getString(actionRequest, "companyPO"));
			partner.setCompanyemail(ParamUtil.getString(actionRequest, "companyEmail"));
			partner.setSignatory(ParamUtil.getString(actionRequest, "signatory"));
			partner.setSignatoryemail(ParamUtil.getString(actionRequest, "signatoryemail"));
			partner.setSignatoryphone(ParamUtil.getString(actionRequest, "signatoryphone"));
			partner.setPartnerStatus(ParamUtil.getString(actionRequest, "partnerStatus"));
			  
			PartnerLocalServiceUtil.updatePartner(partner);
			System.out.println("folderName*****************"+partner);
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	    
	    
	    
	    
	    
	  
			 String fileNames="tradeLicenseFile,establishmentCardFile,signedAgreementFile,emiratesIdFile";
				// String fileNames="tradeLicenseFile";
					
			System.out.println(" in save partner detals"+folderName);
			
			System.out.println("folder exists or not "+DLFolderLocalServiceUtil.fetchFolder(themeDisplay.getScopeGroupId(), 0, folderName));
			
			if(DLFolderLocalServiceUtil.fetchFolder(themeDisplay.getScopeGroupId(), 0, folderName) == null) {
				//createDLFolder(actionRequest, themeDisplay, folderName, description);
					
			}
		    
			Folder folder = null;
			try {
				folder = DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), 0, folderName);
			} catch (PortalException e) { // TODO Auto-generated catch block
				e.printStackTrace();
			} 
    	
			String[] fileName=fileNames.split(",");
			
			System.out.println(""+fileName.length);
			
			try {
				fileUpload(themeDisplay, actionRequest, folder, fileName);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return edit_partner_info != null;
	}
	
	private void getCountryAssetCtegory() {
		// TODO Auto-generated method stub
		
	}

	public DLFolder createDLFolder(ActionRequest actionRequest,ThemeDisplay themeDisplay, String folderName,String description)
	{
		DLFolder folder=null;
		long userId = themeDisplay.getUserId();
		long groupId = themeDisplay.getScopeGroupId();	
		long repositoryId = themeDisplay.getScopeGroupId();//repository id is same as groupId
		boolean mountPoint = false;                       // mountPoint which is a boolean specifying whether the folder is a facade for mounting a third-party repository
		long parentFolderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID; // or 0
		boolean hidden = false; // true if you want to hidden the folder 
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), actionRequest);
		 folder=	DLFolderLocalServiceUtil.addFolder(userId, groupId, repositoryId, mountPoint, parentFolderId, folderName, description, hidden, serviceContext);
		} catch (PortalException e1) {
			e1.printStackTrace();
		} catch (SystemException e1) {
			e1.printStackTrace();
		}
		return folder;
	}
	
	
	public void fileUpload(ThemeDisplay themeDisplay,ActionRequest request,Folder folder,String[] fileNames) throws IOException
	{
		
		
		
		 for (String fileName : fileNames) { 
			
			//createDLFile(themeDisplay, request, folder,fileName);
		} 
      
		

	}

	public void createDLFile(ThemeDisplay themeDisplay, ActionRequest request, Folder folder, String fileName) throws IOException {
		System.out.println(" file Name is "+fileName);
		//-----------------------
		
		UploadPortletRequest uploadPortletRequest1 = PortalUtil.getUploadPortletRequest(request);	
		
		try {
		  
			storeAttachments(uploadPortletRequest1,folder,fileName);
		} catch (Exception e) {	
			System.out.println(e.getMessage());
		}
		
}
	//---------------
		
	public static void storeAttachments(final UploadPortletRequest req, Folder folder,String fileName) 
		    throws PrincipalException, Exception {
		
		System.out.println("FILE EXISTS"+isAttachExistsInRequest(req,fileName));
		    if (isAttachExistsInRequest(req,fileName)) {
		        final FileItem[] arr = req.getMultipartParameterMap().get(fileName);
		        final long repoId = getRepositoryId(req);
		        final long folderId = folder.getFolderId();
		        final ServiceContext sc = new ServiceContext();
		        for (final FileItem fi : arr) {
		        FileEntry dl=	DLAppServiceUtil.getFileEntry(repoId, folderId, folder.getName()+"-"+fileName);
		        	 createFileEntry(repoId, folderId,folder.getName()+"-"+fileName ,
			                    fi.getContentType(), fi.getSize(), fi.getInputStream(),fi.getFileName(),dl,
			                    sc);
		        		            
		        }
		        
		        
		        
		    }
		}

		private static long getRepositoryId(final UploadPortletRequest req) {
		    final ThemeDisplay themeDisplay = (ThemeDisplay) req
		            .getAttribute(WebKeys.THEME_DISPLAY);
		    return themeDisplay.getScopeGroupId();
		}

		public static void createFileEntry(final long repositoryId,
		        final long folderId, final String fileName, final String mimeType,
		        final long fileLength, final InputStream is,
		        String string, FileEntry dl, final ServiceContext serviceContext
		        ) {
		    try {
		    	
		    	if(dl==null) {
		    		  final FileEntry entry = DLAppServiceUtil.addFileEntry(repositoryId,
				                folderId, fileName, mimeType, fileName, string, null, is,
				                fileLength, serviceContext);
		    	}else {
		    		String changeLog="";
					DLVersionNumberIncrease dlVersionNumberIncrease = null;
					DLAppServiceUtil.updateFileEntry(dl.getFileEntryId(), fileName, mimeType,
							fileName, string, changeLog, dlVersionNumberIncrease, is, fileLength, serviceContext);
		    	}
		    	
		      
		    
		    
		    } catch (final Exception e) {
		        System.out.println("Utils::createFileEntry Exception"+ e);
		    }
		}	
		
		public static boolean isAttachExistsInRequest(final UploadPortletRequest req,String fileName) {
	        final FileItem[] arr = req.getMultipartParameterMap().get(fileName);
	        if (arr == null || arr.length == 0) {
	            return false;
	        }
	        boolean isAttachExists = false;
	        for (final FileItem fi : arr) {
	            // fileName == "" when no file input (type=file) has no files
	            // uploaded
	            if (!fi.getFileName().isEmpty()) {
	                isAttachExists = true;
	            }
	        }
	        return isAttachExists;
	    }
	
	

		
	
	
}