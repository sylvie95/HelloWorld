$("#main").tabs({
	fit:true,
	border:false,
});

$("#sideNav").accordion({
	fit:true,
	border:false,	
});

$(".treeNav").tree({
	onClick: function(node){  // node是指树节点， node.text是节点文本内容
		var nodeContent = node.text;
		if($("#main").tabs('exists', nodeContent)){
			$("#main").tabs('close', nodeContent)
		}
		
		if(nodeContent == "新闻信息"){
			$("#main").tabs('add',{
				title: nodeContent,
				href:"back/news_info.jsp",
				iconCls:"icon-mini-add",
				closable:true,
			});
		}else if(nodeContent == "新闻编辑"){
			$("#main").tabs('add',{
				title: nodeContent,
				href:"back/news_edit.jsp",
				iconCls:"icon-mini-add",
				closable:true,
			});
		}else{
			$("#main").tabs('add',{
				title: nodeContent,
				content:nodeContent,
				iconCls:"icon-mini-add",
				closable:true,
			});
		}
		
	}
});


$.extend($.fn.layout.methods,{
	full:function(jq){
		return jq.each(function(){
			var layout=$(this);
			var center=layout.layout("panel","center");
			center.panel("maximize");
			center.parent().css("z-index",10);
			
			$(window).on("resize.full",function(){
				layout.layout("unFull").layout("resize");
			})
		});
	},
	unfull:function(jq){
		return jq.each(function(){
			var layout=$(this);
			var center=layout.layout("panel","center");
			center.parent().css("z-index","inherit");
			center.panel("restore");
			$(window).off("resize.full");
		});
	}
});

function full(){
	$("body").layout("full");
	$("#center_content").addClass("panel-fit");
}

function unfull(){
	$("body").layout("unfull");
}