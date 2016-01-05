<%@ page import="com.skg.learngrails.databind.mapbased.Department" %>



<div class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'depID', 'error')} required">
	<label for="depID">
		<g:message code="department.depID.label" default="Dep ID" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="depID" required="" value="${departmentInstance?.depID}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="department.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${departmentInstance?.name}"/>

</div>

