CREATE OR REPLACE FUNCTION retira_acentos(text) 
RETURNS text AS 
$BODY$ 
select 
translate($1,'��������������������������������������������', 
'aaaaaeeeeiiiooooouuuuAAAAAEEEEIIIOOOOOUUUUcC'); 
$BODY$ 
LANGUAGE 'sql' IMMUTABLE STRICT; 

delete from entidade_entidade;
