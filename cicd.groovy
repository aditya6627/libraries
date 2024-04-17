defnewGit(repo)
{
 git"${repo}"
}
 def newmaven()
{
sh 'maven package'
}
def newdeploy(ip,appname)
{
deploy adapters:{tomcat9(credentialsld: '898c13c4-28fd-4283-82d8-c07f78f8a5e8',
path:",url:"${ip}")}, contextpath: "${appname}",war: **/*.war
}

def newTest(jobname)
{
echo "${jobname}"
sh "java-jar/home/ubuntu/.jenkins/workspace/${jobname}/testing.jar"
}
