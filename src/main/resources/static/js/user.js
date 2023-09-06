let index={
    init:function (){
        $("#button-save").on("click",()=>{this.save()});
        $("#button-login").on("click", ()=>{this.login()});
    },

    save: function(){
        // alert('user의 save함수 호출됨');
        let data ={
            username: $("#username").val(),
            password: $("#password").val(),
            email: $("#email").val(),
        }

        console.log(data);
    },
    login: function (){

    }
}