<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xs="http://www.w3.org/2001/XMLSchema"
                xmlns:jxb="http://java.sun.com/xml/ns/jaxb">
    <xsl:output encoding="UTF-8" indent="yes" xml:space="default"/>

    <xsl:variable name="newline">
        <xsl:text>
</xsl:text>
    </xsl:variable>

    <xsl:template match="/">
        <jxb:bindings>
            <jxb:bindings schemaLocation="schemas.ppsr.gov.au.2011.04.data.xsd">
                <xsl:apply-templates select="//xs:complexType"/>
                <xsl:apply-templates select="//xs:simpleType"/>
            </jxb:bindings>
        </jxb:bindings>
    </xsl:template>

    <xsl:template match="xs:complexType">
        <xsl:variable name="typeName" select="@name"/>
        <xsl:call-template name="produceBinding">
            <xsl:with-param name="typeName" select="$typeName"/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template match="xs:simpleType">
        <xsl:variable name="typeName" select="@name"/>
        <xsl:call-template name="produceBinding">
            <xsl:with-param name="typeName" select="$typeName"/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template name="produceBinding">
        <xsl:param name="typeName"/>
        <xsl:variable name="checkElement">
            <xsl:call-template name="checkElement">
                <xsl:with-param name="typeName" select="$typeName"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:choose>
            <xsl:when test="contains($checkElement, 'true')">
                <jxb:bindings multiple="true">
                    <xsl:attribute name="node">//xs:element[@name=&quot;<xsl:value-of select="$typeName"/>&quot;]</xsl:attribute>
                    <jxb:property>
                        <xsl:attribute name="name">
                            <xsl:value-of select="$typeName"/>Element</xsl:attribute>
                    </jxb:property>
                </jxb:bindings>
                <xsl:value-of select="$newline"/>
            </xsl:when>
            <!--<xsl:otherwise>
                <notRepeating>
                    <xsl:value-of select="$typeName"/>
                </notRepeating>
            </xsl:otherwise>-->
        </xsl:choose>
    </xsl:template>

    <xsl:template name="checkElement">
        <xsl:param name="typeName"/>
        <xsl:for-each select="//xs:element">
            <xsl:variable name="elementName" select="./@name"/>
            <xsl:choose>
                <xsl:when test="$elementName=$typeName">
                    <xsl:value-of select="'true'"/>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="'false'"/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:for-each>

    </xsl:template>

</xsl:stylesheet>