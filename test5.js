function executeform()
{
 var name=document.getElementById('NAME');
 var passwd=document.getElementById('PASS1');
 var cpasswd=document.getElementById('PASS2');
if(name.length<5)
{
        alert('invalid name');
}
else
{
for(i=0;i<name.length;i++)
{
 if(!(name.charCodeAt(i)>=65 && name.charCodeAt(i)<=122))
   {
    alert('invalid name')
    }
 }
}
 if(!(passwd==cpasswd))
 {
    alert('Password does not match Confirm Password')
 }
 
}
function fillbox()
 {
 qualarr=['Select Option','Graduate','Post-Graduate']


var quald= document.getElementById("qual");

for(i=0;i<qualarr.length;i++)
{

var ele=document.createElement('option')
ele.text=qualarr[i];
quald.add(ele,i)
}
function fillOpts()
{
opts=[[Computer Science,Mechanical,IT,Electrical],[Computer Science,Mechanical,IT,Electrical]]


var quald= document.getElementById("qual");

var subquald= document.getElementById("squal");

subquald.innerHTML=null;

idx= quald.selectedIndex;
for(i=0;i<opts[idx-1].length;i++)
        {
         var ele1=document.createElement('option');
         ele1.text=opts[idx-1][i];
         subquald.add(ele1,i);     
        }

}

function dobVal()
{
   var d=new Date();
   var year=d.getFullYear();
   var mon= d.getMonth()+1;
   var d=d.getDate();

                                if(d<10)
                                        d='0'+d;
                                        if(mon<10)
                                        mon='0'+mon;
                document.getElementById('dob').max=year+'-'+mon+'-'+d;                 
alert(year+'-'+mon+'-'+d)
}
function showpass(){
        document.getElementById('PASS1').style.visibility= "visible";
		document.getElementById('PASS2').style.visibility= "visible";
		
    }