package com.fastcampus.ch4.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class PageHandlerTest {
  @Test
  public void pageHandlerTest1(){
    PageHandler pageHandler = new PageHandler(250,1);
    pageHandler.print();
    System.out.println("pageHandler = " + pageHandler);
    assertTrue(pageHandler.getBeginPage() == 1);
    assertTrue(pageHandler.getEndPage() == 10);
  }
  @Test
  public void pageHandlerTest2(){
    PageHandler pageHandler = new PageHandler(250,11);
    pageHandler.print();
    System.out.println("pageHandler = " + pageHandler);
    assertTrue(pageHandler.getBeginPage() == 11);
    assertTrue(pageHandler.getEndPage() == 20);
  }
  @Test
  public void pageHandlerTest3(){
    PageHandler pageHandler = new PageHandler(255,25);
    pageHandler.print();
    System.out.println("pageHandler = " + pageHandler);
    assertTrue(pageHandler.getBeginPage() == 21);
    assertTrue(pageHandler.getEndPage() == 26);
  }
  @Test
  public void pageHandlerTest4(){
    PageHandler pageHandler = new PageHandler(255,10);
    pageHandler.print();
    System.out.println("pageHandler = " + pageHandler);
    assertTrue(pageHandler.getBeginPage() == 1);
    assertTrue(pageHandler.getEndPage() == 10);
  }
}