package com.xxx.domain;

public class Books {

    private Integer bookId;
    private String bookName;
    private Integer bookCount;
    private String detail;

    @Override
    public String toString() {
        return "book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookCount=" + bookCount +
                ", detail='" + detail + '\'' +
                '}';
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookCount() {
        return bookCount;
    }

    public void setBookCount(Integer bookCount) {
        this.bookCount = bookCount;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
