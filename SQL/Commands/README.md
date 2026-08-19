# SQL Commands — Complete Quick Reference

> A practical SQL command reference with one-line explanations.  
> Syntax can vary slightly between MySQL, PostgreSQL, SQL Server, Oracle, and other database systems.

## 1. DDL — Data Definition Language

| Command | One-line explanation |
|---|---|
| `CREATE` | Creates a database object such as a database, table, view, index, or schema. |
| `ALTER` | Changes the structure or definition of an existing database object. |
| `DROP` | Permanently removes a database object and its definition. |
| `TRUNCATE` | Removes all rows from a table while keeping its structure. |
| `RENAME` | Changes the name of an existing database object. |
| `COMMENT` | Adds descriptive metadata/comments to database objects in systems that support it. |

## 2. DML — Data Manipulation Language

| Command | One-line explanation |
|---|---|
| `INSERT` | Adds one or more new rows to a table. |
| `UPDATE` | Changes existing values in one or more rows. |
| `DELETE` | Removes selected rows from a table. |
| `MERGE` | Synchronizes source and target data by inserting, updating, or sometimes deleting rows based on a match condition. |

## 3. DQL — Data Query Language

| Command | One-line explanation |
|---|---|
| `SELECT` | Retrieves data from one or more tables or other queryable objects. |

## 4. TCL — Transaction Control Language

| Command | One-line explanation |
|---|---|
| `COMMIT` | Permanently saves the changes made in the current transaction. |
| `ROLLBACK` | Undoes uncommitted changes in the current transaction. |
| `SAVEPOINT` | Creates a named point inside a transaction to which you can partially roll back. |
| `ROLLBACK TO SAVEPOINT` | Rolls the transaction back to a previously created savepoint without ending the whole transaction. |
| `SET TRANSACTION` | Configures transaction properties such as isolation level in databases that support it. |
| `START TRANSACTION` | Explicitly begins a transaction in systems that support the statement. |

## 5. DCL — Data Control Language

| Command | One-line explanation |
|---|---|
| `GRANT` | Gives users or roles specific privileges on database objects. |
| `REVOKE` | Removes previously granted privileges from users or roles. |
| `DENY` | Explicitly denies permissions in systems such as SQL Server that support it. |

## 6. Constraints

| Constraint | One-line explanation |
|---|---|
| `PRIMARY KEY` | Uniquely identifies each row and does not allow `NULL` values. |
| `FOREIGN KEY` | Enforces a relationship by requiring values to reference a key in another table. |
| `UNIQUE` | Prevents duplicate values in the constrained column or column combination. |
| `NOT NULL` | Prevents a column from containing `NULL`. |
| `CHECK` | Requires inserted or updated values to satisfy a specified condition. |
| `DEFAULT` | Automatically supplies a value when an insert does not provide one. |

## 7. Filtering and Conditions

| Command / Operator | One-line explanation |
|---|---|
| `WHERE` | Filters individual rows before grouping and aggregation. |
| `IN` | Checks whether a value matches any value in a specified list or subquery. |
| `NOT IN` | Checks that a value does not match values in a specified list or subquery. |
| `BETWEEN` | Tests whether a value falls within an inclusive range. |
| `NOT BETWEEN` | Tests whether a value falls outside an inclusive range. |
| `LIKE` | Performs pattern matching using wildcards such as `%` and `_`. |
| `NOT LIKE` | Filters values that do not match a specified pattern. |
| `IS NULL` | Tests whether an expression contains `NULL`. |
| `IS NOT NULL` | Tests whether an expression does not contain `NULL`. |
| `AND` | Requires all combined conditions to be true. |
| `OR` | Requires at least one combined condition to be true. |
| `NOT` | Reverses the result of a condition. |
| `EXISTS` | Tests whether a subquery returns at least one row. |
| `NOT EXISTS` | Tests whether a subquery returns no rows. |
| `=` | Checks equality between two expressions. |
| `<>` | Checks that two expressions are not equal. |
| `!=` | Alternative not-equal operator supported by many SQL databases. |
| `>` | Tests whether the left value is greater than the right value. |
| `<` | Tests whether the left value is less than the right value. |
| `>=` | Tests whether the left value is greater than or equal to the right value. |
| `<=` | Tests whether the left value is less than or equal to the right value. |

## 8. Grouping and Aggregation

| Command | One-line explanation |
|---|---|
| `GROUP BY` | Groups rows with the same values so aggregate calculations can be performed per group. |
| `HAVING` | Filters groups after `GROUP BY` and aggregation. |
| `COUNT()` | Counts rows or non-`NULL` values in a column. |
| `SUM()` | Calculates the total of numeric values. |
| `AVG()` | Calculates the average of numeric values. |
| `MIN()` | Returns the smallest value in a set. |
| `MAX()` | Returns the largest value in a set. |

## 9. Sorting and Result Limiting

| Command | One-line explanation |
|---|---|
| `ORDER BY` | Sorts query results by one or more columns or expressions. |
| `ASC` | Sorts values in ascending order and is the default direction in most SQL systems. |
| `DESC` | Sorts values in descending order. |
| `LIMIT` | Restricts the number of rows returned in systems such as MySQL and PostgreSQL. |
| `OFFSET` | Skips a specified number of rows before returning results. |
| `FETCH FIRST` | Limits the number of rows returned using standard-style SQL syntax supported by many databases. |
| `TOP` | Limits returned rows in SQL Server and some related systems. |

## 10. Joins

| Join | One-line explanation |
|---|---|
| `INNER JOIN` | Returns rows where the join condition matches in both tables. |
| `LEFT JOIN` | Returns every row from the left table and matching rows from the right table. |
| `RIGHT JOIN` | Returns every row from the right table and matching rows from the left table. |
| `FULL OUTER JOIN` | Returns matching rows plus unmatched rows from both tables where supported. |
| `CROSS JOIN` | Produces the Cartesian product containing every combination of rows from both tables. |
| `SELF JOIN` | Joins a table to itself, usually using table aliases. |
| `NATURAL JOIN` | Automatically joins tables using same-named columns, where supported; use carefully because schema changes can affect it. |

## 11. Set Operations

| Command | One-line explanation |
|---|---|
| `UNION` | Combines compatible query results and removes duplicate rows. |
| `UNION ALL` | Combines compatible query results while retaining duplicates. |
| `INTERSECT` | Returns rows that appear in both query results where supported. |
| `EXCEPT` | Returns rows from the first query that do not appear in the second where supported. |
| `MINUS` | Oracle's set operator for returning rows from the first query that are absent from the second. |

## 12. Subqueries and Quantifiers

| Command | One-line explanation |
|---|---|
| `IN (subquery)` | Checks whether a value exists among values returned by a subquery. |
| `EXISTS (subquery)` | Checks whether a correlated or non-correlated subquery returns at least one row. |
| `NOT EXISTS (subquery)` | Checks whether a subquery returns no rows. |
| `ANY` / `SOME` | Compares a value with at least one value returned by a subquery. |
| `ALL` | Compares a value with every value returned by a subquery. |
| `SCALAR SUBQUERY` | A subquery designed to return a single value for use within another expression. |
| `CORRELATED SUBQUERY` | A subquery that refers to a column from the outer query and may execute logically for each outer row. |

## 13. Aliases

| Command | One-line explanation |
|---|---|
| `AS` | Assigns a temporary alias to a column or table for readability and easier referencing. |

## 14. Conditional Expressions

| Command | One-line explanation |
|---|---|
| `CASE` | Performs conditional logic similar to `if/else` and returns a value based on conditions. |
| `COALESCE()` | Returns the first non-`NULL` expression from a list. |
| `NULLIF()` | Returns `NULL` when two expressions are equal; otherwise returns the first expression. |
| `GREATEST()` | Returns the greatest value among supplied expressions in databases that support it. |
| `LEAST()` | Returns the smallest value among supplied expressions in databases that support it. |

## 15. String Functions

| Function | One-line explanation |
|---|---|
| `CONCAT()` | Combines multiple strings into one string. |
| `CONCAT_WS()` | Concatenates strings using a specified separator. |
| `UPPER()` | Converts text to uppercase. |
| `LOWER()` | Converts text to lowercase. |
| `LENGTH()` | Returns the length of a string, with exact semantics varying by database and encoding. |
| `CHAR_LENGTH()` | Returns the number of characters in a string where supported. |
| `SUBSTRING()` | Extracts part of a string. |
| `LEFT()` | Returns a specified number of characters from the beginning of a string. |
| `RIGHT()` | Returns a specified number of characters from the end of a string. |
| `TRIM()` | Removes leading and/or trailing characters, commonly spaces. |
| `LTRIM()` | Removes leading whitespace. |
| `RTRIM()` | Removes trailing whitespace. |
| `REPLACE()` | Replaces occurrences of one substring with another. |
| `REVERSE()` | Reverses the characters in a string where supported. |
| `POSITION()` | Finds the position of a substring within a string in standard-style SQL systems. |

## 16. Numeric Functions

| Function | One-line explanation |
|---|---|
| `ROUND()` | Rounds a numeric value to a specified number of decimal places. |
| `CEIL()` / `CEILING()` | Rounds a number upward to the nearest integer. |
| `FLOOR()` | Rounds a number downward to the nearest integer. |
| `ABS()` | Returns the absolute value of a number. |
| `MOD()` | Returns the remainder after division. |
| `POWER()` | Raises a number to a specified power. |
| `SQRT()` | Returns the square root of a number. |
| `SIGN()` | Returns the sign of a number, such as negative, zero, or positive. |
| `RAND()` | Generates a pseudo-random number in databases that provide this function. |

## 17. Date and Time

| Function / Command | One-line explanation |
|---|---|
| `CURRENT_DATE` | Returns the current date. |
| `CURRENT_TIME` | Returns the current time. |
| `CURRENT_TIMESTAMP` | Returns the current date and time. |
| `NOW()` | Returns the current date and time in systems such as MySQL. |
| `EXTRACT()` | Extracts a component such as year, month, day, or hour from a date/time value. |
| `DATE_ADD()` | Adds a specified time interval to a date in MySQL. |
| `DATE_SUB()` | Subtracts a specified time interval from a date in MySQL. |
| `DATEDIFF()` | Calculates the difference between dates in supported systems. |
| `DATE_FORMAT()` | Formats a date/time value according to a specified pattern in MySQL. |

## 18. Type Conversion

| Function | One-line explanation |
|---|---|
| `CAST()` | Converts an expression from one data type to another. |
| `CONVERT()` | Converts data types or formats values, with syntax and behavior varying by database. |
| `TRY_CAST()` | Attempts type conversion and returns `NULL` instead of raising an error when supported. |
| `TRY_CONVERT()` | SQL Server's safe conversion function that returns `NULL` when conversion fails. |

## 19. Views

| Command | One-line explanation |
|---|---|
| `CREATE VIEW` | Creates a virtual table based on a stored query. |
| `ALTER VIEW` | Changes the definition of an existing view where supported. |
| `DROP VIEW` | Removes a view from the database. |

## 20. Indexes

| Command | One-line explanation |
|---|---|
| `CREATE INDEX` | Creates an index to speed up searches and certain query operations. |
| `CREATE UNIQUE INDEX` | Creates an index that also enforces uniqueness of indexed values. |
| `DROP INDEX` | Removes an existing index. |
| `CLUSTERED INDEX` | Defines an index that determines the physical/logical storage order in systems that support clustered indexes. |
| `NONCLUSTERED INDEX` | Creates a separate index structure that points to table data in systems such as SQL Server. |

## 21. Common Table Expressions — CTE

| Command | One-line explanation |
|---|---|
| `WITH` | Defines a temporary named query result, called a Common Table Expression (CTE), for use by a following statement. |
| `WITH RECURSIVE` | Defines a recursive CTE for hierarchical or iterative data processing where supported. |

Example:

```sql
WITH cse_students AS (
    SELECT *
    FROM students
    WHERE department = 'CSE'
)
SELECT *
FROM cse_students;
```

## 22. Window Functions

| Function / Clause | One-line explanation |
|---|---|
| `OVER()` | Defines the window of rows used by a window function. |
| `PARTITION BY` | Divides rows into independent groups within a window function. |
| `ROW_NUMBER()` | Assigns a unique sequential number to rows within each window. |
| `RANK()` | Assigns rankings while leaving gaps after ties. |
| `DENSE_RANK()` | Assigns rankings without gaps after ties. |
| `NTILE()` | Divides rows into a specified number of approximately equal groups. |
| `LAG()` | Accesses a value from a previous row within a window. |
| `LEAD()` | Accesses a value from a following row within a window. |
| `FIRST_VALUE()` | Returns the first value within a window frame. |
| `LAST_VALUE()` | Returns the last value within a window frame, depending on the window frame definition. |
| `NTH_VALUE()` | Returns the nth value within a window frame where supported. |
| `CUME_DIST()` | Calculates the cumulative distribution of a row within its window. |
| `PERCENT_RANK()` | Calculates the relative rank of a row as a percentage within its window. |

Example:

```sql
SELECT
    name,
    department,
    marks,
    RANK() OVER (
        PARTITION BY department
        ORDER BY marks DESC
    ) AS department_rank
FROM students;
```

## 23. Temporary Tables

| Command | One-line explanation |
|---|---|
| `CREATE TEMPORARY TABLE` | Creates a temporary table whose lifetime is usually limited to the current session or transaction depending on the database. |
| `DROP TEMPORARY TABLE` | Removes a temporary table explicitly. |

## 24. Schemas and Database Objects

| Command | One-line explanation |
|---|---|
| `CREATE SCHEMA` | Creates a schema used to organize database objects. |
| `DROP SCHEMA` | Removes a schema and, depending on the database/options, its contained objects. |
| `CREATE DATABASE` | Creates a new database. |
| `DROP DATABASE` | Deletes a database and its objects. |
| `USE` | Selects the database to use in systems such as MySQL. |

## 25. Sequences and Auto-Generated Values

| Command | One-line explanation |
|---|---|
| `CREATE SEQUENCE` | Creates a database sequence that generates numeric values in systems that support sequences. |
| `NEXT VALUE FOR` | Retrieves the next value from a sequence in systems that support this syntax. |
| `ALTER SEQUENCE` | Changes properties of an existing sequence. |
| `DROP SEQUENCE` | Removes a sequence. |
| `AUTO_INCREMENT` | Automatically generates increasing numeric values in MySQL-style table definitions. |
| `IDENTITY` | Defines an automatically generated numeric column in systems such as SQL Server. |
| `GENERATED AS IDENTITY` | Standard-style syntax for defining automatically generated identity values. |

## 26. Stored Procedures and Functions

| Command | One-line explanation |
|---|---|
| `CREATE PROCEDURE` | Creates a reusable stored procedure containing SQL logic. |
| `CALL` | Executes a stored procedure in systems such as MySQL and PostgreSQL-compatible environments with applicable syntax. |
| `EXEC` / `EXECUTE` | Executes a stored procedure or dynamic SQL depending on the database. |
| `ALTER PROCEDURE` | Changes an existing stored procedure where supported. |
| `DROP PROCEDURE` | Removes a stored procedure. |
| `CREATE FUNCTION` | Creates a reusable user-defined function. |
| `ALTER FUNCTION` | Changes an existing user-defined function where supported. |
| `DROP FUNCTION` | Removes a user-defined function. |

## 27. Triggers

| Command | One-line explanation |
|---|---|
| `CREATE TRIGGER` | Creates automatic logic that runs when specified table events occur. |
| `ALTER TRIGGER` | Changes an existing trigger where supported. |
| `DROP TRIGGER` | Removes a trigger. |

Common trigger events:

| Event | One-line explanation |
|---|---|
| `BEFORE INSERT` | Runs trigger logic before a row is inserted. |
| `AFTER INSERT` | Runs trigger logic after a row is inserted. |
| `BEFORE UPDATE` | Runs trigger logic before a row is updated. |
| `AFTER UPDATE` | Runs trigger logic after a row is updated. |
| `BEFORE DELETE` | Runs trigger logic before a row is deleted. |
| `AFTER DELETE` | Runs trigger logic after a row is deleted. |

## 28. Transactions and Isolation

| Command / Concept | One-line explanation |
|---|---|
| `START TRANSACTION` | Begins an explicit transaction. |
| `BEGIN` | Starts a transaction in databases where this syntax is supported. |
| `COMMIT` | Makes the transaction's changes permanent. |
| `ROLLBACK` | Reverses uncommitted transaction changes. |
| `SAVEPOINT` | Marks a partial rollback point inside a transaction. |
| `SET TRANSACTION ISOLATION LEVEL` | Sets how the transaction handles concurrent reads and writes. |

Common isolation levels:

| Isolation Level | One-line explanation |
|---|---|
| `READ UNCOMMITTED` | Allows the possibility of reading uncommitted changes from other transactions. |
| `READ COMMITTED` | Prevents reading data that has not been committed. |
| `REPEATABLE READ` | Ensures repeated reads of the same row remain consistent within a transaction, with database-specific details. |
| `SERIALIZABLE` | Provides the strongest standard isolation by making concurrent transactions behave more like serial execution. |
| `SNAPSHOT` | Uses row-versioning snapshots in systems that support this isolation mode. |

## 29. Metadata and Information Schema

| Object / Command | One-line explanation |
|---|---|
| `INFORMATION_SCHEMA` | Provides standardized metadata about tables, columns, constraints, privileges, and other database objects. |
| `SHOW DATABASES` | Lists databases in systems such as MySQL. |
| `SHOW TABLES` | Lists tables in the currently selected database in systems such as MySQL. |
| `DESCRIBE` / `DESC` | Displays a table's column definitions and related metadata in supported systems. |
| `SHOW CREATE TABLE` | Displays the SQL definition used to create a table in MySQL. |

## 30. SQL Comments

| Syntax | One-line explanation |
|---|---|
| `--` | Starts a single-line SQL comment. |
| `/* ... */` | Creates a multi-line or inline SQL comment. |

Example:

```sql
-- This is a single-line comment

/*
   This is a
   multi-line comment
*/
SELECT * FROM students;
```

## 31. Important SQL Clauses — Quick Reference

| Clause | One-line explanation |
|---|---|
| `SELECT` | Specifies which columns or expressions to return. |
| `FROM` | Specifies the table or query source from which data is retrieved. |
| `JOIN` | Combines rows from multiple tables using a relationship condition. |
| `ON` | Specifies the condition used to match rows during a join. |
| `WHERE` | Filters rows before grouping. |
| `GROUP BY` | Groups rows for aggregate calculations. |
| `HAVING` | Filters grouped/aggregated results. |
| `ORDER BY` | Sorts the final query result. |
| `LIMIT` | Restricts the number of returned rows in supported databases. |
| `OFFSET` | Skips rows before returning the requested result set. |
| `DISTINCT` | Removes duplicate rows from the result. |
| `AS` | Assigns an alias to a column or table. |
| `WITH` | Defines one or more CTEs before a query. |
| `VALUES` | Specifies row values for `INSERT` or table value constructors. |
| `SET` | Assigns values in `UPDATE` statements and is also used for session/configuration settings depending on the database. |
| `ON CONFLICT` | Defines conflict-handling behavior in PostgreSQL-style inserts. |
| `ON DUPLICATE KEY UPDATE` | Defines duplicate-key update behavior in MySQL. |
| `RETURNING` | Returns affected rows/values from `INSERT`, `UPDATE`, or `DELETE` in databases that support it. |

## 32. Useful MySQL-Specific Commands

| Command | One-line explanation |
|---|---|
| `SHOW DATABASES` | Lists all databases accessible to the current MySQL user. |
| `SHOW TABLES` | Lists tables in the selected MySQL database. |
| `SHOW COLUMNS` | Displays column information for a MySQL table. |
| `SHOW CREATE TABLE` | Displays the `CREATE TABLE` statement for a table. |
| `SHOW INDEX` | Displays index information for a table. |
| `DESCRIBE` | Displays the structure of a MySQL table. |
| `USE` | Selects a MySQL database for subsequent statements. |
| `AUTO_INCREMENT` | Generates increasing numeric identifiers automatically. |
| `ON DUPLICATE KEY UPDATE` | Updates a row when an insert encounters a duplicate key. |

## 33. SQL Query Execution Order

The logical processing order of a typical SQL query is:

```text
1. FROM
2. JOIN
3. ON
4. WHERE
5. GROUP BY
6. HAVING
7. SELECT
8. DISTINCT
9. ORDER BY
10. LIMIT / OFFSET
```

> The exact optimizer execution plan can differ; this is the **logical query processing order** useful for understanding SQL.

## 34. Most Important Commands for Interviews

Focus on these topics first:

1. `SELECT`
2. `WHERE`
3. `DISTINCT`
4. `ORDER BY`
5. `GROUP BY`
6. `HAVING`
7. `COUNT()`, `SUM()`, `AVG()`, `MIN()`, `MAX()`
8. `INNER JOIN`
9. `LEFT JOIN`
10. `RIGHT JOIN`
11. `SELF JOIN`
12. `UNION`
13. `UNION ALL`
14. `INTERSECT`
15. `EXCEPT` / `MINUS`
16. Subqueries
17. `IN`
18. `EXISTS`
19. `ANY`
20. `ALL`
21. `CASE`
22. `COALESCE`
23. `PRIMARY KEY`
24. `FOREIGN KEY`
25. `UNIQUE`
26. `NOT NULL`
27. `CHECK`
28. `DEFAULT`
29. `INSERT`
30. `UPDATE`
31. `DELETE`
32. `CREATE`
33. `ALTER`
34. `DROP`
35. `TRUNCATE`
36. `COMMIT`
37. `ROLLBACK`
38. `SAVEPOINT`
39. CTE / `WITH`
40. Window functions
41. `ROW_NUMBER()`
42. `RANK()`
43. `DENSE_RANK()`
44. `LAG()`
45. `LEAD()`
46. Indexes
47. Views
48. Transactions
49. Stored procedures
50. Triggers

## 35. Quick Category Summary

| Category | Important Commands |
|---|---|
| **DDL** | `CREATE`, `ALTER`, `DROP`, `TRUNCATE`, `RENAME` |
| **DML** | `INSERT`, `UPDATE`, `DELETE`, `MERGE` |
| **DQL** | `SELECT` |
| **TCL** | `COMMIT`, `ROLLBACK`, `SAVEPOINT`, `START TRANSACTION` |
| **DCL** | `GRANT`, `REVOKE`, `DENY` |
| **Constraints** | `PRIMARY KEY`, `FOREIGN KEY`, `UNIQUE`, `NOT NULL`, `CHECK`, `DEFAULT` |
| **Filtering** | `WHERE`, `IN`, `BETWEEN`, `LIKE`, `IS NULL`, `EXISTS` |
| **Grouping** | `GROUP BY`, `HAVING` |
| **Sorting** | `ORDER BY`, `ASC`, `DESC` |
| **Joins** | `INNER`, `LEFT`, `RIGHT`, `FULL OUTER`, `CROSS`, `SELF` |
| **Set Operations** | `UNION`, `UNION ALL`, `INTERSECT`, `EXCEPT`, `MINUS` |
| **Aggregates** | `COUNT`, `SUM`, `AVG`, `MIN`, `MAX` |
| **Objects** | `VIEW`, `INDEX`, `SCHEMA`, `SEQUENCE` |
| **Conditional** | `CASE`, `COALESCE`, `NULLIF` |
| **Subqueries** | `IN`, `EXISTS`, `ANY`, `ALL` |
| **String Functions** | `CONCAT`, `UPPER`, `LOWER`, `SUBSTRING`, `TRIM`, `REPLACE` |
| **Numeric Functions** | `ROUND`, `CEIL`, `FLOOR`, `ABS`, `MOD`, `POWER` |
| **Date Functions** | `CURRENT_DATE`, `CURRENT_TIME`, `CURRENT_TIMESTAMP`, `EXTRACT` |
| **Type Conversion** | `CAST`, `CONVERT`, `TRY_CAST` |
| **CTE** | `WITH`, `WITH RECURSIVE` |
| **Window Functions** | `OVER`, `PARTITION BY`, `ROW_NUMBER`, `RANK`, `DENSE_RANK`, `LAG`, `LEAD` |
| **Procedures** | `CREATE PROCEDURE`, `CALL`, `EXECUTE`, `DROP PROCEDURE` |
| **Functions** | `CREATE FUNCTION`, `ALTER FUNCTION`, `DROP FUNCTION` |
| **Triggers** | `CREATE TRIGGER`, `ALTER TRIGGER`, `DROP TRIGGER` |
| **Metadata** | `INFORMATION_SCHEMA`, `SHOW`, `DESCRIBE` |
| **Comments** | `--`, `/* ... */` |

---

## Important Note

SQL is standardized, but **not every command/function is supported identically by every database**.

For example:

- MySQL uses `LIMIT`.
- SQL Server commonly uses `TOP`.
- Oracle traditionally uses `MINUS`.
- PostgreSQL/standard SQL uses `EXCEPT`.
- `FULL OUTER JOIN` is supported by several databases but not directly by MySQL.
- Date functions have significant syntax differences between databases.
- `MERGE`, `RETURNING`, `ON CONFLICT`, `TRY_CAST`, and other features vary by database/version.

Therefore, always check the syntax for the specific database you are using: **MySQL, Oracle, PostgreSQL, SQL Server, etc.**
