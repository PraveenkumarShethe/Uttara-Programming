<xsl:stylesheet version="1.0"  xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    
	
	<xsl:template match="/">
		<html>
			<head>
				<body>
					<xsl:for-each select="ROWSET">
						<table border="1">
							<xsl:for-each select="ROW">
								<tr>
									<td><xsl:value-of select="EMPNO"></xsl:value-of></td>
									<td><xsl:value-of select="EMPNAME"></xsl:value-of></td>
								</tr>
							</xsl:for-each>
							
							</table>
						
					</xsl:for-each>
				</body>
			</head>
		</html>
		
	</xsl:template>
	</xsl:stylesheet>