<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <style>
                    table {
                        width: 100%;
                        border-collapse: collapse;
                    }
                    th, td {
                        padding: 8px;
                        text-align: left;
                        border: 1px solid #ddd;
                    }
                    th {
                        background-color: #f2f2f2;
                    }
                    h2 {
                        color: green;
                        text-align: center;
                    }
                </style>
            </head>
            <body>
                <h2>Books</h2>
                <table>
                    <tr style="color:grey;">
                        <th>Title</th>
                        <th>Author</th>
                        <th>ISBN</th>
                        <th>Publisher</th>
                        <th>Edition</th>
                        <th>Price</th>
                    </tr>
                    <xsl:for-each select="bookdetails/book">
                    <tr>
                        <td style="color:red; font-family: 'Comic Sans MS';">
                            <xsl:value-of select="title"/>
                        </td>
                        <td style="text-transform: capitalize; font-weight:bold; text-align:center;">
                            <xsl:value-of select="author"/>
                        </td>
                        <td style="color:blue;">
                            <xsl:value-of select="isbn"/>
                        </td>
                        <td style="color:green; font-weight:bold; text-align:center;">
                            <xsl:value-of select="publisher"/>
                        </td>
                        <td style="color:pink; text-align:center;">
                            <xsl:value-of select="edition"/>
                        </td>
                        <td style="color:violet; font-weight:bold;">
                            <xsl:value-of select="price"/>
                        </td>
                    </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
+