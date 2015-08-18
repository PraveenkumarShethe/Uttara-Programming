<xsl:stylesheet version="1.0"  xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<!--	<xsl:output indent="no"></xsl:output>   -->
	
	<xsl:template match="/">
		<html>
			<body>
				<xsl:apply-templates></xsl:apply-templates> <!-- This will inform the XSLT processor to carry on processing my childrens
																& the result of the children node graph will be rendered here ( This This earch for Rules -->
			</body>
		</html>
			</xsl:template> 
		<xsl:template match="ROWSET">
			
			<table border="2" bgcolor="red"> <xsl:apply-templates></xsl:apply-templates>  </table>
			
		</xsl:template>
		
		<xsl:template match="ROW">
			
			<tr> <xsl:apply-templates></xsl:apply-templates>  </tr>
			
		</xsl:template>
		
		<xsl:template match="EMPNO">
			<td><xsl:apply-templates></xsl:apply-templates></td>
		</xsl:template>
		
		<xsl:template match="EMPNAME">
			<td><xsl:apply-templates></xsl:apply-templates></td>
		</xsl:template>
		

	</xsl:stylesheet>