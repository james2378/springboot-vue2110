<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row >
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="维修编号" prop="weixiubianhao">
          <el-input v-model="ruleForm.weixiubianhao" 
              placeholder="维修编号" clearable  :readonly="ro.weixiubianhao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="维修编号" prop="weixiubianhao">
              <el-input v-model="ruleForm.weixiubianhao" 
                placeholder="维修编号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="物品名称" prop="wupinmingcheng">
          <el-input v-model="ruleForm.wupinmingcheng" 
              placeholder="物品名称" clearable  :readonly="ro.wupinmingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="物品名称" prop="wupinmingcheng">
              <el-input v-model="ruleForm.wupinmingcheng" 
                placeholder="物品名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="维修分类" prop="weixiufenlei">
          <el-input v-model="ruleForm.weixiufenlei" 
              placeholder="维修分类" clearable  :readonly="ro.weixiufenlei"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="维修分类" prop="weixiufenlei">
              <el-input v-model="ruleForm.weixiufenlei" 
                placeholder="维修分类" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="维修内容" prop="weixiuneirong">
          <el-input v-model="ruleForm.weixiuneirong" 
              placeholder="维修内容" clearable  :readonly="ro.weixiuneirong"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="维修内容" prop="weixiuneirong">
              <el-input v-model="ruleForm.weixiuneirong" 
                placeholder="维修内容" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="是否优先" prop="shifouyouxian">
          <el-input v-model="ruleForm.shifouyouxian" 
              placeholder="是否优先" clearable  :readonly="ro.shifouyouxian"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="是否优先" prop="shifouyouxian">
              <el-input v-model="ruleForm.shifouyouxian" 
                placeholder="是否优先" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="要求备注" prop="yaoqiubeizhu">
          <el-input v-model="ruleForm.yaoqiubeizhu" 
              placeholder="要求备注" clearable  :readonly="ro.yaoqiubeizhu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="要求备注" prop="yaoqiubeizhu">
              <el-input v-model="ruleForm.yaoqiubeizhu" 
                placeholder="要求备注" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="房间号" prop="fangjianhao">
          <el-input v-model="ruleForm.fangjianhao" 
              placeholder="房间号" clearable  :readonly="ro.fangjianhao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="房间号" prop="fangjianhao">
              <el-input v-model="ruleForm.fangjianhao" 
                placeholder="房间号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="房间类型" prop="fangjianleixing">
          <el-input v-model="ruleForm.fangjianleixing" 
              placeholder="房间类型" clearable  :readonly="ro.fangjianleixing"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="房间类型" prop="fangjianleixing">
              <el-input v-model="ruleForm.fangjianleixing" 
                placeholder="房间类型" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="房间名称" prop="fangjianmingcheng">
          <el-input v-model="ruleForm.fangjianmingcheng" 
              placeholder="房间名称" clearable  :readonly="ro.fangjianmingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="房间名称" prop="fangjianmingcheng">
              <el-input v-model="ruleForm.fangjianmingcheng" 
                placeholder="房间名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="房间位置" prop="fangjianweizhi">
          <el-input v-model="ruleForm.fangjianweizhi" 
              placeholder="房间位置" clearable  :readonly="ro.fangjianweizhi"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="房间位置" prop="fangjianweizhi">
              <el-input v-model="ruleForm.fangjianweizhi" 
                placeholder="房间位置" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="住户账号" prop="zhuhuzhanghao">
          <el-input v-model="ruleForm.zhuhuzhanghao" 
              placeholder="住户账号" clearable  :readonly="ro.zhuhuzhanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="住户账号" prop="zhuhuzhanghao">
              <el-input v-model="ruleForm.zhuhuzhanghao" 
                placeholder="住户账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="住户姓名" prop="zhuhuxingming">
          <el-input v-model="ruleForm.zhuhuxingming" 
              placeholder="住户姓名" clearable  :readonly="ro.zhuhuxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="住户姓名" prop="zhuhuxingming">
              <el-input v-model="ruleForm.zhuhuxingming" 
                placeholder="住户姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="手机号码" prop="shoujihaoma">
          <el-input v-model="ruleForm.shoujihaoma" 
              placeholder="手机号码" clearable  :readonly="ro.shoujihaoma"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="手机号码" prop="shoujihaoma">
              <el-input v-model="ruleForm.shoujihaoma" 
                placeholder="手机号码" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="维修账号" prop="weixiuzhanghao">
          <el-input v-model="ruleForm.weixiuzhanghao" 
              placeholder="维修账号" clearable  :readonly="ro.weixiuzhanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="维修账号" prop="weixiuzhanghao">
              <el-input v-model="ruleForm.weixiuzhanghao" 
                placeholder="维修账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="维修姓名" prop="weixiuxingming">
          <el-input v-model="ruleForm.weixiuxingming" 
              placeholder="维修姓名" clearable  :readonly="ro.weixiuxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="维修姓名" prop="weixiuxingming">
              <el-input v-model="ruleForm.weixiuxingming" 
                placeholder="维修姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="维修时间" prop="weixiushijian">
            <el-date-picker
                value-format="yyyy-MM-dd HH:mm:ss"
                v-model="ruleForm.weixiushijian" 
                type="datetime"
                :readonly="ro.weixiushijian"
                placeholder="维修时间">
            </el-date-picker>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.weixiushijian" label="维修时间" prop="weixiushijian">
              <el-input v-model="ruleForm.weixiushijian" 
                placeholder="维修时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="维修费用" prop="weixiufeiyong">
          <el-input v-model="ruleForm.weixiufeiyong" 
              placeholder="维修费用" clearable  :readonly="ro.weixiufeiyong"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="维修费用" prop="weixiufeiyong">
              <el-input v-model="ruleForm.weixiufeiyong" 
                placeholder="维修费用" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      </el-row>
          <el-row>
            <el-col :span="24">
              <el-form-item class="textarea" v-if="type!='info'" label="维修结果" prop="weixiujieguo">
                <el-input
                  style="min-width: 200px; max-width: 600px;"
                  type="textarea"
                  :rows="8"
                  placeholder="维修结果"
                  v-model="ruleForm.weixiujieguo" >
                </el-input>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.weixiujieguo" label="维修结果" prop="weixiujieguo">
                    <span>{{ruleForm.weixiujieguo}}</span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
      <el-form-item class="btn">
        <el-button  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"rgba(0, 0, 0, 1)","selectFontSize":"16px","btnCancelBorderColor":"rgba(188, 188, 188, 1)","inputBorderRadius":"0","inputFontSize":"16px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"0","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"0","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"rgba(0, 0, 0, 1)","addEditBoxColor":"#fff","dateIconFontSize":"16px","btnSaveBgColor":"rgba(219, 244, 255, 1)","uploadIconFontColor":"rgba(0, 0, 0, 1)","textareaBorderColor":"rgba(112, 112, 112, 1)","btnCancelBgColor":"rgba(241, 241, 241, 1)","selectLableColor":"rgba(0, 0, 0, 1)","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"0","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"rgba(0, 0, 0, 1)","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"rgba(0, 0, 0, 1)","dateBorderColor":"rgba(112, 112, 112, 1)","dateIconFontColor":"rgba(0, 0, 0, 1)","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"rgba(0, 0, 0, 1)","dateFontSize":"16px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"rgba(0, 0, 0, 1)","uploadHeight":"148px","textareaLableColor":"rgba(0, 0, 0, 1)","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"0","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"rgba(0, 0, 0, 1)","uploadBorderRadius":"0","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"16px","dateHeight":"40px","selectBorderColor":"rgba(112, 112, 112, 1)","inputBorderColor":"rgba(112, 112, 112, 1)","uploadBorderColor":"rgba(112, 112, 112, 1)","textareaFontColor":"rgba(0, 0, 0, 1)","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"0 5px 5px","uploadBorderWidth":"1px","textareaFontSize":"16px","selectBorderRadius":"0","selectFontColor":"rgba(0, 0, 0, 1)","btnSaveBorderColor":"rgba(109, 109, 148, 1)","btnSaveBorderWidth":"0 5px 5px"},
      id: '',
      type: '',
      ro:{
	weixiubianhao : false,
	wupinmingcheng : false,
	weixiufenlei : false,
	weixiuneirong : false,
	shifouyouxian : false,
	yaoqiubeizhu : false,
	fangjianhao : false,
	fangjianleixing : false,
	fangjianmingcheng : false,
	fangjianweizhi : false,
	zhuhuzhanghao : false,
	zhuhuxingming : false,
	shoujihaoma : false,
	weixiuzhanghao : false,
	weixiuxingming : false,
	weixiushijian : false,
	weixiufeiyong : false,
	weixiujieguo : false,
	ispay : false,
      },
      ruleForm: {
        weixiubianhao: '',
        wupinmingcheng: '',
        weixiufenlei: '',
        weixiuneirong: '',
        shifouyouxian: '',
        yaoqiubeizhu: '',
        fangjianhao: '',
        fangjianleixing: '',
        fangjianmingcheng: '',
        fangjianweizhi: '',
        zhuhuzhanghao: '',
        zhuhuxingming: '',
        shoujihaoma: '',
        weixiuzhanghao: '',
        weixiuxingming: '',
        weixiushijian: '',
        weixiufeiyong: '',
        weixiujieguo: '',
      },
      rules: {
          weixiubianhao: [
          ],
          wupinmingcheng: [
          ],
          weixiufenlei: [
          ],
          weixiuneirong: [
          ],
          shifouyouxian: [
          ],
          yaoqiubeizhu: [
          ],
          fangjianhao: [
          ],
          fangjianleixing: [
          ],
          fangjianmingcheng: [
          ],
          fangjianweizhi: [
          ],
          zhuhuzhanghao: [
          ],
          zhuhuxingming: [
          ],
          shoujihaoma: [
          ],
          weixiuzhanghao: [
          ],
          weixiuxingming: [
          ],
          weixiushijian: [
          ],
          weixiufeiyong: [
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          weixiujieguo: [
          ],
          ispay: [
          ],
      }
    };
  },
  props: ["parent"],
  computed: {



  },
  created() {
	this.ruleForm.weixiushijian = this.getCurDateTime()

	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
    // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='logistics'){
        this.logistics=false;
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          if(o=='weixiubianhao'){
            this.ruleForm.weixiubianhao = obj[o];
	    this.ro.weixiubianhao = true;
            continue;
          }
          if(o=='wupinmingcheng'){
            this.ruleForm.wupinmingcheng = obj[o];
	    this.ro.wupinmingcheng = true;
            continue;
          }
          if(o=='weixiufenlei'){
            this.ruleForm.weixiufenlei = obj[o];
	    this.ro.weixiufenlei = true;
            continue;
          }
          if(o=='weixiuneirong'){
            this.ruleForm.weixiuneirong = obj[o];
	    this.ro.weixiuneirong = true;
            continue;
          }
          if(o=='shifouyouxian'){
            this.ruleForm.shifouyouxian = obj[o];
	    this.ro.shifouyouxian = true;
            continue;
          }
          if(o=='yaoqiubeizhu'){
            this.ruleForm.yaoqiubeizhu = obj[o];
	    this.ro.yaoqiubeizhu = true;
            continue;
          }
          if(o=='fangjianhao'){
            this.ruleForm.fangjianhao = obj[o];
	    this.ro.fangjianhao = true;
            continue;
          }
          if(o=='fangjianleixing'){
            this.ruleForm.fangjianleixing = obj[o];
	    this.ro.fangjianleixing = true;
            continue;
          }
          if(o=='fangjianmingcheng'){
            this.ruleForm.fangjianmingcheng = obj[o];
	    this.ro.fangjianmingcheng = true;
            continue;
          }
          if(o=='fangjianweizhi'){
            this.ruleForm.fangjianweizhi = obj[o];
	    this.ro.fangjianweizhi = true;
            continue;
          }
          if(o=='zhuhuzhanghao'){
            this.ruleForm.zhuhuzhanghao = obj[o];
	    this.ro.zhuhuzhanghao = true;
            continue;
          }
          if(o=='zhuhuxingming'){
            this.ruleForm.zhuhuxingming = obj[o];
	    this.ro.zhuhuxingming = true;
            continue;
          }
          if(o=='shoujihaoma'){
            this.ruleForm.shoujihaoma = obj[o];
	    this.ro.shoujihaoma = true;
            continue;
          }
          if(o=='weixiuzhanghao'){
            this.ruleForm.weixiuzhanghao = obj[o];
	    this.ro.weixiuzhanghao = true;
            continue;
          }
          if(o=='weixiuxingming'){
            this.ruleForm.weixiuxingming = obj[o];
	    this.ro.weixiuxingming = true;
            continue;
          }
          if(o=='weixiushijian'){
            this.ruleForm.weixiushijian = obj[o];
	    this.ro.weixiushijian = true;
            continue;
          }
          if(o=='weixiufeiyong'){
            this.ruleForm.weixiufeiyong = obj[o];
	    this.ro.weixiufeiyong = true;
            continue;
          }
          if(o=='weixiujieguo'){
            this.ruleForm.weixiujieguo = obj[o];
	    this.ro.weixiujieguo = true;
            continue;
          }
        }
      }
      // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
		if(json.weixiuzhanghao!=''&&json.weixiuzhanghao){
                this.ruleForm.weixiuzhanghao = json.weixiuzhanghao
	    		this.ro.weixiuzhanghao = true;
		}
		if(json.weixiuxingming!=''&&json.weixiuxingming){
                this.ruleForm.weixiuxingming = json.weixiuxingming
	    		this.ro.weixiuxingming = true;
		}
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `weixiujilu/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {







































var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(!statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "weixiujilu/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `weixiujilu/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.weixiujiluCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `weixiujilu/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.weixiujiluCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.weixiujiluCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
	background-color: transparent;
}
.btn .el-button {
  padding: 0;
}
</style>
