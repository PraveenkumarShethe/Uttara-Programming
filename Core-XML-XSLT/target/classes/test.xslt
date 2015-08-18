<xsl:stylesheet version="1.0"      
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"    
    xmlns:ns1="http://samplecomp.com" 
    xmlns:dept="http://mycomp.org"
    exclude-result-prefixes="ns1 xsl dept">  
<xsl:import href="identity.xslt"/>
    <xsl:template match="ns1:DeptResponse">         
      <!--  <xsl:apply-templates select="@*|node()"/> -->     
    </xsl:template>
<!--
    <xsl:template match="*">        
        <xsl:element name="{local-name()}">             
            <xsl:apply-templates select="@*|node()"/>        
        </xsl:element>    
    </xsl:template> 

    <xsl:template match="@*">        
        <xsl:attribute name="{local-name()}" select="."/>  
    </xsl:template> 

    <xsl:template match="text()|processing-instruction()|comment()">        
        <xsl:copy>             
            <xsl:apply-templates select="@*|node()"/>        
        </xsl:copy>    
    </xsl:template>  -->

</xsl:stylesheet>