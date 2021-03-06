# SecondhandOnCampus

   近几年，电子商务的出现带给这个世界一个新视角，新面貌，越来越多的人们开始加入到在线购物的队伍当中，而在这购物大军中，当今的大学生们在其中扮演了一个不可缺少的角色，大学生对于新奇物品的欲望使得他们的手头会出现大量的闲置物品，而我所设计的这样的一个校园二手交易平台，首先它在电子商务这样的背景下，更加精确的定位了这个平台所服务的人群，扎根于校园，其次它为广大高校大学生提供便捷的二手物品转让服务，使校园资源能够得以重复的被使用，减少资源的无谓的浪费。因为每年一到毕业季的时候，总会有着许多的毕业生进入到校园跳蚤市场中转让自己不再需要的一些物品，如书籍，电子产品，生活用品等，这个平台恰恰解决了校园跳蚤市场时间及地点的局限性，使得更多的大学生能够享受到二手物品所带来的便利。
   
1.1 用户管理
  用户管理模块主要是对于用户自身信息的管理，也包含了相应其所收藏商品的管理，用户可以在这里绑定收货信息，以及修改密码，当然对某些服务的访问必须要进行身份的验证，必须要登录的用户信息。
  
1.1.1 注册登录
  网站规定注册用户需提供一个不重复的昵称，以及不曾注册过的手机号码以及必须提供自己的学号进行注册，可以通过学校提供数据或接口来保证用户的真实性，因为这能很大程度保证学校里商品交易之间双方用户的信任。而当用户登录时，设计有 用户名(昵称)+密码，学号+密码，两种登录方式为用户登录提供方便。

1.1.2 用户信息管理
1)用户信息修改。网站提供用户完善自己的详细信息功能，比如对收货地址的填写，否则在购物车提交订单时会提示你进行填写。
2)修改密码，提供对自己的密码进行修改处理

1.1.3 个人收藏商品管理
用户浏览商品选择自己感兴趣的商品来收藏，以方便之后的购物。在用户个人中心，可以查询自己收藏物品，以及将商品移除收藏。

1.2 商品管理
商品管理主要是对整个网站的商品的操作。用户可以对商品进行分类查询，模糊查询，并且展示其详细信息，集成许多与商品相关联的功能提供给用户使用。比如提供某一商家的其他商品信息和商家评价，或者与商品相关留言信息的提供等

1.2.1 商品展示管理
在商品页面，分页展示商品，商品按发布日期进行排序，并且提供给用户方便的分类别查询，以及进行商品的模糊查询，用户可以选择自己喜欢的商品查看其详细信息。在详细商品页面，用户可以查看当前商品的商家其他已上架成功的物品，并且展示出所有购买了商家物品的客户为商家打出的评价信息。为购物降低潜在的风险。

1.2.2 用户留言及商家回复
用户可以在商品的详情页面，对商品留言，商家在登录系统后，能够对每条留言信息一一回复，并在当前详情页面能够看到此物品下所有用户对商品的留言及对应的商家回复信息。来获取商品的相关其他信息。

1.2.3 自身商品管理
网站提供商家用户上架商品的功能，商品必须提供所有系统要求提供的所有信息，包括相应商品真实的照片文件的上传，并且提供查询自身已上架物品的功能，分别提供未审核，审核通过，审核失败的商品信息查询，而审核失败的商品，系统管理员会提供相应失败的原因信息来告知用户，以便用户做出对应正确的修改。审核通过的商品页面展示商品的同时，能提示商家商品有几条新留言等待回复。
1) 上架商品页面模块中的商品类型列表，需要从读取数据库中类别信息。 
2) 存储图片相对路径/goods/xxxx-xxxx-xxxx/xx.jpg及封面图的名称到数据库。
3) 存储图片时，另外对每张图片生成缩略图存储 路径为存储图片路径+“/thumbnail”。
因为页面展示时，基本使用缩略图，缩略图大小才3kb左右，而原图有几MB大，不利于前台展示，降低用户的体验，所以只有在详细商品信息的页面系统使用原图为客户展示。

1.3 订单管理
订单模块是系统的核心模块。订单统一对系统中生成的订单来进行管理，买家用户查询自己购买订单，买家用户管理客户订单，对各种状态订单有相应的展示功能

1.3.1 购物车管理 
用户在浏览过程中可以选取商品加入自己的购物车中，等待结算。在购物车展示页面上，系统会自动分离出同一商家下你所选择的商品，来分离购物车的商品生成多个订单，并且每一个订单提供给用户选择收获方式，暂时提供两种取货方式，一是校园点自取，二是用户提供少许金额，由工作人员进行送货上门服务，购物车里的每一个订单都会显示此订单的总金额信息，以及其中所包含的一个或多个订单项信息，每项信息里又相应地包含了所选货物简单信息及每项的金额，在购物车页面用户可以修改所选商品的数量，或是移除自己不再想买的物品，经过挑选后在此可以来提交订单。用户点击提交订单按钮时，必须要弹出对话框提示用户检查自己的收货地址信息是否正确，以及选择相应的付款方式，
 
1.3.2 自身订单管理
提供给用户查看自己所下订单的信息查询，能够分订单状态查询到自己所有的历史订单以及新下的订单是否已发货，并且可以找到交易成功订单进行商家的评价，此评价是与商家所绑定在一起的，来使所有的买家来评估商家。

1.3.3 客户订单管理
用户作为商家角色，网站提供给他们对所有自己客户订单的管理。当一名买家用户在页面下单后，系统将会发送短信到商家用户所绑定的手机号码上，提示商家有新订单信息到了，这时商家将会打包好用户所买物品，商家可以直接送货到校园自取点，也可以与校园点的工作人员进行联系，付出少许费用，等待工作人员上门取货。 这时工作人员再根据此订单的收货方式：
若为自取件，当校园点收到买家的货物时，会在后台管理员系统来进行此订单的状态的更改。状态由未发货改为已发货，并且短信通知用户，等待用户到来。      
若为送货上门，则工作人员直接在商家处收取货物后直接送往收货人处；用户可以在工作人员处当面验货签收，用户签收后，可在后台管理员系统修改此物品状态为已发货状态，而 订单的已收货状态 只有当用户确定收到的物品 与商家描述一致 后，由用户确认。若用户一周内未进行确认操作，管理员可以在后台批量确认超时过久订单。

1.3.4 评价商家
在用户与商家之间订单交易成功后，用户可以在自身的订单管理页面去对商家来进行评价，而商家用户也可以在商家订单管理页面来看到每个已购买用户对自己的评价。而其他用户在浏览商品详情的同时，可以在页面处，去看到所有的这些评价展示，来对自己是否要买此商家的商品来做一个参考。

1.4 后台管理   
1) 系统管理员在这可以查询并审核所有商家用户上架物品，如果审核不通过，管理员需输入失败的原因来告知商家。
2) 系统管理员可以对收到货的订单由未发货状态，管理员根据订单号找到订单然后修改为已发货状态；并且对用户已取货却未很久未确认收获的订单进行确认操作，由发货日期之后的10天后，管理员操作订单完成。而发货日期则是由校园自取点确认收到商家货物时创建，同时此时已经短信通知了用户。
3）系统管理员统一来管理用户数据，订单数据，商品数据。
