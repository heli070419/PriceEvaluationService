<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<br />
<br />
<div class="container">
	<h4>Enter Product Info to Evaluate</h4>
	<div class="jumbotron">
		<form action="/PriceEvaluationService/submit" method="post">
			<div class="form-group panel panel-body">
				<div class="row">
					<div class="col-xs-12">
						<label for="productNameInput">Product Name</label>
						<div class="input-group">
							<input type="text" class="form-control" id="productNameInput"
								placeholder="Product Name" required> <span
								class="input-group-addon"></span>
						</div>
					</div>
				</div>
				<div class="row top-buffer">
					<div class="col-xs-12">
						<label for="productDesc">Product Description</label>
						<div class="input-group">
							<textarea class="form-control" id="productDesc"
								placeholder="Product Description"></textarea>
							<span class="input-group-addon"></span>
						</div>
					</div>
				</div>
			</div>
			<div class="form-group panel panel-body">
				<div class="row">
					<div class="col-xs-6">
						<label for="productOriginalPrice">Original Price</label>
						<div class="input-group">
							<input type="text" class="form-control" id="productOriginalPrice"
								placeholder="Canadian Dollar" required><span
								class="input-group-addon">$</span>
						</div>
					</div>
					<div class="col-xs-6">
						<label for="mailPrice">Mail Price</label>
						<div class="input-group">
							<input type="text" class="form-control" id="mailPrice"
								placeholder="Canadian Dollar" required> <span
								class="input-group-addon">$</span>
						</div>
					</div>
				</div>
				<div class="row top-buffer">
					<div class="col-xs-6">
						<label for="listPrice">List Price</label>
						<div class="input-group">
							<input type="text" class="form-control" id="listPrice"
								placeholder="Canadian Dollar" required> <span
								class="input-group-addon">$</span>
						</div>
					</div>
					<div class="col-xs-6">
						<label for="secondSalePrice">Second Sale Price</label>
						<div class="input-group">
							<input type="text" class="form-control" id="secondSalePrice"
								placeholder="Canadian Dollar" required><span
								class="input-group-addon">$</span>
						</div>
					</div>
				</div>
			</div>
			<div class="form-group panel panel-body">
				<div class="row">
					<div class="col-xs-6">
						<label for="productWeight">Product Weight</label>
						<div class="input-group">
							<input type="text" class="form-control" id="productWeight"
								placeholder="Gram or Pound" required> <span
								class="input-group-addon">Pound</span>
						</div>
					</div>
				</div>
			</div>
			<button type="submit" class="btn btn-default">Evaluate</button>
		</form>
	</div>
</div>