package com.gatakalfzzah.consumer.network.models.response;

import com.gatakalfzzah.consumer.models.BookingData;

import java.util.List;

public class BookingDetail {

private Integer currentPage;
private List<BookingData> data = null;
private String firstPageUrl;
private Integer from;
private Integer lastPage;
private String lastPageUrl;
private String nextPageUrl;
private String path;
private Integer perPage;
private Object prevPageUrl;
private Integer to;
private Integer total;

public Integer getCurrentPage() {
return currentPage;
}

public void setCurrentPage(Integer currentPage) {
this.currentPage = currentPage;
}

public List<BookingData> getData() {
return data;
}

public void setData(List<BookingData> data) {
this.data = data;
}

public String getFirstPageUrl() {
return firstPageUrl;
}

public void setFirstPageUrl(String firstPageUrl) {
this.firstPageUrl = firstPageUrl;
}

public Integer getFrom() {
return from;
}

public void setFrom(Integer from) {
this.from = from;
}

public Integer getLastPage() {
return lastPage;
}

public void setLastPage(Integer lastPage) {
this.lastPage = lastPage;
}

public String getLastPageUrl() {
return lastPageUrl;
}

public void setLastPageUrl(String lastPageUrl) {
this.lastPageUrl = lastPageUrl;
}

public String getNextPageUrl() {
return nextPageUrl;
}

public void setNextPageUrl(String nextPageUrl) {
this.nextPageUrl = nextPageUrl;
}

public String getPath() {
return path;
}

public void setPath(String path) {
this.path = path;
}

public Integer getPerPage() {
return perPage;
}

public void setPerPage(Integer perPage) {
this.perPage = perPage;
}

public Object getPrevPageUrl() {
return prevPageUrl;
}

public void setPrevPageUrl(Object prevPageUrl) {
this.prevPageUrl = prevPageUrl;
}

public Integer getTo() {
return to;
}

public void setTo(Integer to) {
this.to = to;
}

public Integer getTotal() {
return total;
}

public void setTotal(Integer total) {
this.total = total;
}

}