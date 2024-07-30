-- Craindo a tabela estado!
create table estados (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL,
    sigla VARCHAR(2) NOT NULL,
    regiao ENUM('Norte','Nordeste','Centro-O')
)