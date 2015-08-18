<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">	
	
	<!-- <xsl:import href="identity.xslt"/> -->
	
	
	
	  <!-- Whenever you match any node or any attribute -->
  <xsl:template match="node()|@*">
    <!-- Copy the current node -->
    <xsl:copy>
      <!-- Including any attributes it has and any child nodes -->
      <xsl:apply-templates select="@*|node()"/>
    </xsl:copy>
  </xsl:template>
	<xsl:template match="Phone"/>  
</xsl:stylesheet>