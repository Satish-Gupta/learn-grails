<%@ page import="com.skg.learngrails.databind.mapbased.Course" %>



<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'courseID', 'error')} required">
	<label for="courseID">
		<g:message code="course.courseID.label" default="Course ID" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="courseID" required="" value="${courseInstance?.courseID}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="course.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${courseInstance?.name}"/>

</div>

