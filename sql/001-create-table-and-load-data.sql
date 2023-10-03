DROP TABLE IF EXISTS zoos;

CREATE TABLE zoos (
  zoo_id int unsigned AUTO_INCREMENT,
    zoo_name VARCHAR(100) NOT NULL,
    prefecture VARCHAR(20) NOT NULL,
    PRIMARY KEY(zoo_id)
);

CREATE TABLE capybara (
  id int unsigned AUTO_INCREMENT,
    capybara_name VARCHAR(100) NOT NULL,
    date_of_birth DATE,
    zoo_id int unsigned,
    PRIMARY KEY(id)
);


INSERT INTO zoos (zoo_name, prefecture) VALUES ("伊豆シャボテン動物公園", "静岡県");
INSERT INTO zoos (zoo_name, prefecture) VALUES ("神戸どうぶつ王国", "兵庫県");
INSERT INTO zoos (zoo_name, prefecture) VALUES ("長崎バイオパーク", "長崎県");
INSERT INTO zoos (zoo_name, prefecture) VALUES ("姫路セントラルパーク","兵庫県");

INSERT INTO capybara (capybara_name, date_of_birth, zoo_id) VALUES ("ニンジン", "2012-09-02",1 );
INSERT INTO capybara (capybara_name, date_of_birth, zoo_id) VALUES ("みかん","2013-11-02",1 );
INSERT INTO capybara (capybara_name, date_of_birth, zoo_id) VALUES ("白玉","2015-04-22",1 );

INSERT INTO capybara (capybara_name, date_of_birth, zoo_id) VALUES ("ざらめ","2013-05-19",2);
INSERT INTO capybara (capybara_name, date_of_birth, zoo_id) VALUES ("もっちー","2013-05-26",2);
INSERT INTO capybara (capybara_name, date_of_birth, zoo_id) VALUES ("そめい","2013-05-26",2);
INSERT INTO capybara (capybara_name, date_of_birth, zoo_id) VALUES ("モミジ","2008-09-10",3);
INSERT INTO capybara (capybara_name, date_of_birth, zoo_id) VALUES ("メイプル","2011-06-16",3);
INSERT INTO capybara (capybara_name, date_of_birth, zoo_id) VALUES ("ゴエモン","2011-11-26",3);
INSERT INTO capybara (capybara_name, date_of_birth, zoo_id) VALUES ("幸丸（ゆきまる）","2015-06-08",4);
INSERT INTO capybara (capybara_name, date_of_birth, zoo_id) VALUES ("六花（りっか）","2015-06-08",4);
INSERT INTO capybara (capybara_name, date_of_birth, zoo_id) VALUES ("ちゅる","2015-06-08",4);
