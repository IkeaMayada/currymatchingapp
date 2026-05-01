DELETE FROM questionnaire;

INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (1, 3, 'コーヒーはブラックで飲む', FALSE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (2, 5, '日常のルーティンが乱れるとイライラする', FALSE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (3, 1, '同じ日常が続くと退屈しちゃうタイプだ', FALSE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (4, 2, 'カレーは飲み物である', TRUE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (5, 4, 'ラーメン屋に行くと、ついいろいろトッピングしちゃう', FALSE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (6, 3, 'マーラータン、韓国料理など舌がしびれるほど辛い食べ物が好きだ', FALSE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (7, 1, '海外旅行に行くなら、ヨーロッパの綺麗な街並みを旅したい', TRUE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (8, 5, '旅行をするときは、計画に沿って行動するより、突発的なイベントを楽しみたいタイプだ', TRUE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (9, 4, 'ご飯を食べるためにおかずを食べるタイプだ', TRUE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (10, 2, '余った汁で作る締めの雑炊こそ鍋の醍醐味である', TRUE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (11, 3, '正論をぶつけるより、思いやりを持って伝えることが大事だ', TRUE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (12, 5, '新しいお店を開拓するより、行きつけのお店を優先したい', FALSE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (13, 1, '食べたことのない、新しいことにチャレンジすることが好きだ', FALSE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (14, 4, 'ピザを頼むときは、マルゲリータやペパロニなどシンプルなものを選ぶ', TRUE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (15, 2, 'ヨーグルトは固体より飲むタイプが好き', TRUE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (16, 3, '眠気を覚ますために辛いガムをかむ', FALSE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (17, 5, '意見が衝突した場面では、自分の主張を最後まで突き通す', FALSE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (18, 1, 'カレーはライスと食べるべきだと思う', TRUE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (19, 4, 'ラーメン屋でよく替え玉をする', TRUE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (20, 2, 'ちゃんぽんよりかは皿うどん派だ', FALSE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (21, 3, '友人から「甘党だね」とよく言われる', TRUE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (22, 5, '自分のセンスには自信がある', FALSE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (23, 1, '外食よりは家で作るご飯の方が好きだ', TRUE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (24, 4, '友達と外食に行くと、いろんな料理を頼んでシェアして全部食べてみたい', FALSE);
INSERT INTO questionnaire (questionnaire_id, questionnaire_type, question, reversed_score) VALUES (25, 2, 'LINEのグループは通知オフにしがち', TRUE);TRUE);
INSERT INTO mbti_types (mbti_type, mbti_name, mbti_summary, mbti_description, mbti_image_url) VALUES
('IDKG', '求道者',
 'スパイスから組み立てるカレーこそ本物。市販ルーは否定せんけど、自分で食べるなら絶対に手作り派。',
 '家にはスパイスが10種類以上常備されてて、週末は玉ねぎをじっくり炒めるところから始める。具材はゴロゴロ存在感を残すのが鉄則で、ミキサーで滑らかにするタイプのカレーには物足りなさを感じる。辛さも妥協せず、中辛で満足してる人を見ると「もったいないな」と思ってしまう。新しいインド料理店ができたら情報収集してから訪問、メニューを見ただけで店の本気度が大体わかる。語り出すと熱くなるので、興味ない相手の前では一応セーブする分別はある。',
 '/images/idkg.png'),

('IDKR', '錬金術師',
 'スパイスをじっくり溶け込ませた濃厚ルーが至高。具より「液体そのもの」の完成度に魂を注ぐタイプ。',
 '骨付き肉から出汁を取り、何時間も煮込んでスパイスと一体化させたルーに惚れ込んでる。具材はあくまで脇役、むしろ最後にライスとルーだけで食べる瞬間が一番幸せ。「カレーって結局ソースの料理やろ」が持論で、具材ゴロゴロ系を見ると「素材の主張が強すぎる」と内心思ってる。スパイスのレイヤー構造を語り出すと止まらず、テンパリングのタイミングや油の選び方にまで一家言ある。バターチキンを「あれは入門編」と評してしまうあたり、若干めんどくさい。',
 '/images/idkr.png'),

('IDAG', '慈愛家',
 'スパイスの香りは欲しいけど辛さで暴れたくはない。優しさと本格感の両立を求める繊細派。',
 'バターチキンやコルマみたいな、まろやかで濃厚なインドカレーが好物。スパイスの香りは絶対欲しいけど、汗かいて苦しむのは違うという明確な美学がある。具材はちゃんとゴロゴロ入っててほしくて、特に鶏肉やパニールが沈んでるのを見つけると嬉しい。「辛けりゃいいってもんじゃない」が口癖で、激辛自慢する人を冷ややかに見てる。ナンと一緒にゆったり食べる時間を大事にするタイプで、ランチで急いで食べるカレーには魂が入らんと思ってる。',
 '/images/idag.png'),

('IDAR', '芸術家',
 'スパイスの香りと優しい甘みを溶かし込んだ、滑らかで深いルーに恍惚とするタイプ。',
 'カレーを「飲める」と本気で思ってる派閥。ドロッと濃厚で、口に含んだ瞬間にスパイスがふわっと立ち上がるのに、後味は優しい——そういうカレーを探し続けてる。具材は溶け込んでてOKというか、むしろ溶けてた方が舌触りが綺麗で好き。バターチキンをひたすら追求してる店を見つけると常連化する。「カレーは結局ソースの完成度」という哲学を持ってて、具がゴロゴロしてるだけで満足する人とは少し噛み合わない。スプーンを置く瞬間まで余韻に浸るロマンチスト。',
 '/images/idar.png'),

('IJKG', '冒険者',
 'サラサラのスパイスカレーに具材ゴロゴロ。南インド系の本場感を求める攻めの嗜好。',
 'ミールスとかケララ料理みたいな、シャバッとした汁気のスパイスカレーに具がゴロッと入ってる系がドストライク。日本の「カレーライス」のイメージから一番遠いところに着地してるタイプで、ルーがドロッとしてると「これじゃない感」を覚える。辛さもちゃんと欲しい派で、汗かきながらライスと混ぜて食べる時間が至福。新しいスパイス料理屋を見つけたら即予約するアグレッシブさがあり、知識量も自然と増えていく。日本式カレーの話になると微妙な顔をしてしまうので、付き合いでは少し気をつけてる。',
 '/images/ijkg.png'),

('IJKR', '求心家',
 'サラサラのスパイススープに、複雑な香りが凝縮されてるタイプを愛する玄人志向。',
 '具よりも「スープそのもの」の出来で店を判断する。サンバルやラッサムみたいな、見た目はシンプルやのに口に含むと層が重なってるカレーに惚れ込む。辛さは欲しいけど、辛さで全部上書きするんじゃなくて、複雑な味の中で辛味が一要素として効いてる状態が理想。「カレーって料理ジャンルが広すぎて、もはや別物の集合体やと思う」みたいな冷静な見方をするタイプで、語り口も意外と理屈っぽい。具材ゴロゴロ系を「それはそれで」と認める柔軟さはあるが、自分の選択肢には入らない。',
 '/images/ijkr.png'),

('IJAG', '包容家',
 'スパイスの香りはちゃんと感じたいけど、辛さで疲れたくない。具材主役の優しい本格派。',
 '南インド系の優しいカレーや、辛さ控えめのスパイス料理が好き。ココナッツミルクで丸く仕上がったタイプとか、野菜たっぷりで滋味深いやつに惹かれる。具材ゴロゴロは譲れないポイントで、特に豆や根菜がしっかり入ってると嬉しい。健康志向な側面もあって、「カレーって意外と体にええよな」と無意識に正当化してるところがある。激辛競争には興味ないし、本場感を装うために無理して辛くしてる店には冷ややか。穏やかやけど自分の好みはハッキリしてる、芯のあるタイプ。',
 '/images/ijag.png'),

('IJAR', '静観家',
 'サラッとして優しい味わい、スパイスの香りはあくまで上品に。引き算の美学を持つタイプ。',
 'ココナッツベースの優しい南インドカレーとか、出汁感のあるスパイススープみたいなやつに心惹かれる。具材はあってもなくてもいいけど、ルーの繊細な味わいを邪魔しないでほしい派。「主張しすぎないカレー」というニッチな価値観を持ってて、具がゴロゴロしてたり辛さが攻めてくるカレーは「うん、悪くはない」レベルで終わる。料理全般において過剰さを嫌う美意識があり、カレー選びにもそれが滲み出てる。一見おとなしいが、語らせると独自の感性で深いことを言うタイプ。',
 '/images/ijar.png'),

('EDKG', '職人',
 '欧風カレーのドロッと濃厚なルーに、具材がしっかり入ってるのが理想。辛さも妥協しない王道派。',
 '「日本のカレーライス」の正統進化系を求めてる。デミグラス系の深いコク、何時間も煮込まれた牛肉や野菜のゴロッと感、それでいて辛さもちゃんと効いてる——そういう完成度の高い欧風カレーに惚れ込む。チェーン店でも妥協ポイントを見抜く目があり、「ここはルーは合格、肉が物足りん」みたいな細かい評価をしてる。インド系も食べるけど、最終的には欧風に戻ってくる。「結局これが一番落ち着く」と本人も自覚してて、奇をてらわない安定感を信頼してる。',
 '/images/edkg.png'),

('EDKR', '完璧主義者',
 '欧風の濃厚ルーが主役。具材は溶け込んで、ルーそのものの完成度で勝負してほしい辛口派。',
 '何日も煮込んでフォン・ド・ヴォーから取った的な、ガチのフレンチ系カレーに憧れる。具がゴロッとしてると「ルーの邪魔になる」と感じることすらあり、欧風カレーはあくまで「濃厚なソース料理」として捉えてる節がある。辛さもしっかり欲しいけど、それは料理の完成度を上げる要素としての辛さであって、辛さ自慢のためじゃない。「本物の欧風カレー出す店、東京でも数えるほどしかない」みたいなことを真顔で言う。値段が張ってもクオリティに払う覚悟があるタイプ。',
 '/images/edkr.png'),

('EDAG', '王道家',
 '家庭の味から進化した、優しくて濃厚な欧風カレー。具材ゴロゴロでほっとする系の安定派。',
 'カレーといえばコレ、という日本人の原風景にいちばん近いタイプ。じゃがいも・人参・玉ねぎ・お肉がしっかり入った、甘みのある欧風カレーが何より落ち着く。辛さで攻めるよりも、コクと優しさで包んでくれる味が好み。「カレーは家庭の味やん」という素朴な感覚を持ってて、おしゃれカフェの一皿2000円のカレーには「うーん」となる。実家のカレーを今でも美味しいと思える人で、変わったカレーを探すよりも、定番の完成度を上げることに関心がある。安心感の塊。',
 '/images/edag.png'),

('EDAR', '伝統家',
 'ドロッと濃厚で甘みのあるルーが主役。日本人の郷愁をくすぐる、ザ・カレーライス愛好家。',
 'ルーが命。具材は溶け込んでて、スプーンですくった一口にとろみと甘さとコクが全部入ってる——そういう昭和の喫茶店カレーみたいな世界観に惚れてる。激辛にも本格スパイスにも興味は薄く、「自分の好きなカレーはこれ」とブレない軸を持ってる。レトロな洋食屋のハヤシライスやカレーライスを愛し、ファミレスのカレーも普通に美味しく食べられる懐の深さがある。「凝ったカレー」を見ると「これはこれで別ジャンル」と切り分けるドライさもあり、自分の好みを揺るがされない。',
 '/images/edar.png'),

('EJKG', '探求家',
 '欧風の系譜やのにサラッとしてる珍しいタイプ。具材重視で辛さも欲しい、こだわりの少数派。',
 'スープカレー的なポジションに惹かれる傾向が強い。札幌スープカレーや、シャバッとしたスパイス控えめの汁系カレーに具材がゴロッと入ってるやつにグッとくる。「ドロッとしたカレーは重い」と感じる体質で、軽やかなのに辛さはちゃんと欲しいという結構わがままな要求を持ってる。具材は野菜や肉がそれぞれの存在感を保ってる状態が理想で、すりおろされた具材は受け付けない。マイナー嗜好を自覚してて、「カレー好き」を名乗る場では少し控えめに語る賢さもある。',
 '/images/ejkg.png'),

('EJKR', '革新家',
 'サラッとした欧風寄りのルーで勝負する系。具より味の構築に注目する辛口派。',
 'ジャパニーズスープカレーや、出汁の効いた和風スパイスカレーみたいな、ジャンル横断的なやつに興味を持つ。「カレーは進化してる料理」と捉えてて、伝統的な欧風にもインド系にも完全には属さないハイブリッド系に魅力を感じる。ルーの構築美にこだわる派なので、具材は最低限で十分。辛さも欲しいけど、それは料理全体のバランスの中で機能する辛さであってほしい。新しい店ができると一度は試しに行く好奇心と、流行に流されず自分の評価軸を持ってる芯の強さを併せ持つ。',
 '/images/ejkr.png'),

('EJAG', '健康家',
 '軽やかで優しい欧風寄りカレー、具材たっぷり。重くないのに満足感のあるバランス派。',
 '野菜がメインのスープカレー、優しい味付けの和風カレーみたいな、軽くて健康的なカレーに惹かれる。「カレーって油っこいイメージあるけど、これは違う」みたいな店を見つけると嬉しくなる。具材は野菜がたっぷり入ってる方が好みで、肉ばっかりのカレーは少し重く感じる。辛さも控えめでOKで、刺激より滋味を求めるタイプ。カレーを食べた後に「今日はちょっと贅沢したな」じゃなくて「ちゃんと食事した」と思えるバランスを大事にしてる。意外と健康意識が高い。',
 '/images/ejag.png'),

('EJAR', '穏健家',
 'サラッと優しい味わいで、ルーの一体感を楽しむ。主張しすぎない調和の取れたタイプ。',
 '「お母さんが作ってくれた、ちょっと汁気多めのカレー」みたいな素朴さに安心する。具材は溶け込んでてもいいし、ルーがサラッとしてても気にならない。辛さは控えめが心地よく、刺激より「ほっとする味」を求めてる。カレーに対して強いこだわりはあまりなく、「美味しければそれでええやん」というスタンス。逆に言えばどんなカレーでも一定の満足を得られる柔軟さがあり、外食でカレーを選んでも家で食べても、それぞれに良さを見出せる。穏やかで、争いを好まない平和主義者。',
 '/images/ejar.png');


-- ============================================
-- mbti_subtypes マスタデータ投入
-- ============================================

INSERT INTO mbti_subtypes (mbti_subtype, subtype_name, subtype_description) VALUES
('KODAWARI', 'こだわり派',
 '選んだカレーへの忠誠心が高いタイプ。「自分が好きなのはコレ」と決めたら、そう簡単に浮気しない。お気に入りの店を何度もリピートし、新しい店を試すときも「比較対象」として扱う傾向がある。良くも悪くも軸がブレないので、自分の好みを深く掘り下げていける。'),

('FLEXIBLE', '柔軟派',
 'カレーへの愛はあるけど、特定のスタイルに縛られないタイプ。「今日はインド系、明日は欧風」みたいに気分で選べる自由さを持ってる。色んな店を試すこと自体を楽しめるので、新しい発見も多い。診断結果はあくまで「ベース」であって、状況によってブレる柔らかさが魅力。');
