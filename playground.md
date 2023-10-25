spring init \
--boot-version=3.0.4 \
--type=gradle-project \
--java-version=17 \
--packaging=jar \
--name=api \
--package-name=dev.agasen.api \
--groupId=se.magnus.microservices.core.product \
--dependencies=actuator,webflux \
--version=1.0.0-SNAPSHOT \
api

cd ../

spring init \
--boot-version=3.0.4 \
--type=gradle-project \
--java-version=17 \
--packaging=jar \
--name=mcq-service \
--package-name=dev.agasen.microservices.mcq \
--groupId=dev.agasen.microservices.mcq \
--dependencies=actuator \
--version=1.0.0-SNAPSHOT \
mcq-service