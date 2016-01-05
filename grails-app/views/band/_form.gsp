<%@ page import="com.skg.learngrails.databind.mapbased.Band" %>



<div class="fieldcontain ${hasErrors(bean: bandInstance, field: 'albums', 'error')} ">
	<label for="albums">
		<g:message code="band.albums.label" default="Albums" />
		
	</label>
	<g:select name="albums" from="${com.skg.learngrails.databind.mapbased.Album.list()}" multiple="multiple" optionKey="id" size="5" value="${bandInstance?.albums*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: bandInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="band.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${bandInstance?.name}"/>

</div>

