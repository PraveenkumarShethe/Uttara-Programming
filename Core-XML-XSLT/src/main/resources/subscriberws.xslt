<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsd="http://www.w3.org/2001/XMLSchema/"
	xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
	
	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()"/>
		</xsl:copy>
	</xsl:template>
	
	<xsl:template match="//wsdl:operation[@name='deleteSubscriber']">
		 <xsl:text>The value of Manju </xsl:text>
	</xsl:template>
	
</xsl:stylesheet>