package com.jk.model;


import java.io.Serializable;

//图书表
public class BookBean implements Serializable {
    private static final long serialVersionUID = 3330569693911918194L;
    /**
     * ISBN	9787554604465
     * 版次	1
     * 包装	平装
     * 出版社	古吴轩出版社
     * 出版时间	2015-07-01
     * 开本	32开
     * 套装数量	4
     * 页数	296
     * 字数	150000
     * 用纸	胶版纸
     */
    private   Integer  bookISBN;
    //图书编码
    private   String  bookName;
    //图书名称

    private   Integer  bookAuthorId;
   //作者id
   private   String  bookAuthorName;
    //作者名字

    private   Integer  bookEdition;
    //版次
    private   String   bookPack;
    //包装

    private   Integer  bookHouseId;
    //出版社id
    private   String  bookHouseName;
    //出版社名字

    private   String   bookEndTime;
    //出版时间
    private   String   bookSize;
    //开本
    private   Integer  bookSuitCount;
    //套装数量
    private   Integer  bookPages;
    //页数
    private   Integer  bookWordsNumber;
    //字数

    private   Integer  bookWrapUpId;
    //用纸
    private   String  bookWrapUpName;
    //用纸名字


    private   String  bookInFor;
    //图书简介
    private   Long  bookPrice;
    //图书价格

    private   String bookImg;
    //图书封面


    public Integer getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(Integer bookISBN) {
        this.bookISBN = bookISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookAuthorId() {
        return bookAuthorId;
    }

    public void setBookAuthorId(Integer bookAuthorId) {
        this.bookAuthorId = bookAuthorId;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }

    public Integer getBookEdition() {
        return bookEdition;
    }

    public void setBookEdition(Integer bookEdition) {
        this.bookEdition = bookEdition;
    }

    public String getBookPack() {
        return bookPack;
    }

    public void setBookPack(String bookPack) {
        this.bookPack = bookPack;
    }

    public Integer getBookHouseId() {
        return bookHouseId;
    }

    public void setBookHouseId(Integer bookHouseId) {
        this.bookHouseId = bookHouseId;
    }

    public String getBookHouseName() {
        return bookHouseName;
    }

    public void setBookHouseName(String bookHouseName) {
        this.bookHouseName = bookHouseName;
    }

    public String getBookEndTime() {
        return bookEndTime;
    }

    public void setBookEndTime(String bookEndTime) {
        this.bookEndTime = bookEndTime;
    }

    public String getBookSize() {
        return bookSize;
    }

    public void setBookSize(String bookSize) {
        this.bookSize = bookSize;
    }

    public Integer getBookSuitCount() {
        return bookSuitCount;
    }

    public void setBookSuitCount(Integer bookSuitCount) {
        this.bookSuitCount = bookSuitCount;
    }

    public Integer getBookPages() {
        return bookPages;
    }

    public void setBookPages(Integer bookPages) {
        this.bookPages = bookPages;
    }

    public Integer getBookWordsNumber() {
        return bookWordsNumber;
    }

    public void setBookWordsNumber(Integer bookWordsNumber) {
        this.bookWordsNumber = bookWordsNumber;
    }

    public Integer getBookWrapUpId() {
        return bookWrapUpId;
    }

    public void setBookWrapUpId(Integer bookWrapUpId) {
        this.bookWrapUpId = bookWrapUpId;
    }

    public String getBookWrapUpName() {
        return bookWrapUpName;
    }

    public void setBookWrapUpName(String bookWrapUpName) {
        this.bookWrapUpName = bookWrapUpName;
    }

    public String getBookInFor() {
        return bookInFor;
    }

    public void setBookInFor(String bookInFor) {
        this.bookInFor = bookInFor;
    }

    public Long getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Long bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }


    @Override
    public String toString() {
        return "BookBean{" +
                "bookISBN=" + bookISBN +
                ", bookName='" + bookName + '\'' +
                ", bookAuthorId=" + bookAuthorId +
                ", bookAuthorName='" + bookAuthorName + '\'' +
                ", bookEdition=" + bookEdition +
                ", bookPack='" + bookPack + '\'' +
                ", bookHouseId=" + bookHouseId +
                ", bookHouseName='" + bookHouseName + '\'' +
                ", bookEndTime='" + bookEndTime + '\'' +
                ", bookSize='" + bookSize + '\'' +
                ", bookSuitCount=" + bookSuitCount +
                ", bookPages=" + bookPages +
                ", bookWordsNumber=" + bookWordsNumber +
                ", bookWrapUpId=" + bookWrapUpId +
                ", bookWrapUpName='" + bookWrapUpName + '\'' +
                ", bookInFor='" + bookInFor + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookImg='" + bookImg + '\'' +
                '}';
    }
}
