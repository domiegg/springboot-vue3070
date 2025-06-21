<template>
	<div class="addEdit-block" style="width: 100%;">
		<el-form
			:style='{"padding":"30px 15px","boxShadow":"0 0px 0px #999","borderRadius":"0px","flexWrap":"wrap","background":"none","display":"flex","justifyContent":"space-between"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="120px"
		>
			<template >
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="select" v-if="type!='info'" label="学号" prop="xuehao">
					<el-select :disabled="ro.xuehao" @change="xuehaoChange" v-model="ruleForm.xuehao" placeholder="请选择学号">
						<el-option
							v-for="(item,index) in xuehaoOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-else-if="ruleForm.xuehao" label="学号" prop="xuehao">
					<el-input v-model="ruleForm.xuehao" placeholder="学号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="学生姓名" prop="xueshengxingming">
					<el-input v-model="ruleForm.xueshengxingming" placeholder="学生姓名" clearable  :readonly="ro.xueshengxingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else class="input" label="学生姓名" prop="xueshengxingming">
					<el-input v-model="ruleForm.xueshengxingming" placeholder="学生姓名" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="性别" prop="xingbie">
					<el-input v-model="ruleForm.xingbie" placeholder="性别" clearable  :readonly="ro.xingbie"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else class="input" label="性别" prop="xingbie">
					<el-input v-model="ruleForm.xingbie" placeholder="性别" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="班级" prop="banji">
					<el-input v-model="ruleForm.banji" placeholder="班级" clearable  :readonly="ro.banji"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else class="input" label="班级" prop="banji">
					<el-input v-model="ruleForm.banji" placeholder="班级" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="专业" prop="zhuanye">
					<el-input v-model="ruleForm.zhuanye" placeholder="专业" clearable  :readonly="ro.zhuanye"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else class="input" label="专业" prop="zhuanye">
					<el-input v-model="ruleForm.zhuanye" placeholder="专业" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="手机号码" prop="shoujihaoma">
					<el-input v-model="ruleForm.shoujihaoma" placeholder="手机号码" clearable  :readonly="ro.shoujihaoma"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else class="input" label="手机号码" prop="shoujihaoma">
					<el-input v-model="ruleForm.shoujihaoma" placeholder="手机号码" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="住址" prop="zhuzhi">
					<el-input v-model="ruleForm.zhuzhi" placeholder="住址" clearable  :readonly="ro.zhuzhi"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else class="input" label="住址" prop="zhuzhi">
					<el-input v-model="ruleForm.zhuzhi" placeholder="住址" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="籍贯" prop="jiguan">
					<el-input v-model="ruleForm.jiguan" placeholder="籍贯" clearable  :readonly="ro.jiguan"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else class="input" label="籍贯" prop="jiguan">
					<el-input v-model="ruleForm.jiguan" placeholder="籍贯" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="政治面貌" prop="zhengzhimianmao">
					<el-input v-model="ruleForm.zhengzhimianmao" placeholder="政治面貌" clearable  :readonly="ro.zhengzhimianmao"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else class="input" label="政治面貌" prop="zhengzhimianmao">
					<el-input v-model="ruleForm.zhengzhimianmao" placeholder="政治面貌" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="date" v-if="type!='info'" label="入学日期" prop="ruxueriqi">
					<el-date-picker
						format="yyyy 年 MM 月 dd 日"
						value-format="yyyy-MM-dd"
						v-model="ruleForm.ruxueriqi" 
						type="date"
						:readonly="ro.ruxueriqi"
						placeholder="入学日期"
					></el-date-picker> 
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-else-if="ruleForm.ruxueriqi" label="入学日期" prop="ruxueriqi">
					<el-input v-model="ruleForm.ruxueriqi" placeholder="入学日期" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="upload" v-if="type!='info'&& !ro.danganwenjian" label="档案文件" prop="danganwenjian">
					<file-upload
						tip="点击上传档案文件"
						action="file/upload"
						:limit="1"
						:multiple="true"
						:fileUrls="ruleForm.danganwenjian?ruleForm.danganwenjian:''"
						@change="danganwenjianUploadChange"
					></file-upload>
				</el-form-item>  
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else-if="ruleForm.danganwenjian" label="档案文件" prop="danganwenjian">
					<el-button :style='{"border":"1px solid #2adbcb","cursor":"pointer","padding":"0 24px","margin":"0 20px 0 0","outline":"none","color":"#2adbcb","borderRadius":"0px","background":"#f1fcfb","width":"auto","lineHeight":"36px","fontSize":"14px","height":"36px"}' type="text" size="small" @click="download($base.url+ruleForm.danganwenjian)">下载</el-button>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else-if="!ruleForm.danganwenjian" label="档案文件" prop="danganwenjian">
					<el-button :style='{"border":"1px solid #2adbcb","cursor":"pointer","padding":"0 24px","margin":"0 20px 0 0","outline":"none","color":"#2adbcb","borderRadius":"0px","background":"#f1fcfb","width":"auto","lineHeight":"36px","fontSize":"14px","height":"36px"}' type="text" size="small">无</el-button>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="select" v-if="type!='info'" label="教师工号" prop="jiaoshigonghao">
					<el-select :disabled="ro.jiaoshigonghao" @change="jiaoshigonghaoChange" v-model="ruleForm.jiaoshigonghao" placeholder="请选择教师工号">
						<el-option
							v-for="(item,index) in jiaoshigonghaoOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' class="input" v-else-if="ruleForm.jiaoshigonghao" label="教师工号" prop="jiaoshigonghao">
					<el-input v-model="ruleForm.jiaoshigonghao" placeholder="教师工号" readonly></el-input>
				</el-form-item>
			</template>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-if="type!='info'"  label="个人简介" prop="gerenjianjie">
					<editor 
						style="min-width: 200px; max-width: 600px;"
						v-model="ruleForm.gerenjianjie" 
						class="editor" 
						action="file/upload">
					</editor>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","justifyContent":"flex-start"}' v-else-if="ruleForm.gerenjianjie" label="个人简介" prop="gerenjianjie">
                    <span :style='{"fontSize":"14px","lineHeight":"40px","color":"#333","fontWeight":"500","display":"inline-block"}' v-html="ruleForm.gerenjianjie"></span>
                </el-form-item>
			<el-form-item :style='{"padding":"0","margin":"20px 0 0"}' class="btn">
				<el-button :style='{"cursor":"pointer","padding":"0 30px","margin":"0 20px 0 0","borderColor":"#1fbfae","color":"#1fbfae","outline":"none","borderRadius":"0px","background":"#e9faf8","borderWidth":"4px","width":"auto","lineHeight":"40px","fontSize":"14px","borderStyle":"solid double solid double","height":"44px"}'  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
				<el-button :style='{"cursor":"pointer","padding":"0 24px","margin":"0","borderColor":"#dc333b","color":"#dc333b","outline":"none","borderRadius":"0px","background":"#fbeced","borderWidth":"4px","width":"auto","lineHeight":"40px","fontSize":"14px","borderStyle":"solid double solid double","height":"44px"}' v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
				<el-button :style='{"cursor":"pointer","padding":"0 24px","margin":"0","borderColor":"#dc333b","color":"#dc333b","outline":"none","borderRadius":"0px","background":"#fbeced","borderWidth":"4px","width":"auto","lineHeight":"40px","fontSize":"14px","borderStyle":"solid double solid double","height":"44px"}' v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
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
			id: '',
			type: '',
			
			
			ro:{
				xuehao : false,
				xueshengxingming : false,
				xingbie : false,
				banji : false,
				zhuanye : false,
				shoujihaoma : false,
				zhuzhi : false,
				jiguan : false,
				zhengzhimianmao : false,
				ruxueriqi : false,
				danganwenjian : false,
				gerenjianjie : false,
				jiaoshigonghao : false,
			},
			
			
			ruleForm: {
				xuehao: '',
				xueshengxingming: '',
				xingbie: '',
				banji: '',
				zhuanye: '',
				shoujihaoma: '',
				zhuzhi: '',
				jiguan: '',
				zhengzhimianmao: '',
				ruxueriqi: '',
				danganwenjian: '',
				gerenjianjie: '',
				jiaoshigonghao: '',
			},
		
			xuehaoOptions: [],
			jiaoshigonghaoOptions: [],
			
			rules: {
				xuehao: [
					{ required: true, message: '学号不能为空', trigger: 'blur' },
				],
				xueshengxingming: [
				],
				xingbie: [
				],
				banji: [
				],
				zhuanye: [
				],
				shoujihaoma: [
					{ validator: validateMobile, trigger: 'blur' },
				],
				zhuzhi: [
				],
				jiguan: [
				],
				zhengzhimianmao: [
					{ required: true, message: '政治面貌不能为空', trigger: 'blur' },
				],
				ruxueriqi: [
					{ required: true, message: '入学日期不能为空', trigger: 'blur' },
				],
				danganwenjian: [
				],
				gerenjianjie: [
				],
				jiaoshigonghao: [
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
	created() {
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
						if(o=='xuehao'){
							this.ruleForm.xuehao = obj[o];
							this.ro.xuehao = true;
							continue;
						}
						if(o=='xueshengxingming'){
							this.ruleForm.xueshengxingming = obj[o];
							this.ro.xueshengxingming = true;
							continue;
						}
						if(o=='xingbie'){
							this.ruleForm.xingbie = obj[o];
							this.ro.xingbie = true;
							continue;
						}
						if(o=='banji'){
							this.ruleForm.banji = obj[o];
							this.ro.banji = true;
							continue;
						}
						if(o=='zhuanye'){
							this.ruleForm.zhuanye = obj[o];
							this.ro.zhuanye = true;
							continue;
						}
						if(o=='shoujihaoma'){
							this.ruleForm.shoujihaoma = obj[o];
							this.ro.shoujihaoma = true;
							continue;
						}
						if(o=='zhuzhi'){
							this.ruleForm.zhuzhi = obj[o];
							this.ro.zhuzhi = true;
							continue;
						}
						if(o=='jiguan'){
							this.ruleForm.jiguan = obj[o];
							this.ro.jiguan = true;
							continue;
						}
						if(o=='zhengzhimianmao'){
							this.ruleForm.zhengzhimianmao = obj[o];
							this.ro.zhengzhimianmao = true;
							continue;
						}
						if(o=='ruxueriqi'){
							this.ruleForm.ruxueriqi = obj[o];
							this.ro.ruxueriqi = true;
							continue;
						}
						if(o=='danganwenjian'){
							this.ruleForm.danganwenjian = obj[o];
							this.ro.danganwenjian = true;
							continue;
						}
						if(o=='gerenjianjie'){
							this.ruleForm.gerenjianjie = obj[o];
							this.ro.gerenjianjie = true;
							continue;
						}
						if(o=='jiaoshigonghao'){
							this.ruleForm.jiaoshigonghao = obj[o];
							this.ro.jiaoshigonghao = true;
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
					if(json.jiaoshigonghao!=''&&json.jiaoshigonghao && this.$storage.get("role")!="管理员"){
						this.ruleForm.jiaoshigonghao = json.jiaoshigonghao
						this.ro.jiaoshigonghao = true;
					}
				} else {
					this.$message.error(data.msg);
				}
			});
			
            this.$http({
				url: `option/xuesheng/xuehao`,
				method: "get"
            }).then(({ data }) => {
				if (data && data.code === 0) {
					this.xuehaoOptions = data.data;
				} else {
					this.$message.error(data.msg);
				}
            });
            this.$http({
				url: `option/jiaoshi/jiaoshigonghao`,
				method: "get"
            }).then(({ data }) => {
				if (data && data.code === 0) {
					this.jiaoshigonghaoOptions = data.data;
				} else {
					this.$message.error(data.msg);
				}
            });
			
		},
			// 下二随
			xuehaoChange () {
				this.$http({
					url: `follow/xuesheng/xuehao?columnValue=`+ this.ruleForm.xuehao,
					method: "get"
				}).then(({ data }) => {
					if (data && data.code === 0) {
						if(data.data.xueshengxingming){
							this.ruleForm.xueshengxingming = data.data.xueshengxingming
						}
						if(data.data.xingbie){
							this.ruleForm.xingbie = data.data.xingbie
						}
						if(data.data.banji){
							this.ruleForm.banji = data.data.banji
						}
						if(data.data.zhuanye){
							this.ruleForm.zhuanye = data.data.zhuanye
						}
						if(data.data.shoujihaoma){
							this.ruleForm.shoujihaoma = data.data.shoujihaoma
						}
						if(data.data.zhuzhi){
							this.ruleForm.zhuzhi = data.data.zhuzhi
						}
						if(data.data.jiguan){
							this.ruleForm.jiguan = data.data.jiguan
						}
					} else {
						this.$message.error(data.msg);
					}
				});
			},
			// 下二随
			jiaoshigonghaoChange () {
				this.$http({
					url: `follow/jiaoshi/jiaoshigonghao?columnValue=`+ this.ruleForm.jiaoshigonghao,
					method: "get"
				}).then(({ data }) => {
					if (data && data.code === 0) {
						if(data.data.xueshengxingming){
							this.ruleForm.xueshengxingming = data.data.xueshengxingming
						}
						if(data.data.xingbie){
							this.ruleForm.xingbie = data.data.xingbie
						}
						if(data.data.banji){
							this.ruleForm.banji = data.data.banji
						}
						if(data.data.zhuanye){
							this.ruleForm.zhuanye = data.data.zhuanye
						}
						if(data.data.shoujihaoma){
							this.ruleForm.shoujihaoma = data.data.shoujihaoma
						}
						if(data.data.zhuzhi){
							this.ruleForm.zhuzhi = data.data.zhuzhi
						}
						if(data.data.jiguan){
							this.ruleForm.jiguan = data.data.jiguan
						}
					} else {
						this.$message.error(data.msg);
					}
				});
			},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `xueshengxueji/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        this.ruleForm.gerenjianjie = this.ruleForm.gerenjianjie.replace(reg,'../../../springboott17xx/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {






















	if(this.ruleForm.danganwenjian!=null) {
		this.ruleForm.danganwenjian = this.ruleForm.danganwenjian.replace(new RegExp(this.$base.url,"g"),"");
	}





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
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
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
				url: "xueshengxueji/page", 
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
					   url: `xueshengxueji/${!this.ruleForm.id ? "save" : "update"}`,
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
						 this.parent.xueshengxuejiCrossAddOrUpdateFlag = false;
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
			   url: `xueshengxueji/${!this.ruleForm.id ? "save" : "update"}`,
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
				 this.parent.xueshengxuejiCrossAddOrUpdateFlag = false;
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
      this.parent.xueshengxuejiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    danganwenjianUploadChange(fileUrls) {
	    this.ruleForm.danganwenjian = fileUrls;
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  text-shadow: 0 1px 10px #fff;
	  	  color: #666;
	  	  background: none;
	  	  font-weight: 500;
	  	  display: block;
	  	  width: 120px;
	  	  font-size: 14px;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 120px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border-radius: 0px;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px #4b681d;
	  	  outline: none;
	  	  color: #666;
	  	  background: #fff;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  border-color: #2adbcb;
	  	  border-width: 4px;
	  	  border-style: solid double solid double;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border-radius: 0px;
	  	  padding: 0 10px;
	  	  box-shadow: 0 0 0px #4b681d;
	  	  outline: none;
	  	  color: #666;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  border-color: #2adbcb;
	  	  border-width: 4px;
	  	  border-style: solid double solid double;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 0px solid #333;
	  	  border-radius: 0px;
	  	  padding: 0 10px 0 30px;
	  	  box-shadow: 0 0 0px #4b681d;
	  	  outline: none;
	  	  color: #666;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  border-color: #2adbcb;
	  	  border-width: 4px;
	  	  border-style: solid double solid double;
	  	  height: 40px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  	  border: 2px solid #ddd;
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: #2adbcb;
	  	  width: 200px;
	  	  font-size: 32px;
	  	  border-color: #2adbcb;
	  	  border-width: 4px;
	  	  line-height: 90px;
	  	  border-style: solid double solid double;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 2px solid #ddd;
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: #2adbcb;
	  	  width: 200px;
	  	  font-size: 32px;
	  	  border-color: #2adbcb;
	  	  border-width: 4px;
	  	  line-height: 90px;
	  	  border-style: solid double solid double;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 2px solid #ddd;
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: #2adbcb;
	  	  width: 200px;
	  	  font-size: 32px;
	  	  border-color: #2adbcb;
	  	  border-width: 4px;
	  	  line-height: 90px;
	  	  border-style: solid double solid double;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border-radius: 0px;
	  	  padding: 12px;
	  	  box-shadow: 0 0 0px #4b681d;
	  	  outline: none;
	  	  color: #666;
	  	  width: 500px;
	  	  font-size: 14px;
	  	  min-height: 120px;
	  	  border-color: #2adbcb;
	  	  border-width: 4px;
	  	  border-style: solid double solid double;
	  	  height: auto;
	  	}
</style>
