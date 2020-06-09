// pages/order_list/orderlist.js
var QQMapWX = require('../libs/qqmap-wx-jssdk.js');
var qqmapsdk;

Page({

  /**
   * 页面的初始数据
   */
  data: {
    province:[],
    index:0,
    city:[],
    urban:[],
    seleceprovince:'',
    selectcity:'',
    selecturban:'',
    form:[],
    date:'',
    userName:"",
    uerPhone:"",
    userAddress:"",
    rubbisStuts:0,
    msg:"",
    dialogShow: false,
    showOneButtonDialog: false,
    oneButton: [{ text: '确定' }]
  },
 
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.popup = this.selectComponent("#popup");
    wx.getLocation({
      type: 'wgs84',
      success: function(res) {
        const latitude = res.latitude
        const longitude = res.longitude
        //console.log(res);
      },
    })

    //实例化腾讯地图核心类
    qqmapsdk = new QQMapWX({
      key: 'CT7BZ-E7A3W-6I6R2-OIB25-MF4J5-2YBRF'
    });
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
    var that=this;
    // 调用接口
    /*
    qqmapsdk.search({
      keyword: '酒店',
      success: function (res) {
        console.log(res);
      },
      fail: function (res) {
        console.log(res);
      },
      complete: function (res) {
        console.log(res);
      }
    });*/
    qqmapsdk.getCityList({
      success: function (res) {//成功后的回调
      that.setData({
        province: res.result[0],
        city:res.result[1],
        urban:res.result[2]
      })
      
        
      },
      fail: function (error) {
        console.error(error);
      },
      complete: function (res) {
        //console.log(res);
      }
    });
  },
  tapDialogButton(e) {
    this.setData({
      dialogShow: false,
      showOneButtonDialog: false
    })
  },

  tapOneDialogButton(e) {
    console.log(e);
    this.setData({
      showOneButtonDialog: true
    })
  },
  cancle:function(){
    wx.switchTab({
      url: '/pages/index/index',
      success:function(e){
        console.log(e)
      },
      fail:function(e){
        console.log(e);
      }
    })
  },
  formSubmit: function (e) {
    var that = this;
    var reg = /^[u4E00-u9FA5]+$/;
    var date = e.detail.value.date;
    var userName = e.detail.value.userName;
    var userPhone = e.detail.value.userPhone;
    var userAddress = e.detail.value.userAddress;
    var rubbisStuts=0;
    console.log(userName);
    console.log(userPhone);
    console.log(userAddress);
    if(userName==""){
      that.setData({
        msg:"姓名不能为空"
        
      })
 
    } else if (userName.match(reg)) {
      that.setData({
        msg: "请输入正确的姓名"
      })
    } else if (userPhone==""){
      that.setData({
        msg: "联系电话不能为空"
      })
    } else if (!(/^1[34578]\d{9}$/.test(userPhone))){
      that.setData({
        msg: "请输入正确的电话号码"
      })
    }else if (userAddress == "") {
      that.setData({
        msg: "联系地址不能为空"
      })
    }else{
    
    //console.log('form发生了submit事件，携带数据为：', e.detail.value);
    
    this.setData({
      userName:e.detail.value.userName,
      userPhone:e.detail.value.userPhone,
      userAddress:e.detail.value.userAddress,
      rubbisStuts
    })
    wx.request({
      url: 'http://localhost:8080/nnljfl/queryorder/add',
      method:"POST",
      data: { userName, userPhone, userAddress, rubbisStuts},

      header: {
        'content-type': 'application/x-www-form-urlencoded'
      },
      success:function(res){
        console.log(res);
        var num = res.data.code;
        if(num==100){
          console.log("保存成功");
          that.setData({
            msg: "保存成功，返回主页面"
          })
          setTimeout(function(){
            wx.switchTab({
              url: '/pages/index/index',
            })
          },3000)
          
        }else{
          console.log("保存失败")
          that.setData({
            msg: "保存失败"
          })
        }
      }
    })
    }
   
    
  },
  formReset: function () {
    console.log('form发生了reset事件')
    
  },
  cancle:function(){
    console.log("取消");
    wx.switchTab({
      url: '../index/index',
    })
  },
  bindDateChange:function(e){
    console.log(e.detail.value);
    this.setData({
      date: e.detail.value
    })
  },
  bindRegionChange: function (e) {
    /**seleceprovince:'',
    selectcity:'',
    selecturban:'', */
    console.log('picker发送选择改变，携带值为', e.detail.value)
    this.setData({
      region: e.detail.value,
      seleceprovince: e.detail.value[0],
      selectcity: e.detail.value[1],
      selecturban: e.detail.value[2],
    })
  },
  
  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})