<%@ page import="com.skg.learngrails.databind.mapbased.Employee" %>



<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'department', 'error')} required">
	<label for="department">
		<g:message code="employee.department.label" default="Department" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="department" name="department.id" from="${com.skg.learngrails.databind.mapbased.Department.list()}" optionKey="id" required="" value="${employeeInstance?.department?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'empID', 'error')} required">
	<label for="empID">
		<g:message code="employee.empID.label" default="Emp ID" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="empID" required="" value="${employeeInstance?.empID}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="employee.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${employeeInstance?.name}"/>

</div>

