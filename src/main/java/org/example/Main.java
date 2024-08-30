package org.example;

import AppAuth.LogOut;
import AppAuth.Login;
import ClientManagment.AddClient;
import ClientManagment.ClientActions;
import ClientManagment.SearchClient;


public class Main {
   public static void main(String[] args)
   {
       Login.LoginApp();
       String ClientName= "Ahmed";
       String updatenamesearch="Ahmed Mohamed";
       AddClient.AddNewCustomer(ClientName);
       SearchClient.SearchForClient(ClientName);
       ClientActions.editClient(updatenamesearch);
       SearchClient.SearchForClient(updatenamesearch);
     LogOut.LogoutApp();
   }
}