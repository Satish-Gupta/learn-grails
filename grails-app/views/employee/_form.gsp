<%@ page import="com.skg.domain.constraints.Employee" %>



<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'empID', 'error')} required">
	<label for="empID">
		<g:message code="employee.empID.label" default="Emp ID" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="empID"  value="${employeeInstance?.empID}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'joinDate', 'error')} ">
	<label for="joinDate">
		<g:message code="employee.joinDate.label" default="Join Date" />
		
	</label>
	<g:textField name="joinDate" value="${employeeInstance?.joinDate}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'status', 'error')} required">
	<label for="status">
		<g:message code="employee.status.label" default="Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="status"  value="${employeeInstance?.status}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'department', 'error')} required">
	<label for="department">
		<g:message code="employee.department.label" default="Department" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="department"  value="${employeeInstance?.department}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'age', 'error')} ">
	<label for="age">
		<g:message code="employee.age.label" default="Age" />
		
	</label>
	<g:textField name="age" value="${employeeInstance?.age}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'project', 'error')} ">
	<label for="project">
		<g:message code="employee.project.label" default="Project" />
		
	</label>
	<g:textField name="project" value="${employeeInstance?.project}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="employee.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="email"  value="${employeeInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'designation', 'error')} ">
	<label for="designation">
		<g:message code="employee.designation.label" default="Designation" />
		
	</label>
	<g:textField name="designation" value="${employeeInstance?.designation}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'role', 'error')} required">
	<label for="role">
		<g:message code="employee.role.label" default="Role" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="role"  value="${employeeInstance?.role}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="employee.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" value="${employeeInstance?.name}"/>

</div>

