<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-07
  Time: 오후 6:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="page-right-sidebar" id="main-right-sidebar">
    <div class="page-right-sidebar-inner">
        <div class="right-sidebar-top">
            <div class="right-sidebar-tabs">
                <!-- Nav tabs -->
                <ul class="nav nav-tabs" role="tablist">
                    <li role="presentation" class="active" id="chat-tab"><a href="#chat" aria-controls="chat"
                                                                            role="tab"
                                                                            data-toggle="tab">chat</a></li>
                    <li role="presentation" id="settings-tab"><a href="#settings" aria-controls="settings"
                                                                 role="tab" data-toggle="tab">settings</a></li>
                </ul>
            </div>
            <a href="javascript:void(0)" class="right-sidebar-toggle right-sidebar-close"
               data-sidebar-id="main-right-sidebar"><i class="icon-close"></i></a>
        </div>
        <div class="right-sidebar-content">
            <!-- Tab panes -->
            <div class="tab-content">
                <div role="tabpanel" class="tab-pane active" id="chat">
                    <div class="chat-list">
                        <span class="chat-title">Recent</span>
                        <a href="javascript:void(0);" class="right-sidebar-toggle chat-item unread"
                           data-sidebar-id="chat-right-sidebar">
                            <div class="user-avatar">
                                <img src="http://via.placeholder.com/40x40" alt="">
                            </div>
                            <div class="chat-info">
                                <span class="chat-author">David</span>
                                <span class="chat-text">where u at?</span>
                                <span class="chat-time">08:50</span>
                            </div>
                        </a>
                        <a href="javascript:void(0);" class="right-sidebar-toggle chat-item unread active-user"
                           data-sidebar-id="chat-right-sidebar">
                            <div class="user-avatar">
                                <img src="http://via.placeholder.com/40x40" alt="">
                            </div>
                            <div class="chat-info">
                                <span class="chat-author">Daisy</span>
                                <span class="chat-text">Daisy sent a photo.</span>
                                <span class="chat-time">11:34</span>
                            </div>
                        </a>
                    </div>
                    <div class="chat-list">
                        <span class="chat-title">Older</span>
                        <a href="javascript:void(0);" class="right-sidebar-toggle chat-item"
                           data-sidebar-id="chat-right-sidebar">
                            <div class="user-avatar">
                                <img src="http://via.placeholder.com/40x40" alt="">
                            </div>
                            <div class="chat-info">
                                <span class="chat-author">Tom</span>
                                <span class="chat-text">You: ok</span>
                                <span class="chat-time">2d</span>
                            </div>
                        </a>
                        <a href="javascript:void(0);" class="right-sidebar-toggle chat-item active-user"
                           data-sidebar-id="chat-right-sidebar">
                            <div class="user-avatar">
                                <img src="http://via.placeholder.com/40x40" alt="">
                            </div>
                            <div class="chat-info">
                                <span class="chat-author">Anna</span>
                                <span class="chat-text">asdasdasd</span>
                                <span class="chat-time">4d</span>
                            </div>
                        </a>
                        <a href="javascript:void(0);" class="right-sidebar-toggle chat-item active-user"
                           data-sidebar-id="chat-right-sidebar">
                            <div class="user-avatar">
                                <img src="http://via.placeholder.com/40x40" alt="">
                            </div>
                            <div class="chat-info">
                                <span class="chat-author">Liza</span>
                                <span class="chat-text">asdasdasd</span>
                                <span class="chat-time">&nbsp;</span>
                            </div>
                        </a>
                        <a href="javascript:void(0);" class="load-more-messages" data-toggle="tooltip"
                           data-placement="bottom" title="Load More">&bull;&bull;&bull;</a>
                    </div>
                </div>
                <div role="tabpanel" class="tab-pane" id="settings">
                    <div class="right-sidebar-settings">
                        <span class="settings-title">General Settings</span>
                        <ul class="sidebar-setting-list list-unstyled">
                            <li>
                                <span class="settings-option">Notifications</span><input type="checkbox"
                                                                                         class="js-switch"
                                                                                         checked/>
                            </li>
                            <li>
                                <span class="settings-option">Activity log</span><input type="checkbox"
                                                                                        class="js-switch"
                                                                                        checked/>
                            </li>
                            <li>
                                <span class="settings-option">Automatic updates</span><input type="checkbox"
                                                                                             class="js-switch"/>
                            </li>
                            <li>
                                <span class="settings-option">Allow backups</span><input type="checkbox"
                                                                                         class="js-switch"/>
                            </li>
                        </ul>
                        <span class="settings-title">Account Settings</span>
                        <ul class="sidebar-setting-list list-unstyled">
                            <li>
                                <span class="settings-option">Chat</span><input type="checkbox"
                                                                                class="js-switch" checked/>
                            </li>
                            <li>
                                <span class="settings-option">Incognito mode</span><input type="checkbox"
                                                                                          class="js-switch"/>
                            </li>
                            <li>
                                <span class="settings-option">Public profile</span><input type="checkbox"
                                                                                          class="js-switch"/>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="page-right-sidebar" id="chat-right-sidebar">
    <div class="page-right-sidebar-inner">
        <div class="right-sidebar-top">
            <div class="chat-top-info">
                <span class="chat-name">Noah</span>
                <span class="chat-state">2h ago</span>
            </div>
            <a href="javascript:void(0)" class="right-sidebar-toggle chat-sidebar-close pull-right"
               data-sidebar-id="chat-right-sidebar"><i class="icon-keyboard_arrow_right"></i></a>
        </div>
        <div class="right-sidebar-content">
            <div class="right-sidebar-chat slimscroll">
                <div class="chat-bubbles">
                    <div class="chat-start-date">02/06/2017 5:58PM</div>
                    <div class="chat-bubble them">
                        <div class="chat-bubble-img-container">
                            <img src="http://via.placeholder.com/38x38" alt="">
                        </div>
                        <div class="chat-bubble-text-container">
                            <span class="chat-bubble-text">Hello</span>
                        </div>
                    </div>
                    <div class="chat-bubble me">
                        <div class="chat-bubble-text-container">
                            <span class="chat-bubble-text">Hello!</span>
                        </div>
                    </div>
                    <div class="chat-start-date">03/06/2017 4:22AM</div>
                    <div class="chat-bubble me">
                        <div class="chat-bubble-text-container">
                            <span class="chat-bubble-text">lorem</span>
                        </div>
                    </div>
                    <div class="chat-bubble them">
                        <div class="chat-bubble-img-container">
                            <img src="http://via.placeholder.com/38x38" alt="">
                        </div>
                        <div class="chat-bubble-text-container">
                            <span class="chat-bubble-text">ipsum dolor sit amet</span>
                        </div>
                    </div>
                </div>
            </div>
            <div class="chat-write">
                <form class="form-horizontal" action="javascript:void(0);">
                    <input type="text" class="form-control" placeholder="Say something">
                </form>
            </div>
        </div>
    </div>
</div>