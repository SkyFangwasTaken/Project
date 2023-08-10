//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.10 at 10:37:56 PM PST 
//


package com.actimizewebservice.api.actimize;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RealTimeWSProviderReturn">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="addtionalData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="hasHits" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hits">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hits_InnerSet">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RealTimeWSProvider_Hits_InnerSet_TupleType" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="additionalInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="alertID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="searchId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "realTimeWSProviderReturn",
    "hasHits",
    "hits",
    "alertID",
    "searchId"
})
@XmlRootElement(name = "RealTimeWSProviderResponse")
public class RealTimeWSProviderResponse {

    @XmlElement(name = "RealTimeWSProviderReturn", required = true)
    protected RealTimeWSProviderResponse.RealTimeWSProviderReturn realTimeWSProviderReturn;
    protected boolean hasHits;
    @XmlElement(required = true)
    protected RealTimeWSProviderResponse.Hits hits;
    protected long alertID;
    @XmlElement(required = true)
    protected String searchId;

    /**
     * Gets the value of the realTimeWSProviderReturn property.
     * 
     * @return
     *     possible object is
     *     {@link RealTimeWSProviderResponse.RealTimeWSProviderReturn }
     *     
     */
    public RealTimeWSProviderResponse.RealTimeWSProviderReturn getRealTimeWSProviderReturn() {
        return realTimeWSProviderReturn;
    }

    /**
     * Sets the value of the realTimeWSProviderReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealTimeWSProviderResponse.RealTimeWSProviderReturn }
     *     
     */
    public void setRealTimeWSProviderReturn(RealTimeWSProviderResponse.RealTimeWSProviderReturn value) {
        this.realTimeWSProviderReturn = value;
    }

    /**
     * Gets the value of the hasHits property.
     * 
     */
    public boolean isHasHits() {
        return hasHits;
    }

    /**
     * Sets the value of the hasHits property.
     * 
     */
    public void setHasHits(boolean value) {
        this.hasHits = value;
    }

    /**
     * Gets the value of the hits property.
     * 
     * @return
     *     possible object is
     *     {@link RealTimeWSProviderResponse.Hits }
     *     
     */
    public RealTimeWSProviderResponse.Hits getHits() {
        return hits;
    }

    /**
     * Sets the value of the hits property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealTimeWSProviderResponse.Hits }
     *     
     */
    public void setHits(RealTimeWSProviderResponse.Hits value) {
        this.hits = value;
    }

    /**
     * Gets the value of the alertID property.
     * 
     */
    public long getAlertID() {
        return alertID;
    }

    /**
     * Sets the value of the alertID property.
     * 
     */
    public void setAlertID(long value) {
        this.alertID = value;
    }

    /**
     * Gets the value of the searchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchId() {
        return searchId;
    }

    /**
     * Sets the value of the searchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchId(String value) {
        this.searchId = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="hits_InnerSet">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RealTimeWSProvider_Hits_InnerSet_TupleType" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="additionalInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hitsInnerSet"
    })
    public static class Hits {

        @XmlElement(name = "hits_InnerSet", required = true)
        protected RealTimeWSProviderResponse.Hits.HitsInnerSet hitsInnerSet;

        /**
         * Gets the value of the hitsInnerSet property.
         * 
         * @return
         *     possible object is
         *     {@link RealTimeWSProviderResponse.Hits.HitsInnerSet }
         *     
         */
        public RealTimeWSProviderResponse.Hits.HitsInnerSet getHitsInnerSet() {
            return hitsInnerSet;
        }

        /**
         * Sets the value of the hitsInnerSet property.
         * 
         * @param value
         *     allowed object is
         *     {@link RealTimeWSProviderResponse.Hits.HitsInnerSet }
         *     
         */
        public void setHitsInnerSet(RealTimeWSProviderResponse.Hits.HitsInnerSet value) {
            this.hitsInnerSet = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="RealTimeWSProvider_Hits_InnerSet_TupleType" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="additionalInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "realTimeWSProviderHitsInnerSetTupleType"
        })
        public static class HitsInnerSet {

            @XmlElement(name = "RealTimeWSProvider_Hits_InnerSet_TupleType", required = true)
            protected List<RealTimeWSProviderResponse.Hits.HitsInnerSet.RealTimeWSProviderHitsInnerSetTupleType> realTimeWSProviderHitsInnerSetTupleType;

            /**
             * Gets the value of the realTimeWSProviderHitsInnerSetTupleType property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the realTimeWSProviderHitsInnerSetTupleType property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRealTimeWSProviderHitsInnerSetTupleType().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RealTimeWSProviderResponse.Hits.HitsInnerSet.RealTimeWSProviderHitsInnerSetTupleType }
             * 
             * 
             */
            public List<RealTimeWSProviderResponse.Hits.HitsInnerSet.RealTimeWSProviderHitsInnerSetTupleType> getRealTimeWSProviderHitsInnerSetTupleType() {
                if (realTimeWSProviderHitsInnerSetTupleType == null) {
                    realTimeWSProviderHitsInnerSetTupleType = new ArrayList<RealTimeWSProviderResponse.Hits.HitsInnerSet.RealTimeWSProviderHitsInnerSetTupleType>();
                }
                return this.realTimeWSProviderHitsInnerSetTupleType;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="additionalInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "additionalInfo",
                "score"
            })
            public static class RealTimeWSProviderHitsInnerSetTupleType {

                @XmlElement(required = true)
                protected String additionalInfo;
                protected int score;

                /**
                 * Gets the value of the additionalInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdditionalInfo() {
                    return additionalInfo;
                }

                /**
                 * Sets the value of the additionalInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdditionalInfo(String value) {
                    this.additionalInfo = value;
                }

                /**
                 * Gets the value of the score property.
                 * 
                 */
                public int getScore() {
                    return score;
                }

                /**
                 * Sets the value of the score property.
                 * 
                 */
                public void setScore(int value) {
                    this.score = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="addtionalData" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "addtionalData",
        "message",
        "returnCode"
    })
    public static class RealTimeWSProviderReturn {

        @XmlElement(required = true, nillable = true)
        protected String addtionalData;
        @XmlElement(required = true)
        protected String message;
        @XmlElement(required = true)
        protected String returnCode;

        /**
         * Gets the value of the addtionalData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddtionalData() {
            return addtionalData;
        }

        /**
         * Sets the value of the addtionalData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddtionalData(String value) {
            this.addtionalData = value;
        }

        /**
         * Gets the value of the message property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessage() {
            return message;
        }

        /**
         * Sets the value of the message property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessage(String value) {
            this.message = value;
        }

        /**
         * Gets the value of the returnCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReturnCode() {
            return returnCode;
        }

        /**
         * Sets the value of the returnCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReturnCode(String value) {
            this.returnCode = value;
        }

    }

}