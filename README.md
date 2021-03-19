# tracePg


Tracing events for apis and send to zipkin to further analysis.

On this inplementation, we use spring-boot-data-source-decorator along with p6spy to track queries on postgres Db. 

The full trace is send to a zipkin server to analysis. We can send this traces to gcp to, just input de the library on pom and adjust the config files.


![image](https://user-images.githubusercontent.com/14945326/111716545-04cb2b00-8835-11eb-8dbb-69ae996d45d5.png)



VHCS, Digital Layerbrick.
