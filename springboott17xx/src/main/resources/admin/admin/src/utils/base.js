const base = {
    get() {
        return {
            url : "http://localhost:8080/springboott17xx/",
            name: "springboott17xx",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "在线学籍管理系统"
        } 
    }
}
export default base
