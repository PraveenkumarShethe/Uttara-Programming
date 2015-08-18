<!-- The Identity Transformation -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <!-- Whenever you match any node or any attribute -->
  <xsl:template match="node()|@*">
    <!-- Copy the current node -->
    <xsl:copy>
      <!-- Including any attributes it has and any child nodes -->
      <xsl:apply-templates select="@*|node()"/>
    </xsl:copy>
  </xsl:template>
	
	
	
	
	<!-- Built In Templates -->
<!--	
	<xsl:template match="/|*">
		<xsl:apply-templates/>
	</xsl:template>
	<xsl:template match="text() | @*">
		<xsl:value-of select="."/>
	</xsl:template>
	
	<xsl:template match="processing-instruction() | comment() "/>  -->
	
	<!-- End Build In templates -->
	
</xsl:stylesheet>

