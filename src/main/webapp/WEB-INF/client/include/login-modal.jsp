<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 로그인이 뜨는 모달부분 -->
<div class="modal fade" id="myModal88" tabindex="-1" role="dialog" aria-labelledby="myModal88"
     aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">로그인 / 회원가입</h4>
            </div>
            <div class="modal-body modal-body-sub">
                <div class="row">
                    <div class="col-md-8 modal_body_left modal_body_left1"
                         style="border-right: 1px dotted #C2C2C2;padding-right:3em;">
                        <div class="sap_tabs">
                            <div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
                                <ul>
                                    <li class="resp-tab-item" aria-controls="tab_item-0"><span>Login</span></li>
                                    <li class="resp-tab-item" aria-controls="tab_item-1"><span>Join us</span></li>
                                </ul>
                                <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
                                    <div class="facts">
                                        <div class="register">
                                            <form action="index.do" method="post"><!-- 로그인 -->
                                                <input name="customerTbEmail" placeholder="Email Address" type="text" required="">
                                                <input name="customerTbPassword" placeholder="Password" type="password"
                                                       required="">
                                                <div class="sign-up">
                                                    <input type="submit" value="Sign in"/>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                                <div class="tab-2 resp-tab-content" aria-labelledby="tab_item-1">
                                    <div class="facts">
                                        <div class="register">
                                            <form action="registry.do" method="post"><!-- 회원가입 -->
                                                <input placeholder="Name" name="customerTbName" type="text" required="">
                                                <input placeholder="Email Address" name="customerTbEmail" type="email"
                                                       required="">
                                                <input placeholder="Password" name="customerTbPassword" type="password"
                                                       required="">
                                                <input placeholder="Confirm Password" name="Password" type="password"
                                                       required="">
                                                <div class="sign-up">
                                                    <input type="submit" value="Create Account"/>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div id="OR" class="hidden-xs">OR</div>
                    </div>
                    <div class="col-md-4 modal_body_right modal_body_right1">
                        <div class="row text-center sign-with">
                            <div class="col-md-12">
                                <h3 class="other-nw">Sign in with</h3>
                            </div>
                            <div class="col-md-12">
                                <ul class="social">
                                    <li class="social_facebook"><a href="#" class="entypo-facebook"></a></li>
                                    <li class="social_dribbble"><a href="#" class="entypo-dribbble"></a></li>
                                    <li class="social_twitter"><a href="#" class="entypo-twitter"></a></li>
                                    <li class="social_behance"><a href="#" class="entypo-behance"></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--jQuery -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script><script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
    $(document).ready(function () {
        $("#deleteCategoryBtn").hide();

        $("#categorySelectBox").change(function () {
            var selectedValue = $("#categorySelectBox option:selected").val();
            console.log(selectedValue);
            if(selectedValue === 'thisIsInsert')
            {
                $("#categorySubmitButton").html('카테고리 추가');
                $("#deleteCategoryBtn").hide();
                $("#productCategoryTbNo").attr("value", 0);
                $("#productCategoryTbParent").removeAttr("value");
                $("#productCategoryTbMedian").removeAttr("value");
                $("#productCategoryTbSub").removeAttr("value");
                $("#formToController").attr("action", "product-category-insert.ado");
            }
            else
            {
                var ajaxUrl = "/product-category-single-ajax.ado?productCategoryTbNo="+selectedValue;
                $.ajax({
                    url: ajaxUrl,
                    type: "GET",
                    data: {},
                    dataType: "json"
                })
                    .done(function(json) {
                        console.log(json);
                        $("#productCategoryTbNo").attr("value", json.productCategoryTbNo);
                        $("#productCategoryTbParent").attr("value", json.productCategoryTbParent);
                        $("#productCategoryTbMedian").attr("value", json.productCategoryTbMedian);
                        $("#productCategoryTbSub").attr("value", json.productCategoryTbSub);
                        $("#categorySubmitButton").html('카테고리 수정');
                        $("#deleteCategoryBtn").show();
                        var deleteUrl = "/product-category-delete.ado?productCategoryTbNo="+json.productCategoryTbNo;
                        $("#deleteCategoryBtn").attr("href", deleteUrl);
                        $("#formToController").attr("action", "product-category-update.ado");
                    })
                    .fail(function (xhr, status, errorThrown) {
                        alert(errorThrown);
                    });
            }
        });
    })
</script>
