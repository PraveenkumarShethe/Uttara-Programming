<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	
	<xsl:template match="/|*">
		<xsl:apply-templates/>
	</xsl:template>
	<xsl:template match="text() | @*">
		<xsl:value-of select="."/>
	</xsl:template>
	
	<xsl:template match="processing-instruction() | comment() "/>
	
	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()"/>
		</xsl:copy>
	</xsl:template>
	
</xsl:stylesheet>