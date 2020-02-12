<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="../include/header.jsp" />
   
        <!-- Start Bradcaump area -->
        <div class="ht__bradcaump__area" style="background: rgba(0, 0, 0, 0) url(/resources/client/images/bg/market.jpg) no-repeat scroll center center / cover ;">
            <div class="ht__bradcaump__wrap">
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="bradcaump__inner">
                                <nav class="bradcaump-inner">
                                  <a class="breadcrumb-item" href="index.html">Home</a>
                                  <span class="brd-separetor"><i class="zmdi zmdi-chevron-right"></i></span>
                                  <span class="breadcrumb-item active">Market</span>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Bradcaump area -->
        <!-- cart-main-area start -->
        <div class="checkout-wrap ptb--100">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="htc__product__leftsidebar">
                            <div class="htc__category">
                                <h4 class="title__line--4">Community</h4>
                                <ul class="ht__cat__list">
                                    <li><a href="#">공지</a></li>
                                    <li><a href="#">FAQ</a></li>
                                    <li><a href="#">Q&A</a></li>
                                    <li><a href="#">Review</a></li>
                                    <li><a href="#">Contact</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                     <div class="col-lg-8">
                        <div class="htc__blog__details__wrap">
                     <div class="ht__comment__form">
                                <h4 class="title__line--5">글쓰기</h4>
                                
                                  <form class="form-horizontal">
                              <div class="form-group">
                                 <label for="selector" class="col-sm-2 control-label"></label>
                              <div class="col-sm-8"><select name="selector" id="selector" class="form-control1">
                                 <option>판매</option>
                                 <option>구매</option>
                                 </select></div>
                              </div>
                              <div class="form-group">
                                 <label for="smallinput" class="col-sm-2 control-label label-input-sm">이름</label>
                                    <div class="col-sm-8">
                                        <input type="text" placeholder="Name *">
                                    </div>
                              </div>
                              <div class="form-group">
                                 <label for="email" class="col-sm-2 control-label label-input-sm">이메일</label>
                                    <div class="col-sm-8">
                                        <input type="email" id="email" placeholder="Email *">
                                    </div>
                              </div>
                              <div class="form-group">
                                 <label for="filename" class="col-sm-2 control-label label-input-sm">첨부파일</label>
                                    <div class="col-sm-8">
                                        <input type="file" id="filename" name="filename">
                                    </div>
                              </div>
                              <div class="form-group">
                                  
                                    <label for="message" class="col-sm-2 control-label">내용</label>
                                       <div class="col-sm-8"><textarea name="message" id="message" placeholder="Context *"></textarea></div>
                                 
                              </div>
                              <div class="form-group">
                              <div align="center" class="ht__comment__btn--2 mt--50 col-sm-10">
                                          <a class="fr__btn" href="#">확인</a>
                                          <a class="fr__btn" href="#">취소</a>
                                      </div>
                                      </div>
                        </form>                                                                                                       
                            </div>
                     </div>
                    </div>  
                </div>
            </div>
        </div>
        <!-- cart-main-area end -->
     
        
    
<jsp:include page="../include/footer.jsp" />