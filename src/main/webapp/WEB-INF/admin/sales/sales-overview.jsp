<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-09
  Time: 오후 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="kor">
<jsp:include page="../include/head.jsp"/>
<body onload="chartGo()">

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
                <h3 class="breadcrumb-header">매출 현황</h3>
            </div>
            <div id="main-wrapper">

                <!-- 상세정보 -->
                <!-- Row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-white">
                            <div class="panel-heading clearfix">
                                <h4 class="panel-title">매출 현황</h4>
                            </div>
                            <div class="panel-body">
                                <div class="panel-group" id="accordion2" role="tablist" aria-multiselectable="true">
                                    <div class="panel panel-primary">
                                        <div class="panel-heading" role="tab" id="headingOne1">
                                            <h4 class="panel-title">
                                                <a data-toggle="collapse" data-parent="#accordion2" href="#1"
                                                   aria-expanded="true" aria-controls="collapseOne">
                                                    기간별 매출 현황
                                                </a>
                                            </h4>
                                        </div>
                                        <div id="1" class="panel-collapse collapse in" role="tabpanel"
                                             aria-labelledby="headingOne1">
                                            <div class="panel-body">
                                                <div class="col-md-6">
                                                    <div class="panel-heading clearfix">
                                                        <h4 class="panel-title">일별 매출</h4>
                                                    </div>
                                                    <form class="form-horizontal">
                                                        <div class="form-group">
                                                            <div class="col-sm-10">
                                                                <div class="row">
                                                                    <div class="col-md-4">
                                                                        <input type="text"
                                                                               class="date-picker text-center form-control"
                                                                               placeholder="01/01/2020">
                                                                    </div>
                                                                    <div class="col-md-1">
                                                                        <label class="text-center center-block">~</label>
                                                                    </div>
                                                                    <div class="col-md-4">
                                                                        <input type="text"
                                                                               class="date-picker text-center form-control"
                                                                               placeholder="01/15/2020"
                                                                               style="margin-bottom:14px;">
                                                                    </div>
                                                                    <div class="col-md-1">
                                                                        <button type="submit"
                                                                                class="btn btn-success center-block"
                                                                                style="margin-bottom:14px;">조회
                                                                        </button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </form>
                                                    <canvas id="sales_chart_day"></canvas>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="panel-heading clearfix">
                                                        <h4 class="panel-title">월별 매출</h4>
                                                    </div>
                                                    <form class="form-horizontal">
                                                        <div class="form-group">
                                                            <div class="col-sm-10">
                                                                <div class="row">
                                                                    <div class="col-md-4">
                                                                        <input type="text"
                                                                               class="date-picker text-center form-control"
                                                                               placeholder="01/01/2020">
                                                                    </div>
                                                                    <div class="col-md-1">
                                                                        <label class="text-center center-block">~</label>
                                                                    </div>
                                                                    <div class="col-md-4">
                                                                        <input type="text"
                                                                               class="date-picker text-center form-control"
                                                                               placeholder="01/15/2020"
                                                                               style="margin-bottom:14px;">
                                                                    </div>
                                                                    <div class="col-md-1">
                                                                        <button type="submit"
                                                                                class="btn btn-success center-block"
                                                                                style="margin-bottom:14px;">조회
                                                                        </button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </form>
                                                    <canvas id="sales_chart_month"></canvas>
                                                </div>
                                                <div class="col-lg-12 col-md-12" style="margin-top: 80px">
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
                                                        <table id="dateSaleTable" class="display table"
                                                               style="width: 100%; cellspacing: 0;">
                                                            <thead>
                                                            <tr>
                                                                <th>기간</th>
                                                                <th>총매출</th>
                                                                <th>원가</th>
                                                                <th>배송비</th>
                                                                <th>포인트소모</th>
                                                                <th>순이익</th>
                                                            </tr>
                                                            </thead>
                                                            <tfoot>
                                                            <tr>
                                                                <th>기간</th>
                                                                <th>총매출</th>
                                                                <th>원가</th>
                                                                <th>배송비</th>
                                                                <th>포인트소모</th>
                                                                <th>순이익</th>
                                                            </tr>
                                                            </tfoot>
                                                            <tbody>
                                                            <tr>
                                                                <td>000002</td>
                                                                <td>개 사료 외 1종</td>
                                                                <td><span class="label label-nowGo">배송중</span></td>
                                                                <td>안창호</td>
                                                                <td>2011/04/25</td>
                                                                <td>150,000</td>
                                                            </tr>
                                                            <tr>
                                                                <td>000003</td>
                                                                <td>Accountant</td>
                                                                <td>Tokyo</td>
                                                                <td>63</td>
                                                                <td>2011/07/25</td>
                                                                <td>$170,750</td>
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
                                                                <td>000001</td>
                                                                <td>켓타워 외 2종</td>
                                                                <td><span class="label label-success">배송완료</span></td>
                                                                <td>최창호</td>
                                                                <td>2008/11/28</td>
                                                                <td>336,000</td>
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
                                    <div class="panel panel-success">
                                        <div class="panel-heading" role="tab" id="headingTwo2">
                                            <h4 class="panel-title">
                                                <a class="collapsed" data-toggle="collapse" data-parent="#accordion2"
                                                   href="#2" aria-expanded="false" aria-controls="collapseTwo">
                                                    카테고리별 매출 현황
                                                </a>
                                            </h4>
                                        </div>
                                        <div id="2" class="panel-collapse collapse" role="tabpanel"
                                             aria-labelledby="headingTwo2">
                                            <div class="panel-body">
                                                <div class="col-md-6">
                                                    <div class="panel-heading clearfix">
                                                        <h4 class="panel-title">일별 매출</h4>
                                                    </div>
                                                    <form class="form-horizontal">
                                                        <div class="form-group">
                                                            <div class="col-sm-10">
                                                                <div class="row">
                                                                    <div class="col-md-4">
                                                                        <input type="text"
                                                                               class="date-picker text-center form-control"
                                                                               placeholder="01/01/2020">
                                                                    </div>
                                                                    <div class="col-md-1">
                                                                        <label class="text-center center-block">~</label>
                                                                    </div>
                                                                    <div class="col-md-4">
                                                                        <input type="text"
                                                                               class="date-picker text-center form-control"
                                                                               placeholder="01/15/2020"
                                                                               style="margin-bottom:14px;">
                                                                    </div>
                                                                    <div class="col-md-1">
                                                                        <button type="submit"
                                                                                class="btn btn-success center-block"
                                                                                style="margin-bottom:14px;">조회
                                                                        </button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </form>
                                                    <canvas id="category_sales_chart_day"></canvas>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="panel-heading clearfix">
                                                        <h4 class="panel-title">월별 매출</h4>
                                                    </div>
                                                    <form class="form-horizontal">
                                                        <div class="form-group">
                                                            <div class="col-sm-10">
                                                                <div class="row">
                                                                    <div class="col-md-4">
                                                                        <input type="text"
                                                                               class="date-picker text-center form-control"
                                                                               placeholder="01/01/2020">
                                                                    </div>
                                                                    <div class="col-md-1">
                                                                        <label class="text-center center-block">~</label>
                                                                    </div>
                                                                    <div class="col-md-4">
                                                                        <input type="text"
                                                                               class="date-picker text-center form-control"
                                                                               placeholder="01/15/2020"
                                                                               style="margin-bottom:14px;">
                                                                    </div>
                                                                    <div class="col-md-1">
                                                                        <button type="submit"
                                                                                class="btn btn-success center-block"
                                                                                style="margin-bottom:14px;">조회
                                                                        </button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </form>
                                                    <canvas id="category_sales_chart_month"></canvas>
                                                </div>
                                                <div class="col-lg-12 col-md-12" style="margin-top: 80px">
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
                                                        <table id="categorySaleTable" class="display table"
                                                               style="width: 100%; cellspacing: 0;">
                                                            <thead>
                                                            <tr>
                                                                <th>카테고리</th>
                                                                <th>총매출</th>
                                                                <th>원가</th>
                                                                <th>배송비</th>
                                                                <th>포인트소모</th>
                                                                <th>순이익</th>
                                                            </tr>
                                                            </thead>
                                                            <tfoot>
                                                            <tr>
                                                                <th>기간</th>
                                                                <th>총매출</th>
                                                                <th>원가</th>
                                                                <th>배송비</th>
                                                                <th>포인트소모</th>
                                                                <th>순이익</th>
                                                            </tr>
                                                            </tfoot>
                                                            <tbody>
                                                            <tr>
                                                                <td>000002</td>
                                                                <td>개 사료 외 1종</td>
                                                                <td><span class="label label-nowGo">배송중</span></td>
                                                                <td>안창호</td>
                                                                <td>2011/04/25</td>
                                                                <td>150,000</td>
                                                            </tr>
                                                            <tr>
                                                                <td>000003</td>
                                                                <td>Accountant</td>
                                                                <td>Tokyo</td>
                                                                <td>63</td>
                                                                <td>2011/07/25</td>
                                                                <td>$170,750</td>
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
                                                                <td>000001</td>
                                                                <td>켓타워 외 2종</td>
                                                                <td><span class="label label-success">배송완료</span></td>
                                                                <td>최창호</td>
                                                                <td>2008/11/28</td>
                                                                <td>336,000</td>
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
                                    <div class="panel panel-danger">
                                        <div class="panel-heading" role="tab" id="headingThree3">
                                            <h4 class="panel-title">
                                                <a class="collapsed" data-toggle="collapse" data-parent="#accordion2"
                                                   href="#3" aria-expanded="false" aria-controls="collapseThree">
                                                    가격별 매출 현황
                                                </a>
                                            </h4>
                                        </div>
                                        <div id="3" class="panel-collapse collapse" role="tabpanel"
                                             aria-labelledby="headingThree3">
                                            <div class="panel-body">
                                                <div class="col-md-6">
                                                    <div class="panel-heading clearfix">
                                                        <h4 class="panel-title">일별 매출</h4>
                                                    </div>
                                                    <form class="form-horizontal">
                                                        <div class="form-group">
                                                            <div class="col-sm-10">
                                                                <div class="row">
                                                                    <div class="col-md-4">
                                                                        <input type="text"
                                                                               class="date-picker text-center form-control"
                                                                               placeholder="01/01/2020">
                                                                    </div>
                                                                    <div class="col-md-1">
                                                                        <label class="text-center center-block">~</label>
                                                                    </div>
                                                                    <div class="col-md-4">
                                                                        <input type="text"
                                                                               class="date-picker text-center form-control"
                                                                               placeholder="01/15/2020"
                                                                               style="margin-bottom:14px;">
                                                                    </div>
                                                                    <div class="col-md-1">
                                                                        <button type="submit"
                                                                                class="btn btn-success center-block"
                                                                                style="margin-bottom:14px;">조회
                                                                        </button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </form>
                                                    <canvas id="price_sales_chart_day"></canvas>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="panel-heading clearfix">
                                                        <h4 class="panel-title">월별 매출</h4>
                                                    </div>
                                                    <form class="form-horizontal">
                                                        <div class="form-group">
                                                            <div class="col-sm-10">
                                                                <div class="row">
                                                                    <div class="col-md-4">
                                                                        <input type="text"
                                                                               class="date-picker text-center form-control"
                                                                               placeholder="01/01/2020">
                                                                    </div>
                                                                    <div class="col-md-1">
                                                                        <label class="text-center center-block">~</label>
                                                                    </div>
                                                                    <div class="col-md-4">
                                                                        <input type="text"
                                                                               class="date-picker text-center form-control"
                                                                               placeholder="01/15/2020"
                                                                               style="margin-bottom:14px;">
                                                                    </div>
                                                                    <div class="col-md-1">
                                                                        <button type="submit"
                                                                                class="btn btn-success center-block"
                                                                                style="margin-bottom:14px;">조회
                                                                        </button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </form>
                                                    <canvas id="price_sales_chart_month"></canvas>
                                                </div>
                                                <div class="col-lg-12 col-md-12" style="margin-top: 80px">
                                                    <form class="form-horizontal">
                                                        <div class="form-group">
                                                            <div class="col-sm-10">
                                                                <div class="row">
                                                                    <div class="col-md-4">
                                                                        <input type="text" class="form-control" placeholder="0">
                                                                    </div>
                                                                    <div class="col-md-1">
                                                                        <label class="text-center center-block">~</label>
                                                                    </div>
                                                                    <div class="col-md-4">
                                                                        <input type="text" class="form-control" placeholder="10000" style="margin-bottom:14px;">
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
                                                        <table id="priceSaleTable" class="display table"
                                                               style="width: 100%; cellspacing: 0;">
                                                            <thead>
                                                            <tr>
                                                                <th>범주</th>
                                                                <th>총매출</th>
                                                                <th>총원가</th>
                                                                <th>총배송비</th>
                                                                <th>총포인트소모</th>
                                                                <th>순이익</th>
                                                            </tr>
                                                            </thead>
                                                            <tfoot>
                                                            <tr>
                                                                <th>범주</th>
                                                                <th>총매출</th>
                                                                <th>총원가</th>
                                                                <th>총배송비</th>
                                                                <th>총포인트소모</th>
                                                                <th>순이익</th>
                                                            </tr>
                                                            </tfoot>
                                                            <tbody>
                                                            <tr>
                                                                <td>000002</td>
                                                                <td>개 사료 외 1종</td>
                                                                <td><span class="label label-nowGo">배송중</span></td>
                                                                <td>안창호</td>
                                                                <td>2011/04/25</td>
                                                                <td>150,000</td>
                                                            </tr>
                                                            </tbody>
                                                        </table>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="panel panel-primary">
                                        <div class="panel-heading" role="tab" id="headingFour4">
                                            <h4 class="panel-title">
                                                <a class="collapsed" data-toggle="collapse" data-parent="#accordion2"
                                                   href="#4" aria-expanded="false" aria-controls="collapseTwo">
                                                    지역별 매출 현황
                                                </a>
                                            </h4>
                                        </div>
                                        <div id="4" class="panel-collapse collapse" role="tabpanel"
                                             aria-labelledby="headingFour4">
                                            <div class="panel-body">
                                                <div class="col-md-6">
                                                    <div class="panel-heading clearfix">
                                                        <h4 class="panel-title">일별 매출</h4>
                                                    </div>
                                                    <form class="form-horizontal">
                                                        <div class="form-group">
                                                            <div class="col-sm-10">
                                                                <div class="row">
                                                                    <div class="col-md-4">
                                                                        <input type="text"
                                                                               class="date-picker text-center form-control"
                                                                               placeholder="01/01/2020">
                                                                    </div>
                                                                    <div class="col-md-1">
                                                                        <label class="text-center center-block">~</label>
                                                                    </div>
                                                                    <div class="col-md-4">
                                                                        <input type="text"
                                                                               class="date-picker text-center form-control"
                                                                               placeholder="01/15/2020"
                                                                               style="margin-bottom:14px;">
                                                                    </div>
                                                                    <div class="col-md-1">
                                                                        <button type="submit"
                                                                                class="btn btn-success center-block"
                                                                                style="margin-bottom:14px;">조회
                                                                        </button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </form>
                                                    <canvas id="region_sales_chart_day"></canvas>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="panel-heading clearfix">
                                                        <h4 class="panel-title">월별 매출</h4>
                                                    </div>
                                                    <form class="form-horizontal">
                                                        <div class="form-group">
                                                            <div class="col-sm-10">
                                                                <div class="row">
                                                                    <div class="col-md-4">
                                                                        <input type="text"
                                                                               class="date-picker text-center form-control"
                                                                               placeholder="01/01/2020">
                                                                    </div>
                                                                    <div class="col-md-1">
                                                                        <label class="text-center center-block">~</label>
                                                                    </div>
                                                                    <div class="col-md-4">
                                                                        <input type="text"
                                                                               class="date-picker text-center form-control"
                                                                               placeholder="01/15/2020"
                                                                               style="margin-bottom:14px;">
                                                                    </div>
                                                                    <div class="col-md-1">
                                                                        <button type="submit"
                                                                                class="btn btn-success center-block"
                                                                                style="margin-bottom:14px;">조회
                                                                        </button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </form>
                                                    <canvas id="region_sales_chart_month"></canvas>
                                                </div>
                                                <div class="col-lg-12 col-md-12" style="margin-top: 80px">
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
                                                        <table id="regionSaleTable" class="display table"
                                                               style="width: 100%; cellspacing: 0;">
                                                            <thead>
                                                            <tr>
                                                                <th>지역</th>
                                                                <th>총매출</th>
                                                                <th>원가</th>
                                                                <th>배송비</th>
                                                                <th>포인트소모</th>
                                                                <th>순이익</th>
                                                            </tr>
                                                            </thead>
                                                            <tfoot>
                                                            <tr>
                                                                <th>지역</th>
                                                                <th>총매출</th>
                                                                <th>원가</th>
                                                                <th>배송비</th>
                                                                <th>포인트소모</th>
                                                                <th>순이익</th>
                                                            </tr>
                                                            </tfoot>
                                                            <tbody>
                                                            <tr>
                                                                <td>000002</td>
                                                                <td>개 사료 외 1종</td>
                                                                <td><span class="label label-nowGo">배송중</span></td>
                                                                <td>안창호</td>
                                                                <td>2011/04/25</td>
                                                                <td>150,000</td>
                                                            </tr>
                                                            <tr>
                                                                <td>000003</td>
                                                                <td>Accountant</td>
                                                                <td>Tokyo</td>
                                                                <td>63</td>
                                                                <td>2011/07/25</td>
                                                                <td>$170,750</td>
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
                                                                <td>000001</td>
                                                                <td>켓타워 외 2종</td>
                                                                <td><span class="label label-success">배송완료</span></td>
                                                                <td>최창호</td>
                                                                <td>2008/11/28</td>
                                                                <td>336,000</td>
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


<script>
    function chartGo() {
        new Chart(document.getElementById("sales_chart_day"), {
            "type": "line",
            "data": {
                "labels": ["1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일"],
                "datasets": [{
                    "label": "방문자 수",
                    "data": [5000, 2000, 3000, 4000, 5000, 500, 3600, 3210, 8000, 2000, 10000, 12000, 1000, 2000, 3000],
                    "fill": false,
                    "borderColor": "rgb(93,168,203)",
                    "lineTension": 0.2
                }]
            },
            "options": {}
        });
        new Chart(document.getElementById("sales_chart_month"), {
            "type": "line",
            "data": {
                "labels": ["1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"],
                "datasets": [{
                    "label": "방문자 수",
                    "data": [5000, 2000, 3000, 4000, 5000, 500, 3600, 3210, 8000, 2000, 10000, 12000],
                    "fill": false,
                    "borderColor": "rgb(93,168,203)",
                    "lineTension": 0.2
                }]
            },
            "options": {}
        });

        new Chart(document.getElementById("category_sales_chart_day"),{"type":"doughnut","data":{"labels":["10대","20대","30대","40대","50대","60대"],"datasets":[{"label":"My First Dataset","data":[300,500,500,400,300,200],"backgroundColor":["rgb(236, 94, 105)","rgb(0, 112, 224)","rgb(241, 194, 5)","rgb(144,241,88)","rgb(101, 80, 55)","rgb(41, 14, 5)"]}]}});
        new Chart(document.getElementById("category_sales_chart_month"),{"type":"doughnut","data":{"labels":["10대","20대","30대","40대","50대","60대"],"datasets":[{"label":"My First Dataset","data":[300,500,500,400,300,200],"backgroundColor":["rgb(236, 94, 105)","rgb(0, 112, 224)","rgb(241, 194, 5)","rgb(144,241,88)","rgb(101, 80, 55)","rgb(41, 14, 5)"]}]}});

        new Chart(document.getElementById("price_sales_chart_day"), {
            "type": "line",
            "data": {
                "labels": ["1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일", "15일"],
                "datasets": [{
                    "label": "회원가입수",
                    "data": [5000, 2000, 3000, 4000, 5000, 500, 3600, 3210, 8000, 2000, 10000, 12000, 1000, 2000, 3000],
                    "fill": false,
                    "borderColor": "rgb(99, 203, 137)",
                    "lineTension": 0.2
                }, {
                    "label": "회원탈퇴수",
                    "data": [1000, 500, 1000, 500, 2000, 100, 600, 210, 3000, 1000, 2000, 2000, 0, 1000, 2000],
                    "fill": false,
                    "borderColor": "rgb(203,36,45)",
                    "lineTension": 0.2
                }, {
                    "label": "회원증감",
                    "data": [4000, 1500, 2000, 3500, 3000, 400, 3000, 3000, 5000, 1000, 8000, 10000, 1000, 1000, 1000],
                    "fill": false,
                    "borderColor": "rgb(42,94,203)",
                    "lineTension": 0.2
                }]
            },
            "options": {}
        });
        new Chart(document.getElementById("price_sales_chart_month"), {
            "type": "line",
            "data": {
                "labels": ["1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"],
                "datasets": [{
                    "label": "회원가입수",
                    "data": [5000, 2000, 3000, 4000, 5000, 500, 3600, 3210, 8000, 2000, 10000, 12000],
                    "fill": false,
                    "borderColor": "rgb(99, 203, 137)",
                    "lineTension": 0.2
                }, {
                    "label": "회원탈퇴수",
                    "data": [1000, 500, 1000, 500, 2000, 100, 600, 210, 3000, 1000, 2000, 2000],
                    "fill": false,
                    "borderColor": "rgb(203,36,45)",
                    "lineTension": 0.2
                }, {
                    "label": "회원증감",
                    "data": [4000, 1500, 2000, 3500, 3000, 400, 3000, 3000, 5000, 1000, 8000, 10000],
                    "fill": false,
                    "borderColor": "rgb(42,94,203)",
                    "lineTension": 0.2
                }]
            },
            "options": {}
        });

        new Chart(document.getElementById("region_sales_chart_day"),{"type":"doughnut","data":{"labels":["10대","20대","30대","40대","50대","60대"],"datasets":[{"label":"My First Dataset","data":[300,500,500,400,300,200],"backgroundColor":["rgb(236, 94, 105)","rgb(0, 112, 224)","rgb(241, 194, 5)","rgb(144,241,88)","rgb(101, 80, 55)","rgb(41, 14, 5)"]}]}});
        new Chart(document.getElementById("region_sales_chart_month"),{"type":"doughnut","data":{"labels":["10대","20대","30대","40대","50대","60대"],"datasets":[{"label":"My First Dataset","data":[300,500,500,400,300,200],"backgroundColor":["rgb(236, 94, 105)","rgb(0, 112, 224)","rgb(241, 194, 5)","rgb(144,241,88)","rgb(101, 80, 55)","rgb(41, 14, 5)"]}]}});


    }
</script>

<!-- Javascripts -->
<jsp:include page="../include/scripts-load.jsp"/>
</body>
</html>
