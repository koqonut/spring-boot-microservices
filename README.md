# spring-boot-microservices
This project demonstrates the use of spring boot to create microservices

<h3>1. Overview</h3>
   We will create a customer service accesible at localhost:3001/customers and an order service on localhost:3002/orders

   Then we create a gateway service which will expose port 3005 and route "/customer" request to customer service and "/order" to order service.

   But when we deploy microservices in production, we are more often than not, unaware of which particular hosts the order and customer service will be deployed to.
   This is where DiscoveryService comes in. It is a Eureka server and we define the customer, order and gateway services as eureka clients
   On eureka client start up, it looks for Eureka server and registers itself. Once registered, the other eureka clients queries the Eureka server to find out the actual host,port of other eureka clients and then directs the request to that particular client.

  Finally we add Hystrix dashboard to monitor the state of our application in real time. We also add a Config server which reads the common properties from another   location (github repo in this case) and then makes those properties available for other services. Finally we also use zipkin and sleuth to aid in log tracing   easier.

<h3>2. CustomerService</h3>
<h3>3. OrderService</h3>
<h3>4. GatewayService</h3>
<h3>5. DiscoveryService</h3>
<h3>6. HystrixDashboard</h3>
<h3>7. ConfigServer</h3>
<h3>8. Zipkin and sleuth log tracing</h3>
