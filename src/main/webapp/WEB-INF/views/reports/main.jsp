<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
  <%@ include file="/WEB-INF/views/include/head.jsp"%>
<style>
      .main-footer {
        bottom: 20px !important;
        height: 40px !important;
        position: relative;
        line-height: 10px !important;
      }
  .open{
    width: 190px !important;
  }
  .leftBar{
    margin-left:190px !important;
  }
  .frame{
    margin-left: 40px;
  }
</style>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
  <header class="main-header">
    <!-- Logo -->
    <a href="javascript:void(0);" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <c:if test="${user.username eq 'admin'}">
        <span class="logo-mini"><b>A</b>dmin</span>
        <span class="logo-lg">管理员</span>
      </c:if>
      <c:if test="${user.username ne 'admin'}">
        <span class="logo-mini"><b>P</b>tu</span>
        <span class="logo-lg">普通用户</span>
      </c:if>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top" id = "nav1">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button" id = "toggleBtn">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </a>
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <li class="dropdown user user-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <img src="${contextPath}/static/img/photo2.png" class="user-image" alt="User Image">
              <span class="hidden-xs">${user.username}</span>
            </a>
            <ul class="dropdown-menu">
              <!-- User image -->
              <li class="user-header">
                <img src="${contextPath}/static/img/photo2.png" class="img-circle" alt="User Image">

                <p style = "text-align:center">
                  ${user.username}
                  <%--<small>Member since Nov. 2012</small>--%>
                </p>
              </li>
              <!-- Menu Footer-->
              <li class="user-footer">
                <div class="center-block" style="width:30px;background-color:#ccc;">
                  <a href="${contextPath}/logout" class="btn btn-default btn-flat">退出</a>
                </div>
              </li>
            </ul>
          </li>
        </ul>
      </div>

    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- Sidebar user panel -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="${contextPath}/static/img/photo2.png" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>${user.username}</p>
          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
      </div>
      <br/>
      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu" data-widget="tree">
        <li class="header" style="font-size: 24px">报表分析</li>
        <li class="treeview active">
          <a href="#">
            <i class="fa fa-folder"></i> <span>报表目录</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <c:if test="${user.username eq 'gwh' || user.username eq 'szf'}">
            <li >
                <a href="${contextPath}/report/goReport?type=1.1" target="myiframe"> 市场采购总趋势
                </a>
            </li>
            </c:if>
            <c:if test="${user.username eq 'gwh' || user.username eq 'szf'}">
              <li>
                <a href="${contextPath}/report/goReport?type=2.1" target="myiframe"> 原产地出口分析
                </a>
              </li>
            </c:if>
            <c:if test="${user.username eq 'gwh'}">
              <li>
                <a href="${contextPath}/report/goReport?type=3.1" target="myiframe"> 抵运区域出口分析
                </a>
              </li>
            </c:if>
            <c:if test="${user.username eq 'gwh'}">
              <li>
                <a href="${contextPath}/report/goReport?type=4.1" target="myiframe"> 抵运国统计分析
                </a>
              </li>
            </c:if>
            <c:if test="${user.username eq 'gwh'}">
              <li>
                <a href="${contextPath}/report/goReport?type=5.1" target="myiframe"> 外贸公司总趋势
                </a>
              </li>
            </c:if>
            <c:if test="${user.username eq 'gwh'}">
              <li>
                <a href="${contextPath}/report/goReport?type=6.1" target="myiframe"> 商户总趋势
                </a>
              </li>
            </c:if>
            <c:if test="${user.username eq 'gwh'}">
              <li>
                <a href="${contextPath}/report/goReport?type=7.1" target="myiframe"> 报关行统计分析
                </a>
              </li>
            </c:if>
            <c:if test="${user.username eq 'gwh'}">
              <li>
                <a href="${contextPath}/report/goReport?type=8.1" target="myiframe"> 商品分类出口分析
                </a>
              </li>
            </c:if>
            <c:if test="${user.username eq 'gwh'}">
              <li>
                <a href="${contextPath}/report/goReport?type=9.1" target="myiframe"> 一带一路出口分析
                </a>
              </li>
            </c:if>
            <c:if test="${user.username eq 'gwh'}">
              <li>
                <a href="${contextPath}/report/goReport?type=10.1" target="myiframe"> 收汇情况分析
                </a>
              </li>
            </c:if>
          </ul>
        </li>
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper"  style = "margin:auto" id = "divForShow">
    <!-- Content Header (Page header) -->
    <%--<section class="content-header">--%>
      <%--<iframe  id = "myiframe" src=""--%>
               <%--class="t-iframe" scrolling="no" security="restricted" name = "myiframe" style = "width:100%;height:500px;border:5px solid red"--%>
               <%--sandbox="" frameborder="no" border="0" marginwidth="0" marginheight="0" scrolling="no">--%>

      <%--</iframe>--%>
    <iframe src = "${contextPath}/report/goReport?type=1.1"
            id="myiframe" name="myiframe" scrolling="no" frameborder="0" ></iframe>
    <%--<iframe src = "http://222.92.8.88:9502/analytics/saw.dll?portalpages&PortalPath=%2Fshared%2F1.2%E5%8E%9F%E4%BA%A7%E5%9C%B0%E5%88%86%E6%9E%90%2F_portal%2F1.2%E5%8E%9F%E4%BA%A7%E5%9C%B0%E7%BB%9F%E8%AE%A1%E5%88%86%E6%9E%90&page=%E9%A1%B5%201&NQUser=weblogic&NQPassword=Test_2017" id="myiframe" name="myiframe" scrolling="yes"--%>
            <%--frameborder="0" ></iframe>--%>
  <%--</section>--%>

  </div>
  <!-- /.content-wrapper -->
  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 1.1.0
    </div>
    <strong>Copyright &copy; 2016-2017 常熟服装城市场采购监管中心</strong> All rights
    reserved.
  </footer>
  <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<%@ include file="/WEB-INF/views/include/js.base.jsp"%>
<!-- AdminLTE for demo purposes -->
<%--<script src="${contextPath}/static/js/dist/demo.js"></script>--%>
<script>
  var flag = false;
  var flag1 = true;
  $(function(){
      reinitIframe();
      $("#toggleBtn").trigger("click");
//      flag = true;
  });
  $("#toggleBtn").on("click",function(){
      $("#divForShow").css("position","relative");
      iframe = $("#myiframe");
      var bWidth = iframe.parent().css("width");
      bWidth = bWidth.substring(0,bWidth.indexOf("px"));
      bWidth = parseInt(bWidth);
//      alert(bWidth);
//      alert(flag)
      if(flag){
          flag = false;
          iframe.css("width",bWidth-120+"px");
          toggleWidth("open");
          $("#divForShow").css("left","190px");
      }else{
          flag = true;
		  toggleWidth("close");
          $("#divForShow").css("left","0px");
          if(flag1){
              bWidth += 17;
              flag1 = false;
          }
          iframe.css("width",bWidth-30+"px");
      }
  });
    function reinitIframe(){
        iframe = $("#myiframe");
        try{
            var height1 = parseInt($("#divForShow").css("height"));
//            alert(height1);
            if(height1>700){
                height1 =height1-125;
            }else{
                height1 =height1-110;
            }
            $("#myiframe").css("height",height1);
            var bWidth = iframe.parent().css("width");
            iframe.css("width",bWidth);

        }catch (ex){}
    }
    function toggleWidth(open){
        if(open=="open"){
            $(".main-sidebar").eq(0).addClass("open");
            $(".logo").eq(0).addClass("open");
            $("#nav1").addClass("leftBar");
            $(".main-footer").eq(0).addClass("leftBar");
//            $("#divForShow").css("left","190px !important");
        }else{
			 $(".main-sidebar").eq(0).removeClass("open");
            $(".logo").eq(0).removeClass("open");
            $("#nav1").removeClass("leftBar");
            $(".main-footer").eq(0).removeClass("leftBar");
		}
    }
  var iframe1 = document.getElementById("myiframe");
  if (iframe1.attachEvent) {
      iframe1.attachEvent("onload", function() {
          //iframe加载完成后你需要进行的操作
      });
  } else {
      iframe1.onload = function() {
//          alert($("#myiframe").html())
          //iframe加载完成后你需要进行的操作
      };
  }


//  $("#myiframe").on("change",function(){
//        alert($("#myiframe").html())
//        var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");
//        document.write(unescape("%3Cspan id='cnzz_stat_icon_1264360398'%3E%3C/span%3E%3Cscript src='"
//            + cnzz_protocol + "s22.cnzz.com/z_stat.php%3Fid%3D1264360398' type='text/javascript'%3E%3C/script%3E"));
//    });

</script>
</body>
<script type="text/javascript">var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");document.write(unescape("%3Cspan id='cnzz_stat_icon_1264360398'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s22.cnzz.com/z_stat.php%3Fid%3D1264360398%26show%3Dpic' type='text/javascript'%3E%3C/script%3E"));</script>

</html>
