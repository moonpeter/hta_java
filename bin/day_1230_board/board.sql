drop table board;

create table board(
    BOARD_NUM       NUMBER(5),
    BOARD_NAME      VARCHAR2(30),
    BOARD_PASS      VARCHAR2(30),
    BOARD_SUBJECT   VARCHAR2(300),
    BOARD_CONTENT   VARCHAR2(4000),
    BOARD_FILE      VARCHAR2(50),
    BOARD_ORIGINAL  VARCHAR2(50),
    BOARD_RE_REF    NUMBER(5),
    BOARD_RE_LEV    NUMBER(5),
    BOARD_RE_SEQ       NUMBER(5),
    BOARD_READCOUNT NUMBER(5),
    BOARD_DATE      VARCHAR2(20),
    PRIMARY KEY(BOARD_NUM)
);


create sequence board_seq
start with 1
increment by 1;

insert into board
(board_num, board_name, board_pass, board_subject, board_content,
 board_re_ref, board_re_lev, board_re_seq, board_readcount, board_date)
values(board_seq.nextval, 'admin', '1', 'JSP 공부는 재미있어요', '열심히 해봐요', board_seq.nextval, 0,0,0, sysdate);

select * from board;

select * from
(select rownum rnum, board_num, board_name, board_subject, board_content, board_file, board_re_ref, board_re_lev, board_re_seq, board_readcount, board_date from
(select * from board order by board_re_ref desc, board_re_seq asc));