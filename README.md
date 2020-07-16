# NewWork
监听Android手机的网络切换，通过注解方式进行注册并进行监听，大大方便开发人员对于网络变换重新请求接口渲染页面的逻辑。



使用方法  在 Application 中注册
   
                    NetworkManager.getDefault().init(this);
                    
                    
                    
在Activity或者Fragment中使用
                     NetworkManager.getDefault().registerObserver(this);       //页面中的注册
                     
        网络切换的回调    @NetworkListener(type = NetType.WIFI)
    public void netork(@NetType String type) {
        switch (type) {
            case NetType.WIFI:
              //当前是WIFI
                break;
            case NetType.NONE:
              //关闭了网络
                break;
            case NetType.AUTO:
                //当前有网络不管是WIFI 还是流量
                break;
            case NetType.CMWAP:
             //流量
                break;
        }
        
        -------------------------------取消监听-------------------------------------
         NetworkManager.getDefault().unRegisterAllObserver();      //取消所有监听
         //注销目标广播监听
        NetworkManager.getDefault().unRegisterObserver(this);
        //////////////////////////////   无网打开网络的选择的页面
        NetWorkUtils.openNetSetting(Content con , int code);
        
        
        
        
        
