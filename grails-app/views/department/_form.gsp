<%@ page import="com.skg.scopes.Department" %>



<div class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'depId', 'error')} required">
	<label for="depId">
		<g:message code="department.depId.label" default="Dep Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="depId" required="" value="${departmentInstance?.depId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="department.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${departmentInstance?.name}"/>

</div>

