<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>首页-GRIAFFE-每天都有新鲜事</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="../css/style.css" rel="stylesheet" type="text/css"
	media="all" />
<link rel="icon" href="../images/icon.ico" type="image/x-icon" />
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800'
	rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(
			function() {
				$(".dropdown img.flag").addClass("flagvisibility");

				$(".dropdown dt a").click(function() {
					$(".dropdown dd ul").toggle();
				});

				$(".dropdown dd ul li a").click(
						function() {
							var text = $(this).html();
							$(".dropdown dt a span").html(text);
							$(".dropdown dd ul").hide();
							$("#result").html(
									"Selected value is: "
											+ getSelectedValue("sample"));
						});

				function getSelectedValue(id) {
					return $("#" + id).find("dt a span.value").html();
				}

				$(document).bind('click', function(e) {
					var $clicked = $(e.target);
					if (!$clicked.parents().hasClass("dropdown"))
						$(".dropdown dd ul").hide();
				});

				$("#flagSwitcher").click(function() {
					$(".dropdown img.flag").toggleClass("flagvisibility");
				});
			});
</script>
<!-- start menu -->
<link href="../css/megamenu.css" rel="stylesheet" type="text/css"
	media="all" />
<script type="text/javascript" src="js/megamenu.js"></script>
<script>
	$(document).ready(function() {
		$(".megamenu").megamenu();
	});
</script>
<!-- end menu -->
<!-- top scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event) {
			event.preventDefault();
			$('html,body').animate({
				scrollTop : $(this.hash).offset().top
			}, 1200);
		});
	});
</script>
</head>
<body>

	<div class="header-top">

		<div class="wrap" align="right">
			<div class="logo">
				<a href="<%=pageContext.getServletContext().getContextPath() %>/jsp/index.jsp"><img src="../images/Griaffe.png" alt="" /></a>
			</div>
			<div class="cssmenu">

				<ul class="megamenu skyblue">

					<li class="grid"><a class="color2"
						href="<%=pageContext.getServletContext().getContextPath() %>/user/changeinformation.action?user_id=${sessionScope.user.user_id}">修改个人信息</a>
						<div class="megapanel">
							<div class="row">
								<div class="col3"></div>
							</div>
						</div></li>
					<li class="active grid"><a class="color7"
						href="<%=pageContext.getServletContext().getContextPath()%>/favorite/myfavorite.action?user_id=${sessionScope.user.user_id}&user_name=${sessionScope.user.user_name}">收藏</a></li>
					<li><a class="color8"
						href="<%=pageContext.getServletContext().getContextPath()%>/follow/myfollow.action?user_id=${sessionScope.user.user_id}&user_name=${sessionScope.user.user_name}">关注列表</a></li>
					<li><a class="color9"
						href="<%=pageContext.getServletContext().getContextPath()%>/post/mypost.action?post_user=${sessionScope.user.user_id}">我的</a></li>
				</ul>
			</div>

			<ul class="icon2 sub-icon2 profile_img">
				<li><div class="button1">
						<a href="#"><input type="submit" name="Submit" value="已登录"></a>
					</div>

					<ul class="sub-icon2 list">
						<li><h4>已登录</h4> <a href="#"></a></li>
						<li><p>
								<a
									href="<%=pageContext.getServletContext().getContextPath()%>/user/myinformation.action?user_id=${sessionScope.user.user_id}&user_name=${sessionScope.user.user_name}"><li><font
										color="bule;" size="3">账号姓名：${sessionScope.user.user_name}</font></li></a>
							</p></li>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

						<a
							href="<%=pageContext.getServletContext().getContextPath()%>/user/outlogin.action"><li><font
								color="bule;" size="3">退出登录</font></li></a>

					</ul></li>

			</ul>

			<div class="clear"></div>

		</div>
	</div>
	<div class="header-bottom">
		<div class="wrap">
			<!-- start header menu -->
			<ul class="megamenu skyblue">
				<li><a class="color1"
					href="<%=pageContext.getServletContext().getContextPath()%>/post/postlive.action">实时</a></li>

				<li class="active grid"><a class="color4"
					href="<%=pageContext.getServletContext().getContextPath()%>/post/hotpost.action">热门</a></li>
				<li><a class="color5"
					href="<%=pageContext.getServletContext().getContextPath()%>/post/follow.action?user_id=${sessionScope.user.user_id}">关注</a></li>
				<li><a class="color6"
					href="<%=pageContext.getServletContext().getContextPath()%>/post/sendpost.action?user_id=${sessionScope.user.user_id}">发帖</a></li>

			</ul>
			<div class="clear"></div>
		</div>
	</div>


	<div class="wmuSlider example1" style="height: 560px;">
		<div class="wmuSliderWrapper">
			<article style="position: relative; width: 100%; opacity: 1;">
				<div class="banner-wrap">
					<div class="slider-left">
						<script language=javascript>
							var curIndex = 0;
							//时间间隔(单位毫秒)，每秒钟显示一张，数组共有5张图片放在Photos文件夹下。
							var timeInterval = 3000;
							var arr = new Array();
							arr[0] = "../images/1.jpg";
							arr[1] = "../images/2.jpg";
							arr[2] = "../images/3.jpg";
							arr[3] = "../images/4.jpeg";
							setInterval(changeImg, timeInterval);
							function changeImg() {
								var obj = document.getElementById("obj");
								if (curIndex == arr.length - 1) {
									curIndex = 0;
								} else {
									curIndex += 1;
								}
								obj.src = arr[curIndex];
							}
						</script>
						<img id=obj src="../images/1.jpg" width=720 height=480 border=0>

					</div>
					<div class="slider-right">
						<h1>Griaffe</h1>
						<h2>每天都有新鲜事</h2>
						<p>记录生活，留下感动</p>

					</div>
					<div class="clear"></div>
				</div>
			</article>



		</div>
	</div>






	<!--页脚-->
	<div class="footer">
		<div class="footer-top">
			<div class="wrap">
				<div class="col_1_of_footer-top span_1_of_footer-top">
					<ul class="f_list">
						<li><span class="delivery">我只愿面朝大海，春暖花开</span></li>
					</ul>
				</div>
				<div class="col_1_of_footer-top span_1_of_footer-top">
					<ul class="f_list">
						<li><img src="../images/f_icon1.png" alt="" /><span
							class="delivery">联系方式 :<span class="orange">
									303886955 (QQ)</span></span></li>
					</ul>
				</div>
				<div class="col_1_of_footer-top span_1_of_footer-top">
					<ul class="f_list">
						<li><img src="../images/f_icon2.png" alt="" /><span
							class="delivery">世界很大，一块来看看</span></li>
					</ul>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>

</body>
</html>