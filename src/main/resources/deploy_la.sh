#! /bin/bash

cd /Users/kyg/code/hxzq/lifeapp/

mvn clean install -Pdev

sshpass -p abc=123 scp lifeapp-web/target/lifeapp-web.war admin@10.199.105.184:/srv/wars/dev/lifeapp-web.war

echo "scp done"

sshpass -p abc=123 ssh admin@10.199.105.184 'sh /srv/admin/deploy_lifeapp.sh'

echo "deploy_lifeapp.sh done"
