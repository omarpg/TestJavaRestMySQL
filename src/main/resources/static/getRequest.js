 $(document).ready(
		function() {

			// GET REQUEST
			$("#getALlBooks").click(function(event) {
				event.preventDefault();
				ajaxGet();
			});

			// DO GET
			function ajaxGet() {
				$.ajax({
					type : "GET",
					url : "all",
					success : function(result) {
						if (result.status == "success") {
							$('#getResultDiv ul').empty();
							var custList = "";
							$.each(result.data,
									function(i, libro) {
										var book = "ID: " + libro.id
											    + ", Nombre Libro: " + libro.name
												+ ", Autor: " + libro.autor
												+ ", A&ntilde;o: " + libro.anio
												+ ", Editorial: " + libro.editorial
												+ ", Precio: " + libro.precio
												+ "<br>";
										$('#getResultDiv .list-group').append(
												book)
									});
							console.log("Success: ", result);
						} else {
							$("#getResultDiv").html("<strong>Error</strong>");
							console.log("Fail: ", result);
						}
					},
					error : function(e) {
						$("#getResultDiv").html("<strong>Error</strong>");
						console.log("ERROR: ", e);
					}
				});
			}
		})