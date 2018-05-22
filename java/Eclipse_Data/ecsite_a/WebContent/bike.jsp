<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta http-equiv="Content-Script-Type" content="text/javascript" />
		<meta http-equiv="imagetoolbar" content="no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<title>バイク商品一覧</title>
</head>

<body>

		<div id="main">
			<h3>BUY BIKE</h3>


			<!-- メーカー表示機能 -->
	<s:form action="MakerSearchAction">
	<tr>
		<td>
		<select name="sortCategory" onchange="submit(this.form)">
			<option value="0" selected="selected">カテゴリ選択</option>
			<option value="kawasaki">カワサキ</option>
			<option value="yamaha">ヤマハ</option>
			<option value="harley-davidsom">ハーレー</option>
		</select>
		</td>
	</tr>
	</s:form>


	<p><a href='<s:url action="ProductPageAction"/>'>検索のリセット</a></p>


	<!-- 商品検索機能 -->
	<s:form action="SearchAction">
	<tr>
		<td><s:textfield name="searchWord" value=""/><s:submit class="button" value="検索"/></td>
	</tr>
	</s:form>

	<!-- 商品テーブル -->
<div class="item-table">

	<table>
	<s:form action="BuyItemAction">

<!-- カテゴリソート① -->
	<s:if test="session.sortCategory=='kawasaki'">
	<s:iterator value="#session.buyItemDTOList">
		<dl class="dl-list">
			<dd class="dd-list">

			<div class="item_description">
			<a href="#">
			<span class="remark"><s:property value="item_description"/></span>
			<img class="image" style="width:150px; height:100px;" src="<s:property value='image_file_path'/>" >

			<br><br>

			<s:property value="BikeName" /><br>

			<span>値段:</span>
			<s:property value="itemPrice" /><span>円</span><br>

			<span>在庫:</span>
			<s:if test="item_stock>0">
				<s:property value="item_stock"/>
			</s:if>
			<s:else>
				<span class="error-message">品切れ</span>
			</s:else>
			</a>

			<br>

			<span>購入個数:</span>
			<s:if test="item_stock>0">
				<div class="select-box">
				<select name="count">
					<option value="0" selected="selected">-</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
				</div>
			</s:if>
			<s:else>
				<select name="count">
					<option value="0" selected="selected">0</option>
				</select>
			</s:else>

			</div>
			</dd>
		</dl>
	</s:iterator>
	</s:if>

<!-- カテゴリソート② -->
	<s:elseif test="session.sortCategory=='yamaha'">
	<s:iterator value="#session.buyItemDTOList">
		<dl class="dl-list">
			<dd class="dd-list">

			<div class="item_description">
			<a href="#">
			<span class="remark"><s:property value="item_description"/></span>
			<img class="image" style="width:150px; height:100px;" src="<s:property value='image_file_path'/>" >

			<br><br>

			<s:property value="BikeName" /><br>

			<span>値段:</span>
			<s:property value="itemPrice" /><span>円</span><br>

			<span>在庫:</span>
			<s:if test="item_stock>0">
				<s:property value="item_stock"/>
			</s:if>
			<s:else>
				<span class="error-message">品切れ</span>
			</s:else>
			</a>

			<br>

			<span>購入個数:</span>
			<s:if test="item_stock>0">
				<div class="select-box">
				<select name="count">
					<option value="0" selected="selected">-</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
				</div>
			</s:if>
			<s:else>
				<select name="count">
					<option value="0" selected="selected">0</option>
				</select>
			</s:else>

			</div>
			</dd>
		</dl>
	</s:iterator>
	</s:elseif>


<!-- カテゴリソート③ -->
	<s:elseif test="session.sortCategory=='harley-davidson'">
	<s:iterator value="#session.buyItemDTOList">
		<dl class="dl-list">
			<dd class="dd-list">

			<div class="item_description">
			<a href="#">
			<span class="remark"><s:property value="item_description"/></span>
			<img class="image" style="width:150px; height:100px;" src="<s:property value='image_file_path'/>" >

			<br><br>

			<s:property value="BikeName" /><br>

			<span>値段:</span>
			<s:property value="itemPrice" /><span>円</span><br>

			<span>在庫:</span>
			<s:if test="item_stock>0">
				<s:property value="item_stock"/>
			</s:if>
			<s:else>
				<span class="error-message">品切れ</span>
			</s:else>
			</a>

			<br>

			<span>購入個数:</span>
			<s:if test="item_stock>0">
				<div class="select-box">
				<select name="count">
					<option value="0" selected="selected">-</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
				</div>
			</s:if>
			<s:else>
				<select name="count">
					<option value="0" selected="selected">0</option>
				</select>
			</s:else>



			</div>
			</dd>
		</dl>
	</s:iterator>
	</s:elseif>


<!-- カテゴリソート④ -->
	<%-- <s:elseif test="session.sortCategory=='kawasaki'">
	<s:iterator value="#session.buyItemDTOList">
		<dl class="dl-list">
			<dd class="dd-list">

			<div class="item_description">
			<a href="#">
			<span class="remark"><s:property value="item_description"/></span>
			<img class="image" style="width:150px; height:100px;" src="<s:property value='image_file_path'/>" >

			<br><br>

			<s:property value="BikeName" /><br>

			<span>値段:</span>
			<s:property value="itemPrice" /><span>円</span><br>

			<span>在庫:</span>
			<s:if test="item_stock>0">
				<s:property value="item_stock"/>
			</s:if>
			<s:else>
				<span class="error-message">品切れ</span>
			</s:else>
			</a>

			<br>

			<span>購入個数:</span>
			<s:if test="item_stock>0">
				<div class="select-box">
				<select name="count">
					<option value="0" selected="selected">-</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
				</div>
			</s:if>
			<s:else>
				<select name="count">
					<option value="0" selected="selected">0</option>
				</select>
			</s:else>



			</div>
			</dd>
		</dl>
	</s:iterator>
	</s:elseif> --%>

<!-- カテゴリソートしない時の表示 -->
	<s:else>
	<s:iterator value="#session.AllItem">
		<dl class="dl-list">
			<dd class="dd-list">

			<div class="item_description">
			<a href="#">
			<span class="remark"><s:property value="item_description"/></span>
			<img class="image" style="width:150px; height:100px;" src="<s:property value='image_file_path'/>" >

			<br><br>

			<s:property value="BikeName" /><br>

			<span>値段:</span>

			<s:property value="itemPrice" /><span>円</span><br>

			<span>在庫:</span>
				<s:if test="item_stock>0">
					<s:property value="item_stock"/>
				</s:if>
				<s:else>
					<span class="error-message">品切れ</span>
				</s:else>
			</a>
			<br>

			<span>購入個数:</span>
				<s:if test="item_stock>0">
					<div class="select-box">
					<select name="count">
						<option value="0" selected="selected">-</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
					</select>
			</div>
				</s:if>
				<s:else>
					<select name="count">
						<option value="0" selected="selected">0</option>
					</select>
				</s:else>
			</div>
			</dd>
		</dl>

	</s:iterator>
	</s:else>
</s:form>
</table>

</div>
</div>
</body>
</html>