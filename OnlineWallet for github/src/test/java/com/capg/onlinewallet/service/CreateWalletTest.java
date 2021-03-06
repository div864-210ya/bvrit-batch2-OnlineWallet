package com.capg.onlinewallet.service;
import static org.assertj.core.api.Assertions.assertThat;
//import org.springframework.context.support.StaticApplicationContext; 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.onlinewallet.dao.IOnlineWalletDao;
import com.capg.onlinewallet.entities.OnlineWallet;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreateWalletTest {
	@Autowired
	 private IOnlineWalletService service;
	@MockBean
	private IOnlineWalletDao dao;
	@Test
	public void walletaddtest()
	{
		OnlineWallet bean = new OnlineWallet();
	     //  bean.setCustomerId(87);
	       bean.setCustomerPassword("tomilson");
	      bean.setCustomerName("Louis");
	      bean.setAccountBalance(400);

		Mockito.when(dao.CreateOnlineWallet(bean)).thenReturn(bean);
         assertThat(service.CreateOnlineWallet(bean)).isEqualTo(bean);
		
	}
}


