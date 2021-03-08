INSERT INTO users VALUES (1,'shohei koyanagi','shohei','koyanagi','$2a$10$ul/xAHCkCP0SygGCYhgBxO42UePcHxqpm.GaqHkRjuV9OOEQH.0q6','test@test.co.jp','1');
INSERT INTO tasks VALUES (1,1,'筋トレ（腹筋，バーベル）',1,TO_DATE('2021/01/01', 'YYYY/MM/DD')),
                         (2,1,'市役所で転入手続き',1,TO_DATE('2021/01/11', 'YYYY/MM/DD')),
                         (3,2,'評価表の記入',2,TO_DATE('2021/02/05', 'YYYY/MM/DD')),
                         (4,2,'得意先へお手紙の返信',3,TO_DATE('2021/02/13', 'YYYY/MM/DD')),
                         (5,1,'千葉でランチ',1,TO_DATE('2021/03/29', 'YYYY/MM/DD')),
                         (6,3,'大会参加申し込み',2,TO_DATE('2021/02/10', 'YYYY/MM/DD')),
                         (7,3,'練習会返信',2,TO_DATE('2021/01/26', 'YYYY/MM/DD')),
                         (8,2,'目標提出',1,TO_DATE('2021/01/16', 'YYYY/MM/DD')),
                         (9,2,'人事メール返信',1,TO_DATE('2021/04/01', 'YYYY/MM/DD')),
                         (10,1,'MNP予約番号発行',3,TO_DATE('2021/04/15', 'YYYY/MM/DD'));
INSERT INTO categories VALUES (1,'プライベート','#A5D6A7'),
                            (2,'仕事','#FFCC80'),
                            (3,'家事','#84FFFF'),
                            (4,'筋トレ','#CE93D8');
INSERT INTO status VALUES (1,'未着手','#EF9A9A'),
                          (2,'着手中','#90CAF9'),
                          (3,'完了','#DCE775');

