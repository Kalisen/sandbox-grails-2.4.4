drop table user;

create table user (
  id BINARY(16) NOT NULL,
  other_id BINARY(16) NOT NULL,
  another_id VARCHAR(36) NOT NULL,
  date_created TIMESTAMP NOT NULL,
  last_updated TIMESTAMP NOT NULL,
  version bigint(20) NOT NULL DEFAULT '0',
  CONSTRAINT PRIMARY KEY (`id`),
  CONSTRAINT UNIQUE KEY `idx_other_id` (`other_id`),
  CONSTRAINT UNIQUE KEY `idx_another_id` (`another_id`)
);


drop table user2;

create table user2 (
  id BINARY(16) NOT NULL DEFAULT 0,
  version bigint(20) NOT NULL DEFAULT '0',
  CONSTRAINT PRIMARY KEY (`id`)
);

drop table user3;

create table user3 (
  id VARCHAR(36) NOT NULL DEFAULT 0,
  version bigint(20) NOT NULL DEFAULT '0',
  CONSTRAINT PRIMARY KEY (`id`)
);

# the following requires super privileges
drop function uuid_from_bin;

DELIMITER $

CREATE FUNCTION uuid_from_bin(b BINARY(16))
RETURNS CHAR(36) DETERMINISTIC
BEGIN
DECLARE hex CHAR(32);
SET hex = HEX(b);
RETURN LOWER(CONCAT(LEFT(hex, 8), '-', MID(hex, 9,4), '-', MID(hex, 13,4), '-', MID(hex, 17,4), '-', RIGHT(hex, 12)));
END;

DELIMITER ;
