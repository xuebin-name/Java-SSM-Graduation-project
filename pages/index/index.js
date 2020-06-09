Page({

  /**
   * 页面的初始数据
   */
  data: {
    focus:false,
    inputValue:'',
    list:[],
    inputShowed: false,
    inputVal: "",
    rubbish:'',
    dialogShow: false,
    showOneButtonDialog: false,
    canIUse: wx.canIUse('button.open-type.getUserInfo'),
    oneButton: [{ text: '确定' }]

  },
  tapDialogButton(e) {
    this.setData({
      dialogShow: false,
      showOneButtonDialog: false
    })
  }, 
  tapOneDialogButton(e) {
    this.setData({
      showOneButtonDialog: true
    })
  },
  showInput: function () {
    this.setData({
      inputShowed: true
    });
    
  },
  hideInput: function () {
    this.setData({
      inputVal: "",
      inputShowed: false
    });
  },
  clearInput: function () {
    this.setData({
      inputVal: ""
    });
    
  },
  inputTyping: function (e) {
   
    this.setData({
      inputVal: e.detail.value
    });
    search(inputVal);
    
  },
  show:function(){
    this.setData({
      showOneButtonDialog: true
    })
  },
  /** 预约 */
order:function(){

  wx.getSetting({
    success(res) {
      if (!res.authSetting['scope.userInfo']) {
        // 已经授权，可以直接调用 getUserInfo 获取头像昵称
       
        
      }else{
        wx.getUserInfo({
          success: function (res) {
            console.log(res.userInfo)
          }
        })
      }
    }
  })
/***/
  
  wx.getSetting({
    success(res) {
      if (!res.authSetting['scope.userLocation']) {
        wx.authorize({
          scope: 'scope.userLocation',
          success() {
            // 获取位置信息
            wx.getLocation({
              type: 'wgs84',
              success(res) {
                const latitude = res.latitude
                const longitude = res.longitude
                const speed = res.speed
                const accuracy = res.accuracy

                wx.redirectTo({
                  url: '../order_list/orderlist?latitude=' + latitude + '&longitude=' + longitude,
                })
              }
            })
          }
        }) 
      }else{
        wx.redirectTo({
          url: '../order_list/orderlist',
        })
      }
    }
  })

  },
  bindGetUserInfo(e) {
    console.log(e.detail.userInfo)
  },

//查询
search:function(value){
 // console.log(value.detail.value);
  var that = this;
  var name = value.detail.value;
  wx.request({
    url: 'http://localhost:8080/nnljfl/rubbish/getRubbish',
    method:"POST",
    data:{
      name:name
      },
    header: {
      'content-type': 'application/x-www-form-urlencoded'
    },
    success:function(res){
      
      var list  = res.data; 
      that.setData({
        list:res.data
      })  
      wx.navigateTo({
        url: '../index_list/showlist?name='+name,
        
      })
    }
  })
},

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
   
    this.tapOneDialogButton
   
    //进行一些初始化工作
    wx.getSetting({
      success(res) {
        if (res.authSetting['scope.userInfo']) {
          // 已经授权，可以直接调用 getUserInfo 获取头像昵称
          wx.getUserInfo({
            success: function (res) {
              console.log(res.userInfo)
            }
          })
        }else{
          wx.authorize({
            scope: 'scope.userInfo',
            success() {
              wx.getUserInfo({
                success: function (res) {
                  console.log(res.userInfo)
                }
              })
            }
          })
        }
      }
    })
  },
  bindKeyInput: function (e) {
    this.setData({
      inputValue: e.detail.value
    })
    console.log('bindInput'+this.data.inputValue)
  },
  bindReplaceInput: function (e) {
    var value = e.detail.value
    var pos = e.detail.cursor
    var left
    if (pos !== -1) {
      // 光标在中间
      left = e.detail.value.slice(0, pos)
      // 计算光标的位置
      pos = left.replace(/11/g, '2').length
    }

    // 直接返回对象，可以对输入进行过滤处理，同时可以控制光标的位置
    return {
      value: value.replace(/11/g, '2'),
      cursor: pos
    }

    // 或者直接返回字符串,光标在最后边
    // return value.replace(/11/g,'2'),
  },
  bindHideKeyboard: function (e) {
    if (e.detail.value === '123') {
      // 收起键盘
      wx.hideKeyboard()
    }
  },

  //获取地理位置信息
  getUserLocation: function(){
    wx.getSetting({
      success(res) {
        if (!res.authSetting['scope.userLocation']) {
          wx.authorize({
            scope: 'scope.userLocation',
            success() {
              // 获取位置信息
              wx.getLocation({
                type: 'wgs84',
                success(res) {
                  const latitude = res.latitude
                  const longitude = res.longitude
                  const speed = res.speed
                  const accuracy = res.accuracy
                  
                }
              })
            }
          })
        }
      }
    })
  },
  //获取用户信息
  getUserInfo:function(){
    wx.getSetting({
      success(res) {
        if (!res.authSetting['scope.userInfo']) {
          wx.authorize({
            scope: 'scope.userInfo',
            success(res) {
              console(res);
              wx.getUserInfo({
                success(res) {
                  console.log(res.userInfo);
                  console.log(res.signature);
                  console.log(res.rawData);
                }
              })
            }
          })
        }
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