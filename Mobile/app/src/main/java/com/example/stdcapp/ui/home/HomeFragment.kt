package com.example.stdcapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.stdcapp.R
import com.example.stdcapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        val buttonstdc: Button = binding.buttonstdc
        val buttonpopular: Button = binding.buttonpopular
        val buttonticket: Button = binding.buttonticket
        val buttonview: Button = binding.buttonview
        val buttonway: Button = binding.buttonway
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        buttonstdc.setOnClickListener()
        {
            textView.text = "上海南北兩地皆有上海旅遊集散中心，分別在上海體育館附近及虹口足球場旁，是集快速便捷、舒適安全又實惠的旅遊服務單位；上海旅遊集散中心目前有40條旅遊路線，包括上海市內、上海近郊、浙江等周邊地區的旅遊路線等，上海周邊著名的 120個旅遊景點附近也都有旅遊巴士可以搭乘，上海旅遊集散中心每天發送400多輛旅遊巴士，方便遊客出遊，讓您感受到快速便捷的上海旅遊，是您來上海自由行的理想選擇。"
        }
        buttonpopular.setOnClickListener()
        {
            textView.text = "\n" +
                    "10條旅遊專線\n" +
                    "上海旅遊一號線\n" +
                    "1A漕寶路→桂林公園→靜安新城→九亭→泗涇→磚橋→洞涇→松江招商→方塔北門 1B漕寶路→桂林公園→靜安新城→九亭→泗涇→磚橋→漂流世界→森林公園→陳坊橋→佘山滑索道\n" +
                    "上海旅遊二號線\n" +
                    "公安博物館→打浦橋→十六鋪→北蔡→蓮溪→康橋→周浦→沈莊→下沙→茜琦→航頭→新場→張家橋→野生→薛家宅→南門→惠南鎮\n" +
                    "上海旅遊三號線(現暫停營運)\n" +
                    "徐家匯→海華花苑→重慶北路→東方明珠塔→東方醫院→五牛城→德平路→居家橋→高廟→金橋→張江→孫橋→華夏文化公園→華夏旅遊城\n" +
                    "上海旅遊四號線\n" +
                    "上海動物園→吳家巷→衛家角→徐涇→趙巷→青浦→朱家角→東方綠舟→水上運動場→保國寺→西岑→東興遊艇俱樂部→大觀園\n" +
                    "上海旅遊五號線\n" +
                    "成都北路→江灣鎮→吳淞碼頭→水產路→夏園賓館→金富門酒店→東林路→寶楊路碼頭\n" +
                    "上海旅遊六號線\n" +
                    "6A長風公園→真如鎮→古猗園→馬陸→匯龍潭→博樂廣場→溫宿路→迎園賓館 6B長風公園→梅川路→輕紡市場→百佛園→新澤源→江橋→曹安路20號橋→黃渡協通大酒店→美麗華度假村→上海汽車博覽公園→市民廣場→安亭菩提寺\n" +
                    "上海旅遊七號線(現暫停營運)\n" +
                    "上海體育館→交通大學→上海圖書館→襄陽公園→中共一大會址→博物館→豫園明星街→三牌樓→白渡路→多稼路→南浦大橋\n" +
                    "上海旅遊八號線\n" +
                    "上海體育館→共青森林公園(雙休日開班)\n" +
                    "上海旅遊九號線\n" +
                    "長途客運站→金陵飯店\n" +
                    "上海旅遊十號線\n" +
                    "上海體育館→裕德路→徐家匯→高安路→復興中路→陝西南路→思南路→嵩山路→人民廣場→山西北路→武昌路→武進路→虯江路→橫浜橋→山陰路→虹口足球場→曲陽路(下行上農新村)→商務中心"
        }
        buttonticket.setOnClickListener()
        {
            textView.text = "買五送一"
        }
        buttonview.setOnClickListener()
        {
            textView.text = "衡山路酒吧街\n" +
                    "衡山路酒吧街\n" +
                    "衡山路酒吧街位於上海市徐匯區衡山路，全長約為2.3公里，包含烏魯木齊路和東平路等地，北鄰著名的購物商圈淮海路、南為徐家匯商業商圈，附近也有外國大使館，地鐵一號線也設站於此，是上海相當繁華的地帶，始建於西元1992年，在法租界時期稱為貝當路，1943年才更名為橫山路，道路兩旁的法國梧桐和各式植栽讓橫山路更具風情；衡山路酒吧一條街除了酒吧和咖啡店林立以外，還有著名的出版社、唱片專業電，也是民眾購買藝術品、書籍或唱片的最佳去處，來到上海旅遊的民眾可別忘了到衡山路酒吧一條街感受醉人的異國風情。\n" +
                    "\n" +
                    "圖片提供 / 陳銘祥\n" +
                    "過去上海明星發跡地，現在的小紅樓酒吧\n" +
                    "在餐廳林立的上海中，小紅樓擁有與眾不同的歷史，這幢法國人建造的三層樓法式洋樓，曾是中國唱片公司的所在地，多年後的今日更成為中國的文化遺產之一。經過2002年的整修後，小紅樓散發出更獨特的魅力，歷史的光輝讓她散發了獨特的風韻，而如今小紅樓成了上海高級的酒吧西餐廳，也就是La Villa Rouge。\n" +
                    "\n" +
                    "30年代上海小洋房，凱文酒吧給你庭園愜意時光\n" +
                    "凱文餐廳酒吧，是一間座落於上海長樂路上的30年代四層洋房。凱文擁有歐風花園，隔絕了喧囂，餐廳內就是安靜雅緻的環境，裝潢舒適溫馨。紅椅白桌的搭配，以小燈點綴著壁上的每幅掛畫，窗邊半六小型凸出有一小圓桌，不僅可享用美食，還可愜意的享受窗外的上海景色。設有露天庭園，木椅及藤椅擺設有秩，庭園呈現閒逸的感受，適合到此喝下午茶沉澱心情。\n" +
                    "\n" +
                    "上海最佳運動酒吧 虹蕃主題音樂餐廳\n" +
                    "虹蕃主題音樂餐廳，坐落於上海衡山路上，是一家複合式餐廳。全天播放著悠美的音樂，二樓是印地安風格酒吧，以印地安的土著風情為主要裝潢風格，運用石材和幾何圖形，結合成印第安部落的壁畫及各式圖騰，搭配暗色調燈光，風格強烈，讓人從印地安神秘氣氛中感到溫暖。樓上則為中餐廳，提供海派菜為主，也搭配了台灣風味，所有的菜色以韓式的石頭火鍋最為有名，提供各式飲料及酒品，紅茶至國際酒類一應俱全。\n" +
                    "\n" +
                    "純美式酒吧波缽街 要你體驗美式ROCK魅力\n" +
                    "波缽街，屹立於上海衡山路酒吧街，是加拿大人開的純美式酒吧，各種食物、飲料、音樂，甚至服務，都是美式風格。夜晚神秘繽紛的色彩散發出無限魅力，露天的座位完全開放，紅色的光照印下來，看著往返的行人、穿梭的車輛，夜晚的繁忙景色映入眼簾，更顯得在BOURBON STREET裡偷閒的時光是多麼難得，讓人不禁把平日的煩惱拋諸腦後，盡情沉浸在音樂的洗禮中。\n" +
                    "\n" +
                    "義式風情MAO Club，各式雞尾酒創意多\n" +
                    "MAO Club(MAO=Music Art Oasis的縮寫)，靠近上海Zapata’s，附近曾有許多酒吧倒閉，MAO接手重新開業，吧內聘請了國外的調酒師及音樂總監，整體風格充滿了義大利酒吧風情。而MAO意識到當今的環保議題，因此非常著重廢棄物的回收與利用，為了提高大家的環保意識，吧內所有的俱樂部裝飾品、LOGO等物品，都是再次利用的物品，是上海酒吧的良好典範。\n" +
                    "\n" +
                    "中國文化延伸到酒吧了！磨硯散發迷人中國風\n" +
                    "Mural Bar，中文名為磨硯，中國風從名稱即可看出，與一般帶有濃厚西方風情的酒吧不同，這樣的特色讓磨硯脫穎而出。磨硯的老闆陳先生通曉天文地理，室內極具巧思的中國風設計，仔細觀察便可發現許多中國傳統的代表作融合其中，整體風格是中國的莊重與典雅，置身其中有一種特殊的自在感。吧台設計成唐朝客棧的外觀，屋頂還掛著有”酒”字的板，坐在吧台上喝著磨硯中國風醞釀出的酒，儘管是國外美酒，依然透出幾分中國味。\n" +
                    "\n" +
                    "Hot Chocolate 各式巧克力調酒讓您甜在心裡\n" +
                    "Hot Chocolate(熱巧克力)，一家座落於上海東平路上的酒吧，特色如其名就是提供了熱巧克力飲品。巧克力一直是人們用來示愛的蜜糖，也是浪漫的象徵。有趣的店名不僅吸引了喜愛巧克力的顧客，也透露出一種甜蜜的情感，讓許多人慕名而來。\n" +
                    "\n" +
                    "昔日蔣家氣派官邸，Sasha's帶您體驗當年無限風光\n" +
                    "一幢紅色的洋房氣派地座落於東平路上，這幢三層樓的建築是宋美齡的嫁妝，曾是蔣介石夫婦的官邸，氣派的大門門柱上方式一個可愛的小陽台，樓房週遭處處綠意，還有一座後花園。現在改為Sasha's(薩莎)，一間上海經典西式複合式餐廳。一樓為咖啡酒吧，佈置擺設維持著舊時的格局，可在那裏享受下午茶，夏天時在露天花園中，陽光從樹梢灑下，另有一番愜意與樂趣。"
        }
        buttonway.setOnClickListener()
        {
            textView.text = "上海的交通以發展公共交通為主體，目前仍以公車及地鐵為公交的骨幹體系，在上海公車稱為公交車，市區公交路線縱橫交錯，密如蛛網，公交車路線長度截至2002年底為止，已達22004公里，在全世界各大城市中上海居於首位。\n" +
                    "\n" +
                    "上海公車營運時間可分為全日線、早晚高峰線和通宵線；票價分為單一票價與多級制票價。上海大部份的公交車票價為單程RMB\$1元或是1.5元；但新型空調車、超長線車、專線車、雙層車等則是單程RMB\$1元或是2元，也有按照路線長短距離實行的多級制票價。\n" +
                    "\n" +
                    "到上海旅遊可以購買一張「上海公共交通卡」，這是具有現金支付功能的IC儲值卡，可在裝有POS機的公共交通消費區域使用。上海公交卡分為普通卡、紀念卡兩種，購買普通卡須支付押金RMB\$30元/張、紀念卡則按規定收費；每次加值金額以RMB\$10元為單位。有了這張上海公交卡不論是搭乘地鐵、公車、渡輪、計程車皆可使用，近幾年上海更推出了「公交優惠換乘」的服務，在上海不同交通工具間轉乘可以節省費用，讓您的上海旅遊通行無阻！"
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}