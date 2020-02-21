<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 리뷰가 뜨는 모달부분 -->
    <div class="modal video-modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModal">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                </div>
                <section>
                    <div class="modal-body">
                        <div class="col-md-5 modal_body_left">
                            <img id="img" src="" alt="review image" class="img-responsive" />
                        </div>
                        <div class="col-md-7 modal_body_right">
                            <h4><a href="" id="productName"></a></h4>
                            <p id="reviewContent"></p>
                            <div class="rating modal_body_right_cart simpleCart_shelfItem">
                                <p>평점 : <i class="item_price">4.0</i></p>
                                <div class="clearfix"> </div>
                            </div>                      
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                </section>
            </div>
        </div>
    </div>