package es.luis.ndc.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NdcControler {
	@RequestMapping("/getOffers")
	public String getOffers() {
		return "hola";
	}
}
