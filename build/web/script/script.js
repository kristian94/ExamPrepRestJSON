$(document).ready(function(){
    
    var table = document.createElement("table");
    $("body").append(table);
    
    var getData = function(number, params){
        
        
        
        
        var url = "http://localhost:8080/ExampPrepRestJSON/webresources/api/addresses/" + number + "/" + params;
        
        $.get(url, "application/json", function(data){
            $(data).each(function(){
                $(this).each(function(){
                    var tr = document.createElement("tr");
                    if(this.fname != undefined){
                        var td1 = document.createElement("td")
                        $(td1).text(this.fname);
                        $(tr).append(td1);
                    }
                    if(this.lname != undefined){
                        var td2 = document.createElement("td")
                        $(td2).text(this.lname);
                        $(tr).append(td2);
                    }
                    if(this.street != undefined){
                        var td3 = document.createElement("td")
                        $(td4).text(this.street);
                        $(tr).append(td3);
                    }
                    if(this.city != undefined){
                        var td4 = document.createElement("td")
                        $(td4).text(this.city);
                        $(tr).append(td4);
                    }
                    $(table).append(tr);
                });
            });
        });
        
        
        
    };
    
    $("#btn").click(function(){
        getData(5,"fname,lname");
    });
    
    
    
    
    
});






