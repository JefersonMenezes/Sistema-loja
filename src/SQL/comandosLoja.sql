--inserir uma cidade:
insert into cidade (nome_cid, sigla_uf) values ('CURITIBA','PR');

--inserir um cliente:
insert into cliente (nome_cli, sexo_cli, telefone, idade, bairro, numero, id_cid) 
    values ('Pedro','M','09900000',20,'vilanova','192',1);

--inserir uma venda:
insert into venda (data_ven, valor_ven, id_cli) values ('2014/11/04',285.45,1);

--inserir um produto:
insert into produto (desc_pro, valor_pro, qtde_pro,id_cla) values ('calsa jeans',50,4,1);

--inserir uma classe:
insert into classe (nome_cla) values ('Cama Mesa e Banho');

--alterar cliente;
update cliente set  nome_cli = 'Jferson menezes' where id_cli = 1;

--excluir:
--venda:
delete from venda where id_ven = 2;

--listar dados;
cidade;
select * from cidade;

--listar por colunas;
cidade;
select nome_cid, sigla_uf from cidade;

--ordenar lista em ordem crescente;
cliente;
select * from cliente order by nome_cli;

--ordenar lista decrescente;
cliente;
select * from cliente order by nome_cli desc;

--listar so os clientes que realizaram compras;
select id_cli from venda;

--lista quais clientes realizaram vendas sem repetir;
select distinct (id_cli) from venda;

--saber quantas vendas tem;
select count(id_ven) from venda;

--saber quantas vendas tem de um determinado cliente;
select count(id_ven) from venda where id_cli = 1;

--saber o mair valor das vendas;
select max(valor_ven) from venda;

--saber o menor valor das vendas;
select min(valor_ven) from venda;

--saber a soma das vendas;
select sum(valor_ven) from venda;


--saber a media das vendas;
select avg(valor_ven) from venda;

--saber a soma das vendas de cada data;
select sum(valor_ven) from venda 
	group by data_ven;

--saber a soma das vendas de cada data mostrando a data;
select data_ven, sum(valor_ven) from venda 
	group by data_ven;

--saber a soma das vendas agrupadas data com determinda condicao;
select data_ven, sum(valor_ven) from venda 
	group by data_ven
	having sum(valor_ven) > 250;

--listar com condicao;
--cliente;
select * from cliente
where id_cli > 1;

--listar id mair e onde o nome comece com determinda letra;
select * from cliente
where id_cli > 1 and nome_cli like '%A%';

--listar duas tabelas;
select * from cidae, cliente;

--listar quando cidade_id_cid for igual id_cid da tabela cidade;
select * from cidade inner join cliente on cidade.id_cid = cliente.id_cid;

--listar os clientes e suas vendas
select * from cliente inner join venda on cliente.id_cli = 
venda.id_cli;

--listar quais cidade tem quais clientes
select * from cidade inner join cliente on cidade.id_cid = cliente.id_cid;

--listar quais cidade tem quais clientes e as cidade que nao tem clientes ATRAVES DO COMANDO LEFT tabela (ESQUERDA) DO COOMANDO;
select * from cidade left outer join cliente
	 on cidade.id_cid = cliente.id_cid;


--listar as cidades e os clientes inclusive os clientes que nao tem cidade ATRAVES DO RIGHT tabela (DIREITA) DO COMANDO;
select * from cidade right outer join cliente
	 on cidade.id_cid = cliente.id_cid;


