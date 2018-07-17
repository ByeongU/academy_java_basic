-- product.sql
/*
Product adidas = new Product("S001", "슈퍼스타", 87200, 5);
*/
-- 1. PRODUCT 테이블 생성 구문
/* prodcode NUMBER(4)
 * prodname VARCHAR2(50)
 * price 	NUMBER(12)
 * quantity NUMBER(3)
 * regdate	DATE	DEFAULT sysdate
 * moddate	DATE
 * pk_product : prodcode
 */
CREATE TABLE PRODUCT
( prodcode 	NUMBER(4)
 ,prodname 	VARCHAR2(50)
 ,price 	NUMBER(12)
 ,quantity	NUMBER(3)
 ,regdate	DATE	DEFAULT sysdate
 ,moddate	DATE
 ,CONSTRAINT pk_product PRIMARY KEY (prodcode)
);

-- 2. isExists()동일 데이터가 존재하는지 선조회
SELECT p.PRODCODE
  FROM product p
 WHERE p.PRODCODE = ?
 
-- 3. add() : 신규 제품 정보 등록
INSERT INTO PRODUCT(PRODCODE, PRODNAME, PRICE, QUANTITY) 
VALUES (?, ?, ?, ?)
;

-- 4. get() : 제품 정보 수집
SELECT p.PRODCODE
     , p.PRODNAME
     , p.PRICE
     , p.QUANTITY
  FROM product p
 WHERE p.PRODCODE = ?
;

-- 5. set() : 제품 정보 수정
UPDATE product p
   SET p.prodname = ?
     , p.price = ?
     , p.quantity = ?
     , p.moddate = sysdate
 WHERE p.prodcode = ?
;

-- 6. remove() : 제품 정보 삭제
DELETE product p
 WHERE p.PRODCODE = ?
