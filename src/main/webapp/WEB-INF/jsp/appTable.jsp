<%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2017/10/17
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>DataTables | Gentelella</title>

    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="../css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="../css/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
    <link href="../css/green.css" rel="stylesheet">
    <!-- Datatables -->
    <link href="../css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="../css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="../css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="../css/responsive.bootstrap.min.css" rel="stylesheet">
    <link href="../css/scroller.bootstrap.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="../css/custom.min.css" rel="stylesheet">
</head>

<body class="nav-md">
<div class="container body">
    <div class="main_container">
        <div class="col-md-3 left_col">
            <div class="left_col scroll-view">
                <div class="navbar nav_title" style="border: 0;">
                    <a href="/index" class="site_title"><i class="fa fa-paw"></i> <span>Gentelella Alela!</span></a>
                </div>

                <div class="clearfix"></div>

                <!-- menu profile quick info -->
                <div class="profile clearfix">
                    <div class="profile_pic">
                        <img src="../images/img.jpg" alt="404" class="img-circle profile_img">
                    </div>
                    <div class="profile_info">
                        <span>Welcome,</span>
                        <h2>${sessionScope.user.username}</h2>
                    </div>
                </div>
                <!-- /menu profile quick info -->

                <br/>

                <!-- sidebar menu -->
                <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                    <div class="menu_section">
                        <h3>General</h3>
                        <ul class="nav side-menu">
                            <li><a><i class="fa fa-home"></i> Home <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="/index">Dashboard</a></li>
                                </ul>
                            </li>


                            <li><a><i class="fa fa-table"></i> Tables <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">

                                    <li><a href="/appTable">Table Dynamic</a></li>
                                </ul>
                            </li>

                        </ul>
                    </div>


                </div>
                <!-- /sidebar menu -->

                <!-- /menu footer buttons -->
                <div class="sidebar-footer hidden-small">
                    <a data-toggle="tooltip" data-placement="top" title="Settings">
                        <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
                    </a>
                    <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                        <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
                    </a>
                    <a data-toggle="tooltip" data-placement="top" title="Lock">
                        <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
                    </a>
                    <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                        <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
                    </a>
                </div>
                <!-- /menu footer buttons -->
            </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav">
            <div class="nav_menu">
                <nav>
                    <div class="nav toggle">
                        <a id="menu_toggle"><i class="fa fa-bars"></i></a>
                    </div>

                    <ul class="nav navbar-nav navbar-right">
                        <li class="">
                            <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown"
                               aria-expanded="false">
                                <img src="images/img.jpg" alt="">${sessionScope.user.username}
                                <span class=" fa fa-angle-down"></span>
                            </a>
                            <ul class="dropdown-menu dropdown-usermenu pull-right">
                                <li><a href="javascript:;"> Profile</a></li>
                                <li>
                                    <a href="javascript:;">
                                        <span class="badge bg-red pull-right">50%</span>
                                        <span>Settings</span>
                                    </a>
                                </li>
                                <li><a href="javascript:;">Help</a></li>
                                <li><a href="login.html"><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
                            </ul>
                        </li>


                    </ul>
                </nav>
            </div>
        </div>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
            <div class="">
                <div class="page-title">
                    <div class="title_left">
                        <h3>Users
                            <small>Some examples to get you started</small>
                        </h3>
                    </div>

                    <div class="title_right">
                        <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="Search for...">
                                <span class="input-group-btn">
                      <button class="btn btn-default" type="button">Go!</button>
                    </span>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <form role="form">
                                <div class="form-group">
                                    <div class="row top">
                                        <div class="col-md-3 col-sm-3 col-md-offset-1">
                                            <label>软件名称</label><input type="text" class="col-xs-offset-1"/>
                                        </div>
                                        <div class="col-md-3 col-sm-3">
                                            <label>APP名称</label><input type="text" class=""/>
                                        </div>
                                        <div class="col-md-3 col-sm-3">
                                            <label>所属平台</label>

                                        </div>
                                    </div>
                                    <br/>
                                    <div class="row bottom">
                                        <div class="col-md-3 col-sm-3 col-md-offset-1">
                                            <label>软件名称</label><input type="text" class="col-xs-offset-1"/>
                                        </div>
                                        <div class="col-md-3 col-sm-3">
                                            <input type="text" class=""/>
                                        </div>
                                        <div class="col-md-3 col-sm-3">
                                            软件名称<input type="text" class=""/>
                                        </div>
                                    </div>
                                    <br/>
                                    <div class="col-md-3 col-sm-3 col-md-offset-1">
                                        <button type="submit" class="btn-primary btn" value="查询">查询</button>
                                    </div>
                                </div>

                            </form>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_title">
                                <button class="btn btn-primary " data-toggle="modal" data-target="#newApp" type="button">新增APP信息</button>
                                <!-- 模态框（Modal） -->
                                <form class="form-horizontal form-label-left">
                                <div class="modal fade" id="newApp" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                                    &times;
                                                </button>
                                                <h4 class="modal-title" id="myModalLabel">
                                                    新增APP基础信息<span class="small">${sessionScope.user.username}</span>
                                                </h4>
                                            </div>

                                                <br />


                                                    <div class="form-group">
                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">软件名称<span class="required">*</span></label>
                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                            <input type="text" class="form-control" placeholder="软件名称">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">APK名称 <span class="required">*</span></label>
                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                            <input type="text" class="form-control" placeholder="APK名称">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">支持ROM<span class="required">*</span></label>
                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                            <input type="text" class="form-control" placeholder="支持ROM">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">界面语言 <span class="required">*</span>
                                                        </label>
                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                            <input type="text" class="form-control" placeholder='界面语言'>
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">软件大小</label>
                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                            <input type="text" class="form-control" placeholder='软件大小'>
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">所属平台</label>
                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                            <select class="form-control">
                                                                <option>--请选择--</option>
                                                                <option>手机</option>
                                                                <option>平板</option>
                                                                <option>通用</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                            <div class="form-group">
                                                <label class="control-label col-md-3 col-sm-3 col-xs-12">一级分类</label>
                                                <div class="col-md-9 col-sm-9 col-xs-12">
                                                    <select class="form-control">
                                                        <option>--请选择--</option>
                                                        <option>手机</option>
                                                        <option>平板</option>
                                                        <option>通用</option>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label col-md-3 col-sm-3 col-xs-12">二级分类</label>
                                                <div class="col-md-9 col-sm-9 col-xs-12">
                                                    <select class="form-control">
                                                        <option>--请选择--</option>
                                                        <option>手机</option>
                                                        <option>平板</option>
                                                        <option>通用</option>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label col-md-3 col-sm-3 col-xs-12">三级分类</label>
                                                <div class="col-md-9 col-sm-9 col-xs-12">
                                                    <select class="form-control">
                                                        <option>--请选择--</option>
                                                        <option>手机</option>
                                                        <option>平板</option>
                                                        <option>通用</option>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label col-md-3 col-sm-3 col-xs-12">软件状态</label>
                                                <div class="col-md-9 col-sm-9 col-xs-12">
                                                    待审核
                                                </div>
                                            </div>

                                            <div class="form-group">
                                                <label class="control-label col-md-3 col-sm-3 col-xs-12">应用简介</label>
                                                <div class="col-md-9 col-sm-9 col-xs-12">
                                                    <textarea rows="3" class="form-control" placeholder="dd">

                                                    </textarea>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label col-md-3 col-sm-3 col-xs-12">文件上传</label>
                                                <div class="col-md-9 col-sm-9 col-xs-12">
                                                    <input id="appLogo" type="file" class="form-control"/>
                                                </div>
                                            </div>



                                                    <div class="ln_solid"></div>
                                                    <div class="modal-footer">
                                                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                                                        </button>
                                                        <%--新建app信息--%>
                                                        <button type="button" class="btn btn-primary">
                                                            提交更改
                                                        </button>
                                                    </div>



                                        </div><!-- /.modal-content -->
                                    </div><!-- /.modal -->

                                    </form>

                                    <div class="clearfix"></div>
                            </div>
                            <div class="x_content">

                                <table id="datatable" class="table table-striped table-bordered">
                                    <thead>
                                    <tr>
                                        <td>软件名称</td>
                                        <td>APK名称</td>
                                        <td>软件大小(单位:M)</td>
                                        <td>所属平台</td>
                                        <td>所属分类(一级分类,二级分类,三级分类)</td>
                                        <td>状态</td>
                                        <td>下载次数</td>
                                        <td>最新版本号</td>
                                        <td>操作</td>
                                    </tr>
                                    </thead>

                                    <tbody>
                                    <c:forEach items="${appInfoDefaultList}" var="applist">
                                        <tr>
                                            <td>${applist.softwarename}</td>
                                            <td>${applist.apkname}</td>
                                            <td>${applist.softwaresize}</td>
                                            <td>${applist.appFlatform}</td>
                                            <td>${applist.level1Category}->${applist.level2Category}->${applist.level2Category}</td>
                                            <td>${applist.appStatus}</td>
                                            <td>${applist.downloads}</td>
                                            <td>${applist.versionNo}</td>
                                            <td>

                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>

                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- /page content -->

        <!-- footer content -->
        <footer>
            <div class="pull-right">
                Gentelella - Bootstrap Admin Template by <a href="https://colorlib.com">Colorlib</a>
            </div>
            <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
    </div>
</div>

<!-- jQuery -->
<script src="../js/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="../js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="../js/fastclick.js"></script>
<!-- NProgress -->
<script src="../js/nprogress.js"></script>
<!-- iCheck -->
<script src="../js/icheck.min.js"></script>
<!-- Datatables -->
<script src="../js/jquery.dataTables.min.js"></script>
<script src="../js/dataTables.bootstrap.min.js"></script>
<script src="../js/dataTables.buttons.min.js"></script>
<script src="../js/buttons.bootstrap.min.js"></script>
<script src="../js/buttons.flash.min.js"></script>
<script src="../js/buttons.html5.min.js"></script>
<script src="../js/buttons.print.min.js"></script>
<script src="../js/dataTables.fixedHeader.min.js"></script>
<script src="../js/dataTables.keyTable.min.js"></script>
<script src="../js/dataTables.responsive.min.js"></script>
<script src="../js/responsive.bootstrap.js"></script>
<script src="../js/dataTables.scroller.min.js"></script>
<script src="../js/jszip.min.js"></script>
<script src="../js/pdfmake.min.js"></script>
<script src="../js/vfs_fonts.js"></script>

<!-- Custom Theme Scripts -->
<script src="../js/custom.min.js"></script>

</body>
</html>
