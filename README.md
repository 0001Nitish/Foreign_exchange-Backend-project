# Foreign_exchange-Backend-project
Setup and Installation Instructions
Clone the Repository: git clone (https://github.com/0001Nitish/Foreign_exchange-Backend-project.git) cd

Install Dependencies: Ensure you have Maven installed. Run the following command to install the necessary dependencies: mvn clean install

Database Setup:
Ensure you have a running instance of a database (e.g., MySQL, PostgreSQL).

Update the application.properties file with your database configuration: properties 
spring.datasource.url=jdbc:postgres://localhost:5432/your_database
spring.datasource.username=your_username 
spring.datasource.password=your_password 
spring.jpa.hibernate.ddl-auto=update

DDL
-- Table: public.conversion_rates

-- DROP TABLE IF EXISTS public.conversion_rates;

CREATE TABLE IF NOT EXISTS public.conversion_rates
(
    id bigint NOT NULL GENERATED BY DEFAULT AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    date date NOT NULL,
    from_currency character varying(255) COLLATE pg_catalog."default" NOT NULL,
    rate double precision NOT NULL,
    to_currency character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT conversion_rates_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.conversion_rates
    OWNER to postgres;
