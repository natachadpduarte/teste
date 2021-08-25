package com.hrpayroll.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrpayroll.hrpayroll.clients.feignclients.WorkerFeignClient;
import com.hrpayroll.hrpayroll.entities.Payment;
import com.hrpayroll.hrpayroll.entities.Worker;

@Service
public class PaymentService {

	/*Ligação
	@Value("${hr-worker.host}")
	private String workerHost;*/
	
	/*@Autowired
	private RestTemplate restTemplate;*/
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		/*Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id",""+workerId);
		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);*/
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getNameString(), worker.getDailyincome(), days);
	}
}
