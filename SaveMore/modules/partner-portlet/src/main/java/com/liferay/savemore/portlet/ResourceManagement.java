package  com.liferay.savemore.portlet;

import com.liferay.asset.kernel.model.AssetCategory;
import com.liferay.asset.kernel.service.AssetCategoryLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.savemore.constants.PartnerPortletKeys;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
 property = {
 "javax.portlet.name=" + PartnerPortletKeys.PARTNER,
 "mvc.command.name=/countries/regions"
 }, service = MVCResourceCommand.class
 )
public class ResourceManagement implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest request, ResourceResponse response)
			throws PortletException {
		// TODO Auto-generated method stub
		
		String countryId = ParamUtil.getString(request, "countryId");
		
      System.out.println("countryId"+countryId);
		
		JSONArray stateArray = JSONFactoryUtil.createJSONArray();	
		JSONObject stateObject = null;
		
		long parentCategoryId=Long.parseLong(countryId);
		List<AssetCategory> childCategories= AssetCategoryLocalServiceUtil.getChildCategories(parentCategoryId);
		  for (AssetCategory assetCategory : childCategories) { 
		  
		  stateObject = JSONFactoryUtil.createJSONObject(); 
		  stateObject.put("stateId",assetCategory.getCategoryId());
		  stateObject.put("name",assetCategory.getName()); 
		  stateArray.put(stateObject);
		  System.out.println("childCategories-"+stateArray);
		  }
		  
		  System.out.println("------------"+stateArray);
		 	    
		    try {
		    	 stateArray.put(stateObject);
		   	response.getWriter().println(stateArray);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//	return true;
			return true;
	}
	
	

	}

	/*@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		
		System.out.println("srikanth velugoti-------------");
		
		List<AssetCategory> categories=AssetCategoryLocalServiceUtil.getAssetCategories(-1, -1);
		
		categories.stream().forEach(category->{
			try {
				System.out.println("parent categories"+category.getAncestors());
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		
		
		
		
		
		return false;
	}
*/
