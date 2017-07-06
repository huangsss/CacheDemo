package com.example.huangj.retrofit1.entity;

import java.util.List;

/**
 * Created by Administrator on 2016/12/16.15:51
 */

public class HomeEntity {


    /**
     * code : 10000
     * mess : 请求成功
     * data : {"rows":[{"id":"14007","title":"你问我爱你有多深，LOFT代表我的心","desc":"谁说冷硬的工业风才是LOFT应该有的样子，只要具有开放性和艺术性，空间中有流动感，就能称之为LOFT。","poster_img":"http://cdn.otbmall.com/za/2016/11/08/ddfb7c369e54192dd720bd2c70183d17-8753.jpg","scale":"0.56","class_name":"空间"},{"id":"14004","title":"日本当代前卫建筑，美到让人窒息","desc":"日本传统建筑潜藏与自然同居的渴望，以及日本人细腻的感性基因、高度要求的完美主义，使这些建筑多了一份难能可贵的「清新」与「自由」。","poster_img":"http://cdn.otbmall.com/za/2016/09/27/97751449d2510b5f8ca1b55b2f9d8404-8753.jpg","scale":"0.56","class_name":"建筑"},{"id":"14003","title":"你见过这样的火人节吗？","desc":"每年，成千上万的参与者都会聚集在美国内华达州的黑石沙漠（Black Rock Desert），来打造一座叫做黑石城的城市。","poster_img":"http://cdn.otbmall.com/za/2016/09/27/47b509195f895f0b6023c594bc320476-8753.jpg","scale":"0.56","class_name":"旅行"},{"id":"14002","title":"16岁少年的游客照，秒杀朋友圈","desc":"16岁的年龄对许多人来说也许正意味着闷在教室里，要去应付没完没了的题海以及即将到来的\u201c人生转折点\u201d\u2026\u2026","poster_img":"http://cdn.otbmall.com/za/2016/09/27/1ab25d8bfb27e478087d86ba08076946-8753.jpg","scale":"0.56","class_name":"旅行"},{"id":"14001","title":"异想天开之家：The Folly House","desc":"这是一座位于印度浦那的异想天开的住宅\u2014\u2014The Folly House，这里的布置与家具完全打破了常规。","poster_img":"http://cdn.otbmall.com/za/2016/09/27/39f285eb55279b40c8187beba884ce9d-8753.jpg","scale":"0.56","class_name":"建筑"},{"id":"14000","title":"一块板擦，一支粉笔，Hirotaka Hamasaki画遍世界名作","desc":"利用每天上课的粉笔和一块破旧的板擦，这位日本美术教师征服了他的所有学生。","poster_img":"http://cdn.otbmall.com/za/2016/09/27/66e0e1b05fb14fdb3a3122f3a533e5fd-8753.jpg","scale":"0.56","class_name":"人物"},{"id":"13999","title":"小户型越来越多，台北22平米LOFT是这样改造的","desc":"小户型越来越流行，与其说是时下年轻人的主动选择，不如说是在大城市高房价下做出的妥协。如何在能够负担得起的空间里创造舒适宽敞的居住体验，就要考验设计师的脑力了。","poster_img":"http://cdn.otbmall.com/za/2016/09/27/f072fa95a37ca9cc14c0643031e3d4d4-8753.jpg","scale":"0.56","class_name":"空间"},{"id":"13998","title":"不管客厅大小，设计感都不能少","desc":"12款经典客厅案例，给你带来不一样的灵感。","poster_img":"http://cdn.otbmall.com/za/2016/09/27/bd1dfa95c997ce26901433cacefcd693-8753.jpg","scale":"0.56","class_name":"空间"},{"id":"13997","title":"只要书够，书架的创意就永远不嫌多","desc":"方方正正的书架看久了，难免会让人感到有些乏味。实际上只要有一个稳定的结构，书架的造型完全可以脱离那些方正的格子，打造出一个不需要太过严肃的阅读空间。","poster_img":"http://cdn.otbmall.com/za/2016/09/21/070d8c10c4ae38fe3fdee7b19647af31-8753.jpg","scale":"0.56","class_name":"创意"},{"id":"13996","title":"盘卧在非洲丛林中的\u201c穿山甲\u201d酒店：Sandibe Okavango Safari Lodge","desc":"酒店的每一处与环境融合，所用材料对动植物没有任何伤害，70%以上的能源都通过可持续能源供给。","poster_img":"http://cdn.otbmall.com/za/2016/09/18/14976edb0434635e74ddb28426e0db37-8753.jpg","scale":"0.56","class_name":"建筑"},{"id":"13995","title":"爆改哪有那么难？6步就能让你家焕然一新！","desc":"我们的目标是：只需6步，房间的格调就蹭蹭地UP，UP，UP ！","poster_img":"http://cdn.otbmall.com/za/2016/09/14/b0ac3ca5a78ee117309562955c59647b-8753.jpg","scale":"0.56","class_name":"空间"},{"id":"13994","title":"如果，生活小物会说话\u2026\u2026","desc":"如果万物有灵，当你遇到它们时你会觉得它们会对你说什么呢？","poster_img":"http://cdn.otbmall.com/za/2016/09/12/4b910cb46c5285d89b4656a0ad85d4ff-8753.jpg","scale":"0.56","class_name":"创意"},{"id":"13993","title":"谁说姑娘都喜欢公主房？她们真正想睡的是这些！","desc":"一说到女孩子的房间，大家的刻板印象中就会出现有着各种粉红色、梦幻蕾丝和水晶灯搭配组合的所谓公主房\u2014\u2014","poster_img":"http://cdn.otbmall.com/za/2016/09/12/64f363b1f72578c5658766a085a02d96-8753.jpg","scale":"0.56","class_name":"空间"},{"id":"13992","title":"别再乱买家具了，床、沙发、书桌、电视柜\u2026一块木板全搞定！","desc":"简直不敢相信，世上竟有如此好用的东西？？？","poster_img":"http://cdn.otbmall.com/za/2016/09/08/191024310df32a5eb49f8208cbfec590-8753.jpg","scale":"0.56","class_name":"创意"},{"id":"13990","title":"丑无国界，这个看脸的世界还会好吗？","desc":"建筑作为人类可以购买的最大体积的人造商品，经常会变成野心的代名词。只不过有一些表现得克制，有一些则表现得愚蠢。一起去看看这些\u201c辣眼睛\u201d的最丑建筑吧！","poster_img":"http://cdn.otbmall.com/za/2016/08/26/68ee3b7e8584715c10e167a3d57c100c-8753.jpg","scale":"0.56","class_name":"建筑"},{"id":"13989","title":"上帝眼中的凡间，竟然这么美","desc":"摄影师Shamim Shorif Susom来自孟加拉国（Bangladesh），他拍摄了一组上帝视角的当地美景，简直美哭众人。","poster_img":"http://cdn.otbmall.com/za/2016/08/23/af0535a8009afd3f486f94086fe74492-8753.jpg","scale":"0.56","class_name":"空间"},{"id":"13988","title":"Eco Pot ：集笔筒和盆栽于一体的创新生态盒","desc":"许多人都喜欢在办公桌上摆放一个小盆栽。乌克兰的 Kononenkoid工作室，用木头精心设计出了一种新型的盆栽，取名为 Eco Pot (生态盒)。","poster_img":"http://cdn.otbmall.com/za/2016/08/23/ab0f8d995e9a74c9f29c4315305b43c4-8753.jpg","scale":"0.56","class_name":"创意"},{"id":"13987","title":"爱她，就带她去过最想要的生活","desc":"25年前，一对穷困的艺术家夫妇 Catherine King 与 Wayne Adams认为买房置业对他们来说太过不现实，于是他们做了一个大胆的决定\u2014\u2014\u201c我们去建座岛吧\u201d。这个看似痴人说梦的想法，如今却已成为现实。","poster_img":"http://cdn.otbmall.com/za/2016/08/23/4c6709e17e62d85d5d2ba1067ba8fc56-8753.jpg","scale":"0.56","class_name":"创意"},{"id":"13986","title":"以记忆为名的3D肖像画，满满是爱意","desc":"   每个人从一出生开始，生活中便开始出现、接触各式各样的物品，有些可能非常具有纪念意义，有些则是使用过后即被遗忘的普通物件，而每个人对待曾经与自己相关的物件方式也不一样。 来自瑞士设计师Till Könneker则将与自己生活有关的物件组成一幅真人大小的自画像。","poster_img":"http://cdn.otbmall.com/za/2016/08/12/bd03a4f259657cdd3c7aa8c6c5ff4de9-8764.jpg","scale":"0.56","class_name":"创意"},{"id":"13985","title":"当喵星人遇到建筑师，它们的居所会发生什么","desc":"   作为一名铲屎官，如何提高猫咪主子的生活环境是非常重要的。在洛杉矶，有将近300万只流浪猫无家可归。为了提高人们对这些流浪猫的关注，同时为慈善机构FixNation筹集资金，通过动物绝育减少流浪猫的数量，12支建筑设计团队参加了FixNation最近发起的\u201c给小动物建收容所\u201c活动，设计了一系列有趣的猫窝。","poster_img":"http://cdn.otbmall.com/za/2016/08/11/2d02117adb031d33bb05312878510da4-8764.jpg","scale":"0.56","class_name":"创意"}],"offset":0,"limit":20,"total":"47"}
     */

    private String code;
    private String mess;
    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * rows : [{"id":"14007","title":"你问我爱你有多深，LOFT代表我的心","desc":"谁说冷硬的工业风才是LOFT应该有的样子，只要具有开放性和艺术性，空间中有流动感，就能称之为LOFT。","poster_img":"http://cdn.otbmall.com/za/2016/11/08/ddfb7c369e54192dd720bd2c70183d17-8753.jpg","scale":"0.56","class_name":"空间"},{"id":"14004","title":"日本当代前卫建筑，美到让人窒息","desc":"日本传统建筑潜藏与自然同居的渴望，以及日本人细腻的感性基因、高度要求的完美主义，使这些建筑多了一份难能可贵的「清新」与「自由」。","poster_img":"http://cdn.otbmall.com/za/2016/09/27/97751449d2510b5f8ca1b55b2f9d8404-8753.jpg","scale":"0.56","class_name":"建筑"},{"id":"14003","title":"你见过这样的火人节吗？","desc":"每年，成千上万的参与者都会聚集在美国内华达州的黑石沙漠（Black Rock Desert），来打造一座叫做黑石城的城市。","poster_img":"http://cdn.otbmall.com/za/2016/09/27/47b509195f895f0b6023c594bc320476-8753.jpg","scale":"0.56","class_name":"旅行"},{"id":"14002","title":"16岁少年的游客照，秒杀朋友圈","desc":"16岁的年龄对许多人来说也许正意味着闷在教室里，要去应付没完没了的题海以及即将到来的\u201c人生转折点\u201d\u2026\u2026","poster_img":"http://cdn.otbmall.com/za/2016/09/27/1ab25d8bfb27e478087d86ba08076946-8753.jpg","scale":"0.56","class_name":"旅行"},{"id":"14001","title":"异想天开之家：The Folly House","desc":"这是一座位于印度浦那的异想天开的住宅\u2014\u2014The Folly House，这里的布置与家具完全打破了常规。","poster_img":"http://cdn.otbmall.com/za/2016/09/27/39f285eb55279b40c8187beba884ce9d-8753.jpg","scale":"0.56","class_name":"建筑"},{"id":"14000","title":"一块板擦，一支粉笔，Hirotaka Hamasaki画遍世界名作","desc":"利用每天上课的粉笔和一块破旧的板擦，这位日本美术教师征服了他的所有学生。","poster_img":"http://cdn.otbmall.com/za/2016/09/27/66e0e1b05fb14fdb3a3122f3a533e5fd-8753.jpg","scale":"0.56","class_name":"人物"},{"id":"13999","title":"小户型越来越多，台北22平米LOFT是这样改造的","desc":"小户型越来越流行，与其说是时下年轻人的主动选择，不如说是在大城市高房价下做出的妥协。如何在能够负担得起的空间里创造舒适宽敞的居住体验，就要考验设计师的脑力了。","poster_img":"http://cdn.otbmall.com/za/2016/09/27/f072fa95a37ca9cc14c0643031e3d4d4-8753.jpg","scale":"0.56","class_name":"空间"},{"id":"13998","title":"不管客厅大小，设计感都不能少","desc":"12款经典客厅案例，给你带来不一样的灵感。","poster_img":"http://cdn.otbmall.com/za/2016/09/27/bd1dfa95c997ce26901433cacefcd693-8753.jpg","scale":"0.56","class_name":"空间"},{"id":"13997","title":"只要书够，书架的创意就永远不嫌多","desc":"方方正正的书架看久了，难免会让人感到有些乏味。实际上只要有一个稳定的结构，书架的造型完全可以脱离那些方正的格子，打造出一个不需要太过严肃的阅读空间。","poster_img":"http://cdn.otbmall.com/za/2016/09/21/070d8c10c4ae38fe3fdee7b19647af31-8753.jpg","scale":"0.56","class_name":"创意"},{"id":"13996","title":"盘卧在非洲丛林中的\u201c穿山甲\u201d酒店：Sandibe Okavango Safari Lodge","desc":"酒店的每一处与环境融合，所用材料对动植物没有任何伤害，70%以上的能源都通过可持续能源供给。","poster_img":"http://cdn.otbmall.com/za/2016/09/18/14976edb0434635e74ddb28426e0db37-8753.jpg","scale":"0.56","class_name":"建筑"},{"id":"13995","title":"爆改哪有那么难？6步就能让你家焕然一新！","desc":"我们的目标是：只需6步，房间的格调就蹭蹭地UP，UP，UP ！","poster_img":"http://cdn.otbmall.com/za/2016/09/14/b0ac3ca5a78ee117309562955c59647b-8753.jpg","scale":"0.56","class_name":"空间"},{"id":"13994","title":"如果，生活小物会说话\u2026\u2026","desc":"如果万物有灵，当你遇到它们时你会觉得它们会对你说什么呢？","poster_img":"http://cdn.otbmall.com/za/2016/09/12/4b910cb46c5285d89b4656a0ad85d4ff-8753.jpg","scale":"0.56","class_name":"创意"},{"id":"13993","title":"谁说姑娘都喜欢公主房？她们真正想睡的是这些！","desc":"一说到女孩子的房间，大家的刻板印象中就会出现有着各种粉红色、梦幻蕾丝和水晶灯搭配组合的所谓公主房\u2014\u2014","poster_img":"http://cdn.otbmall.com/za/2016/09/12/64f363b1f72578c5658766a085a02d96-8753.jpg","scale":"0.56","class_name":"空间"},{"id":"13992","title":"别再乱买家具了，床、沙发、书桌、电视柜\u2026一块木板全搞定！","desc":"简直不敢相信，世上竟有如此好用的东西？？？","poster_img":"http://cdn.otbmall.com/za/2016/09/08/191024310df32a5eb49f8208cbfec590-8753.jpg","scale":"0.56","class_name":"创意"},{"id":"13990","title":"丑无国界，这个看脸的世界还会好吗？","desc":"建筑作为人类可以购买的最大体积的人造商品，经常会变成野心的代名词。只不过有一些表现得克制，有一些则表现得愚蠢。一起去看看这些\u201c辣眼睛\u201d的最丑建筑吧！","poster_img":"http://cdn.otbmall.com/za/2016/08/26/68ee3b7e8584715c10e167a3d57c100c-8753.jpg","scale":"0.56","class_name":"建筑"},{"id":"13989","title":"上帝眼中的凡间，竟然这么美","desc":"摄影师Shamim Shorif Susom来自孟加拉国（Bangladesh），他拍摄了一组上帝视角的当地美景，简直美哭众人。","poster_img":"http://cdn.otbmall.com/za/2016/08/23/af0535a8009afd3f486f94086fe74492-8753.jpg","scale":"0.56","class_name":"空间"},{"id":"13988","title":"Eco Pot ：集笔筒和盆栽于一体的创新生态盒","desc":"许多人都喜欢在办公桌上摆放一个小盆栽。乌克兰的 Kononenkoid工作室，用木头精心设计出了一种新型的盆栽，取名为 Eco Pot (生态盒)。","poster_img":"http://cdn.otbmall.com/za/2016/08/23/ab0f8d995e9a74c9f29c4315305b43c4-8753.jpg","scale":"0.56","class_name":"创意"},{"id":"13987","title":"爱她，就带她去过最想要的生活","desc":"25年前，一对穷困的艺术家夫妇 Catherine King 与 Wayne Adams认为买房置业对他们来说太过不现实，于是他们做了一个大胆的决定\u2014\u2014\u201c我们去建座岛吧\u201d。这个看似痴人说梦的想法，如今却已成为现实。","poster_img":"http://cdn.otbmall.com/za/2016/08/23/4c6709e17e62d85d5d2ba1067ba8fc56-8753.jpg","scale":"0.56","class_name":"创意"},{"id":"13986","title":"以记忆为名的3D肖像画，满满是爱意","desc":"   每个人从一出生开始，生活中便开始出现、接触各式各样的物品，有些可能非常具有纪念意义，有些则是使用过后即被遗忘的普通物件，而每个人对待曾经与自己相关的物件方式也不一样。 来自瑞士设计师Till Könneker则将与自己生活有关的物件组成一幅真人大小的自画像。","poster_img":"http://cdn.otbmall.com/za/2016/08/12/bd03a4f259657cdd3c7aa8c6c5ff4de9-8764.jpg","scale":"0.56","class_name":"创意"},{"id":"13985","title":"当喵星人遇到建筑师，它们的居所会发生什么","desc":"   作为一名铲屎官，如何提高猫咪主子的生活环境是非常重要的。在洛杉矶，有将近300万只流浪猫无家可归。为了提高人们对这些流浪猫的关注，同时为慈善机构FixNation筹集资金，通过动物绝育减少流浪猫的数量，12支建筑设计团队参加了FixNation最近发起的\u201c给小动物建收容所\u201c活动，设计了一系列有趣的猫窝。","poster_img":"http://cdn.otbmall.com/za/2016/08/11/2d02117adb031d33bb05312878510da4-8764.jpg","scale":"0.56","class_name":"创意"}]
         * offset : 0
         * limit : 20
         * total : 47
         */

        private int offset;
        private int limit;
        private String total;
        private List<RowsBean> rows;

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public List<RowsBean> getRows() {
            return rows;
        }

        public void setRows(List<RowsBean> rows) {
            this.rows = rows;
        }

        public static class RowsBean {
            /**
             * id : 14007
             * title : 你问我爱你有多深，LOFT代表我的心
             * desc : 谁说冷硬的工业风才是LOFT应该有的样子，只要具有开放性和艺术性，空间中有流动感，就能称之为LOFT。
             * poster_img : http://cdn.otbmall.com/za/2016/11/08/ddfb7c369e54192dd720bd2c70183d17-8753.jpg
             * scale : 0.56
             * class_name : 空间
             */

            private String id;
            private String title;
            private String desc;
            private String poster_img;
            private String scale;
            private String class_name;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPoster_img() {
                return poster_img;
            }

            public void setPoster_img(String poster_img) {
                this.poster_img = poster_img;
            }

            public String getScale() {
                return scale;
            }

            public void setScale(String scale) {
                this.scale = scale;
            }

            public String getClass_name() {
                return class_name;
            }

            public void setClass_name(String class_name) {
                this.class_name = class_name;
            }
        }
    }
}
