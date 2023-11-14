-- beats 51%
update salary set sex =
    case sex
        when 'm' then 'f'
        when 'f' then 'm'
    end ;

-- beats 80%
UPDATE SALARY SET SEX =
    CASE
        WHEN SEX = 'm' THEN 'f'
        WHEN SEX = 'f' THEN 'm'
    END