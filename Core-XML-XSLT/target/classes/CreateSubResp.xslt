<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"  
	xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:ns1="http://tecnomen.com/m2m">
	 
	<xsl:template match="@*|node()">
      <xsl:copy>
			<xsl:apply-templates select="@*|node()"/>		
		</xsl:copy>
    </xsl:template>
	
<xsl:template match="//ns1:createSubscriberResponse//ns1:password"></xsl:template> 


</xsl:stylesheet>

