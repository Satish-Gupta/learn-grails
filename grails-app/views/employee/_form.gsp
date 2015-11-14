<%@ page import="com.skg.scopes.Employee" %>



<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'department', 'error')} required">
	<label for="department">
		<g:message code="employee.department.label" default="Department" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="department" name="department.id" from="${com.skg.scopes.Department.list()}" optionKey="id" required="" value="${employeeInstance?.department?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'empId', 'error')} required">
	<label for="empId">
		<g:message code="employee.empId.label" default="Emp Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="empId" required="" value="${employeeInstance?.empId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="employee.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${employeeInstance?.name}"/>

</div>

