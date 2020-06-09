Page({

  /**
   * 页面的初始数据
   */
  data: {
    typeModel: '',
    list: '',
    array: []
  },
  /**
   * 访问后台查询数据
   */
  houtailianjie: function () {
    var that = this;
    wx.request({
      url: 'http://localhost:8080/nnljfl/typemodel/getType',
      method: 'POST',
      header: {
        'content-type': 'application/json'
      },
      success: function (res) {
        var list = res.data;
        var arry = res.data[3].throwClaims;
        console.log(arry);
        if (list == null) {
          console.log("数据获取失败");
        } else {
          that.setData({
            list: list,
          })
        }
      }
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.houtailianjie();
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