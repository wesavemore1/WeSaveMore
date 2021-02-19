<%@page import="com.liferay.partner.info.model.Region"%>
<%@page import="com.liferay.asset.kernel.service.AssetCategoryLocalServiceUtil"%>
<%@page import="com.liferay.partner.info.service.RegionLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.partner.info.model.Partner"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.partner.info.service.PartnerLocalServiceUtil"%>
<%@ include file="/init.jsp" %>


<%
 List<Partner> partner = PartnerLocalServiceUtil.getPartners(-1,-1);
 System.out.println("partner size is "+partner.size());
%>

 <portlet:renderURL var="partnerDetailsURL"> 

 <portlet:param name="mvcRenderCommandName" value="viewPartnerDetails"/>
 </portlet:renderURL>

<liferay-ui:search-container total="<%=partner.size()%>" var="searchContainer" delta="10" deltaConfigurable="true" 
  emptyResultsMessage="Oops. There Are No Partners To Display, Please add partners">
  
 
  
  
 <liferay-ui:search-container-results results="<%=ListUtil.subList(partner, searchContainer.getStart(),searchContainer.getEnd())%>" />
  <liferay-ui:search-container-row className="com.liferay.partner.info.model.Partner" modelVar="partnr" keyProperty="partnetId" >
  
 <portlet:renderURL var="editpartnerDetailsURL"> 
 <portlet:param name="partnerId" value="${partnr.partnetId}" /> 
 <portlet:param name="CMD-ACTION" value="EDIT" />
 <portlet:param name="mvcRenderCommandName" value="viewPartnerDetails"/>
 </portlet:renderURL> 

  <liferay-ui:search-container-column-text name="Company Name" value="${partnr.partnername}"/>
  
  
  <%
  Region regions= RegionLocalServiceUtil.getRegion(partnr.getRegionId());
  
  String[] t=regions.getRegion().split(",");
  String re="";
  
  for(String reg:t ){
	  
	re+=  AssetCategoryLocalServiceUtil.getAssetCategory(Long.parseLong(reg)).getName() +",";
	  
  }
 re= re.substring(0, re.length() - 1);
 
String county= AssetCategoryLocalServiceUtil.getAssetCategory(partnr.getCountryId()).getName();
 
  %>
  
   <liferay-ui:search-container-column-text name="license Number" property="licensename"/>
   <liferay-ui:search-container-column-text name="Signatory" property="signatory"/>
   <liferay-ui:search-container-column-text name="country" value="<%=county %>"/>
   
   <liferay-ui:search-container-column-text name="Region" value="<%= re%>">
   
   
   
   
   </liferay-ui:search-container-column-text>
   
   
   
   <liferay-ui:search-container-column-text name="P.Status" value="regionId"/>
   <liferay-ui:search-container-column-text name="R.Status" value="regionId"/>
   <liferay-ui:search-container-column-text name="view" value="view" href="${partnerDetailsURL}"/>
   <liferay-ui:search-container-column-text name="edit" value="edit" href="${editpartnerDetailsURL}"/>
   <liferay-ui:search-container-column-text name="Activate" property="partnerStatus"/>
   
   
  <%--  <%RegionLocalServiceUtil.getRegion(partnr.regionid); %> --%>
  </liferay-ui:search-container-row>
 <liferay-ui:search-iterator />
</liferay-ui:search-container>

<div class="row">
    <div class="col-sm-12 text-center">
        <button class="btn btn-primary btn-md" onclick="location.href ='#';" ># of active partners</button>
        <button class="btn btn-danger btn-md"># of online offers</button>
    <button class="btn btn-danger btn-md" onclick="location.href ='${partnerDetailsURL}';"># Add/Edit partner</button>
     <button class="btn btn-danger btn-md">Add Offers</button>
     
     </div>
</div>









