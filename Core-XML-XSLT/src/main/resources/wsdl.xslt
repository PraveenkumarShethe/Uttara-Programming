<?xml version="1.0"?>
<!-- 
    XSL for transforming the WSDL port binding address
    from MAS-specific URI to M2M-proxy-specific URI 
    
    @author sampo
     
 -->
<xsl:stylesheet version="1.0" 
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
    xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/">

    <xsl:template match="@*|node()">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()" />
        </xsl:copy>
    </xsl:template>
    <xsl:template match="@location[parent::soap:address]">
        <xsl:attribute name="location">
            <xsl:call-template name="replace-string">
                <xsl:with-param name="text" select="." />
                <xsl:with-param name="replace" select="'mas/rest'" />
                <xsl:with-param name="with" select="'m2m'" />
            </xsl:call-template>
        </xsl:attribute>
    </xsl:template>


    <xsl:template name="replace-string">
        <xsl:param name="text"/>
        <xsl:param name="replace" />
        <xsl:param name="with" />
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
                <xsl:value-of select="$text" />
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>
</xsl:stylesheet>