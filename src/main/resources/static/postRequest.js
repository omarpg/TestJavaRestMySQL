$(document).ready(
		function() {

			// SUBMIT FORM
			$("#bookForm").submit(function(event) {
				event.preventDefault();
				ajaxPost();
			});

			function ajaxPost() {

				// PREPARE FORM DATA
				var formData = {
					nombre : $("#nombre").val(),
					autor : $("#autor").val(),
					anio : $("#anio").val(),
					editorial : $("#editorial").val(),
					precio : $("#precio").val()
				}

				// DO POST
				$.ajax({
					type : "POST",
					contentType : "application/json",
					url : "save",
					data : JSON.stringify(formData),
					dataType : 'json',
					success : function(result) {
						if (result.status == "success") {
							$("#postResultDiv").html(
									"" + result.data.nombre
											+ "Post Successfully!);
						} else {
							$("#postResultDiv").html("<strong>Error</strong>");
						}
						console.log(result);
					},
					error : function(e) {
						alert("Error!")
						console.log("ERROR: ", e);
					}
				});

			}

		})