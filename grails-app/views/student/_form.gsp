<%@ page import="com.skg.learngrails.databind.mapbased.Student" %>



<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'courses', 'error')} ">
	<label for="courses">
		<g:message code="student.courses.label" default="Courses" />
		
	</label>
	<g:select name="courses" from="${com.skg.learngrails.databind.mapbased.Course.list()}" multiple="multiple" optionKey="id" size="5" value="${studentInstance?.courses*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="student.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${studentInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'roll', 'error')} required">
	<label for="roll">
		<g:message code="student.roll.label" default="Roll" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="roll" required="" value="${studentInstance?.roll}"/>

</div>

