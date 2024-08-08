
-- AGREGAÇÃO POR REGIÃO
select regiao as 'Região', sum(populacao) as Total from estados group by regiao order by Total desc

-- AGREGAÇÃO TODA A TABELA
select avg(populacao) as Total from estados
