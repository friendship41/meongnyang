(function(e){function t(t){for(var r,a,u=t[0],f=t[1],l=t[2],s=0,d=[];s<u.length;s++)a=u[s],Object.prototype.hasOwnProperty.call(o,a)&&o[a]&&d.push(o[a][0]),o[a]=0;for(r in f)Object.prototype.hasOwnProperty.call(f,r)&&(e[r]=f[r]);c&&c(t);while(d.length)d.shift()();return i.push.apply(i,l||[]),n()}function n(){for(var e,t=0;t<i.length;t++){for(var n=i[t],r=!0,u=1;u<n.length;u++){var f=n[u];0!==o[f]&&(r=!1)}r&&(i.splice(t--,1),e=a(a.s=n[0]))}return e}var r={},o={app:0},i=[];function a(t){if(r[t])return r[t].exports;var n=r[t]={i:t,l:!1,exports:{}};return e[t].call(n.exports,n,n.exports,a),n.l=!0,n.exports}a.m=e,a.c=r,a.d=function(e,t,n){a.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:n})},a.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},a.t=function(e,t){if(1&t&&(e=a(e)),8&t)return e;if(4&t&&"object"===typeof e&&e&&e.__esModule)return e;var n=Object.create(null);if(a.r(n),Object.defineProperty(n,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var r in e)a.d(n,r,function(t){return e[t]}.bind(null,r));return n},a.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return a.d(t,"a",t),t},a.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},a.p="/";var u=window["webpackJsonp"]=window["webpackJsonp"]||[],f=u.push.bind(u);u.push=t,u=u.slice();for(var l=0;l<u.length;l++)t(u[l]);var c=f;i.push([0,"chunk-vendors"]),n()})({0:function(e,t,n){e.exports=n("56d7")},"56d7":function(e,t,n){"use strict";n.r(t);n("e260"),n("e6cf"),n("cca6"),n("a79d");var r=n("2b0e"),o=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",[n("v-stage",{ref:"stage",attrs:{config:e.stageSize}},[n("v-layer",{ref:"layer"},[n("v-image",{ref:"wheel",attrs:{config:{image:e.image,x:350,y:350,width:500,height:500,offset:{x:250,y:250}}},on:{click:e.rotate}}),n("v-shape",{attrs:{config:{sceneFunc:function(e,t){e.beginPath(),e.moveTo(320,80),e.lineTo(340,120),e.lineTo(360,80),e.quadraticCurveTo(350,90,340,90),e.closePath(),e.fillStrokeShape(t)},fill:"#ff1b31",stroke:"black",strokeWidth:5}}})],1)],1)],1)},i=[],a=n("362d"),u=n.n(a),f=window.innerWidth,l=window.innerHeight,c=!1,s=.1+0*Math.random(),d={data:function(){return{stageSize:{width:f,height:l},image:null}},created:function(){var e=this,t=new window.Image;t.src="https://konvajs.org/assets/yoda.jpg",t.onload=function(){e.image=t}},methods:{rotate:function(){var e=1e5,t=this.$refs.wheel.getNode(),n=new u.a.Animation((function(r){var o=e*r.timeDiff*(1-s)/1e3;if(o<.01){if(!1===c){c=!0,alert("포인트가 적랍되었습니다.");var i=t.rotation();i%=360,alert(i),p(i)}n.stop()}else{e-=o;var a=r.timeDiff*e/1e3;t.rotate(a)}}),t.getLayer());n.start()}}};function p(e){window.opener.location.href="eventFinish.do?degree="+e,window.close()}var h=d,g=n("2877"),v=Object(g["a"])(h,o,i,!1,null,null,null),w=v.exports,b=n("7591"),y=n.n(b);r["default"].use(y.a),r["default"].config.productionTip=!1,new r["default"]({render:function(e){return e(w)}}).$mount("#app")}});
//# sourceMappingURL=app.39956212.js.map