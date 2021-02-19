<!DOCTYPE html>
<%@page import="java.util.stream.Collectors"%>
<%@page
	import="com.liferay.asset.kernel.service.AssetCategoryLocalServiceUtil"%>
<%@page
	import="com.liferay.asset.kernel.service.AssetVocabularyLocalServiceUtil"%>
<%@page import="com.liferay.asset.kernel.model.AssetCategory"%>
<%@page import="com.liferay.asset.kernel.model.AssetVocabulary"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/init.jsp"%>


<html>
<head>

<link class="jsbin"
	href="http://ajax.googleapis.com/ajax/libs/jqueryui/1/themes/base/jquery-ui.css"
	rel="stylesheet" type="text/css" />
<script class="jsbin"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script class="jsbin"
	src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.0/jquery-ui.min.js"></script>

<!-- Remember to include jQuery :) -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>

<!-- jQuery Modal -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />


<meta charset=utf-8 />
<title>JS Bin</title>
<style>
article, aside, figure, footer, header, hgroup, menu, nav, section {
	display: block;
}
</style>
</head>
<body>


	<portlet:actionURL var="uploadFile" name="uploadFileAction">
		<portlet:param name="mvcActionCommand"	value="saveActionPartnerDetails" />
		
		<c:if test="${empty partnerDetails}">
	   <portlet:param name="CMD-ACTION" value="" />	
	   </c:if>
	    <portlet:param name="CMD-ACTION" value="EDIT" />
	</portlet:actionURL>

	<form name="savePartner" method="post" enctype='multipart/form-data'
		action="${uploadFile}">
		<portlet:resourceURL id="/countries/regions" var="getRegions"></portlet:resourceURL>
		<div class="container">
			<div class="row">
				<div class="col-sm">
					<span> <label for="company name" class="w-10 p-1">Company
							Name</label></span> <span> <input type="text" class="w-100 p-3"
						id="companyName" name="<portlet:namespace/>companyName" value="${partnerDetails.partnername}"></span>
				</div>
			
				<div class="col-sm">
					<span> <label for="signatory" class="w-10 p-1">Signatory</label></span>
					<span> <input type="text" class="w-100 p-3" id="signatory"
						placeholder="signatory" name="<portlet:namespace/>signatory" value="${partnerDetails.signatory}"></span>
				</div>
			</div>
			<div class="row">
				<div class="col-sm">
					<span> <label for="licenseNumber" class="w-10 p-1">license
							Number</label></span> <span> <input type="text" class="w-100 p-3"
						id="licenseNumber" name="<portlet:namespace/>licenseNumber"
						value="${partnerDetails.licensename}"></span>
				</div>
				<!-- <div class="col-sm">
      One of three columns
    </div> -->
				<div class="col-sm">
					<span> <label for="company name" class="w-10 p-1">Signatory
							phone</label></span> <span> <input type="text" class="w-100 p-3"
						id="signatoryphone" value="${partnerDetails.signatoryphone}" name="<portlet:namespace/>signatoryphone"
						placeholder="Signatory phone"></span>
				</div>
			</div>

			<div class="row">
				<div class="col-sm">
					<label for="exampleFormControlSelect1">Countries</label> <select
						class="form-control" id="country" name="<portlet:namespace/>country">
						<option value="-1">--select--</option>
						<c:forEach items="${assetCategories}" var="country">
							<option value="${country.categoryId}" ${country.categoryId == partnerDetails.countryId ? 'selected="selected"' : ''}>${country.name}</option>
						</c:forEach>
					</select>
				</div>
			
				<div class="col-sm">
					<span> <label for="signatoryEmail" class="w-10 p-1">Signatory
							Email</label></span> <span> <input type="text" class="w-100 p-3"
						id="signatoryEmail" name="<portlet:namespace/>signatoryemail"
						placeholder="Signatory Email"  value="${partnerDetails.signatoryemail}"></span>
				</div>

			</div>
			<div class="row">
				<div class="col-sm">

					<span> <label for="company name" class="w-10 p-1">Regions</label></span>
					<span> <select multiple class="form-control" id="region" name="<portlet:namespace/>region"></select></span>


					<span> <label for="address" class="w-10 p-1">Description/Address</label></span>
					<span> <textarea class="form-control" id="address" name="<portlet:namespace/>address" ></textarea></span> <span> <label
						for="company name" class="w-10 p-1">Company Email</label></span> <span>
						<input type="text" class="form-control" id="companyEmail"
						name="<portlet:namespace/>companyEmail" value="${partnerDetails.companyemail}">
					</span> <span> <label for="company Phone" class="w-10 p-1">Company
							Phone</label></span> <span> <input type="text" class="form-control"
						id="companyPhone" name="<portlet:namespace/>companyPhone" value="${partnerDetails.companyphone}" ></span> <span>
						<label for="company name" class="w-10 p-1">Company P.O</label>
					</span> <span> <input type="text" class="form-control" value="${partnerDetails.companyPO}"
						id="companyPO"  name="<portlet:namespace/>companyPO" >
					</span>



				</div>

				<div class="col-sm">
					<table class="table  table-bordered">
						<thead>
							<tr>
								<th scope="col">#</th>
								<th scope="col">File Name</th>
								<th scope="col">File Type</th>
								<th scope="col">options</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th scope="row">1</th>
								<td>Trade License</td>
								<td><p>
										<a href="#TL" id="tradeLicense">view</a>
									</p></td>
								<td><label for="tradeLicenseFile" class="btn">Select
										TL file</label><input type='file' id="tradeLicenseFile"
									name="<portlet:namespace/>tradeLicenseFile"
									style="visibility: hidden;"></td>
							</tr>
							<tr>
								<th scope="row">2</th>
								<td>Establishment Card</td>
								<td><p>
										<a href="#EC" id="establishmentCard">view</a>
									</p></td>
								<td><label for="establishmentCardFile" class="btn">Select
										EC file</label><input type='file' id="establishmentCardFile"
									name="<portlet:namespace/>establishmentCardFile"
									style="visibility: hidden;"></td>
							</tr>
							<tr>
								<th scope="row">3</th>
								<td>Agreement</td>
								<td><p>
										<a href="#SA" id="signedAgreement">view</a>
									</p></td>
								<td><label for="signedAgreementFile" class="btn">Select
										SA file</label><input type='file' id="signedAgreementFile"
									name="<portlet:namespace/>signedAgreementFile"
									style="visibility: hidden;"></td>
							</tr>
							<tr>
								<th scope="row">4</th>
								<td>Emirates Id</td>
								<td><p>
										<a href="#EID" id="emiratesId">view</a>
									</p></td>
								<td><label for="emiratesIdFile" class="btn">Select
										EID file</label><input type='file' id="emiratesIdFile"
									name="<portlet:namespace/>emiratesIdFile"
									style="visibility: hidden;"></td>
							</tr>
						</tbody>
					</table>
					<span> <label for="partnerStatus" class="w-10 p-1">Partner
							Status</label></span> <span> <select class="form-control" name="<portlet:namespace/>partnerStatus" id="status">
							<option value="Active">Active</option>
							<option value="InActive">InActive</option>
					</select>
					</span>


				</div>

			</div>



		</div>




		<input type="submit" name="save" value="save Details" />

		<!-- Modal HTML embedded directly into document -->
		<div id="TL" class="modal">
			<img id=tradeLicenseDiv src="#" alt="your image" /> <a href="#"
				rel="modal:close">Close</a>
		</div>
		<!-- Modal HTML embedded directly into document -->
		<div id="EC" class="modal">
			<img id="establishmentCardDiv" src="#" alt="your image" /> <a
				href="#" rel="modal:close">Close</a>
		</div>
		<!-- Modal HTML embedded directly into document -->
		<div id="SA" class="modal">
			<img id="signedAgreementDiv" src="#" alt="your image" /> <a href="#"
				rel="modal:close">Close</a>
		</div>
		<!-- Modal HTML embedded directly into document -->
		<div id="EID" class="modal">
			<img id="emiratesIdDiv" src="#" alt="your image" /> <a href="#"
				rel="modal:close">Close</a>
		</div>



		<script type="text/javascript">
$(document).ready(function(){
	
	

	$("#tradeLicense").click(function(){		
		 $('#tradeLicenseDiv').show();	 
		 $("#tradeLicense").attr("rel","modal:open");

	});
	$("#establishmentCard").click(function(){		
		 $('#establishmentCardDiv').show();	 
		 $("#establishmentCard").attr("rel","modal:open");

	});
	$("#signedAgreement").click(function(){		
		 $('#signedAgreementDiv').show();	 
		 $("#signedAgreement").attr("rel","modal:open");

	});
	$("#emiratesId").click(function(){		
		 $('#emiratesIdDiv').show();	 
		 $("#emiratesId").attr("rel","modal:open");

	});
	
	
	$("#tradeLicenseFile").change(function(){
		if (this.files && this.files[0]) {
	        var reader = new FileReader();
	        reader.onload = function (e) {
	            $('#tradeLicenseDiv')
	                .attr('src', e.target.result);
	                /* .width(500)
	                .height(600);  */
	        };
	        reader.readAsDataURL(this.files[0]);
	    }		
		 $('#tradeLicenseDiv').hide();
	});
	$("#establishmentCardFile").change(function(){
		if (this.files && this.files[0]) {
	        var reader = new FileReader();
	        reader.onload = function (e) {
	            $('#establishmentCardDiv')
	                .attr('src', e.target.result);
	                /* .width(500)
	                .height(600);  */
	        };
	        reader.readAsDataURL(this.files[0]);
	    }		
		 $('#establishmentCardDiv').hide();
	});
	$("#signedAgreementFile").change(function(){
		if (this.files && this.files[0]) {
	        var reader = new FileReader();
	        reader.onload = function (e) {
	            $('#signedAgreementDiv')
	                .attr('src', e.target.result);
	                /* .width(500)
	                .height(600);  */
	        };
	        reader.readAsDataURL(this.files[0]);
	    }		
		 $('#signedAgreementDiv').hide();
	});
	$("#emiratesIdFile").change(function(){
		if (this.files && this.files[0]) {
	        var reader = new FileReader();
	        reader.onload = function (e) {
	            $('#emiratesIdDiv')
	                .attr('src', e.target.result);
	                /* .width(500)
	                .height(600);  */
	        };
	        reader.readAsDataURL(this.files[0]);
	    }		
		 $('#emiratesIdDiv').hide();
	});
	
$("#country").change(function() {
	alert("on change");
	var url="${getRegions}";
	
	  $.ajax({
	        url: "${getRegions}" ,
	        type: 'POST',
	        datatype:'json',
	        data: { 
	        	'<portlet:namespace />countryId': $("#country").val() 
		      },
	            success: function(data){          	
	            
	            	$('#region').html('');
	            var content= JSON.parse(data);
	            // to clear the previous option
	            $.each(content, function(i, state) {
	                $('#region').append($('<option>').text(state.name).attr('value', state.stateId));
	            });
	        }
	    });
  }); 
$("#country").change();
$("#country").trigger('change');
});
</script>


	</form>
</body>
</html>