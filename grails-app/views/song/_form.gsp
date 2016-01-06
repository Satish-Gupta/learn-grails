<%@ page import="com.skg.learngrails.databind.mapbased.Song" %>



<div class="fieldcontain ${hasErrors(bean: songInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="song.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${songInstance?.name}"/>

</div>

