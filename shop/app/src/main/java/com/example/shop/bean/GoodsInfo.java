package com.example.shop.bean;

import com.example.shop.R;

import java.util.ArrayList;

public class GoodsInfo {

    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "australia", "light", "newzealand", "nestle", "sanyuan", "telunsu","yili","cube"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "澳洲纽仕兰A2β-酪蛋白全脂专注儿童成长牛奶200ml*24盒",
            "光明有机纯牛奶200mLX12礼盒装享受品质生活全脂早餐早餐奶",
            "新西兰牛奶纽仕兰4.0g乳蛋白全脂纯牛奶250ml*24盒*2早餐",
            "雀巢全脂牛奶1L*12盒箱装补钙营养早餐牛奶饮料奶茶纯牛奶",
            "帝都三元A2-β酪蛋白250ml*12盒a2牛奶珍稀奶源品质享受",
            "蒙牛特仑苏有机纯牛奶利乐梦幻盖250ml*24包牛奶/整箱",
            "伊利无菌砖纯牛奶250ml*20盒/整箱乳蛋白营养儿童学生早餐奶",
            "三元小方白纯牛奶200ml*24盒*2箱奶香浓郁"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {59, 45, 58, 46, 66, 78,63,42};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.australia_s,R.drawable.light_s,R.drawable.newzealand_s,
            R.drawable.nestle_s,R.drawable.sanyuan_s,R.drawable.telunsu_s,
            R.drawable.yili_s,R.drawable.cube_s

    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.australia,R.drawable.light,R.drawable.newzealand,
            R.drawable.nestle,R.drawable.sanyuan,R.drawable.telunsu,
            R.drawable.yili,R.drawable.cube

    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}

