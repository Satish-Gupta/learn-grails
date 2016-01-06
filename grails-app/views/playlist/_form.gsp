<%@ page import="com.skg.learngrails.databind.mapbased.Playlist" %>



<div class="fieldcontain ${hasErrors(bean: playlistInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="playlist.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${playlistInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: playlistInstance, field: 'songs', 'error')} ">
	<label for="songs">
		<g:message code="playlist.songs.label" default="Songs" />
		
	</label>
	<g:select name="songs" from="${com.skg.learngrails.databind.mapbased.Song.list()}" multiple="multiple" optionKey="id" size="5" value="${playlistInstance?.songs*.id}" class="many-to-many"/>

</div>

