DROP DATABASE texts_db;
CREATE DATABASE texts_db;

-- Table: public.Users

DROP TABLE IF EXISTS public."Users";

CREATE TABLE IF NOT EXISTS public."Users"
(
    "UserId" serial PRIMARY KEY,
    "UserName" text COLLATE pg_catalog."default" NOT NULL,
    "Fio" text COLLATE pg_catalog."default",
    "PasswordHash" text COLLATE pg_catalog."default" NOT NULL,
    "Age" integer
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Users"
    OWNER to postgres;

    -- пароль такой же как логин!
INSERT into "Users" ("UserName", "Fio", "PasswordHash", "Age") values ('user', 'Ivan Ivanich', '$2a$10$2Df/RkwlblsBzBxtgx9R3OcKakluX3XzHw5ilkKjA8Xg/dr23uKE2', 25);
INSERT into "Users" ("UserName", "Fio", "PasswordHash", "Age") values ('user1', 'Petr Petrovich', '$2a$10$sD96meng8z5GG2nfCvgfsOWBCzJShx6TxvK3YDskA6w.fWXw6zf0i', 28);




--__________ Table Texts_____________________________________________________
DROP TABLE IF EXISTS public."Texts";

CREATE TABLE IF NOT EXISTS public."Texts"
(
    "TextId" serial PRIMARY KEY,
    "PublishDate" date NOT NULL DEFAULT now(),
    "TextContent" text COLLATE pg_catalog."default" NOT NULL
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Texts"
    OWNER to postgres;

INSERT into "Texts" ("TextContent") values ('There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don_t look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn_t anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.');
INSERT into "Texts" ("TextContent") values ('Mauris eget lorem in sapien feugiat vehicula vel quis nulla. Nulla fermentum metus quis nisl accumsan, quis sollicitudin urna porta. Nunc in pharetra massa. In pellentesque ornare felis, eget condimentum erat mollis sed. Nulla tincidunt, dolor et aliquet pharetra, sapien neque ornare ligula, ut suscipit leo nisl vitae dolor. Nunc non tristique mauris, non pellentesque elit. Morbi massa odio, rutrum a commodo at, iaculis vitae nibh. Aenean vel augue dignissim, sagittis sapien eu, euismod mauris. Donec imperdiet tincidunt tristique. Duis vestibulum porta consequat.');
INSERT into "Texts" ("TextContent") values ('But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful.');



-- Table Comments ____________________________________________________________________________________
DROP TABLE IF EXISTS public."Comments";

CREATE TABLE IF NOT EXISTS public."Comments"
(
    "CommentId" serial PRIMARY KEY,
    "UserId" integer NOT NULL,
    "TextId" integer NOT NULL,
    "CommentText" text COLLATE pg_catalog."default" NOT NULL,
    "DateAt" date NOT NULL DEFAULT now(),
    CONSTRAINT "TextsFK" FOREIGN KEY ("TextId")
        REFERENCES public."Texts" ("TextId") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT "UsersFK" FOREIGN KEY ("UserId")
        REFERENCES public."Users" ("UserId") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Comments"
    OWNER to postgres;
    
INSERT into "Comments" ("UserId", "TextId", "CommentText") values (1, 1, 'Comment to text1 ...');
INSERT into "Comments" ("UserId", "TextId", "CommentText") values (2, 1, 'Comment to text1 from user 2 ...');
commit;
