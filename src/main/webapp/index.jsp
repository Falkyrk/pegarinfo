<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="classes.Info" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Informações do Sistema</title>
<Link href="style.css" rel="stylesheet">

<img src="https://icons.iconarchive.com/icons/wallpaperfx/3d-bluefx-desktop/256/Monitor-icon.png" width="100">



</head>

<body>


<h2>Informações do Sistema</h2>


<%
	Info info = new Info();
out.println("<br>Número de Processadores: "+info.infocomp().get(0));
out.println("<br>Total de Memória Livre: "+info.infocomp().get(1));
out.println("<br>Total de Memória do computador: "+info.infocomp().get(2));
out.println("<br>Total de Memória utilizada: "+info.infocomp().get(3));
out.println("<br>Raiz do Sistema: "+info.infocomp().get(4));
out.println("<br>Tamanho do Disco: "+info.infocomp().get(5));
out.println("<br>Espaço Livre em Disco: "+info.infocomp().get(6));
out.println("<br>Espaço usado em Disco: "+info.infocomp().get(7));
out.println("<br>Nome do Sistema Operacional: "+info.infocomp().get(20));
out.println("<br>Arquitetura do Sistema Operacional: "+info.infocomp().get(21));
out.println("<br>Versão do Sistema Operacional: "+info.infocomp().get(22));
out.println("<br>Separador de Arquivos: "+info.infocomp().get(11));
out.println("<br>Sepadador de Caminho: "+info.infocomp().get(12));
out.println("<br>Linha Separação: "+info.infocomp().get(13));
out.println("<br>Nome de Usuário: "+info.infocomp().get(26));
out.println("<br>Pasta home do Usuário: "+info.infocomp().get(27));
out.println("<br>Pasta corrente do Usuário: "+info.infocomp().get(28));




%>


</body>
</html>