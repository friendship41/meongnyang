<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="kor">
<jsp:include page="../include/head.jsp"/>
<body>

<!-- Page Container -->
<div class="page-container">
    <!-- Page Sidebar -->
    <jsp:include page="../include/page-sidebar.jsp"/>
    <!-- /Page Sidebar -->

    <!-- Page Content -->
    <div class="page-content">
        <!-- Page Header -->
        <jsp:include page="../include/page-header.jsp"/>
        <!-- /Page Header -->
        <!-- Page Inner -->
        <div class="page-inner">
            <div class="page-title">
                <h3 class="breadcrumb-header">상품 상세현황</h3>
            </div>
            <div id="main-wrapper">
                <!-- row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">주문현황</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control"
                                                           placeholder="01/01/2020">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control"
                                                           placeholder="01/15/2020" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <button type="submit" class="btn btn-success center-block"
                                                            style="margin-bottom:14px;">조회
                                                    </button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <div class="table-responsive">
                                    <table id="orderTable" class="display table" style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>주문번호</th>
                                            <th>주문상품</th>
                                            <th>주문자명</th>
                                            <th>주문금액</th>
                                            <th>주문일자</th>
                                            <th>주문상태</th>
                                        </tr>
                                        </thead>
                                        <tfoot>
                                        <tr>
                                            <th>주문번호</th>
                                            <th>주문상품</th>
                                            <th>주문자명</th>
                                            <th>주문금액</th>
                                            <th>주문일자</th>
                                            <th>주문상태</th>
                                        </tr>
                                        </tfoot>
                                        <tbody>
                                        <tr>
                                            <td>000002</td>
                                            <td>개 사료 외 1종</td>
                                            <td>안창호</td>
                                            <td>150,000</td>
                                            <td>2011/04/25</td>
                                            <td><span class="label label-nowGo">배송중</span></td>
                                        </tr>
                                        <tr>
                                            <td>000003</td>
                                            <td>개 사료 외 1종</td>
                                            <td>안창호</td>
                                            <td>150,000</td>
                                            <td>2011/04/25</td>
                                            <td><span class="label label-nowGo">배송중</span></td>
                                        </tr>
                                        <tr>
                                            <td>000001</td>
                                            <td>켓타워 외 2종</td>
                                            <td>최창호</td>
                                            <td>336,000</td>
                                            <td>2008/11/28</td>
                                            <td><span class="label label-success">배송완료</span></td>
                                        </tr>
                                        <tr>
                                            <td>Ashton Cox</td>
                                            <td>Junior Technical Author</td>
                                            <td>San Francisco</td>
                                            <td>66</td>
                                            <td>2009/01/12</td>
                                            <td>$86,000</td>
                                        </tr>
                                        <tr>
                                            <td>Cedric Kelly</td>
                                            <td>Senior Javascript Developer</td>
                                            <td>Edinburgh</td>
                                            <td>22</td>
                                            <td>2012/03/29</td>
                                            <td>$433,060</td>
                                        </tr>
                                        <tr>
                                            <td>Brielle Williamson</td>
                                            <td>Integration Specialist</td>
                                            <td>New York</td>
                                            <td>61</td>
                                            <td>2012/12/02</td>
                                            <td>$372,000</td>
                                        </tr>
                                        <tr>
                                            <td>Herrod Chandler</td>
                                            <td>Sales Assistant</td>
                                            <td>San Francisco</td>
                                            <td>59</td>
                                            <td>2012/08/06</td>
                                            <td>$137,500</td>
                                        </tr>
                                        <tr>
                                            <td>Rhona Davidson</td>
                                            <td>Integration Specialist</td>
                                            <td>Tokyo</td>
                                            <td>55</td>
                                            <td>2010/10/14</td>
                                            <td>$327,900</td>
                                        </tr>
                                        <tr>
                                            <td>Colleen Hurst</td>
                                            <td>Javascript Developer</td>
                                            <td>San Francisco</td>
                                            <td>39</td>
                                            <td>2009/09/15</td>
                                            <td>$205,500</td>
                                        </tr>
                                        <tr>
                                            <td>Sonya Frost</td>
                                            <td>Software Engineer</td>
                                            <td>Edinburgh</td>
                                            <td>23</td>
                                            <td>2008/12/13</td>
                                            <td>$103,600</td>
                                        </tr>
                                        <tr>
                                            <td>Jena Gaines</td>
                                            <td>Office Manager</td>
                                            <td>London</td>
                                            <td>30</td>
                                            <td>2008/12/19</td>
                                            <td>$90,560</td>
                                        </tr>
                                        <tr>
                                            <td>Quinn Flynn</td>
                                            <td>Support Lead</td>
                                            <td>Edinburgh</td>
                                            <td>22</td>
                                            <td>2013/03/03</td>
                                            <td>$342,000</td>
                                        </tr>
                                        <tr>
                                            <td>Charde Marshall</td>
                                            <td>Regional Director</td>
                                            <td>San Francisco</td>
                                            <td>36</td>
                                            <td>2008/10/16</td>
                                            <td>$470,600</td>
                                        </tr>
                                        <tr>
                                            <td>Haley Kennedy</td>
                                            <td>Senior Marketing Designer</td>
                                            <td>London</td>
                                            <td>43</td>
                                            <td>2012/12/18</td>
                                            <td>$313,500</td>
                                        </tr>
                                        <tr>
                                            <td>Tatyana Fitzpatrick</td>
                                            <td>Regional Director</td>
                                            <td>London</td>
                                            <td>19</td>
                                            <td>2010/03/17</td>
                                            <td>$385,750</td>
                                        </tr>
                                        <tr>
                                            <td>Michael Silva</td>
                                            <td>Marketing Designer</td>
                                            <td>London</td>
                                            <td>66</td>
                                            <td>2012/11/27</td>
                                            <td>$198,500</td>
                                        </tr>
                                        <tr>
                                            <td>Paul Byrd</td>
                                            <td>Chief Financial Officer (CFO)</td>
                                            <td>New York</td>
                                            <td>64</td>
                                            <td>2010/06/09</td>
                                            <td>$725,000</td>
                                        </tr>
                                        <tr>
                                            <td>Gloria Little</td>
                                            <td>Systems Administrator</td>
                                            <td>New York</td>
                                            <td>59</td>
                                            <td>2009/04/10</td>
                                            <td>$237,500</td>
                                        </tr>
                                        <tr>
                                            <td>Bradley Greer</td>
                                            <td>Software Engineer</td>
                                            <td>London</td>
                                            <td>41</td>
                                            <td>2012/10/13</td>
                                            <td>$132,000</td>
                                        </tr>
                                        <tr>
                                            <td>Dai Rios</td>
                                            <td>Personnel Lead</td>
                                            <td>Edinburgh</td>
                                            <td>35</td>
                                            <td>2012/09/26</td>
                                            <td>$217,500</td>
                                        </tr>
                                        <tr>
                                            <td>Jenette Caldwell</td>
                                            <td>Development Lead</td>
                                            <td>New York</td>
                                            <td>30</td>
                                            <td>2011/09/03</td>
                                            <td>$345,000</td>
                                        </tr>
                                        <tr>
                                            <td>Yuri Berry</td>
                                            <td>Chief Marketing Officer (CMO)</td>
                                            <td>New York</td>
                                            <td>40</td>
                                            <td>2009/06/25</td>
                                            <td>$675,000</td>
                                        </tr>
                                        <tr>
                                            <td>Caesar Vance</td>
                                            <td>Pre-Sales Support</td>
                                            <td>New York</td>
                                            <td>21</td>
                                            <td>2011/12/12</td>
                                            <td>$106,450</td>
                                        </tr>
                                        <tr>
                                            <td>Doris Wilder</td>
                                            <td>Sales Assistant</td>
                                            <td>Sidney</td>
                                            <td>23</td>
                                            <td>2010/09/20</td>
                                            <td>$85,600</td>
                                        </tr>
                                        <tr>
                                            <td>Angelica Ramos</td>
                                            <td>Chief Executive Officer (CEO)</td>
                                            <td>London</td>
                                            <td>47</td>
                                            <td>2009/10/09</td>
                                            <td>$1,200,000</td>
                                        </tr>
                                        <tr>
                                            <td>Gavin Joyce</td>
                                            <td>Developer</td>
                                            <td>Edinburgh</td>
                                            <td>42</td>
                                            <td>2010/12/22</td>
                                            <td>$92,575</td>
                                        </tr>
                                        <tr>
                                            <td>Jennifer Chang</td>
                                            <td>Regional Director</td>
                                            <td>Singapore</td>
                                            <td>28</td>
                                            <td>2010/11/14</td>
                                            <td>$357,650</td>
                                        </tr>
                                        <tr>
                                            <td>Brenden Wagner</td>
                                            <td>Software Engineer</td>
                                            <td>San Francisco</td>
                                            <td>28</td>
                                            <td>2011/06/07</td>
                                            <td>$206,850</td>
                                        </tr>
                                        <tr>
                                            <td>Fiona Green</td>
                                            <td>Chief Operating Officer (COO)</td>
                                            <td>San Francisco</td>
                                            <td>48</td>
                                            <td>2010/03/11</td>
                                            <td>$850,000</td>
                                        </tr>
                                        <tr>
                                            <td>Shou Itou</td>
                                            <td>Regional Marketing</td>
                                            <td>Tokyo</td>
                                            <td>20</td>
                                            <td>2011/08/14</td>
                                            <td>$163,000</td>
                                        </tr>
                                        <tr>
                                            <td>Michelle House</td>
                                            <td>Integration Specialist</td>
                                            <td>Sidney</td>
                                            <td>37</td>
                                            <td>2011/06/02</td>
                                            <td>$95,400</td>
                                        </tr>
                                        <tr>
                                            <td>Suki Burks</td>
                                            <td>Developer</td>
                                            <td>London</td>
                                            <td>53</td>
                                            <td>2009/10/22</td>
                                            <td>$114,500</td>
                                        </tr>
                                        <tr>
                                            <td>Prescott Bartlett</td>
                                            <td>Technical Author</td>
                                            <td>London</td>
                                            <td>27</td>
                                            <td>2011/05/07</td>
                                            <td>$145,000</td>
                                        </tr>
                                        <tr>
                                            <td>Gavin Cortez</td>
                                            <td>Team Leader</td>
                                            <td>San Francisco</td>
                                            <td>22</td>
                                            <td>2008/10/26</td>
                                            <td>$235,500</td>
                                        </tr>
                                        <tr>
                                            <td>Martena Mccray</td>
                                            <td>Post-Sales support</td>
                                            <td>Edinburgh</td>
                                            <td>46</td>
                                            <td>2011/03/09</td>
                                            <td>$324,050</td>
                                        </tr>
                                        <tr>
                                            <td>Unity Butler</td>
                                            <td>Marketing Designer</td>
                                            <td>San Francisco</td>
                                            <td>47</td>
                                            <td>2009/12/09</td>
                                            <td>$85,675</td>
                                        </tr>
                                        <tr>
                                            <td>Howard Hatfield</td>
                                            <td>Office Manager</td>
                                            <td>San Francisco</td>
                                            <td>51</td>
                                            <td>2008/12/16</td>
                                            <td>$164,500</td>
                                        </tr>
                                        <tr>
                                            <td>Hope Fuentes</td>
                                            <td>Secretary</td>
                                            <td>San Francisco</td>
                                            <td>41</td>
                                            <td>2010/02/12</td>
                                            <td>$109,850</td>
                                        </tr>
                                        <tr>
                                            <td>Vivian Harrell</td>
                                            <td>Financial Controller</td>
                                            <td>San Francisco</td>
                                            <td>62</td>
                                            <td>2009/02/14</td>
                                            <td>$452,500</td>
                                        </tr>
                                        <tr>
                                            <td>Timothy Mooney</td>
                                            <td>Office Manager</td>
                                            <td>London</td>
                                            <td>37</td>
                                            <td>2008/12/11</td>
                                            <td>$136,200</td>
                                        </tr>
                                        <tr>
                                            <td>Jackson Bradshaw</td>
                                            <td>Director</td>
                                            <td>New York</td>
                                            <td>65</td>
                                            <td>2008/09/26</td>
                                            <td>$645,750</td>
                                        </tr>
                                        <tr>
                                            <td>Olivia Liang</td>
                                            <td>Support Engineer</td>
                                            <td>Singapore</td>
                                            <td>64</td>
                                            <td>2011/02/03</td>
                                            <td>$234,500</td>
                                        </tr>
                                        <tr>
                                            <td>Bruno Nash</td>
                                            <td>Software Engineer</td>
                                            <td>London</td>
                                            <td>38</td>
                                            <td>2011/05/03</td>
                                            <td>$163,500</td>
                                        </tr>
                                        <tr>
                                            <td>Sakura Yamamoto</td>
                                            <td>Support Engineer</td>
                                            <td>Tokyo</td>
                                            <td>37</td>
                                            <td>2009/08/19</td>
                                            <td>$139,575</td>
                                        </tr>
                                        <tr>
                                            <td>Thor Walton</td>
                                            <td>Developer</td>
                                            <td>New York</td>
                                            <td>61</td>
                                            <td>2013/08/11</td>
                                            <td>$98,540</td>
                                        </tr>
                                        <tr>
                                            <td>Finn Camacho</td>
                                            <td>Support Engineer</td>
                                            <td>San Francisco</td>
                                            <td>47</td>
                                            <td>2009/07/07</td>
                                            <td>$87,500</td>
                                        </tr>
                                        <tr>
                                            <td>Serge Baldwin</td>
                                            <td>Data Coordinator</td>
                                            <td>Singapore</td>
                                            <td>64</td>
                                            <td>2012/04/09</td>
                                            <td>$138,575</td>
                                        </tr>
                                        <tr>
                                            <td>Zenaida Frank</td>
                                            <td>Software Engineer</td>
                                            <td>New York</td>
                                            <td>63</td>
                                            <td>2010/01/04</td>
                                            <td>$125,250</td>
                                        </tr>
                                        <tr>
                                            <td>Zorita Serrano</td>
                                            <td>Software Engineer</td>
                                            <td>San Francisco</td>
                                            <td>56</td>
                                            <td>2012/06/01</td>
                                            <td>$115,000</td>
                                        </tr>
                                        <tr>
                                            <td>Jennifer Acosta</td>
                                            <td>Junior Javascript Developer</td>
                                            <td>Edinburgh</td>
                                            <td>43</td>
                                            <td>2013/02/01</td>
                                            <td>$75,650</td>
                                        </tr>
                                        <tr>
                                            <td>Cara Stevens</td>
                                            <td>Sales Assistant</td>
                                            <td>New York</td>
                                            <td>46</td>
                                            <td>2011/12/06</td>
                                            <td>$145,600</td>
                                        </tr>
                                        <tr>
                                            <td>Hermione Butler</td>
                                            <td>Regional Director</td>
                                            <td>London</td>
                                            <td>47</td>
                                            <td>2011/03/21</td>
                                            <td>$356,250</td>
                                        </tr>
                                        <tr>
                                            <td>Lael Greer</td>
                                            <td>Systems Administrator</td>
                                            <td>London</td>
                                            <td>21</td>
                                            <td>2009/02/27</td>
                                            <td>$103,500</td>
                                        </tr>
                                        <tr>
                                            <td>Jonas Alexander</td>
                                            <td>Developer</td>
                                            <td>San Francisco</td>
                                            <td>30</td>
                                            <td>2010/07/14</td>
                                            <td>$86,500</td>
                                        </tr>
                                        <tr>
                                            <td>Shad Decker</td>
                                            <td>Regional Director</td>
                                            <td>Edinburgh</td>
                                            <td>51</td>
                                            <td>2008/11/13</td>
                                            <td>$183,000</td>
                                        </tr>
                                        <tr>
                                            <td>Michael Bruce</td>
                                            <td>Javascript Developer</td>
                                            <td>Singapore</td>
                                            <td>29</td>
                                            <td>2011/06/27</td>
                                            <td>$183,000</td>
                                        </tr>
                                        <tr>
                                            <td>Donna Snider</td>
                                            <td>Customer Support</td>
                                            <td>New York</td>
                                            <td>27</td>
                                            <td>2011/01/25</td>
                                            <td>$112,000</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
                <!-- row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">판매 상품현황</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control"
                                                           placeholder="01/01/2020">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control"
                                                           placeholder="01/15/2020" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <button type="submit" class="btn btn-success center-block"
                                                            style="margin-bottom:14px;">조회
                                                    </button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <div class="table-responsive">
                                    <table id="onSaleProductTable" class="display table"
                                           style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>상품번호</th>
                                            <th>상품이름</th>
                                            <th>프로모션적용여부</th>
                                            <th>판매가격</th>
                                            <th>할인율</th>
                                            <th>잔량</th>
                                            <th>평점</th>
                                            <th>상품내리기</th>
                                            <th>배너여부</th>
                                            <th>배너등록</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>000001</td>
                                            <td>개 사료1</td>
                                            <td>적용</td>
                                            <td>50,000</td>
                                            <td>10%</td>
                                            <td>100,000</td>
                                            <td>4.8</td>
                                            <td><button id="saleStartStopBtn-saleNo" class="btn btn-primary" onclick="saleStartStop()">판매중지</button></td>
                                            <td>등록됨</td>
                                            <td><button class="btn btn-danger">배너해제</button></td>
                                        </tr>
                                        <tr>
                                            <td>000002</td>
                                            <td>고양이 사료1</td>
                                            <td>적용</td>
                                            <td>80,000</td>
                                            <td>10%</td>
                                            <td>200,000</td>
                                            <td>4.7</td>
                                            <td><button class="btn btn-primary" onclick="saleStartStop()">판매재등록</button></td>
                                            <td>등록됨</td>
                                            <td><button class="btn btn-danger">배너해제</button></td>
                                        </tr>
                                        <tr>
                                            <td>000003</td>
                                            <td>강아지 옷</td>
                                            <td>미적용</td>
                                            <td>120,000</td>
                                            <td>-</td>
                                            <td>1,000</td>
                                            <td>3.9</td>
                                            <td><button class="btn btn-primary">판매중지</button></td>
                                            <td>미등록</td>
                                            <td><button class="btn btn-success">배너등록</button></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
                <!-- Row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">인기상품현황</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control"
                                                           placeholder="01/01/2020">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control"
                                                           placeholder="01/15/2020" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <button type="submit" class="btn btn-success center-block"
                                                            style="margin-bottom:14px;">조회
                                                    </button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <div id="grid-gallery" class="grid-gallery">
                                    <section class="grid-wrap">
                                        <ul class="grid">
                                            <li class="grid-sizer"></li>
                                            <li>
                                                <figure>
                                                    <img src="http://via.placeholder.com/674x800" alt="img03"/>
                                                    <figcaption><h3>Brunch semiotics</h3>
                                                        <p>Ex disrupt cray yr, butcher pour-over magna umami kitsch
                                                            before they sold out commodo.</p></figcaption>
                                                </figure>
                                            </li>
                                            <li>
                                                <figure>
                                                    <img src="http://via.placeholder.com/674x800" alt="img03"/>
                                                    <figcaption><h3>Brunch semiotics</h3>
                                                        <p>Ex disrupt cray yr, butcher pour-over magna umami kitsch
                                                            before they sold out commodo.</p></figcaption>
                                                </figure>
                                            </li>
                                            <li>
                                                <figure>
                                                    <img src="http://via.placeholder.com/674x800" alt="img03"/>
                                                    <figcaption><h3>Brunch semiotics</h3>
                                                        <p>Ex disrupt cray yr, butcher pour-over magna umami kitsch
                                                            before they sold out commodo.</p></figcaption>
                                                </figure>
                                            </li>
                                            <li>
                                                <figure>
                                                    <img src="http://via.placeholder.com/674x800" alt="img03"/>
                                                    <figcaption><h3>Brunch semiotics</h3>
                                                        <p>Ex disrupt cray yr, butcher pour-over magna umami kitsch
                                                            before they sold out commodo.</p></figcaption>
                                                </figure>
                                            </li>
                                        </ul>
                                    </section>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
                <!-- row -->
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">전체상품 현황</h4>
                            </div>
                            <div class="panel-body">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <div class="row">
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control"
                                                           placeholder="01/01/2020">
                                                </div>
                                                <div class="col-md-1">
                                                    <label class="text-center center-block">~</label>
                                                </div>
                                                <div class="col-md-4">
                                                    <input type="text" class="date-picker text-center form-control"
                                                           placeholder="01/15/2020" style="margin-bottom:14px;">
                                                </div>
                                                <div class="col-md-1">
                                                    <button type="submit" class="btn btn-success center-block"
                                                            style="margin-bottom:14px;">조회
                                                    </button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <div class="table-responsive">
                                    <table id="holdProductTable" class="display table"
                                           style="width: 100%; cellspacing: 0;">
                                        <thead>
                                        <tr>
                                            <th>상품번호</th>
                                            <th>카테고리</th>
                                            <th>상품이름</th>
                                            <th>잔량</th>
                                            <th>이미지등록여부</th>
                                            <th>판매등록여부</th>
                                            <th>판매등록</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>000001</td>
                                            <td>개-먹거리</td>
                                            <td><a href="updateProduct.ado?productTbCode=1833b5eab9e8471582b4">개 사료1</a></td>
                                            <td>10,000</td>
                                            <td><a href="product-image-add.ado?productTbCode=1833b5eab9e8471582b4&resultMessage=none" class="btn btn-default btn-xs">3</a></td>
                                            <td>등록중</td>
                                            <td>-</td>
                                        </tr>
                                        <tr>
                                            <td>000002</td>
                                            <td>고양이-먹거리</td>
                                            <td>고양이 사료1</td>
                                            <td>20,000</td>
                                            <td><a href="product-image-add.ado?productTbCode=ec5a51e7a4564e6181d2&resultMessage=none" class="btn btn-default btn-xs">N</a></td>
                                            <td>미등록</td>
                                            <td><button class="btn btn-success" onclick="location.href='/insertProductSale.ado?productTbCode=1833b5eab9e8471582b4'">판매등록</button></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- !Row -->
            </div>
            <!-- Main Wrapper -->
            <div class="page-footer">
                <p>메인프로젝트 뭐먹냥 <i class="fa fa-heart"></i> by team4</p>
            </div>
        </div>
        <!-- /Page Inner -->
        <jsp:include page="../include/right-sidebar.jsp"/>
    </div>
    <!-- /Page Content -->
</div>
<!-- /Page Container -->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script><script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
    function saleStartStop() {
        //판매 중지면 판매중지, 아니면 판매 재등록

        //판매재개 페이지로
        location.href='restartSaleProduct.ado?pdSaleTbNo=5';

        //판매중지처리
        // location.href='stopSaleProduct.ado?pdSaleTbNo=5';

    }

</script>
<!-- Javascripts -->
<jsp:include page="../include/scripts-load.jsp"/>
</body>
</html>
