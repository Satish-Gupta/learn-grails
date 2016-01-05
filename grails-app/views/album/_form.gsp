<%@ page import="com.skg.learngrails.databind.mapbased.Album" %>



<div class="fieldcontain ${hasErrors(bean: albumInstance, field: 'numberOfTracks', 'error')} required">
	<label for="numberOfTracks">
		<g:message code="album.numberOfTracks.label" default="Number Of Tracks" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="numberOfTracks" type="number" value="${albumInstance.numberOfTracks}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: albumInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="album.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" required="" value="${albumInstance?.title}"/>

</div>

