<xsl:stylesheet version="1.0"  xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    
	<!-- Each Rule is Called a template because the literal element and attribute contained inside the 
		body of the rule act as a blueprint for constructing a part of the result tree -->
	<xsl:import href="identity.xslt"/>
	<xsl:template match="ROWSET/ROW[ENAME]">
		<Employee id="MANJU-{EMPNO}"> <!-- Creating New Element and adding attribute and another 
										  element as child element to Employee -->
			<xsl:value-of select="ENAME"/>
			</Employee>
		
		
		<!-- U are Started in Right Way -->
	</xsl:template>
	</xsl:stylesheet>