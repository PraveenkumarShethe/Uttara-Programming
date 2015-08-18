<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	
	
	<!-- The Out put from this empty Style Sheet is always plain text of xml elements NO ATRRIBUTES -->
	<!-- <xsl:template match="/"/> this will ignore Built in templates -->
	
	<!--  1  Adding Attribute to Existing Elment -->
	<!--		<xsl:import href="identity.xslt"/> 
	<xsl:template match="ROW/ENAME">
	<xsl:copy>
	<xsl:attribute name="newatt">static string</xsl:attribute>
	<xsl:apply-templates select="node()|@*"/>
	</xsl:copy>
	</xsl:template>	
	
	-->
	<!--   2  Adding Element to Existing Element Including Comments-->
	<!--	
	<xsl:import href="identity.xslt"/>
	
	<xsl:template match="ROW/ENAME">'
	<xsl:comment>adding new element</xsl:comment>
	
	<xsl:copy>
	<xsl:element name="MANJU">
	<xsl:attribute name="test">static string</xsl:attribute>
	</xsl:element>
	<xsl:apply-templates select="node()|@*"/>
	</xsl:copy>
	</xsl:template>  -->
	
<!-- 3 Call templaye Example  its like calling meth0d -->
	<xsl:import href="identity.xslt"/>
	
	
	
	<xsl:template match="ROW[2]">
    
		    <xsl:attribute name="num">
            <xsl:call-template name="replace-string">
                <xsl:with-param name="text" select="'http://localhost:8008/mas/rest/sub'" />
                <xsl:with-param name="replace" select="'mas/rest'" />
                <xsl:with-param name="with" select="'m2m'" />
            </xsl:call-template>
        </xsl:attribute>
   </xsl:template>
	
	
	 <xsl:template name="replace-string">
        <xsl:param name="text"/>
        <xsl:param name="replace" />
        <xsl:param name="with" />
		 <xsl:text>The value of $test is: </xsl:text>
    <xsl:value-of select="$replace"/>
        <xsl:choose>
            <xsl:when test="contains($text,$replace)">
                <xsl:value-of select="substring-before($text,$replace)" />
                <xsl:value-of select="$with" />
                <xsl:call-template name="replace-string">
                    <xsl:with-param name="text" select="substring-after($text,$replace)" />
                    <xsl:with-param name="replace" select="$replace" />
                    <xsl:with-param name="with" select="$with" />
                </xsl:call-template>
				
            </xsl:when>
            <xsl:otherwise>
				<xsl:text>The value of $test is: </xsl:text>
    <xsl:value-of select="$replace"/>
                <xsl:value-of select="$text" />
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>
	
	

	<xsl:template name="row_num">
      <xsl:param name="test"/>
	  <xsl:param name="test1"/>
	
 <xsl:text>The value of $test is: </xsl:text>
    <xsl:value-of select="$test"/>
		 <xsl:text>The value of $test1 is: </xsl:text>
    <xsl:value-of select="$test1"/> 
  </xsl:template>

	
		
	
	
</xsl:stylesheet>