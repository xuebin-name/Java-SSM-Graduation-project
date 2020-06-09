var i=0;
var num=1;
Page({

  /**
   * 页面的初始数据
   */
  data: {
    list:'',
    
    id:"",
    csId:[],
    csText:[],
    text:"",
    msg:"",
    msgtitle:"",
    result:""
  },

  radioChange:function(e){
    console.log(e.detail.value);
    var select=e.detail.value;
    //.log(select);
  },
  click:function(e){
    var that = this;
    //console.log(e.target.id);
    var typeId = e.target.id;
    var csId = that.data.csText[i-1].csId;
    console.log(i);
    //console.log(that.data.csText.length)
    if(num>=that.data.csText.length){
      
      that.setData({
        result:"答题完成",
        msg:"答题完成"
      })

      wx.switchTab({
        url: '/pages/index/index',
      })
    }else{
    wx.request({
      url: 'http://localhost:8080/nnljfl/ceshi/query',
      method: 'POST',
      data: {typeId,csId},
      header: {
        'content-type': 'application/x-www-form-urlencoded'
      },
      success:function(res){
        //console.log(res);
        if(res.data.code!=100){
          that.setData({
            msg:"这道题错啦",
            msgtitle:"error",
            
          })
          
        }else{
          that.setData({
            msg: "恭喜你答对啦",
            msgtitle: "success"
          })
          var cstext = that.data.csText;

          that.setData({
            text: cstext[i].csText
          })
          i++;
          num++;
        }
      }
      
    })
   
    }
  },

  
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this;

    
    wx.request({
      url: 'http://localhost:8080/nnljfl/ceshi/getTimu',
      method: 'POST',
      header: {
        'content-type': 'application/x-www-form-urlencoded'
      },
      success: function (res) {

        var list = res.data;
      console.log(list);
      
      that.setData({
        csText:list,
        text:list[0].csText
      })
       i++;
        
      }
    })
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
