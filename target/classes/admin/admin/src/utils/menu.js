const menu = {
    list() {
        return [{"backMenu":[{"child":[{"buttons":["查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"评审员","menuJump":"列表","tableName":"pingshenyuan"}],"menu":"评审员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"省份","menuJump":"列表","tableName":"shengfen"}],"menu":"省份管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"评审条件","menuJump":"列表","tableName":"pingshentiaojian"}],"menu":"评审条件管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"职称申请","menuJump":"列表","tableName":"zhichengshenqing"}],"menu":"职称申请管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"结果公布","menuJump":"列表","tableName":"jieguogongbu"}],"menu":"结果公布管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"客服管理","tableName":"chat"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"系统公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","申请"],"menu":"评审条件列表","menuJump":"列表","tableName":"pingshentiaojian"}],"menu":"评审条件模块"}],"roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","修改","删除"],"menu":"职称申请","menuJump":"列表","tableName":"zhichengshenqing"}],"menu":"职称申请管理"},{"child":[{"buttons":["查看"],"menu":"结果公布","menuJump":"列表","tableName":"jieguogongbu"}],"menu":"结果公布管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","申请"],"menu":"评审条件列表","menuJump":"列表","tableName":"pingshentiaojian"}],"menu":"评审条件模块"}],"roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["查看","审核","添加结果"],"menu":"职称申请","menuJump":"列表","tableName":"zhichengshenqing"}],"menu":"职称申请管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"结果公布","menuJump":"列表","tableName":"jieguogongbu"}],"menu":"结果公布管理"}],"frontMenu":[{"child":[{"buttons":["查看","申请"],"menu":"评审条件列表","menuJump":"列表","tableName":"pingshentiaojian"}],"menu":"评审条件模块"}],"roleName":"评审员","tableName":"pingshenyuan"}]
    }
}
export default menu;