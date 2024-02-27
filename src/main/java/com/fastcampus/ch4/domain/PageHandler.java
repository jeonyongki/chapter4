package com.fastcampus.ch4.domain;

public class PageHandler {

  private int totalCnt; // 게시물의 총 갯수
  private int pageSize; // 한 페이지의 크기(페이지 row 갯수)
  private int naviSize = 10; // 페이지 네비게이션의 크기
  private int totalPage; // 전체 페이지의 갯수
  private int page; // 현제 페이지
  private int beginPage; // 화면에 보여줄 첫 페이지
  private int endPage; // 화면에 보여줄 마지막 페이지
  private boolean showPrev; // 이전 페이지로 이동하는 링크를 보여줄 것인지의 여부
  private boolean showNext; // 다음 페이지로 이동하는 링크를 보여줄 것인지의 여부

  public PageHandler(int totalCnt, int page){
      this(totalCnt, page, 10);
    }
  public PageHandler(int totalCnt, int page, int pageSize){
    this.totalCnt = totalCnt;
    this.page = page;
    this.pageSize = pageSize;
    //전체페이지 = 올림수(전체게시물수/10)
    totalPage = (int)Math.ceil(totalCnt/(float)pageSize);
    //시작페이지 = 공식(page/10) *10 일의자리는 버림 +1 ex)25/10*10 +1 = (int)21
    beginPage = (page/naviSize) * naviSize +1;
    //마지막페이지 = 전체페이지보다 작을수있으므로 둘중 작은값을 네비마지막 값으로 처리
    endPage = Math.min(beginPage+naviSize -1, totalPage);

    //이전, 이후 페이지 확인
    showPrev = beginPage != 1;//1부터시작 더이상 없음.
    showNext = endPage != totalPage;//다음페이지 없음.
  }
  void print(){
    System.out.println("page = " + page);
    System.out.print(showPrev ? "[PREV] " : "");
    for(int i=beginPage; i<=endPage; i++){
      System.out.print(i+" ");
    }
    System.out.println(showNext ? " [NEXT]": "");
  }

  public int getTotalCnt() {
    return totalCnt;
  }

  public void setTotalCnt(int totalCnt) {
    this.totalCnt = totalCnt;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public int getNaviSize() {
    return naviSize;
  }

  public void setNaviSize(int naviSize) {
    this.naviSize = naviSize;
  }

  public int getTotalPage() {
    return totalPage;
  }

  public void setTotalPage(int totalPage) {
    this.totalPage = totalPage;
  }

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  public int getBeginPage() {
    return beginPage;
  }

  public void setBeginPage(int beginPage) {
    this.beginPage = beginPage;
  }

  public int getEndPage() {
    return endPage;
  }

  public void setEndPage(int endPage) {
    this.endPage = endPage;
  }

  public boolean isShowPrev() {
    return showPrev;
  }

  public void setShowPrev(boolean showPrev) {
    this.showPrev = showPrev;
  }

  public boolean isShowNext() {
    return showNext;
  }

  public void setShowNext(boolean showNext) {
    this.showNext = showNext;
  }

  @Override
  public String toString() {
    return "PageHandler{" +
        "totalCnt=" + totalCnt +
        ", pageSize=" + pageSize +
        ", naviSize=" + naviSize +
        ", totalPage=" + totalPage +
        ", page=" + page +
        ", beginPage=" + beginPage +
        ", endPage=" + endPage +
        ", showPrev=" + showPrev +
        ", showNext=" + showNext +
        '}';
  }
}