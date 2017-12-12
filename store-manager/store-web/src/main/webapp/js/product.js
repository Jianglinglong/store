 $(function() {
				$("#searchInput").keyup(
						function() {
							var content = $(this).val();
							if (content != "") {
								$.get("searchProduct/listName.do", {
									name : content
								}, function(data) {
									$("#mark").html("");
									var json = data;
									if (json.length > 0) {
										for (var i = 0; i < json.length; i++) {
											$("#mark").append(
													"<span onclick='setValue(this);'>"
															+ json[i].proName
															+ "</span>");
										}
										$("#mark").slideDown(300);
									} else {
										$("#mark").slideUp(300);
									}

								})
							}
						});
			});
			function setValue(span) {
				var value = span.innerHTML;
				$("#searchInput").val(value);
				$("#mark").slideUp(300);
				var textArr = $("form :input[type='text']");
				$("form").submit();

			}
		